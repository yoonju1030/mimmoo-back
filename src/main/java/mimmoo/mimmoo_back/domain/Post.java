package mimmoo.mimmoo_back.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Entity
public class Post {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "varchar(255)")
    private String id;
    private String title;
    private String writter;
    private String type;
    private Integer view;
    @Column(name="detail", columnDefinition = "varchar(1000)")
    private String detail;
    private LocalDateTime date;

    public String getId() { return id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getWritter() { return writter; }
    public void setWritter(String writter) { this.writter = writter; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Integer getView() { return view; }
    public void setView(Integer view) { this.view = view; }

    public String getDetail() { return detail; }
    public void setDetail(String detail) { this.detail = detail; }

    public LocalDateTime getDate() { return date; }
    public void setDate() {
        LocalDateTime seoulNow = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
        this.date = seoulNow;
    }
}
