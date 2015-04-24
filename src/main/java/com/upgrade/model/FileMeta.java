package com.upgrade.model;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by twl-thinkpad on 2015-04-17.
 */
public class FileMeta {
    private Long id;
    private String fileName;
    private String fileSize;
    private String fileType;
    private byte[] bytes;
    private String deleteUrl;
    private String deleteType;
    private String downloadUrl;
    private String fsUrl;
    private String cdnUrl;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFsUrl() {
        return fsUrl;
    }

    public void setFsUrl(String fsUrl) {
        this.fsUrl = fsUrl;
    }

    public String getCdnUrl() {
        return cdnUrl;
    }

    public void setCdnUrl(String cdnUrl) {
        this.cdnUrl = cdnUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getDeleteUrl() {
        return deleteUrl;
    }

    public void setDeleteUrl(String deleteUrl) {
        this.deleteUrl = deleteUrl;
    }

    public String getDeleteType() {
        return deleteType;
    }

    public void setDeleteType(String deleteType) {
        this.deleteType = deleteType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "FileMeta{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", fileSize='" + fileSize + '\'' +
                ", fileType='" + fileType + '\'' +
                ", bytes=" + Arrays.toString(bytes) +
                ", deleteUrl='" + deleteUrl + '\'' +
                ", deleteType='" + deleteType + '\'' +
                ", downloadUrl='" + downloadUrl + '\'' +
                ", fsUrl='" + fsUrl + '\'' +
                ", cdnUrl='" + cdnUrl + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }



}
