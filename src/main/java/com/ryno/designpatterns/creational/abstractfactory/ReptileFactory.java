/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.creational.abstractfactory;

import com.ryno.designpatterns.creational.factorymethod.Animal;

/**
 *
 * @author Ryno
 */
public class ReptileFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type) {
        if("Snake".equals(type))
            return new Snake();
        else
            return new TRex();
    }
    
}
