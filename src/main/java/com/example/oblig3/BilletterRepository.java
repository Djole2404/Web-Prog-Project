package com.example.oblig3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BilletterRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreBilletter(Billetter billetter){
        String sql = "INSERT INTO Billetter (filmer, fornavn, etternavn, antall, telefonnr, email) VALUES(?,?,?,?,?,?)";
        db.update(sql,billetter.getFilmer(),billetter.getFornavn(),billetter.getEtternavn(),billetter.getAntall(),billetter.getTelefonnr(),billetter.getEmail());
    }
    public List<Billetter> hentBilletter(){
        String sql = "SELECT * FROM Billetter ORDER BY etternavn";
        List<Billetter> alleBilletter = db.query(sql,new BeanPropertyRowMapper(Billetter.class));
        return alleBilletter;
    }
    public void slettAlleBilletter(){
        String sql = "DELETE FROM Billetter";
        db.update(sql);
    }
}
