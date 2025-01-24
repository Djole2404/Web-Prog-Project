// Funksjon for å registrere en billett ved å samle inn data fra skjemaet og sende det til serveren.
function registrerBillett() {
    // Henter verdiene fra inputfeltene i skjemaet og lager et ticket-objekt.
    const ticket = {
        filmer: $("#filmer").val(),
        fornavn: $("#fornavn").val(),
        etternavn: $("#etternavn").val(),
        antall: $("#antall").val(),
        telefonnr: $("#telefonnr").val(),
        email: $("#epost").val()
    };

    // Kaller valideringsfunksjonen for å sjekke at dataene er riktig fylt ut.
    validering();

    // Sender dataene til serveren via en POST-forespørsel for å lagre billetten.
    $.post("/lagreBilletter", ticket, function (){
        // Etter at billetten er lagret, henter alle billetter på nytt.
        hentBilletter();
    });

    // Tømmer inputfeltene etter registrering.
    $("#filmer").val("");
    $("#fornavn").val("");
    $("#etternavn").val("");
    $("#antall").val("");
    $("#telefonnr").val("");
    $("#epost").val("");
}

// Funksjon for å hente alle billetter fra serveren og vise dem i en tabell.
function hentBilletter(){
    // Sender GET-forespørsel for å hente billetter.
    $.get("/hentBilletter", function(data){
        // Lager HTML-struktur for tabellen som skal vise billettene.
        let ut="<table class='table table-striped'><tr><th>Film</th><th>Fornavn</th>" +
            "<th>Etternavn</th><th>Antall</th>" +
            "<th>Email</th><th>Telefonnr</th>";
        
        // Itererer gjennom billettene og legger dem til tabellen.
        for(const ticket of data){
            ut+="<tr><td>" + ticket.filmer+"</td>" + "<td>"+ticket.fornavn+"</td>"+"<td>"+
                ticket.etternavn+"</td>"+
                "<td>" + ticket.antall + "</td>"+
                "<td>"+ticket.email+"</td>"+
                "<td>"+ticket.telefonnr +"</td>";
        }
        // Oppdaterer HTML-elementet med id 'ut' for å vise tabellen.
        $("#ut").html(ut);
    });
}

// Funksjon for å slette alle billetter ved å sende en GET-forespørsel.
function slettBilletter(){
    // Sender GET-forespørsel for å slette alle billetter.
    $.get("/slettBilletter", function(){
        // Etter sletting, henter alle billetter på nytt.
        hentBilletter();
    })
}

// Funksjon for å validere skjemaet før billetten kan registreres.
function validering(){
    // Sjekker om de nødvendige feltene er tomme og viser en feilmelding om de er det.
    if($("#fornavn").val()===""){
        $("#feilFornavn").html("You must type in name");
    }
    if($("#etternavn").val()===""){
        $("#feilEtternavn").html("You must type in surname");
    }
    if($("#telefonnr").val()===""){
        $("#feilTlf").html("You must type in number");
    }
    if($("#epost").val()===""){
        $("#feilEpost").html("You must type in epost");
    }
    if($("#antall").val()===""){
        $("#feilAntall").html("You must type in number");
    }
}
