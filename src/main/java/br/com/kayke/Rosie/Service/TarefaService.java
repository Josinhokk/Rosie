package br.com.kayke.Rosie.Service;

import br.com.kayke.Rosie.Entidades.StatusTarefa;
import br.com.kayke.Rosie.Entidades.Tarefa;
import br.com.kayke.Rosie.Repository.tarefaRepository;
import br.com.kayke.Rosie.dto.dadosTarefa;
import br.com.kayke.Rosie.dto.tarefaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private tarefaRepository repo;

    public void criarTarefa(tarefaDto dto) {
        Tarefa tarefa = new Tarefa(dto);
        repo.save(tarefa);
    }

    public List<dadosTarefa> listarTarefas() {
        return repo.findAll().stream().map(tarefa -> new dadosTarefa(
                tarefa.getTarefa(),
                tarefa.getStatus()
        )).toList();
    }

    public void completarTarefa(Long id) {
        var tarefa = repo.getReferenceById(id);
        tarefa.setStatus(StatusTarefa.COMPLETO);
        repo.save(tarefa);
    }
}
