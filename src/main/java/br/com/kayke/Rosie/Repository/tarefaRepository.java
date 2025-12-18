package br.com.kayke.Rosie.Repository;

import br.com.kayke.Rosie.Entidades.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface tarefaRepository extends JpaRepository <Tarefa , Long>{
}
