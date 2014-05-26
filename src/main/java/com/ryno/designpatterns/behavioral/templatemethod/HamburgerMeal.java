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
public class HamburgerMeal extends Meal{
    @Override
    public String prep() {
        System.out.println("getting buns, patties");
        return "preppingBunsBeef";
    }
    @Override
    public String cook(){
        System.out.println("cooking patties");
        return "cookingBeef";
    }
    @Override
    public String cleanup(){
        System.out.println("cleaning grill");
        return "cleaningGrill";
    }
}
