/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.structural.adapter;

/**
 *
 * @author Ryno
 */
public class CelsiusReporter {
    double tempC;
    public CelsiusReporter(){
        
    }
    public double getTemp(){
        return tempC;
    }
    public void setTemp(double tempC){
        this.tempC = tempC;
    }
}
