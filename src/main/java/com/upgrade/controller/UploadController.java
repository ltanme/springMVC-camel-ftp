package com.upgrade.controller;

import com.upgrade.model.FileMeta;
import com.upgrade.service.FileMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by aaa-thinkpad on 2015-03-28.
 */
@Controller
public class UploadController {
    public LinkedList<FileMeta> files = new LinkedList<FileMeta>();
    public FileMeta fileMeta = null;

    @Autowired
    private FileMetaService fileMetaService;

    @Value("#{configProperties['file.upload.directory']}")
    private String fileUploadDirectory;
    @Value("#{configProperties['file.download.base.url']}")
    private String fileDownloadBaseUrl;

    @RequestMapping("/")
    public String Index(Model model) {
        return "/index";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public HashMap upload(MultipartHttpServletRequest request, HttpServletResponse response) {
        Iterator<String> itr = request.getFileNames();
        MultipartFile mpf = null;
        String storageDirectory = fileUploadDirectory;
        files = new LinkedList<FileMeta>();
        while (itr.hasNext()) {
            mpf = request.getFile(itr.next());

            String newFilenameBase = UUID.randomUUID().toString();
            String originalFileExtension = mpf.getOriginalFilename().substring(mpf.getOriginalFilename().lastIndexOf("."));
            String newFilename = newFilenameBase + originalFileExtension;
            if (files.size() >= 10) {
                files.pop();
            }

            File newFile = new File(storageDirectory + "/" + newFilename);
            try {
                mpf.transferTo(newFile);
                fileMeta = new FileMeta();
                fileMeta.setFileName(mpf.getOriginalFilename());
                fileMeta.setFileSize(mpf.getSize() / 1024 + " Kb");
                fileMeta.setFileType(mpf.getContentType());
                fileMeta.setDownloadUrl(fileDownloadBaseUrl + newFilename);
                fileMeta.setDeleteUrl("aaaaa");
                fileMeta.setDeleteType("aaaaa");
                fileMeta.setCreateTime(new Date());
                fileMetaService.insert(fileMeta);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Could not upload file " + mpf.getOriginalFilename());
            }

            files.add(fileMeta);
        }

        HashMap<String, Object> hm = new HashMap<String, Object>();
        hm.put("files", files);
        return hm;
    }
}
