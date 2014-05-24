/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.creational.prototype;

/**
 *
 * @author Ryno
 */
public class Dog implements Prototype{
    String sound;
    
    public Dog(String sound){
        this.sound=sound;
    }
    @Override
    public Prototype doClone(){
        return new Dog(sound);
    }
    public String getSound(){
        return this.sound;
    }
    
    public String toString(){
        return "dog says "+sound;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
