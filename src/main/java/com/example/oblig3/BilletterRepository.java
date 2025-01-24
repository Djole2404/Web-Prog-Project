package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

// Repository annotasjonen markerer denne klassen som en Data Access Object (DAO) som håndterer databaseoperasjoner.
@Repository
public class BilletterRepository {

    // JdbcTemplate brukes for å utføre SQL-spørringer og oppdateringer mot databasen.
    @Autowired
    private JdbcTemplate db;

    // Metoden lagrer billettene i databasen ved å bruke en SQL INSERT spørring.
    public void lagreBilletter(Billetter billetter){
        // SQL-spørring for å sette inn data i Billetter-tabellen.
        String sql = "INSERT INTO Billetter (filmer, fornavn, etternavn, antall, telefonnr, email) VALUES(?,?,?,?,?,?)";
        // Utfører spørringen og setter inn billettens detaljer.
        db.update(sql,billetter.getFilmer(),billetter.getFornavn(),billetter.getEtternavn(),billetter.getAntall(),billetter.getTelefonnr(),billetter.getEmail());
    }

    // Metoden henter alle billetter fra databasen og returnerer dem som en liste.
    public List<Billetter> hentBilletter(){
        // SQL-spørring for å hente alle billetter fra Billetter-tabellen, sortert etter etternavn.
        String sql = "SELECT * FROM Billetter ORDER BY etternavn";
        // Bruker BeanPropertyRowMapper for å mappe resultatet til en liste av Billetter-objekter.
        List<Billetter> alleBilletter = db.query(sql,new BeanPropertyRowMapper(Billetter.class));
        // Returnerer listen av billetter.
        return alleBilletter;
    }

    // Metoden sletter alle billetter fra databasen.
    public void slettAlleBilletter(){
        // SQL-spørring for å slette alle poster fra Billetter-tabellen.
        String sql = "DELETE FROM Billetter";
        // Utfører spørringen for å slette alle billetter.
        db.update(sql);
    }
}
