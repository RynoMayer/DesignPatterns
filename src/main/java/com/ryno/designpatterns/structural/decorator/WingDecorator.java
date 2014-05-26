/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.structural.decorator;

/**
 *
 * @author Ryno
 */
public class WingDecorator extends AnimalDecorator{
    public WingDecorator(Animal animal){
        super(animal);
    }
    @Override
    public String describe() {
        System.out.println("I have wings");
        fly();
        return "flying";
    }
    public String  fly(){
        System.out.println("i can fly");
        return "flying";
    }
}
