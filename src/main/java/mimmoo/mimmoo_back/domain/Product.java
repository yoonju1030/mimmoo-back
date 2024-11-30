package mimmoo.mimmoo_back.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
public class Product {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "varchar(255)")
    private String id;
    private String name;
    private Integer price;
    private String type;

    public String getId() { return id; }
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
