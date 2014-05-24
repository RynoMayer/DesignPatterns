/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.structural.composite;

/**
 *
 * @author Ryno
 */
public class Leaf implements Component{
    String name;
    String msg;
    
    public Leaf(String name){
        this.name=name;
    }
    @Override
    public void sayHello(){
        System.out.println(name +": hello");
        getHello();
    }
    @Override
    public void sayBye(){
        System.out.println(name+": bye");
        getBye();
    }
    @Override
    public String getBye(){
        msg="Bye";
        return name+msg;
    }
    @Override
    public String getHello(){
        msg="Hello";
        return name+msg;
    }
}
