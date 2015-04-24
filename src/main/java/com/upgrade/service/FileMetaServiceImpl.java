package com.upgrade.service;

import com.upgrade.dao.FileMetaMapper;
import com.upgrade.model.FileMeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by twl-thinkpad on 2015-04-20.
 */
@Service
public class FileMetaServiceImpl implements FileMetaService {
    @Autowired
    private FileMetaMapper fileMetaMapper;
    @Override
    public void insert(FileMeta fileMeta) {
         fileMetaMapper.insert(fileMeta);
    }

    @Override
    public void update(FileMeta fileMeta) {
        fileMetaMapper.update(fileMeta);
    }

    @Override
    public void delete(Long id) {
        fileMetaMapper.delete(id);
    }

    @Override
    public List<FileMeta> findBy(HashMap<?, ?> params) {
        return fileMetaMapper.findBy(params);
    }

    @Override
    public Long countBy(HashMap<?, ?> params) {
        return fileMetaMapper.countBy(params);
    }

    @Override
    public FileMeta getEntityById(Long id) {
        return fileMetaMapper.getEntityById(id);
    }

    @Override
    public FileMeta getEntityBy(HashMap<?, ?> params) {
        return fileMetaMapper.getEntityBy(params);
    }
}
