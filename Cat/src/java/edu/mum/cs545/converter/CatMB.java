/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.converter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author kb
 */
@Named(value = "catMB")
@SessionScoped
public class CatMB implements Serializable {

    List<Cat> cats = new ArrayList<>();
    Cat cat = new Cat();

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public CatMB() {
        cats.add(new Cat("Jerry", 1,"Jhon"));
        cats.add(new Cat("Tom", 4,"Oblak"));
        cats.add(new Cat("Snicky", 10,"Jack"));
        cats.add(new Cat("Britu", 5,"Vardy"));
    }

    public List<Cat> getCats() {
        return cats;
    }

    public Cat findCat(String catName) {
        for (Cat c : cats) {
            if (c.getName().equalsIgnoreCase(catName)) {
                return c;
            }
        }
        return null;
    }
}
