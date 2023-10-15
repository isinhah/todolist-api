package br.com.isabelhenrique.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

//interface - possui a representacao dos metodos
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
  // adicionei um método que não estava disponivel antes
  UserModel findByUsername(String username);
}
