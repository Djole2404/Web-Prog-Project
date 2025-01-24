package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BilletterController {

    @Autowired
    BilletterRepository rep;

    @PostMapping("/lagreBilletter")
    public void lagreBillett(Billetter innBillett){rep.lagreBilletter(innBillett);}
    @GetMapping("/hentBilletter")
    public List<Billetter> skrivUt(){
        return rep.hentBilletter();
    }
    @GetMapping("/slettBilletter")
    public void slettAlle(){
        rep.slettAlleBilletter();
    }
}