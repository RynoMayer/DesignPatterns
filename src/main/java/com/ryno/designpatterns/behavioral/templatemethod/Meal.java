/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.behavioral.templatemethod;

/**
 *
 * @author Ryno
 */
public abstract class Meal {
    public final void doMeal(){
        prep();
        cook();
        eat();
        cleanup();
    }
    public abstract String prep();
    public abstract String cook();
    public String eat(){
        System.out.println("yum");
        return "yum";
    }
    public abstract String cleanup();
}
