package mimmoo.mimmoo_back.domain;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer price;
    private String type;

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() { return price; }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getType() { return type; }
    public void setType(String type) {
        this.type = type;
    }
}
