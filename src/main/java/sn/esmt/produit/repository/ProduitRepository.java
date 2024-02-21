package sn.esmt.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sn.esmt.produit.entite.ProduitEntity;

import java.util.List;
import java.util.Optional;

@Repository

public interface ProduitRepository extends JpaRepository<ProduitEntity,String> {

  @Query("select p from ProduitEntity p where p.ref=?1 and p.nom=?2")
  public Optional<ProduitEntity> findByRefAndName(String ref,String nom) ;

  public Optional<ProduitEntity> findByRef(String ref);

}
