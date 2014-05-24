/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.structural;

import com.ryno.designpatterns.structural.adapter.TempClassReporter;
import com.ryno.designpatterns.structural.adapter.TempInfo;
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
public class TestAdapter {
    
    public TestAdapter() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     public void testTempC(TempInfo ti){
         ti.setTempC(5);
         System.out.println("C: "+ti.getTempC());
         System.out.println("F: "+ti.getTempF());
         System.out.println("---------------------------------------------------");
         Assert.assertEquals(41.0, ti.getTempF() );
         
         }
     
     public void testTempF(TempInfo ti){
         
         
         ti.setTempF(82.4);
         System.out.println("C: "+ti.getTempC());
         System.out.println("F: "+ti.getTempF());
         Assert.assertEquals(28.000000000000004, ti.getTempC() );
     }
    
     
     @Test
     public void runAdapter (){
         System.out.println("class adapter test");
         TempInfo tempInfo = new TempClassReporter();
         testTempC(tempInfo);
         testTempF(tempInfo);
         //tempInfo.setTempC(5);
         //tempInfo.setTempF(85);
         
         
         
         
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
