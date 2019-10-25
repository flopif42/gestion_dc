package net.nguflo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ref_type_contrat")
public class TypeContrat {
  private int code;
  private String label;
  
  @Id
  @Column(name = "code_typecontrat")
  public int getCode() {
    return code;
  }
  
  public void setCode(int code) {
    this.code = code;
  }
  
  @Column(name = "label_typecontrat")
  public String getLabel() {
    return label;
  }
  
  public void setLabel(String label) {
    this.label = label;
  }
}
