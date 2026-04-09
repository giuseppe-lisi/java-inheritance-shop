package com.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private int imei;
    private int memoria;

    public Smartphone(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, int imei, int memoria) {
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }


}
