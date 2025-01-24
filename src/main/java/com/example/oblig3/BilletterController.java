package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// RestController annotasjonen gjør at denne klassen kan håndtere HTTP forespørsler (REST API).
@RestController
public class BilletterController {

    // Autowired annotasjonen injiserer BilletterRepository avhengigheten i denne klassen.
    @Autowired
    BilletterRepository rep;

    // PostMapping annotasjonen knytter metoden til HTTP POST forespørsler på /lagreBilletter.
    @PostMapping("/lagreBilletter")
    public void lagreBillett(Billetter innBillett) {
        // Metoden lagrer billetten (innBillett) ved å kalle lagreBilletter på BilletterRepository.
        rep.lagreBilletter(innBillett);
    }

    // GetMapping annotasjonen knytter metoden til HTTP GET forespørsler på /hentBilletter.
    @GetMapping("/hentBilletter")
    public List<Billetter> skrivUt() {
        // Metoden henter og returnerer listen med billetter fra BilletterRepository.
        return rep.hentBilletter();
    }

    // GetMapping annotasjonen knytter metoden til HTTP GET forespørsler på /slettBilletter.
    @GetMapping("/slettBilletter")
    public void slettAlle() {
        // Metoden sletter alle billetter ved å kalle slettAlleBilletter på BilletterRepository.
        rep.slettAlleBilletter();
    }
}
