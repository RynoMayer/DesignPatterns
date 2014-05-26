/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.behavioral.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Ryno
 */
public class WeatherStation implements WeatherSubject{
    Set<WeatherObserver> weatherObservers;
    int temp;
    
    public WeatherStation(int temp){
        weatherObservers = new HashSet<WeatherObserver>();
        this.temp=temp;
    }
    
    @Override
    public void addObserver(WeatherObserver weatherObserver){
        weatherObservers.add(weatherObserver);
    }
    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
        
    }
    @Override
    public void doNotify(){
        Iterator<WeatherObserver>it = weatherObservers.iterator();
        while (it.hasNext()){
            WeatherObserver weatherObserver = it.next();
            weatherObserver.doUpdate(temp);
        }
    }

    public int getTemp() {
        return temp;
    }
    
    public void setTemp(int newTemp){
        System.out.println("weather station setting temp t0 " + newTemp);
        temp=newTemp;
        doNotify();
    }
}
