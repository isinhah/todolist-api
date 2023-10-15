package br.com.isabelhenrique.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // lombok - getters e setters
@Entity(name = "tb_users") // tabela de usuarios
public class UserModel {

  @Id // chave primária
  @GeneratedValue(generator = "UUID") // gera automaticamente e define tipo de gerador
  private UUID id; // id de formato UUID

  @Column(unique = true) // username com restrição: o valor deve ser único
  private String username;
  private String name;
  private String password;

  // quando a informação foi adicionada no database
  @CreationTimestamp
  private LocalDateTime createdAt;

}
