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
public class Person implements Prototype{
    String name;
    
    public Person (String name){
        this.name=name;
    }
    @Override
    public Prototype doClone(){
        return new Person(name);
    }
    @Override
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return "This person is named "+ name;
    }
}
