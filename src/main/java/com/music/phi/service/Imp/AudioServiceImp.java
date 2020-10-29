package com.music.phi.service.Imp;

import com.music.phi.model.Audio;
import com.music.phi.model.CollectionImage;
import com.music.phi.model.Image;
import com.music.phi.repository.AudioRepository;
import com.music.phi.service.AudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class AudioServiceImp implements AudioService {

    @Autowired
    private AudioRepository audioRepository;

    @Override
    public Audio createAudio(MultipartFile file) throws IOException {
        Audio audio = new Audio();
        audio.setData(file.getBytes());
        audio.setAudioName(file.getOriginalFilename());
        audio = audioRepository.save(audio);
        return audio;
    }
}
