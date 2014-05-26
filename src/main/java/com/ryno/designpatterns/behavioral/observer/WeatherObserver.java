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
public interface WeatherObserver {
    public void doUpdate(int temp);
    public int getTemp(int temp);
}
