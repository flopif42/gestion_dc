package net.nguflo.model;

import java.util.Date;

import javax.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "client")
public class Client {
  private int num;
  
  @NotEmpty
  @Size(min=2, max=15, message="Le nom doit contenir entre 2 et 15 caracteres.")
  private String nom;
  
  @NotEmpty
  @Size(min=2, max=15, message="Le prenom doit contenir entre 2 et 15 caracteres.")
  private String prenom;
  
  private Date dateNaissance;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "numclient")
  public int getNum() {
    return num;
  }
  
  public void setNum(int num) {
    this.num = num;
  }
  
  @Column(name = "nomclient")
  public String getNom() {
    return nom;
  }
  
  public void setNom(String nom) {
    this.nom = nom;
  }
  
  @Column(name = "prenomclient")
  public String getPrenom() {
    return prenom;
  }
  
  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
  
  @Column(name = "datenaissclient")
  public Date getDateNaissance() {
     return dateNaissance;
  }
  
  public void setDateNaissance(Date dateNaissance) {
    this.dateNaissance = dateNaissance;
  }
  
}
