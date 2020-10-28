package com.music.phi.api;

import com.music.phi.model.Image;
import com.music.phi.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin("*")
@RequestMapping("api/images")
public class ImageAPI {

    @Autowired
    private ImageService imageService;

    @PostMapping
    public Image createImage(@RequestParam("file") MultipartFile file) throws IOException {
       Image image = imageService.createImage(file);
       return image;
    }
}
