/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.behavioral;

import com.ryno.designpatterns.behavioral.mediator.AmericanSeller;
import com.ryno.designpatterns.behavioral.mediator.Buyer;
import com.ryno.designpatterns.behavioral.mediator.DollarConverter;
import com.ryno.designpatterns.behavioral.mediator.FrenchBuyer;
import com.ryno.designpatterns.behavioral.mediator.Mediator;
import com.ryno.designpatterns.behavioral.mediator.SwedishBuyer;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ryno
 */
public class TestMediator {
    
    public TestMediator() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void RunMediator() {
         Mediator mediator = new Mediator();
         
         Buyer swedishBuyer = new SwedishBuyer(mediator);
         Buyer frenchBuyer = new FrenchBuyer(mediator);
         float sellingPriceInDollars = 10.0f;
         AmericanSeller usaSeller = new AmericanSeller(mediator, sellingPriceInDollars);
         DollarConverter dollarConverter = new DollarConverter(mediator);
         
         float swedishBidInKronor=55.0f;
         while(!swedishBuyer.attemptToPurchase(swedishBidInKronor)){
             swedishBidInKronor+=15.0f;
         }
         Assert.assertEquals(usaSeller.isBidAccepted(12),true);
         
         float frenchBidInEuros=3.0f;
         while(!frenchBuyer.attemptToPurchase(frenchBidInEuros)){
             Assert.assertEquals(usaSeller.isBidAccepted(frenchBidInEuros),false);
             frenchBidInEuros+=1.5f;
         }
         Assert.assertEquals(usaSeller.isBidAccepted(frenchBidInEuros),false);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
