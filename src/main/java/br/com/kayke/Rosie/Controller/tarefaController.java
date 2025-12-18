package br.com.kayke.Rosie.Controller;

import br.com.kayke.Rosie.Service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("tarefa"))
public class tarefaController {

    @Autowired
    private TarefaService servico;

    @PostMapping("criar")
    public void criarTarefa(@RequestBody tarefaDto dto){
        servico.criarTarefa(dto);
    }

}
