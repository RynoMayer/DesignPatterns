/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.creational;

import com.ryno.designpatterns.creational.prototype.Dog;
import com.ryno.designpatterns.creational.prototype.Person;
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
public class TestPrototype {
    
    public TestPrototype() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void runPrototypePerson() {
         Person p1 = new Person("Dave");
         Person p2 = (Person) p1.doClone();
         
         Assert.assertEquals(p1.getName(), p2.getName());
     }

     @Test
     public void runPrototypeDog() {
         Dog d1 = new Dog("Bark");
         Dog d2 = (Dog) d1.doClone();
         
         Assert.assertEquals(d1.getSound(), d2.getSound());
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
