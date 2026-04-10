package com.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String colore;
    private String cableOrBt;

    public Cuffie(int codice, BigDecimal prezzo, BigDecimal iva, String colore, String cableOrBt) {
        super(codice, prezzo, iva);
        this.colore = colore;
        this.cableOrBt = cableOrBt;
    }

    // setter e getter
    public void setColore(String colore) {
        if (colore != null) {
            this.colore = colore;
        }
    }

    public String getColore() {
        return this.colore;
    }

    public void setCableOrBt(String cableOrBt) {
        String lowerCableBt = cableOrBt.toLowerCase();
        if (lowerCableBt != null && (lowerCableBt.equals("cavo") || lowerCableBt.equals("bluetooth") || lowerCableBt.equals("entrambi"))) {
            this.cableOrBt = lowerCableBt;
        }
    }

    public String getCableOrBt() {
        return this.cableOrBt;
    }

    @Override
    public String toString() {    
        String message = "Codice prodotto: " + this.codice + "\n Colore: " + this.colore + "\n Connessione: " + this.cableOrBt + "\n#----------#"; 
        return message;
    }
}

