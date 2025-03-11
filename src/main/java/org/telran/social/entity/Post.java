package org.telran.social.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.telran.social.emuns.PostStatus;

import java.util.Objects;

@Entity //говорит о том ,что объекты данного класса будут сохранятся в БД и обратно
@Table(name = "posts")
public class Post {

    @Id// указывает что это поле первичный ключ
    @GeneratedValue(strategy = GenerationType.IDENTITY)//авто генерацию значения поля
    private Long id;

    private String content;

    private PostStatus postStatus;

    public PostStatus getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(PostStatus postStatus) {
        this.postStatus = postStatus;
    }

    public Post() {
    }

    public Post(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) && Objects.equals(content, post.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }
}
