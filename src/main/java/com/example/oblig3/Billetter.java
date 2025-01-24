package com.example.oblig3;

// Class representing movie ticket information
public class Billetter {
    // Private fields to store movie ticket details
    private String filmer;         // Movie title
    private String fornavn;        // First name of the person
    private String etternavn;      // Last name of the person
    private Integer antall;        // Number of tickets
    private String telefonnr;      // Phone number of the person
    private String email;          // Email address of the person

    // Constructor to initialize the ticket information
    public Billetter(String filmer, String fornavn, String etternavn, Integer antall, String telefonnr, String email) {
        this.filmer = filmer;      // Set the movie title
        this.fornavn = fornavn;    // Set the first name
        this.etternavn = etternavn; // Set the last name
        this.antall = antall;      // Set the number of tickets
        this.telefonnr = telefonnr; // Set the phone number
        this.email = email;        // Set the email address
    }

    // Default constructor (no parameters)
    public Billetter() {}

    // Getter for the movie title
    public String getFilmer() {
        return filmer;
    }

    // Setter for the movie title
    public void setFilmer(String filmer) {
        this.filmer = filmer;
    }

    // Getter for the first name
    public String getFornavn() {
        return fornavn;
    }

    // Setter for the first name
    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    // Getter for the last name
    public String getEtternavn() {
        return etternavn;
    }

    // Setter for the last name
    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    // Getter for the number of tickets
    public Integer getAntall() {
        return antall;
    }

    // Setter for the number of tickets
    public void setAntall(Integer antall) {
        this.antall = antall;
    }

    // Getter for the phone number
    public String getTelefonnr() {
        return telefonnr;
    }

    // Setter for the phone number
    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    // Getter for the email address
    public String getEmail() {
        return email;
    }

    // Setter for the email address
    public void setEmail(String email) {
        this.email = email;
    }

    // Override the toString() method to return a formatted string with ticket details
    @Override
    public String toString(){
        return "Film: " + filmer         // Movie title
                + "Fornavn: " + fornavn // First name
                + "Etternavn: " + etternavn // Last name
                + "Antall: " + antall   // Number of tickets
                + "Telefonnr: " + telefonnr // Phone number
                + "Email: " + email;     // Email address
    }
}
