package mimmoo.mimmoo_back.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Image {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "varchar(255)")
    private String id;
    private String productId;
    private String path;

    public String getId() { return id; }
    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getPath() { return path; }

    public void setPath(String path) { this.path = path; }
}
