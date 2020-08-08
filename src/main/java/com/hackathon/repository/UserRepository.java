package com.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hackathon.model.User;



@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,Integer> {
//    User findByUsername(String username);
//    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN 'true' ELSE 'false' END FROM User u WHERE u.username = ?1")
//    public Boolean existsByUsername(String username);
}