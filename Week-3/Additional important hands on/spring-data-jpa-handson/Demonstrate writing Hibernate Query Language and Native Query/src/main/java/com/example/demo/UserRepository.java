package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("FROM User u WHERE u.name = ?1")
    List<User> findByNameHQL(String name);

    @Query(value = "SELECT * FROM user WHERE email = ?1", nativeQuery = true)
    List<User> findByEmailNative(String email);
}
