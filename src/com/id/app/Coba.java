/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.id.app;

import com.id.Calculate.CostPaket;
import com.id.Entity.Paket;
import java.util.List;

/**
 *
 * @author user
 */
public class Coba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Paket paket1 = new Paket();
        paket1.setKotaTujuan("bandung");
        paket1.setLebar(2.0);
        paket1.setPanjang(5.0);
        paket1.setTinggi(4.0);
        paket1.setBeratBarang(5.0);
        paket1.setIsAsuransi(false);
        paket1.setJasaLayanan("reguler");
        paket1.setHargaBarang(25000.0);

        CostPaket cost = new CostPaket();
        double costs = cost.hitungCost(paket1);
        
        
        
//        System.out.println("Tujuan : " + paket1.getKotaTujuan());
//        System.out.println("Tipe Paket : " + paket1.getJasaLayanan());
//        System.out.println("Total : "+costs);

     CostPaket cost = new perhitungan();
     

    }

}
