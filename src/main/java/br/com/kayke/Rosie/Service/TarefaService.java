package br.com.kayke.Rosie.Service;

import br.com.kayke.Rosie.Controller.tarefaDto;
import br.com.kayke.Rosie.Entidades.Tarefa;
import br.com.kayke.Rosie.Repository.tarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {

    @Autowired
    private tarefaRepository repo;

    public void criarTarefa(tarefaDto dto){
        Tarefa tarefa = new Tarefa(dto);
        repo.save(tarefa);
    }

}
