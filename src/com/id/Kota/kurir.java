/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.id.Kota;

import java.util.Date;

/**
 *
 * @author user
 */
public class kurir {
    private String codePackage;
            private double weight;
            private double lengths;
            private double witdhs;
            private double height;
            private double price;
            private String paymentMethod;
            private Date senDate;

    public kurir() {
    }
            

    /**
     * @return the codePackage
     */
    public String getCodePackage() {
        return codePackage;
    }

    /**
     * @param codePackage the codePackage to set
     */
    public void setCodePackage(String codePackage) {
        this.codePackage = codePackage;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the lengths
     */
    public double getLengths() {
        return lengths;
    }

    /**
     * @param lengths the lengths to set
     */
    public void setLengths(double lengths) {
        this.lengths = lengths;
    }

    /**
     * @return the witdhs
     */
    public double getWitdhs() {
        return witdhs;
    }

    /**
     * @param witdhs the witdhs to set
     */
    public void setWitdhs(double witdhs) {
        this.witdhs = witdhs;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the senDate
     */
    public Date getSenDate() {
        return senDate;
    }

    /**
     * @param senDate the senDate to set
     */
    public void setSenDate(Date senDate) {
        this.senDate = senDate;
    }
            
            
}
   