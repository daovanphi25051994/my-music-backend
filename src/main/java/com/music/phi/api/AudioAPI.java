package com.music.phi.api;

import com.music.phi.model.Audio;
import com.music.phi.model.Image;
import com.music.phi.service.AudioService;
import com.music.phi.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin("*")
@RequestMapping("api/audio")
public class AudioAPI {

    @Autowired
    private AudioService audioService;

    @PostMapping
    public Audio createAuido(@RequestParam("audio") MultipartFile file) throws IOException {
        Audio audio = audioService.createAudio(file);
        return audio;
    }
}
