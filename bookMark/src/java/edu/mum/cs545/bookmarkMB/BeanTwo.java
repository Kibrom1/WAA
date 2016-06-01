/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.bookmarkMB;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author kb
 */
@Named(value = "beanTwo")
@SessionScoped
public class BeanTwo implements Serializable{

    /**
     * Creates a new instance of BeanTwo
     */
    private String detail;
    private int value;

    public BeanTwo() {
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String defalutVal() {

        this.detail = "This is the second page obtained from the value";
        this.value = 2;

        return "page3.jsf?faces-redirect=true";
    }

}
