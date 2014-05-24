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
public class JapaneseMealBuilder implements MealBuilder{
    private Meal meal;

    @Override
    public void buildDrink() {
       meal.setDrink("sake");
    }

    @Override
    public void buildFood() {
        meal.setFood("teriyaki");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
    
    
}
