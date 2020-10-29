package com.music.phi.service.Imp;

import com.music.phi.model.CollectionImage;
import com.music.phi.model.Image;
import com.music.phi.repository.CollectionImageRepository;
import com.music.phi.repository.ImageRepository;
import com.music.phi.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ImageServiceImp implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private CollectionImageRepository collectionImageRepository;

    @Override
    public Image createImage(MultipartFile file) throws IOException {
        Image image = new Image();
        image.setData(file.getBytes());
        image.setImageName(file.getOriginalFilename());
        image = imageRepository.save(image);
//        image.setData(null);
        return image;
    }
}
