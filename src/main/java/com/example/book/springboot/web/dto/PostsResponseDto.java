package com.example.book.springboot.web.dto;

import com.example.book.springboot.domain.posts.Posts;

public class PostsResponseDto { // Entity의 필드 중 일부만 사용
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
