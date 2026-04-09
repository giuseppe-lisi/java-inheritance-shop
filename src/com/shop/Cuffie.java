package com.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String colore;
    private String cableOrBt;

    public Cuffie(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, String cableOrBt) {
        super(codice, nome, marca, prezzo, iva);
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
        if (cableOrBt != null && (cableOrBt == "cavo" || cableOrBt == "bluetooth" || cableOrBt == "entrambi")) {
            this.cableOrBt = cableOrBt;
        }
    }

    public String getCableOrBt() {
        return this.cableOrBt;
    }
}

