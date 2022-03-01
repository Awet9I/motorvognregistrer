

function register(){
    const eiere = {
        personnummer: $("#personnummer").val(),
        navn: $("#navn").val(),
        addresse: $("#addresse").val(),
        kjennetegn: $("#tegn").val(),
        bilmerke: $("#merke").val(),
        biltype: $("#type").val()
    }

    $.post("/registre", eiere, function (){
        hentAlle();
    })

    $("#personnummer").val("");
    $("#navn").val("");
    $("#addresse").val("");
    $("#tegn").val("");
    $("#merke").val("");
    $("#type").val("");


}

function hentAlle(){
    $.get("/hentalle", function (data){
        formaterData(data)
    })
}

function formaterData(eiere){
    let ut = "<table class='table table-striped'>" +
        "<tr>" +
        "<th>Personnummer</th><th>Navn</th><th>Adresse</th>" +
        "<th>Kjennetegn</th><th>Bilmerke</th><th>Biltype</th>"+
        "</tr>"

    for(const eier of eiere){
        ut+="<tr><td>"+ eier.personnummer +"</td><td>" + eier.navn+"</td><td>" + eier.addresse + "</td><td>" +
            eier.kjennetegn +" </td><td>" + eier.bilmerke+"</td><td>"+ eier.biltype+"</td></tr>"

    }
    $("#biler").html(ut);
}


function slettAlle(){
    $.get("/slettalle", function (){
       hentAlle();
    })
}