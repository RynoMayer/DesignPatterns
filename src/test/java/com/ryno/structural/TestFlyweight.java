/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.structural;

import com.ryno.designpatterns.structural.flyweight.Flyweight;
import com.ryno.designpatterns.structural.flyweight.FlyweightFactory;
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
public class TestFlyweight {
    
    public TestFlyweight() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void RunFlyweight() {
         FlyweightFactory flyweightfactory = FlyweightFactory.getInstance();
         
         for(int i=0;i<5; i++){
             Flyweight flyweightAdder = flyweightfactory.getFlyweight("add");
             flyweightAdder.doMath(i, i);
             Assert.assertEquals(flyweightAdder.doMath(8, 3), 11);
             
             Flyweight flyweightMultiplier = flyweightfactory.getFlyweight("multiplier");
             flyweightMultiplier.doMath(i, i);
             Assert.assertEquals(flyweightMultiplier.doMath(2, 3), 6);
         }
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
