package com.news.NewsPortal.Repository;

import com.news.NewsPortal.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
