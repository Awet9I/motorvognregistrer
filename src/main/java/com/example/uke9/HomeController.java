package com.example.uke9;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    private final List<Eier> eiere = new ArrayList<>();


    public HomeController(){

    }

    @PostMapping("/registre")
    public void register(Eier eier){
        eiere.add(eier);
    }

    @GetMapping("/hentalle")
    public List<Eier> hentalle(){
        return eiere;

    }

    @GetMapping("/slettalle")
    public void slettAlle(){
        eiere.clear();
    }

}
