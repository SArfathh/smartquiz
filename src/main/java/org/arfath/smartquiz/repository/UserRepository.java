package org.arfath.smartquiz.repository;

import org.arfath.smartquiz.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends  JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUsername(String username);
}
