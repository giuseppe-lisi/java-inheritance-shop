package com.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    @Override
    public void setDiscountedPrice(boolean hasFidelity) {
        
        // applica sconto del 10% se non è una smart tv
        if (this.isSmartTv == false && hasFidelity) {
            setPrezzoIvato();
            this.prezzo = this.prezzo.subtract(this.prezzo.multiply(new BigDecimal(0.10))).setScale(2, RoundingMode.HALF_EVEN);
        } else {
            super.setDiscountedPrice(hasFidelity);
        }
    }
}
