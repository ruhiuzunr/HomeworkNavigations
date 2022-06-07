package com.example.odev4;

import java.io.Serializable;

public class Kisiler implements Serializable {

    private String isim;
    private String soyad;
    private int yas;

    public Kisiler() {
    }

    public Kisiler(String isim, String soyad, int yas) {
        this.isim = isim;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
