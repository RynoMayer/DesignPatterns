/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.behavioral.mediator;

/**
 *
 * @author Ryno
 */
public class Buyer {
    Mediator mediator;
    String unitOfCurrency;
    
    public Buyer(Mediator mediator, String unitOfCurrency){
        this.mediator=mediator;
        this.unitOfCurrency= unitOfCurrency;
    }
    public boolean attemptToPurchase(float bid){
        System.out.println("buyer attempting bid of "+ bid + " "+ unitOfCurrency);
        return mediator.placeBid(bid, unitOfCurrency);
    }
}
