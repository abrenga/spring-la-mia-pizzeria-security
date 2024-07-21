package it.lamiapizzeria.repository;

import java.util.List;

import it.lamiapizzeria.model.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;

import it.lamiapizzeria.model.ModelofmenuDB;






public interface MyRepository extends JpaRepository<ModelofmenuDB, Integer>{

	List<ModelofmenuDB> findByName(String name);


	List<ModelofmenuDB> findByIngredients(Ingredients i);
}