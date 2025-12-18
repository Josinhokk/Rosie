package br.com.kayke.Rosie.dto;

import br.com.kayke.Rosie.Entidades.StatusTarefa;
import br.com.kayke.Rosie.Entidades.Tarefa;

public record dadosTarefa(String tarefa, StatusTarefa status) {

    public dadosTarefa(Tarefa tarefa) {
        this(tarefa.getTarefa(), tarefa.getStatus());
    }
}