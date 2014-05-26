/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.behavioral;

import com.ryno.designpatterns.behavioral.templatemethod.CBurger;
import com.ryno.designpatterns.behavioral.templatemethod.HamburgerMeal;
import com.ryno.designpatterns.behavioral.templatemethod.Meal;
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
public class TestTemplate {
    
    public TestTemplate() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void RunTemplate() {
         Meal meal1 = new HamburgerMeal();
         meal1.doMeal();
         Assert.assertEquals(meal1.cook(), "cookingBeef");
         System.out.println("------------------------------------");
         Meal meal2 = new CBurger();
         meal2.doMeal();
         Assert.assertEquals(meal2.eat(), "yumCheesy");
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
