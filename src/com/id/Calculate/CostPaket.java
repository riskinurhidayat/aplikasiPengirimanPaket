package com.id.Calculate;

import com.id.Entity.Paket;
import com.id.Entity.Tipes;
import java.util.List;

/**
 *
 * @author user
 */
public class CostPaket {

    private Double asuransi = 0.03;

    public Double hitungCost(Paket paket) {
        System.out.println("paket: " + paket.getKotaTujuan());
        
        Double totalCost = 0.0;

        Double destinationCost;
        Double weightCost = paket.getBeratBarang();
        Double itemCost = paket.getHargaBarang();

        List<Tipes> servTipe = PengirimanDao.getTarifPaket();
        System.out.println("servtipe " + servTipe.size());
        for (Tipes tipes : servTipe) {
            if (tipes.getDestination().equalsIgnoreCase(paket.getKotaTujuan())) {
                System.out.println("cek kota tujuan " + tipes.getDestination());
                if (paket.getJasaLayanan().equalsIgnoreCase("reguler")) {
                    destinationCost = tipes.getReg();
                    if (paket.isIsAsuransi()) {
                        totalCost = (destinationCost * weightCost) + (itemCost * asuransi);
                    } else {
                        totalCost = destinationCost * weightCost;
                    }
                }
                if (paket.getJasaLayanan().equalsIgnoreCase("kilat")) {
                    destinationCost = tipes.getKilat();
                    if (paket.isIsAsuransi()) {
                        totalCost = (destinationCost * weightCost) + (itemCost * asuransi);
                    } else {
                        totalCost = destinationCost * weightCost;
                    }
                }
                if (paket.getJasaLayanan().equalsIgnoreCase("sds")) {
                    destinationCost = tipes.getSds();
                    if (paket.isIsAsuransi()) {
                        totalCost = (destinationCost * weightCost) + (itemCost * asuransi);
                    } else {
                        totalCost = destinationCost * weightCost;
                    }
                }
                if (paket.getJasaLayanan().equalsIgnoreCase("ons")) {
                    System.out.println("cek ons");
                    destinationCost = tipes.getOns();
                    if (paket.isIsAsuransi()) {
                        totalCost = (destinationCost * weightCost) + (itemCost * asuransi);
                    } else {
                        totalCost = destinationCost * weightCost;
                    }
                }
                if (paket.getJasaLayanan().equalsIgnoreCase("hds")) {
                    destinationCost = tipes.getHds();
                    if (paket.isIsAsuransi()) {
                        totalCost = (destinationCost * weightCost) + (itemCost * asuransi);
                    } else {
                        totalCost = destinationCost * weightCost;
                    }
                }
            }
        }

        return totalCost;
    }
}
