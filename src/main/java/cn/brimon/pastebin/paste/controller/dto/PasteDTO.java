package cn.brimon.pastebin.paste.controller.dto;

import java.time.LocalDateTime;

public class PasteDTO {
    private int id;
    private String uuid;
    private String author;
    private String content;
    private String title;
    private LocalDateTime pasteTime;
    private String language;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getPasteTime() {
        return pasteTime;
    }

    public void setPasteTime(LocalDateTime pasteTime) {
        this.pasteTime = pasteTime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
