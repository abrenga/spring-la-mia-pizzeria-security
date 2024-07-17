package it.lamiapizzeria.controller;


import it.lamiapizzeria.repository.MyRepository;
import it.lamiapizzeria.repository.SpecialPriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IngredientsController {

    @Autowired
    private MyRepository repository;

    @Autowired
    private SpecialPriceRepo specialPriceRepo;



}
