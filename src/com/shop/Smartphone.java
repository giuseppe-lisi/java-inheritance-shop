package com.shop;

import java.math.BigDecimal;

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
        String message = "\n#----------#" + "\nCodice prodotto: " + this.codice + "\nMarca: " + this.marca + "\nModello: " + this.nome + "\n Codice imei: " + this.imei + "\n Gb di memoria: " + this.memoria + "\nPrezzo + iva" + this.prezzo.add(this.prezzo.multiply(this.iva)) + "\n#----------#"; 
        return message;
    }
}
