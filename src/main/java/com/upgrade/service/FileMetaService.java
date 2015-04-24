package com.upgrade.service;

import com.upgrade.model.FileMeta;

import java.util.HashMap;
import java.util.List;

/**
 * Created by twl-thinkpad on 2015-04-20.
 */
public interface FileMetaService {
    void insert(FileMeta fileMeta);
    void update(FileMeta fileMeta);
    void delete(Long id);
    List<FileMeta> findBy(HashMap<?,?> params);
    Long countBy(HashMap<?,?> params);
    FileMeta getEntityById(Long id);
    FileMeta getEntityBy(HashMap<?,?> params);
}
