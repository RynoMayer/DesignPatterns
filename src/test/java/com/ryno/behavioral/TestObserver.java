/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.behavioral;

import com.ryno.designpatterns.behavioral.observer.WeatherCustomer1;
import com.ryno.designpatterns.behavioral.observer.WeatherCustomer2;
import com.ryno.designpatterns.behavioral.observer.WeatherObserver;
import com.ryno.designpatterns.behavioral.observer.WeatherStation;
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
public class TestObserver {
    
    public TestObserver() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void runObserver() {
         WeatherStation weatherStation = new WeatherStation(23);
         
         WeatherCustomer1 wc1 = new WeatherCustomer1();
         WeatherCustomer2 wc2 = new WeatherCustomer2();
         weatherStation.addObserver(wc1);
         weatherStation.addObserver(wc2);
         
         weatherStation.setTemp(34);
         
         Assert.assertEquals(weatherStation.getTemp(), 34);
         weatherStation.removeObserver(wc1);
         weatherStation.setTemp(35);
         Assert.assertEquals(weatherStation.getTemp(), 35);
     }

     public void runAssert(){
         
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
