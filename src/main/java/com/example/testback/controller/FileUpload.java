package com.example.testback.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FileUpload {

    Map<String, Object> result = new HashMap<>();
    /// Receive message
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public Map<String, Object> uploadFile(@RequestParam("attach") MultipartFile file) throws IOException {
        // File info
        System.out.println("File name = "  + file.getOriginalFilename());
        System.out.println("File type = " + file.getContentType());

        // Save to disk
        // file path example 1) Windows c:/, 3) Mac ~/Documents/
        String filePath = "C:/Users/Mohamed/Documents/prog/test/testback/Documents/";
        file.transferTo(new File(filePath + file.getOriginalFilename()));
        result.put("Success", true);
        return result;
    }
}
