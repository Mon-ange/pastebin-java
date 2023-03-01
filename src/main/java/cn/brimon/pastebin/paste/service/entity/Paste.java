package cn.brimon.pastebin.paste.service.entity;

import cn.brimon.pastebin.paste.controller.dto.PasteDTO;
import cn.brimon.pastebin.paste.repository.po.PastePO;

import java.time.LocalDateTime;

public class Paste {
    private int id;
    private String uuid;
    private String author;
    private String content;
    private String title;
    private LocalDateTime pasteTime;
    private String language;

    public static Paste from(PasteDTO pasteDTO){
        Paste paste = new Paste();
        paste.id = pasteDTO.getId();
        paste.uuid = pasteDTO.getUuid();
        paste.author = pasteDTO.getAuthor();
        paste.content = pasteDTO.getContent();
        paste.title = pasteDTO.getTitle();
        paste.pasteTime = pasteDTO.getPasteTime();
        paste.language = pasteDTO.getLanguage();
        return paste;
    }
    public static Paste from(PastePO pastePO){
        Paste paste = new Paste();
        paste.id = pastePO.getId();
        paste.language = pastePO.getLanguage();
        paste.uuid = pastePO.getUuid();
        paste.author = pastePO.getAuthor();
        paste.content = pastePO.getContent();
        paste.title = pastePO.getTitle();
        paste.pasteTime = pastePO.getPasteTime();
        return paste;

    }
    public PastePO toPO(){
        PastePO pastePO = new PastePO();
        pastePO.setId(this.id);
        pastePO.setUuid(this.uuid);
        pastePO.setAuthor(this.author);
        pastePO.setLanguage(this.language);
        pastePO.setContent(this.content);
        pastePO.setTitle(this.title);
        pastePO.setPasteTime(this.pasteTime);
        return pastePO;
    }

    public PasteDTO toDTO(){
        PasteDTO pasteDTO = new PasteDTO();
        pasteDTO.setUuid(this.uuid);
        pasteDTO.setAuthor(this.author);
        pasteDTO.setPasteTime(this.pasteTime);
        pasteDTO.setContent(this.content);
        pasteDTO.setId(this.id);
        pasteDTO.setLanguage(this.language);
        pasteDTO.setTitle(this.title);
        pasteDTO.setId(this.id);


        return pasteDTO;
    }
    public void setUuid(String uuid){
        this.uuid = uuid;
    }
    public void setPasteTime(LocalDateTime localDateTime){
        this.pasteTime = localDateTime;

    }


}
