package com.dgmf.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data @Builder
public class Post {
    @Id
    private Long id;
    private String title;
    private String content;
    @CreatedDate
    private LocalDateTime publishedOn;
    private LocalDateTime updatedOn;
    // author
    // comments

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.publishedOn = LocalDateTime.now();
    }
}
