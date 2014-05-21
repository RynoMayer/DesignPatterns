/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ryno.designpatterns.creational.abstractfactory;

import com.ryno.designpatterns.creational.factorymethod.Animal;
import com.ryno.designpatterns.creational.factorymethod.Cat;
import com.ryno.designpatterns.creational.factorymethod.Dog;

/**
 *
 * @author Ryno
 */
public class MammalFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type){
        if("Canine".equals(type))
            return new Dog();
        else
            return new Cat();
    }
}
