package com.sanajitjana.repository;

import java.util.Optional;

import com.sanajitjana.models.ERole;
import com.sanajitjana.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
