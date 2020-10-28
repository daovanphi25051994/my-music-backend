package com.music.phi.api;

import com.music.phi.model.User;
import com.music.phi.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("api/users")
public class UserProfileAPI {

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userProfileService.createUserProfile(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userProfileService.getById(id);
    }
}
