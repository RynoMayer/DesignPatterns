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
public class KelvinReporter {
    double tempK;
    public KelvinReporter(){
        
    }
    public double getTemp(){
        return tempK;
    }
    public void setTemp(double tempK){
        this.tempK = tempK;
    }
}
