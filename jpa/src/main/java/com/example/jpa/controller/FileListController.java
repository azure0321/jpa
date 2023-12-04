package com.example.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.jpa.repository.UploadFileRepository;
import com.example.jpa.model.UploadFile;

@Controller
public class FileListController {
    @Autowired
    UploadFileRepository uploadFileRepository;
    UploadFile uploadFile;
    @GetMapping("/filelist")
    public String fileList(Model model){
        model.addAttribute("uploadfiles", uploadFileRepository.findAll());
        return "html/filelist";
    }
}