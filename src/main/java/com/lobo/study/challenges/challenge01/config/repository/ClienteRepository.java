package com.lobo.study.challenges.challenge01.config.repository;

import com.lobo.study.challenges.challenge01.config.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
