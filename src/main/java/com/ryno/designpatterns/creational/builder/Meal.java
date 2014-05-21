/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.creational.builder;

/**
 *
 * @author Ryno
 */
public class Meal {
    private String drink;
    private String food;
    
    public String getDrink(){
       return this.drink; 
    }
    public String getFood(){
        return this.food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setFood(String food) {
        this.food = food;
    }
    
    
}
