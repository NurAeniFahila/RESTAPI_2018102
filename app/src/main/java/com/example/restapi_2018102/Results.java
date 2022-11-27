package com.example.restapi_2018102;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

public class Results implements Serializable {

    private String keterangan;

    private String rukuk;

    private String nama;

    private Integer ayat;

    private String urut;

    private String arti;

    private String asma;

    private String audio;

    private String type;

    private String nomor;

    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getRukuk() {
        return this.rukuk;
    }

    public void setRukuk(String rukuk) {
        this.rukuk = rukuk;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getAyat() {
        return this.ayat;
    }

    public void setAyat(Integer ayat) {
        this.ayat = ayat;
    }

    public String getUrut() {
        return this.urut;
    }

    public void setUrut(String urut) {
        this.urut = urut;
    }

    public String getArti() {
        return this.arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }

    public String getAsma() {
        return this.asma;
    }

    public void setAsma(String asma) {
        this.asma = asma;
    }

    public String getAudio() {
        return this.audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNomor() {
        return this.nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
}

