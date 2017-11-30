/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.id.pengiriman;

/**
 *
 * @author user
 */
public class MasterData {
  private final double insurance =0.03;
  private String destination;
  private double regulerService;
  private double kilatService;
  private double sameDayService;
  private double oneNightService;
  private double holidaySevice;

    public MasterData() {
    }
  
  

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the regulerService
     */
    public double getRegulerService() {
        return regulerService;
    }

    /**
     * @param regulerService the regulerService to set
     */
    public void setRegulerService(double regulerService) {
        this.regulerService = regulerService;
    }

    /**
     * @return the kilatService
     */
    public double getKilatService() {
        return kilatService;
    }

    /**
     * @param kilatService the kilatService to set
     */
    public void setKilatService(double kilatService) {
        this.kilatService = kilatService;
    }

    /**
     * @return the sameDayService
     */
    public double getSameDayService() {
        return sameDayService;
    }

    /**
     * @param sameDayService the sameDayService to set
     */
    public void setSameDayService(double sameDayService) {
        this.sameDayService = sameDayService;
    }

    /**
     * @return the oneNightService
     */
    public double getOneNightService() {
        return oneNightService;
    }

    /**
     * @param oneNightService the oneNightService to set
     */
    public void setOneNightService(double oneNightService) {
        this.oneNightService = oneNightService;
    }

    /**
     * @return the holidaySevice
     */
    public double getHolidaySevice() {
        return holidaySevice;
    }

    /**
     * @param holidaySevice the holidaySevice to set
     */
    public void setHolidaySevice(double holidaySevice) {
        this.holidaySevice = holidaySevice;
    }

    /**
     * @return the insurance
     */
    public double getInsurance() {
        return insurance;
    }
}