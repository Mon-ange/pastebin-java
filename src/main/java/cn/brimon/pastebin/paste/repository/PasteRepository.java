package cn.brimon.pastebin.paste.repository;

import cn.brimon.pastebin.paste.repository.po.PastePO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PasteRepository extends CrudRepository<PastePO,Integer> {
    List<PastePO> findByUuid(String uuid);
    Page<PastePO> findAll(Pageable pageable);
}
