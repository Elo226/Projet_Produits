package sn.esmt.produit.entite;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="produit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ProduitEntity {

  @Id
  @Column(name="reference")
  private String ref;
  @Column(name="Nom_Produit")
  private String nom;
  @Column(name="QuantitéStock")
  private Double QtStock;

}
