package sn.esmt.produit.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.esmt.produit.entite.ProduitEntity;
import sn.esmt.produit.service.ProduitService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("produit")
public class ProduitController {
  private ProduitService produitService;

  @PostMapping
  public ProduitEntity save(ProduitEntity produitEntity){

    return produitService.save(produitEntity);
  }
  @GetMapping
  public List<ProduitEntity> all(){

    return produitService.getAll().get();
  }
}
