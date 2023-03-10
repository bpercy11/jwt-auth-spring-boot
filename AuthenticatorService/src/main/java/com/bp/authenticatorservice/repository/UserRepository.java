package com.bp.authenticatorservice.repository;

import com.bp.authenticatorservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    public User findByUserNameAndPassword(String userName, String password);

}
