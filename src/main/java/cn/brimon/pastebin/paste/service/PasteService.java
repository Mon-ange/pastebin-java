package cn.brimon.pastebin.paste.service;

import cn.brimon.pastebin.paste.repository.PasteRepository;
import cn.brimon.pastebin.paste.repository.po.PastePO;
import cn.brimon.pastebin.paste.service.entity.Paste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class PasteService {
    @Autowired
    PasteRepository pasteRepository;

    public Paste add(Paste paste){
        paste.setUuid(UUID.randomUUID().toString());
        paste.setPasteTime(LocalDateTime.now());
        return Paste.from(pasteRepository.save(paste.toPO()));

    }
    public Paste getByUuid(String uuid){
        return Paste.from(pasteRepository.findByUuid(uuid).get(0));
    }

    public Page<Paste> findPage(Pageable pageable){
        return pasteRepository.findAll(pageable).map(Paste::from);
    }


}
