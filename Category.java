/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mycart.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Title;
    private String Description;
    
    @OneToMany(mappedBy="category")
    private List<Product> product = new ArrayList<>();

    public Category() {
    }

    public Category(int Id, String Title, String Description) {
        this.Id = Id;
        this.Title = Title;
        this.Description = Description;
    }

    public Category(String Title, String Description, List<Product>product) {
        this.Title = Title;
        this.Description = Description;
        this.product = product;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Category{" + "Id=" + Id + ", Title=" + Title + ", Description=" + Description + ", product=" + product + '}';
    }

   
    
}
