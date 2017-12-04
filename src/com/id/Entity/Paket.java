/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.id.Entity;

/**
 *
 * @author user
 */
public class Paket {
     private String kotaTujuan;
     //private String pembayaran;
     private double panjang;
     private double lebar;
     private double tinggi;
     private double hargaBarang;
     private boolean isAsuransi; 
     //private String provinsi;
     private String jasaLayanan;
     private double beratBarang;

    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }
//
//    /**
//     * @return the pembayaran
//     */
//    public String getPembayaran() {
//        return pembayaran;
//    }
//
//    /**
//     * @param pembayaran the pembayaran to set
//     */
//    public void setPembayaran(String pembayaran) {
//        this.pembayaran = pembayaran;
//    }

    /**
     * @return the panjang
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the isAsuransi
     */
    public boolean isIsAsuransi() {
        return isAsuransi;
    }

    /**
     * @param isAsuransi the isAsuransi to set
     */
    public void setIsAsuransi(boolean isAsuransi) {
        this.isAsuransi = isAsuransi;
    }

//    /**
//     * @return the provinsi
//     */
//    public String getProvinsi() {
//        return provinsi;
//    }
//
//    /**
//     * @param provinsi the provinsi to set
//     */
//    public void setProvinsi(String provinsi) {
//        this.provinsi = provinsi;
//    }


    /**
     * @return the beratBarang
     */
    public double getBeratBarang() {
        return beratBarang;
    }

    /**
     * @param beratBarang the beratBarang to set
     */
    public void setBeratBarang(double beratBarang) {
        this.beratBarang = beratBarang;
    }

    /**
     * @return the jasaLayanan
     */
    public String getJasaLayanan() {
        return jasaLayanan;
    }

    /**
     * @param jasaLayanan the jasaLayanan to set
     */
    public void setJasaLayanan(String jasaLayanan) {
        this.jasaLayanan = jasaLayanan;
    }

    
}
