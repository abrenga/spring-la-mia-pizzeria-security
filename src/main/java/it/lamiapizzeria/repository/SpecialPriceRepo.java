package it.lamiapizzeria.repository;

import it.lamiapizzeria.model.ModelofmenuDB;
import org.springframework.data.jpa.repository.JpaRepository;
 import it.lamiapizzeria.model.ModelOfSpecialPrice;

import java.util.List;

public interface SpecialPriceRepo extends JpaRepository<ModelOfSpecialPrice,Integer> {
 List<ModelOfSpecialPrice> findAllByPizze(ModelofmenuDB pizza);
    
}
