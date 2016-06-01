/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.bookmarkMB;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author kb
 */
@Named(value = "beanOne")
@SessionScoped
public class BeanOne implements Serializable{

    /**
     * Creates a new instance of BeanOne
     */
    private String pageName;
    private String content;
    public BeanOne() {
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public String callPage(){
    
        this.pageName = "page2";
        this.content ="This is statically assigned bean";
        
        return "page1.jsf?faces-redirect=true";
    }
}
