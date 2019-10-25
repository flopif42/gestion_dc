package net.nguflo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contrat")
public class Contrat {
  private int num;
  private int numClient;
  private int typeContrat;
  private Date dateSouscription;
  
  @Id
  @Column(name = "numcontrat")
  public int getNum() {
    return num;
  }
  public void setNum(int num) {
    this.num = num;
  }
  
  @Column(name = "numclient")
    public int getNumClient() {
    return numClient;
  }
  public void setNumClient(int numClient) {
    this.numClient = numClient;
  }
  
  @Column(name = "typecontrat")
    public int getTypeContrat() {
    return typeContrat;
  }
  public void setTypeContrat(int typeContrat) {
    this.typeContrat = typeContrat;
  }
  
  @Column(name = "datesouscription")
  public Date getDateSouscription() {
    return dateSouscription;
  }
  public void setDateSouscription(Date dateSouscription) {
    this.dateSouscription = dateSouscription;
  }
}
