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
public abstract class Thing {
    public void sayHello() {
        System.out.println(this.getClass().getSimpleName());
    }
    public String getName(){
        String name=this.getClass().getSimpleName();
        return name;
    }
}
