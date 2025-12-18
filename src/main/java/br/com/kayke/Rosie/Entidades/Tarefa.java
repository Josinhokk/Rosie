package br.com.kayke.Rosie.Entidades;

import br.com.kayke.Rosie.dto.tarefaDto;
import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tarefa;

    @Enumerated(EnumType.STRING)
    private StatusTarefa status = StatusTarefa.INCOMPLETO;

    public Tarefa(tarefaDto dto){
        this.tarefa = dto.tarefa();
        this.status = StatusTarefa.INCOMPLETO;
    }
}
