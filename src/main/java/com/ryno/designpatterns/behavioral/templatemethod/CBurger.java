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
public class CBurger extends Meal{
    @Override
    public String prep() {
        System.out.println("getting beef+cheese");
        return "gettingCheese";
    }
    
    @Override
    public String cook(){
        System.out.println("cooking beef in pan");
        return "cookingBeefPan";
    }
    @Override
    public String eat(){
        System.out.println("yum cheesy");
        return "yumCheesy";
    }
    @Override
    public String cleanup(){
        System.out.println("doDishes");
        return "doDishes";
    }
}
