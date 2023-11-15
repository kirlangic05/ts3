package com.ts3.ts3.repository;

import com.ts3.ts3.entity.Melih;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MelihRepo extends JpaRepository<Melih, Long> {
}
