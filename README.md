Oblig 3
=======
OsloMet brukernavn: s374219

GitHub brukernavn: Djole2404

Github repo URL: https://github.com/data1700-v23/oblig-3-Djole2404.git

Fullt navn: Dorde Mijajlovic

Kort beskrivelse av applikasjon (5-10 setninger):

Applikasjonen brukes for registrering av kino billetter.

Den henter informasjoner fra input-bokser, lagrer dem i database som ligger på server og skriver dem ut tilbake.

Det som vi brukte JavaScript for var opprettelse av forskjellige funksjoner som sørger for at data blir lagret på server

Første funksjon, registrerBillett(), gjør flere ting:henter informasjon fra input-bokser, kaller to andre funksjoner
og sender info til server ved bruk av $.post jquery funksjon.

Andre funksjon, hentBilletter(), henter data fra server ved å kalle /hentBilletter endpoint og skriver den ut i form av tabell.

Tredje funksjon, slettBilletter(), tømmer array og sletter alle informasjon fra server.

Fjerde funksjon, sjekkInput(), sjekker om brukeren har skrevet noe inn i input-bokser og viser beskjed at noe må skrives inn.

BilletterController er en controller som på en måte styrer server og alt som skjer der. Jeg brukte @PostMapping for å lagre info på server
og @GetMapping for å hente info fra server. 

BilletterRepository er en repository hvor SQL delen av prosjektet blir behandlet. 3 funksjoner er brukt for behandling av data i databasen.

I schema.sql opprettet jeg en tabell hvor data fra nettsiden skal settes inn. 

