/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.structural.bridge;

/**
 *
 * @author Ryno
 */
public abstract class Vehicle {
    Engine engine;
    int weightKg;
    String speed;
    
    public abstract void drive();
    
    public void setEngine(Engine engine){
        this.engine= engine;
    }
    
    public void reportOnSpeed(int horsepower){
        int ratio = weightKg/horsepower;
        if(ratio<3){
            System.out.println("vechile going fast");
            speed= "fast";
        }else if((ratio>=3) && (ratio<8)){
            System.out.println("vehicle going average");
            speed= "average";
        }else{
            System.out.println("vehicle going slow");
            speed= "slow";
        }
    }

    public String getSpeed() {
        return speed;
    }

    
   
}
