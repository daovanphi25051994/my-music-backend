package com.music.phi.service;

import com.music.phi.model.Audio;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface AudioService {
    Audio createAudio(MultipartFile file) throws IOException;
}
