/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.behavioral.chainofresponsibility;

/**
 *
 * @author Ryno
 */
public abstract class PlanetHandler {
    PlanetHandler successor;
    String msg="";
    public void setSuccessor(PlanetHandler successor) {
        this.successor=successor;
        
    }

    public abstract String handleRequest(PlanetEnum request); 
        
    
}
