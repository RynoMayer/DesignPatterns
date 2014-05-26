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
public class EarthHandler extends PlanetHandler{
    public String handleRequest(PlanetEnum request) {
        if(request == PlanetEnum.EARTH){
            msg+="1";
            System.out.println("handling "+request);
            System.out.println("Earth is comfy");
            System.out.println(msg);
            return msg;
        }else{
            msg+="0";
            System.out.println("earthHandler not handling "+request);
            if(successor != null){
                successor.handleRequest(request);
            }
            System.out.println(msg);
            return msg;
        }
            
    }
}
