/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.id.Calculate;

import com.id.Entity.Paket;
import com.id.Entity.Tipes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PengirimanDao {
//
//    public static List<Tipes> TarifPaket() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public static List<Tipes> getTarifPaket() {

        List<Tipes> daftarTarifs = new ArrayList<>();

        try {
            Scanner scan;
            scan = new Scanner(new File(PengirimanDao.class.getResource("/com/id/app/Asset/AppBarang.txt").getFile()));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(",");
                Tipes tipes = new Tipes();
                tipes.setDestination(data[0]);

                tipes.setReg(Double.parseDouble(data[1].trim()));
                tipes.setKilat(Double.parseDouble(data[2].trim()));
                tipes.setSds(Double.parseDouble(data[3].trim()));
                tipes.setOns(Double.parseDouble(data[4].trim()));
                tipes.setHds(Double.parseDouble(data[5].trim()));

                daftarTarifs.add(tipes);
            }

        } catch (FileNotFoundException fileErr) {
            //fileErr.printStackTrace();
            System.out.println("File Tidak Ada");
        }

        return daftarTarifs;

    }
}
