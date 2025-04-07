package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int productid;
    private String productname;
    private String productcategory;
    private String productquantity;
    private String productunit;

    public Product(int productid, String productname, String productcategory, String productquantity, String productunit) {
        this.productid = productid;
        this.productname = productname;
        this.productcategory = productcategory;
        this.productquantity = productquantity;
        this.productunit = productunit;
    }

    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "productid='" + productid + '\'' +
                ", productname='" + productname + '\'' +
                ", productcategory='" + productcategory + '\'' +
                ", productquantity='" + productquantity + '\'' +
                ", productunit='" + productunit + '\'' +
                '}';
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductcategory() {
        return productcategory;
    }

    public void setProductcategory(String productcategory) {
        this.productcategory = productcategory;
    }

    public String getProductquantity() {
        return productquantity;
    }

    public void setProductquantity(String productquantity) {
        this.productquantity = productquantity;
    }

    public String getProductunit() {
        return productunit;
    }

    public void setProductunit(String productunit) {
        this.productunit = productunit;
    }
}
