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
public class TempObjectReporter implements TempInfo{
    CelsiusReporter cRep;
    
    public TempObjectReporter(){
        cRep = new CelsiusReporter();
    }
    @Override
    public double getTempC(){
        return cRep.getTemp();
    }
    @Override
    public double getTempF(){
        return cToF(cRep.getTemp());
    }
    @Override
    public void setTempC(double tempC){
        cRep.setTemp(tempC);
    }
    @Override
    public void setTempF(double tempF){
        cRep.setTemp(fToC(tempF));
    }
    
    private double fToC(double f){
        return((f-32)*5/9);
    }
    private double cToF(double c){
        return ((c*9/5)+32);
    }
}
