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
public class SkiStrategy implements Strategy{
    @Override
    public boolean checkTemp(int tempF){
        if((tempF<=32)){
            return true;
        }
        else{
            return false;
        }
    }
}
