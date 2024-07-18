package it.lamiapizzeria.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.lamiapizzeria.model.Ingredients;
import it.lamiapizzeria.model.ModelofmenuDB;

public interface  IngredientsRepository extends JpaRepository<Ingredients, Integer> {
    List<Ingredients> findAllByMenu(ModelofmenuDB menu);

}