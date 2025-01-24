function registrerBillett() {
    const ticket = {
        filmer: $("#filmer").val(),
        fornavn: $("#fornavn").val(),
        etternavn: $("#etternavn").val(),
        antall: $("#antall").val(),
        telefonnr: $("#telefonnr").val(),
        email: $("#epost").val()
    };

    validering();

    $.post("/lagreBilletter", ticket, function (){
        hentBilletter();
    });

    $("#filmer").val("");
    $("#fornavn").val("");
    $("#etternavn").val("");
    $("#antall").val("");
    $("#telefonnr").val("");
    $("#epost").val("");
}
function hentBilletter(){
    $.get("/hentBilletter", function(data){
        let ut="<table class='table table-striped'><tr><th>Film</th><th>Fornavn</th>" +
            "<th>Etternavn</th><th>Antall</th>" +
            "<th>Email</th><th>Telefonnr</th>";
        for(const ticket of data){
            ut+="<tr><td>" + ticket.filmer+"</td>" + "<td>"+ticket.fornavn+"</td>"+"<td>"+
                ticket.etternavn+"</td>"+
                "<td>" + ticket.antall + "</td>"+
                "<td>"+ticket.email+"</td>"+
                "<td>"+ticket.telefonnr +"</td>";
        }
        $("#ut").html(ut);
        });
    };
function slettBilletter(){
    $.get("/slettBilletter", function(){
        hentBilletter()
    })
}
function validering(){
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
