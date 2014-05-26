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
public class LivingAnimal implements Animal{
    
    @Override
    public String describe() {
        System.out.println("I R Animal");
        return "animal";
    }
}
