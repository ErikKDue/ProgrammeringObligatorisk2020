package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class HomeController {

    @Autowired
    BillionaireService service;

    BillionaireRepository billyRepo;

    public HomeController(BillionaireRepository pokemonRepository){this.billyRepo = pokemonRepository;}

    @GetMapping("/")
    public String Index(Model model){
        Billionaire tstBilly = billyRepo.findById(1).get();//service.findByid(1).get();
        System.out.println(tstBilly.getfName());
        System.out.println(tstBilly.getCareer());
        return"index";
    }

    @PostMapping("/")
    public int CreateBilly(){
        Billionaire billy = new Billionaire( "Boof", "Barf", "Bgarf");
        Billionaire billy2 = new Billionaire("Bborf", "Balrf", "Bgoyf");
       // service.createBillionaire(billy);
       // service.createBillionaire(billy2);
        billyRepo.save(billy);
        billyRepo.save(billy2);
        return billy.getId();

    }
}
