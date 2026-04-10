package com.shop;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    protected int codice;
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;
    protected BigDecimal iva;

    public Prodotto(int codice, BigDecimal prezzo, BigDecimal iva) {
        this.codice = codice;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Prodotto(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // getter e setter methods
    public int getCodice() {
        return this.codice;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    // helper
    public String toString() {
        String message = "Codice prodotto: " + this.codice + "\nNome prodotto: " + this.nome + "\nMarca: " + this.marca + "\nPrezzo: " + this.prezzo.setScale(2,RoundingMode.HALF_EVEN) + "\nIva: " + this.iva.setScale(2,RoundingMode.HALF_EVEN);
        return message;
    }

    public void setDiscountedPrice(boolean hasFidelity) {
        // ottiene il prezzo totale comprensivo di iva
        this.prezzo = this.prezzo.add(this.prezzo.multiply(this.iva));
        // applica sconto del 2% se l'utente ha una carta fedeltà
        if (hasFidelity) {
            this.prezzo = this.prezzo.subtract(this.prezzo.multiply(new BigDecimal(0.02))).setScale(2, RoundingMode.HALF_EVEN);
        }
    }
}
