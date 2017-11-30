/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.id.pengiriman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TarifFileDao {
    public static List<MasterData> getListData(Scanner scan){
        List<MasterData> dataList = new ArrayList();
        try {
            scan = new Scanner(new File("E:/Pengiriman/AppBarang.txt"));
            while (scan.hasNextLine());
            MasterData Kurir = new MasterData();
            String line = scan.nextLine();
            String[] data = line.split(",");
            Kurir.setDestination(data[0]);
            Kurir.setRegulerService(Double.parseDouble(data[1]));
            Kurir.setKilatService(Double.parseDouble(data[2]));
            Kurir.setSameDayService(Double.parseDouble(data[3]));
            Kurir.setOneNightService(Double.parseDouble(data[4]));
            Kurir.setHolidaySevice(Double.parseDouble(data[5]));
            
            dataList.add(Kurir);
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TarifFileDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataList;
        
        
              
        }

    public static List<MasterData> getListData() {
        return null;
        
    }
        
    }

    