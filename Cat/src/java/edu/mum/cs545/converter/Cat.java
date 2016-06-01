/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.converter;

/**
 *
 * @author csfaculty
 */
public class Cat {
    private String name;
    private int age;
    private String owner;
public Cat(){
    
}
    public Cat(String name, int age,String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    
    @Override
    public String toString(){
    
        return "Name: " + name + " age : " + age + " Owner: " + owner;
    }
}
