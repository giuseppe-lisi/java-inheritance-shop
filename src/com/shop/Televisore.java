package com.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {
    private float larghezza;
    private float lunghezza;
    private boolean isSmartTv;

    public Televisore(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, float larghezza,
            float lunghezza, boolean isSmartTv) {
        super(codice, nome, marca, prezzo, iva);
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
        this.isSmartTv = isSmartTv;
    }

    // setter e getter
    public void setLarghezza(float larghezza) {
        if (larghezza > 0) {
            this.larghezza = larghezza;
        }
    }

    public float getLarghezza() {
        return this.larghezza;
    }

    public void setLunghezza(float lunghezza) {
        if (lunghezza > 0) {
            this.lunghezza = lunghezza;
        }
    }

    public float getLunghezza() {
        return this.lunghezza;
    }

    public void setIsSmartTv(boolean isSmartTv) {
        this.isSmartTv = isSmartTv;
    }

    public boolean getIsSmartTv() {
        return this.isSmartTv;
    }
}
