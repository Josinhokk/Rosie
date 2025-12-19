package br.com.kayke.Rosie.Controller;

import br.com.kayke.Rosie.Entidades.Tarefa;
import br.com.kayke.Rosie.Service.TarefaService;
import br.com.kayke.Rosie.dto.dadosTarefa;
import br.com.kayke.Rosie.dto.tarefaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("tarefa"))
public class tarefaController {


    //aqui tentando evitar o autowired usando construtor para a injeção
    private final TarefaService servico;

    public tarefaController(TarefaService service) {
        this.servico = service;
    }

    @PostMapping
    public void criarTarefa(@RequestBody tarefaDto dto){
        servico.criarTarefa(dto);
    }

    @GetMapping
    public List<dadosTarefa> listarTarefa(){
        return servico.listarTarefas();}

    @PutMapping("{id}")
    @Transactional
    public void completarTarefa(@PathVariable Long id){
        servico.completarTarefa(id);
    }

    @DeleteMapping("{id}")
    @Transactional
    public void excluirTarefa(@PathVariable Long id){ servico.incompletarTarefa(id);}

    @DeleteMapping("deletar/{id}")
    @Transactional
    public void deletarTarefa(@PathVariable Long id){
        servico.deletarTarefa(id);
    }

}
