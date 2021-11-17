/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jtrice
 */
public class Book {
    private String name;
    private int pages;
    private int pubYear;
    
    public Book(String name, int pages, int pubYear) {
        this.name = name;
        this.pages = pages;
        this.pubYear = pubYear;
    }
    
    public String getTitle() {
        return this.name;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int getPubYear() {
        return this.pubYear;
    }
    
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.pubYear;
    }
}
