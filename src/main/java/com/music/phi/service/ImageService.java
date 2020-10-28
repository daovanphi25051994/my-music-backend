package com.music.phi.service;

import com.music.phi.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageService {
    Image createImage(MultipartFile file) throws IOException;
}
