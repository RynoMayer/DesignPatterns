/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.structural;

import com.ryno.designpatterns.structural.composite.Composite;
import com.ryno.designpatterns.structural.composite.Leaf;
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
public class TestComposite {
    
    public TestComposite() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void RunComposite() {
         Leaf leaf1 = new Leaf("bob");
         Leaf leaf2 = new Leaf("John");
         Leaf leaf3 = new Leaf("Walter");
         Leaf leaf4 = new Leaf("Ellen");
         Leaf leaf5 = new Leaf("Jane");
        
         
         Composite comp1 = new Composite();
         comp1.add(leaf1);
         comp1.add(leaf2);
         
         Composite comp2 = new Composite();
         comp2.add(leaf3);
         comp2.add(leaf4);
         
         Composite comp3 = new Composite();
         comp3.add(comp1);
         comp3.add(comp2);
         comp3.add(leaf5);
         
         System.out.println("calling sayhello on leaf1");
         leaf1.sayHello();
         Assert.assertEquals(leaf1.getHello(), "bobHello");
         
         System.out.println("calling sayhello on comp1");
         comp1.sayHello();
         //Assert.assertEquals(comp1.sayHello(), "JohnHello");
         
         
         System.out.println("calling sayhello on comp2");
         comp2.sayHello();
         
         System.out.println("calling saybye on comp3");
         comp3.sayBye();
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
