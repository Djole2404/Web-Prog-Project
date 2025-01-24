package com.example.oblig3;

public class Billetter {
    private String filmer;
    private String fornavn;
    private String etternavn;
    private Integer antall;
    private String telefonnr;
    private String email;

    public Billetter(String filmer, String fornavn, String etternavn, Integer antall, String telefonnr, String email) {
        this.filmer = filmer;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.antall = antall;
        this.telefonnr = telefonnr;
        this.email = email;
    }

    public Billetter(){}

    public String getFilmer() {
        return filmer;
    }

    public void setFilmer(String filmer) {
        this.filmer = filmer;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public Integer getAntall() {
        return antall;
    }

    public void setAntall(Integer antall) {
        this.antall = antall;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Film: " + filmer
                + "Fornavn: " + fornavn
                + "Etternavn: " + etternavn
                + "Antall: " + antall
                + "Telefonnr: " + telefonnr
                + "Email: " + email;
    }
}
