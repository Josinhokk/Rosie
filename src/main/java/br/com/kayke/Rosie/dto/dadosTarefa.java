package br.com.kayke.Rosie.dto;

import br.com.kayke.Rosie.Entidades.StatusTarefa;
import br.com.kayke.Rosie.Entidades.Tarefa;

public record dadosTarefa(Long id, String tarefa, StatusTarefa status) {

    public dadosTarefa(Tarefa tarefa) {
        this(tarefa.getId(), tarefa.getTarefa(), tarefa.getStatus());
    }
}