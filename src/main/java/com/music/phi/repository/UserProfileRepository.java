package com.music.phi.repository;

import com.music.phi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<User, Long> {
}
