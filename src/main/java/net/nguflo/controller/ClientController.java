package net.nguflo.controller;

import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.validation.Valid;

import net.nguflo.model.Client;
import net.nguflo.utils.HibernateUtil;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {
  @RequestMapping(value = "/userForm", method = RequestMethod.GET)
  public String userForm(Locale locale, Model model) {
    model.addAttribute("client", new Client());
    return "userForm";
  }

  @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
  public String saveUser(@ModelAttribute("client") @Valid Client client, BindingResult result, Model model) {
    if (result.hasErrors()) {
      return "userForm";
    }
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    if (client.getNum() == 0) {
      session.persist(client);      
    } else {
      session.evict((Client) session.get(Client.class, client.getNum()));
      session.update(client);
    }
    session.getTransaction().commit();
    return "success";
  }

  @RequestMapping(value = "/client", method = RequestMethod.POST)
  public String viewClient(@RequestParam(name = "id") String id, Locale locale, Model model) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      Client client = (Client) session.get(Client.class, Integer.parseInt(id));
      if (client == null) {
        return "home";
      } else {
        model.addAttribute("client", client);
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        model.addAttribute("dateNaissance", formatter.format(client.getDateNaissance()));
        return "userForm";
      }
    } catch(NumberFormatException e) {
      return "error";
    }
  }
}
