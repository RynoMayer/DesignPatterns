/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.behavioral.observer;

/**
 *
 * @author Ryno
 */
public class WeatherCustomer1 implements WeatherObserver{
    @Override
    public void doUpdate(int temp){
        System.out.println("weather customer 1 just found out the temp is "+temp);
    }
    @Override
    public int getTemp(int temp){
        return temp;
    }
}
