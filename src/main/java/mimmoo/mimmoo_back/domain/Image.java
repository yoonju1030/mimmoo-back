package mimmoo.mimmoo_back.domain;

import jakarta.persistence.Entity;

@Entity
public class Image {
    private Long id;
    private String base64Image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBase64Image() {
        return getBase64Image();
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }
}
