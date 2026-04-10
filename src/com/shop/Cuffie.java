package com.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        if (lowerCableBt != null && (lowerCableBt.equals("cavo") || lowerCableBt.equals("bluetooth"))) {
            this.cableOrBt = lowerCableBt;
        }
    }

    public String getCableOrBt() {
        return this.cableOrBt;
    }

    @Override
    public String toString() {    
        String message = "#----------#" + "\nCodice prodotto: " + this.codice + "\nColore: " + this.colore + "\nConnessione: " + this.cableOrBt + "\nPrezzo + iva: " + this.prezzo + "\n#----------#"; 
        return message;
    }

    @Override
    public void setDiscountedPrice(boolean hasFidelity) {
        // applica sconto del 10% se non è una smart tv
        if (this.cableOrBt.equals("cavo") && hasFidelity) {
            setPrezzoIvato();
            this.prezzo = this.prezzo.subtract(this.prezzo.multiply(new BigDecimal(0.07))).setScale(2, RoundingMode.HALF_EVEN);
        } else {
            super.setDiscountedPrice(hasFidelity);
        }
    }
}

