package com.lobo.study.challenges.challenge01.config.repository;

import com.lobo.study.challenges.challenge01.config.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

}
