package com.dsi.kaumimadrasa.repository;

import com.dsi.kaumimadrasa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
