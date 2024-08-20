package com.gerencimaneto_endereco.projeto.gerenciamento.de.endereco.Repository;

import com.gerencimaneto_endereco.projeto.gerenciamento.de.endereco.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
