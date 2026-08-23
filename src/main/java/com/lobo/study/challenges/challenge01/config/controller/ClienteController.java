package com.lobo.study.challenges.challenge01.config.controller;

import com.lobo.study.challenges.challenge01.config.model.Transacao;
import com.lobo.study.challenges.challenge01.config.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller("/clientes")
public class ClienteController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping("/{id}/transacoes")
    public List<Transacao> getTransacoesPorCliente(@PathVariable Long id) {
        List<Transacao> transacoes = transacaoRepository.findAll();

        return transacoes.stream()
                .filter(t -> t.getCliente().getId().equals(id))
                .toList();
    }

}
