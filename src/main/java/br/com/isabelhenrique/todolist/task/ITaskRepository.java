package br.com.isabelhenrique.todolist.task;

import java.util.UUID;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
  // Encontrar tarefa por id
  List<TaskModel> findByIdUser(UUID idUser);
  // Atualizar tarefa
}
