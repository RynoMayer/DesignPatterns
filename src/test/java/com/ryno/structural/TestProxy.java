/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.structural;

import com.ryno.designpatterns.structural.proxy.FastThing;
import com.ryno.designpatterns.structural.proxy.Proxy;
import org.testng.Assert;
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
public class TestProxy {
    
    public TestProxy() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void runProxy() {
         Proxy proxy = new Proxy();
         FastThing fast = new FastThing();
         fast.sayHello();
         proxy.sayHello();
         Assert.assertEquals(fast.getName(), "FastThing");
         Assert.assertEquals(proxy.getName(), "SlowThing");
         
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
