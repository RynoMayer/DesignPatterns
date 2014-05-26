/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.behavioral.strategy;

/**
 *
 * @author Ryno
 */
public class Context {
   int tempF;
   Strategy strategy;
   
   public Context(int tempF, Strategy strategy){
       this.tempF=tempF;
       this.strategy=strategy;
   }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getTempF() {
        return tempF;
    }
   public boolean getResult(){
       return strategy.checkTemp(tempF);
   }
}
