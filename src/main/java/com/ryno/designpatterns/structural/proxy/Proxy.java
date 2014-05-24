/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.structural.proxy;

import java.util.Date;

/**
 *
 * @author Ryno
 */
public class Proxy {
    SlowThing slow;
    
    public Proxy(){
        System.out.println("creating proxy at"+ new Date());
    }
    
    public void sayHello(){
        if(slow == null){
            slow = new SlowThing();
        }
        slow.sayHello();
    }
    public String getName(){
        if(slow == null){
            slow = new SlowThing();
        }
        
        String name = slow.getName();
        return name;
    }
    
}
