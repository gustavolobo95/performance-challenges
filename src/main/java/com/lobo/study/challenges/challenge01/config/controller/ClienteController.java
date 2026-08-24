package com.lobo.study.challenges.challenge01.config.controller;

import com.lobo.study.challenges.challenge01.config.model.Transacao;
import com.lobo.study.challenges.challenge01.config.model.record.TransacaoRecord;
import com.lobo.study.challenges.challenge01.config.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping("/{id}/transacoes")
    public List<TransacaoRecord> getTransacoesPorCliente(@PathVariable Long id) {
        List<Transacao> transacoes = transacaoRepository.findAll();

        return transacoes.stream()
                .filter(t -> t.getCliente().getId().equals(id))
                .map(t -> new TransacaoRecord(t.getId(), t.getCliente().getNome(), t.getValor()))
                .toList();
    }

}
