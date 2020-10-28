package com.music.phi.service.Imp;

import com.music.phi.model.User;
import com.music.phi.repository.UserProfileRepository;
import com.music.phi.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImp implements UserProfileService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Override
    public User createUserProfile(User user) {
        return userProfileRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userProfileRepository.findById(id).get();
    }
}
