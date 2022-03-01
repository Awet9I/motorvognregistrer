package com.example.uke9;

public class Eier {
    long personnummer;
    String navn;
    String addresse;
    String kjennetegn;
    String bilmerke;
    String biltype;


    public Eier(long personnummer, String navn, String addresse, String kjennetegn, String bilmerke, String biltype) {
        this.personnummer = personnummer;
        this.navn = navn;
        this.addresse = addresse;
        this.kjennetegn = kjennetegn;
        this.bilmerke = bilmerke;
        this.biltype = biltype;
    }

    public Eier() {
    }

    public long getPersonnummer() {
        return personnummer;
    }

    public String getNavn() {
        return navn;
    }

    public String getAddresse() {
        return addresse;
    }

    public String getKjennetegn() {
        return kjennetegn;
    }

    public String getBilmerke() {
        return bilmerke;
    }

    public String getBiltype() {
        return biltype;
    }

    public void setPersonnummer(long personnummer) {
        this.personnummer = personnummer;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAddresse(String adresse) {
        this.addresse = adresse;
    }

    public void setKjennetegn(String kjennetegn) {
        this.kjennetegn = kjennetegn;
    }

    public void setBilmerke(String bilmerke) {
        this.bilmerke = bilmerke;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }
}
