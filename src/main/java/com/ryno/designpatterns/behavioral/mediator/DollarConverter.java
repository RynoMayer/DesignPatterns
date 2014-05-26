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
public class DollarConverter {
    Mediator mediator;
    public static final float DOLLAR_UNIT = 1.0f;
    public static final float EURO_UNIT = 0.7f;
    public static final float KRONA_UNIT = 8.0f;
    
    public DollarConverter(Mediator mediator){
        this.mediator=mediator;
        mediator.regDollarConverter(this);
    }
    public float convertEuroToDollars(float euros){
        float dollars = euros * (DOLLAR_UNIT / EURO_UNIT);
        System.out.println("converting "+euros+" E to "+dollars+ "$");
        return dollars;
    }
    public float convertKronorToDollars(float krona){
        float dollars = krona * (DOLLAR_UNIT / KRONA_UNIT);
        System.out.println("converting "+krona+" E to "+dollars+ "$");
        return dollars;
    }
    public float convertCurrencyToDollars(float amount, String unitOfCurrency){
        if("krona".equalsIgnoreCase(unitOfCurrency)){
            return convertKronorToDollars(amount);
        }else{
        return convertEuroToDollars(amount);
        }
    }
}
