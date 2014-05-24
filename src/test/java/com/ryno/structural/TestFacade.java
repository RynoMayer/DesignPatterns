/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.structural;

import com.ryno.designpatterns.structural.facade.Facade;
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
public class TestFacade {
    
    public TestFacade() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     @Test
     public void RunFacade() {
         Facade facade = new Facade();
         int x=3;
         System.out.println("cube of "+x+" : "+facade.cubeX(3) );
         Assert.assertEquals(facade.cubeX(3), 27);
         System.out.println("cube of "+x+" : "+facade.cubeXTimes2(3));
         Assert.assertEquals(facade.cubeXTimes2(3), 54);
         System.out.println(x+" to sixth power times 2: "+ facade.xToSixthPowerTimes2(3));
         Assert.assertEquals(facade.xToSixthPowerTimes2(3), 1458);
     }
     @Test
     public void RunCube(){
         Facade facade = new Facade();
         Assert.assertEquals(facade.cubeX(3), 27);
     }
     
     @Test
     public void RunCube2(){
         Facade facade = new Facade();
         Assert.assertEquals(facade.cubeXTimes2(3), 54);
     }
     
     @Test
     public void RunSixthPower(){
         Facade facade = new Facade();
         Assert.assertEquals(facade.xToSixthPowerTimes2(3), 1458);
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
