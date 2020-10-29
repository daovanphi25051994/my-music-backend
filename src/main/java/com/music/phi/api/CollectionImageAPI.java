package com.music.phi.api;

import com.music.phi.model.CollectionImage;
import com.music.phi.model.Image;
import com.music.phi.model.User;
import com.music.phi.service.CollectionImageService;
import com.music.phi.service.ImageService;
import com.music.phi.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin("*")
@RequestMapping("api/collections")
public class CollectionImageAPI {

    @Autowired
    private CollectionImageService collectionImageService;

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping
    public CollectionImage createCollectionImage(@RequestBody CollectionImage collectionImage) {
        User user = userProfileService.getById(Long.valueOf(1));
        collectionImage.setUser(user);
        return collectionImageService.createCollectionImage(collectionImage);
    }
}
