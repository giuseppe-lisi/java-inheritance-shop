package com.shop;
import java.math.BigDecimal;

public class Prodotto {
    protected int codice;
    protected String nome;
    protected String marca;
    protected BigDecimal prezzo;
    protected BigDecimal iva;

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

    public String getNome(String nome) {
        return this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca(String marca) {
        return this.marca = marca;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getPrezzo(BigDecimal prezzo) {
        return this.prezzo;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getIva(BigDecimal iva) {
        return this.iva;
    }
}
