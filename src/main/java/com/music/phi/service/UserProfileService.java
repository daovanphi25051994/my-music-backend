package com.music.phi.service;

import com.music.phi.model.User;

public interface UserProfileService {
    User createUserProfile(User user);
    User getById(Long id);
}
