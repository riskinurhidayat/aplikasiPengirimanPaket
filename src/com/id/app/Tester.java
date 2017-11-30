/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.id.app;

import com.id.pengiriman.MasterData;
import com.id.pengiriman.TarifFileDao;
import java.util.List;

/**
 *
 * @author user
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     List<MasterData> getMasterData = TarifFileDao.getListData();
     for (MasterData masterData : getMasterData){
         System.out.println("Kota Tujuan Anda" +masterData.getDestination()+"Dengan Reguler Tarif Anda"+masterData.getRegulerService() );
         
     }
    }
    
}
