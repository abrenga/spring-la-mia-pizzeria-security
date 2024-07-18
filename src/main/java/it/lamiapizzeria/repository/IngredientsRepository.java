package it.lamiapizzeria.repository;


import it.lamiapizzeria.model.ModelOfSpecialPrice;
import it.lamiapizzeria.model.ModelofmenuDB;
import org.springframework.data.jpa.repository.JpaRepository;

import it.lamiapizzeria.model.Ingredients;

import java.util.List;

public interface  IngredientsRepository extends JpaRepository<Ingredients, Integer> {
    List<Ingredients> findAllByMenu(ModelofmenuDB menu);

}