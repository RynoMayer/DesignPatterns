/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.behavioral;

import com.ryno.designpatterns.behavioral.chainofresponsibility.EarthHandler;
import com.ryno.designpatterns.behavioral.chainofresponsibility.MercuryHandler;
import com.ryno.designpatterns.behavioral.chainofresponsibility.PlanetEnum;
import com.ryno.designpatterns.behavioral.chainofresponsibility.PlanetHandler;
import com.ryno.designpatterns.behavioral.chainofresponsibility.VenusHandler;
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
public class TestChainOfResponsibility {
    
    public TestChainOfResponsibility() {
    }

    // TODO add test methods here.
    // The methods must be anno0tated with annotation @Test. For example:
    //
     @Test
     public void runChain(){
         PlanetHandler chain = setUpChain();
         //submit requests
         //chain.handleRequest(PlanetEnum.MERCURY);
         Assert.assertEquals("1",chain.handleRequest(PlanetEnum.MERCURY) );
         //chain.handleRequest(PlanetEnum.VENUS);
         Assert.assertEquals("10", chain.handleRequest(PlanetEnum.VENUS));
         //chain.handleRequest(PlanetEnum.EARTH);
         Assert.assertEquals("100", chain.handleRequest(PlanetEnum.EARTH) );
     }
     
     public static PlanetHandler setUpChain() {
         PlanetHandler mercuryHandler = new MercuryHandler();
         PlanetHandler venusHandler = new VenusHandler();
         PlanetHandler earthHandler = new EarthHandler();
         
         mercuryHandler.setSuccessor(venusHandler);
         venusHandler.setSuccessor(earthHandler);
         
         return mercuryHandler;
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
