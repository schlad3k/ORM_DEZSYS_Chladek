package org.example;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int warehouseid;
    private String warehousename;
    private String warehouseaddress;
    private String warehousepostalcode;
    private String warehousecity;
    private String warehousecountry;
    private String timestamp;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> productdata;

    public Warehouse(int warehouseid, String warehousename, String warehouseaddress, String warehousepostalcode, String warehousecity, String warehousecountry, String timestamp) {
        this.warehouseid = warehouseid;
        this.warehousename = warehousename;
        this.warehouseaddress = warehouseaddress;
        this.warehousepostalcode = warehousepostalcode;
        this.warehousecity = warehousecity;
        this.warehousecountry = warehousecountry;
        this.timestamp = timestamp;
    }

    public Warehouse() {

    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseid=" + warehouseid +
                ", warehousename='" + warehousename + '\'' +
                ", warehouseaddress='" + warehouseaddress + '\'' +
                ", warehousepostalcode='" + warehousepostalcode + '\'' +
                ", warehousecity='" + warehousecity + '\'' +
                ", warehousecountry='" + warehousecountry + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", productdata=" + productdata +
                '}';
    }

    public int getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(int warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getWarehousename() {
        return warehousename;
    }

    public void setWarehousename(String warehousename) {
        this.warehousename = warehousename;
    }

    public String getWarehouseaddress() {
        return warehouseaddress;
    }

    public void setWarehouseaddress(String warehouseaddress) {
        this.warehouseaddress = warehouseaddress;
    }

    public String getWarehousepostalcode() {
        return warehousepostalcode;
    }

    public void setWarehousepostalcode(String warehousepostalcode) {
        this.warehousepostalcode = warehousepostalcode;
    }

    public String getWarehousecity() {
        return warehousecity;
    }

    public void setWarehousecity(String warehousecity) {
        this.warehousecity = warehousecity;
    }

    public String getWarehousecountry() {
        return warehousecountry;
    }

    public void setWarehousecountry(String warehousecountry) {
        this.warehousecountry = warehousecountry;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public List<Product> getProductdata() {
        return productdata;
    }

    public void setProductdata(List<Product> productdata) {
        this.productdata = productdata;
    }
    public void addProduct(Product product) {
        this.productdata.add(product);
    }
    public void deleteProduct(Product product) {
        this.productdata.remove(product);
    }
    public Product getProduct(int id) {
        return this.productdata.get(id);
    }
}
