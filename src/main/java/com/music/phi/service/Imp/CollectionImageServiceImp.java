package com.music.phi.service.Imp;

import com.music.phi.model.CollectionImage;
import com.music.phi.repository.CollectionImageRepository;
import com.music.phi.service.CollectionImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionImageServiceImp implements CollectionImageService {

    @Autowired
    private CollectionImageRepository collectionImageRepository;

    @Override
    public CollectionImage createCollectionImage(CollectionImage collectionImage) {
        return collectionImageRepository.save(collectionImage);
    }
}
