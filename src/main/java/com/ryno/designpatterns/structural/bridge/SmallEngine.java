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
public class SmallEngine implements Engine{
    int horsepower;
    public SmallEngine(){
        horsepower = 100;
    }
    @Override
    public int go(){
        System.out.println("small engine running");
        return horsepower;
    }
}
