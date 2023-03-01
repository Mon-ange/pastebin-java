package cn.brimon.pastebin.paste.controller;

import cn.brimon.pastebin.paste.controller.dto.PasteDTO;
import cn.brimon.pastebin.paste.service.PasteService;
import cn.brimon.pastebin.paste.service.entity.Paste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paste")
public class PasteController {
    @Autowired
    PasteService pasteService;
    @GetMapping("/{uuid}")
    public PasteDTO get(@PathVariable String uuid){
        return pasteService.getByUuid(uuid).toDTO();
    }

    @PostMapping
    public PasteDTO add(@RequestBody PasteDTO pasteDTO){
        return pasteService.add(Paste.from(pasteDTO)).toDTO();

    }

    @GetMapping("/page")
//    deprecated:public Page<PasteDTO> getAllPastes(@RequestParam("size") int pageSize){
      public Page<PasteDTO> getAllPastes(Pageable pageable){
//    call :    pageable.getPageSize();
        return pasteService.findPage(pageable).map(Paste::toDTO);
        //deprecated:return pasteService.findPage(pageable).map(paste -> {
        //    return paste.toDTO();
        //});
//explanation:        map是通过一个函数规则，对一个集合中的所有对象进行逐个转化
//        Page<Paste> 调用map说明需要对Paste进行逐个转化，转化方式应该调用function（Paste) ,返回值是转化后的结果
    }


}
