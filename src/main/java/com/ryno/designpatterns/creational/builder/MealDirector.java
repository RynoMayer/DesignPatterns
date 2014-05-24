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
public class MealDirector {
 private MealBuilder mealBuild=null;
 
 public MealDirector(MealBuilder mealBuild){
     this.mealBuild=mealBuild;
 }
 
 public void constructMeal(){
     mealBuild.buildDrink();
     mealBuild.buildFood();
 }
 public Meal getMeal(){
     return mealBuild.getMeal();
 }
}
