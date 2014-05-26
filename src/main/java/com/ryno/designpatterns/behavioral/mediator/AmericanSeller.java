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
public class AmericanSeller {
    Mediator mediator;
    float priceInDollars;
    
    public AmericanSeller(Mediator mediator, float priceInDollars){
        this.mediator=mediator;
        this.priceInDollars=priceInDollars;
        this.mediator.regAmericanSeller(this);
    }
    public boolean isBidAccepted(float bidInDollars){
        if(bidInDollars>=priceInDollars){
            System.out.println("seller accept bid of "+bidInDollars);
            return true;
        }else{
            System.out.println("seller rejects bid of "+bidInDollars);
            return false;
        }
    }
}
