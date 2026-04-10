package com.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smartphone extends Prodotto {
    private int imei;
    private int memoria;

    public Smartphone(int codice, BigDecimal prezzo, BigDecimal iva, String nome, String marca, int imei, int memoria) {
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    // metodi set get
    public void setImei(int imei) {
        if (imei > 0) {
            this.imei = imei;
        }
    }

    public int getImei() {
        return this.imei;
    }

    public void setMemoria(int memoria) {
        if (memoria > 0) {
            this.memoria = memoria;
        }
    }

    public int getMemoria() {
        return this.memoria;
    }

    @Override
    public String toString() {    
        String message = "\n#----------#" + "\nCodice prodotto: " + this.codice + "\nMarca: " + this.marca + "\nModello: " + this.nome + "\nCodice imei: " + this.imei + "\nGb di memoria: " + this.memoria + "\nPrezzo + iva: " + this.prezzo + "\n#----------#"; 
        return message;
    }

    @Override
    public void setDiscountedPrice(boolean hasFidelity) {
        // applica sconto del 5% se verificate condizioni
        if (this.memoria <= 32 && hasFidelity) {
            setPrezzoIvato();
            this.prezzo = this.prezzo.subtract(this.prezzo.multiply(new BigDecimal(0.05))).setScale(2, RoundingMode.HALF_EVEN);
        } else {
            super.setDiscountedPrice(hasFidelity);
        }
    }
}
