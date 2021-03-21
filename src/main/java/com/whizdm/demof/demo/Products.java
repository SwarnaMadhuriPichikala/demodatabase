package com.whizdm.demof.demo;
import javax.persistence.*;
@Entity
@Table(name="products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
    private String p_name;
    private double p_price;
    public String getP_name() {
        return p_name;
    }
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }
    public double getP_price() {
        return p_price;
    }
    public void setP_price(double p_price) {
        this.p_price = p_price;
    }
    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getProduct_id() {
        return product_id;
    }
}