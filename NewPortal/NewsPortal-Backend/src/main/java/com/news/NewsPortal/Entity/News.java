package com.news.NewsPortal.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="News")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "content",length = 2000)
    private String content;
    @Column(name="comment")
    private String comment;
    @Column(name = "date")
    private String date;

    public News(int id, String title, String author, String content, String comment, String date) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
        this.comment = comment;
        this.date = date;
    }

    public News(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", comment='" + comment + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public News() {
    }

    public News(String title, String author, String content, String comment, String date) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.comment = comment;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
