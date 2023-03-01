package cn.brimon.pastebin.paste.repository.po;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity(name = "paste")
public class PastePO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String uuid;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String title;

    private LocalDateTime pasteTime;
    @Column(nullable = false)
    private String language;
    private String ip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String token) {
        this.uuid = token;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
