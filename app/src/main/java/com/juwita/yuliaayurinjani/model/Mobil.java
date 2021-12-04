package com.juwita.yuliaayurinjani.model;

import java.io.Serializable;

public class Mobil implements Serializable {
    String jeniMobil,namaMobil, asalMobil, descMobil;
    int gambarMobil;

    public Mobil(String jeniMobil, String namaMobil, String asalMobil, String descMobil, int gambarMobil) {
        this.jeniMobil = jeniMobil;
        this.namaMobil = namaMobil;
        this.asalMobil = asalMobil;
        this.descMobil = descMobil;
        this.gambarMobil = gambarMobil;
    }

    public String getJeniMobil() {
        return jeniMobil;
    }

    public void setJeniMobil(String jeniMobil) {
        this.jeniMobil = jeniMobil;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public String getAsalMobil() {
        return asalMobil;
    }

    public void setAsalMobil(String asalMobil) {
        this.asalMobil = asalMobil;
    }

    public String getDescMobil() {
        return descMobil;
    }

    public void setDescMobil(String descMobil) {
        this.descMobil = descMobil;
    }

    public int getGambarMobil() {
        return gambarMobil;
    }

    public void setGambarMobil(int gambarMobil) {
        this.gambarMobil = gambarMobil;
    }
}
