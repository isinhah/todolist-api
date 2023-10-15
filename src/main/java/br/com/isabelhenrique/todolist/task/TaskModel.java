package br.com.isabelhenrique.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {
  // id, usuario, descricao, titulo, data de inicio, data de termino, prioridade

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  @Column(length = 150)
  private String description;

  @Column(length = 50)
  private String title;
  private LocalDateTime startAt;
  private LocalDateTime endAt;
  private String priority;

  // associacao do id da tarefa com usuario
  private UUID idUser;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
