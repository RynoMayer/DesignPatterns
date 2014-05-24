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
public class TempClassReporter extends CelsiusReporter implements TempInfo{
    @Override
    public double getTempF(){
        return cToF(tempC);
    }
    @Override
    public void setTempF(double tempF){
        this.tempC=fToC(tempF);
    }
    @Override
    public double getTempC(){
        return tempC;
    }
    @Override
    public void setTempC(double tempC){
        this.tempC=tempC;
    }
    
    private double fToC(double f){
        return((f-32)*5/9);
    }
    private double cToF(double c){
        return ((c*9/5)+32);
    }
}
