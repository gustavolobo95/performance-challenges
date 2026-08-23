# Challenge 01 — O método que ficou lento

## Contexto

A empresa possui uma API responsável por consultar as transações de um cliente.

O endpoint abaixo é utilizado por diversas funcionalidades internas:

```text
GET /clientes/{clienteId}/transacoes
```

A implementação atual funciona corretamente e apresenta boa performance durante os testes realizados pelos desenvolvedores.

Entretanto, alguns clientes possuem uma quantidade muito grande de transações e começaram a relatar lentidão.

O time de suporte informou que:

* clientes pequenos não apresentam problemas;
* clientes médios apresentam alguma lentidão;
* clientes muito grandes podem esperar vários segundos pela resposta.

Você foi encarregado de investigar o problema.

---

## Cenário atual

A aplicação possui aproximadamente:

* 10 clientes pequenos;
* 100 clientes médios;
* 5 clientes com milhões de transações.

A implementação atual não deve ser considerada necessariamente errada.

O objetivo deste desafio é descobrir **por que ela apresenta comportamento ruim em determinados volumes de dados**.

---

## Objetivo

Identificar o gargalo de performance e propor uma implementação capaz de lidar com grandes volumes de dados.

Você deve demonstrar, através de métricas, a diferença entre a implementação original e sua proposta.

---

## Restrições

Não altere o contrato da API.

O resultado funcional da operação deve permanecer o mesmo.

Não é permitido simplesmente remover funcionalidades para obter melhor performance.

---

## Dados

O ambiente deve permitir gerar pelo menos:

```text
1.000
10.000
100.000
1.000.000
10.000.000
```

transações.

---

## O que investigar

Durante a investigação, considere:

* complexidade algorítmica;
* quantidade de objetos criados;
* utilização de CPU;
* utilização de memória;
* quantidade de dados processados;
* tempo total da operação;
* custo de ordenação;
* custo de filtros;
* quantidade de dados carregados desnecessariamente.

---

## Medições

Registre pelo menos:

|     Volume | Tempo | Memória | CPU |
| ---------: | ----: | ------: | --: |
|      1.000 |       |         |     |
|     10.000 |       |         |     |
|    100.000 |       |         |     |
|  1.000.000 |       |         |     |
| 10.000.000 |       |         |     |

---

## Ferramentas sugeridas

Você pode utilizar:

* Java Flight Recorder;
* Java Mission Control;
* VisualVM;
* async-profiler;
* ferramentas de benchmark;
* métricas da própria aplicação.

---

## Critério de conclusão

O desafio está concluído quando você conseguir responder:

1. Qual é o gargalo?
2. Por que ele aparece apenas em determinados volumes?
3. Qual é a complexidade da implementação atual?
4. Qual alteração você propõe?
5. Qual foi o ganho obtido?
6. O ganho foi comprovado através de benchmark?

---

## Regra principal

Não otimize baseado em suposição.

Antes de modificar o código, produza evidências que indiquem onde está o problema.

---

## Entregáveis

Na pasta `solution/`, registre:

```text
README.md
benchmark/
profiling/
implementation/
```

O `README.md` deve explicar:

* problema encontrado;
* hipótese inicial;
* evidências coletadas;
* solução;
* resultados antes/depois;
* trade-offs.
