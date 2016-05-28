/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.homework.pojo;

/**
 *
 * @author kb
 */
public class Book {
    
    private String title;
     private int pages;
    private String type;

    public Book(String title, int pages, String type) {
        this.title = title;
        this.pages = pages;
        this.type = type;
    }

    public Book() {
    
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setType(String type) {
        this.type = type;
    }
   
    
}
