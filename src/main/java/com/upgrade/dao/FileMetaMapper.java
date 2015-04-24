package com.upgrade.dao;

import com.upgrade.model.FileMeta;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by twl-thinkpad on 2015-04-20.
 */
@Repository
public interface FileMetaMapper {
    void insert(FileMeta fileMeta);
    void update(FileMeta fileMeta);
    void delete(Long id);
    List<FileMeta> findBy(HashMap<?,?> params);
    Long countBy(HashMap<?,?> params);
    FileMeta getEntityById(Long id);
    FileMeta getEntityBy(HashMap<?,?> params);
}
