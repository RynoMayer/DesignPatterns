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
public class Mediator {
    Buyer swedishBuyer;
    Buyer frenchBuyer;
    AmericanSeller usaSeller;
    DollarConverter dollarConverter;
    
    public Mediator(){
        
    }
    public void regSwedishBuyer(SwedishBuyer swedBuyer) {
        this.swedishBuyer=swedBuyer;
    }
    public void regFrenchBuyer(FrenchBuyer frenchBuyer) {
        this.frenchBuyer=frenchBuyer;
    }
    public void regAmericanSeller(AmericanSeller usaSeller) {
        this.usaSeller=usaSeller;
    }
    public void regDollarConverter(DollarConverter dollarConverter) {
        this.dollarConverter=dollarConverter;
    }
    public boolean placeBid(float bid, String unitOfCurrency){
        float dollarAmount = dollarConverter.convertCurrencyToDollars(bid, unitOfCurrency);
        return usaSeller.isBidAccepted(dollarAmount);
    }
}
