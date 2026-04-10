package com.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {
    private float pollici;
    private boolean isSmartTv;

    public Televisore(int codice, BigDecimal prezzo, BigDecimal iva, float pollici, boolean isSmartTv) {
        super(codice, prezzo, iva);
        this.pollici = pollici;
        this.isSmartTv = isSmartTv;
    }

    // setter e getter
    public void setPollici(float pollici) {
        if (pollici > 0) {
            this.pollici = pollici;
        }
    }

    public float getPollici() {
        return this.pollici;
    }

    public void setIsSmartTv(boolean isSmartTv) {
        this.isSmartTv = isSmartTv;
    }

    public boolean getIsSmartTv() {
        return this.isSmartTv;
    }

    @Override
    public String toString() {    
        String message = "#----------#\n" + "Codice prodotto: " + this.codice + "\nPollici: " + this.pollici + "\nÈ una smart tv: " + this.isSmartTv + "\nPrezzo + iva: " + this.prezzo + "\n#----------#"; 
        return message;
    }
}
