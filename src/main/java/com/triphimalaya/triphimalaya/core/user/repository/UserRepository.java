package com.triphimalaya.triphimalaya.core.user.repository;

import com.triphimalaya.triphimalaya.core.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
