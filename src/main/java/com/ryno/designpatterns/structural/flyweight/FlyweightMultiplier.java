/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.structural.flyweight;

/**
 *
 * @author Ryno
 */
public class FlyweightMultiplier implements Flyweight{
    String operation;
    
    public FlyweightMultiplier(){
        operation ="multiplying";
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public int doMath(int a, int b) {
        System.out.println(operation+" "+ a+ " times "+b+" : "+ (a*b));
        return a*b;
    }
    
}
