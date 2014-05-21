/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.creational;

import com.ryno.designpatterns.creational.abstractfactory.AbstractFactory;
import com.ryno.designpatterns.creational.abstractfactory.SpeciesFactory;
import com.ryno.designpatterns.creational.factorymethod.Animal;
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
public class TestAbstractFactory {
    
    public TestAbstractFactory() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void TestReptileFact() {
         AbstractFactory abstractFact = new AbstractFactory();
         SpeciesFactory speciesFactR = abstractFact.getSpeciesFactory("Reptile");
         
         Animal rex = speciesFactR.getAnimal("TRex");
         Assert.assertEquals(rex.makeSound(), "Roar", "Run Forrest, Run");
     }
     @Test
     public void TestMammalFact() {
         AbstractFactory abstractFact = new AbstractFactory();
         SpeciesFactory speciesFactM = abstractFact.getSpeciesFactory("Mammal");
         Animal cats = speciesFactM.getAnimal("Cat");
         Assert.assertEquals(cats.makeSound(), "Meow", "Aww");
         
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
