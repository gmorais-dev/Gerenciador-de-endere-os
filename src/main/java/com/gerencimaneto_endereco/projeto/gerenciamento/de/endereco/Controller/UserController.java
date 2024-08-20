package com.gerencimaneto_endereco.projeto.gerenciamento.de.endereco.Controller;

import com.gerencimaneto_endereco.projeto.gerenciamento.de.endereco.Dto.UserDTO;
import com.gerencimaneto_endereco.projeto.gerenciamento.de.endereco.Model.User;
import com.gerencimaneto_endereco.projeto.gerenciamento.de.endereco.Repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
    @RestController
    @RequestMapping("/users")
    public class UserController {
        @Autowired
        private UserRepository userRepository;

        @GetMapping("/{id}")
        public ResponseEntity<User> getUserById(@PathVariable Long id) {
            Optional<User> user = userRepository.findById(id);
            return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        }

        @PostMapping
        public User createUser(@RequestBody UserDTO userDTO) {
            User usuario = new User();
            BeanUtils.copyProperties(userDTO, usuario);

            return userRepository.save(usuario);
        }
    }


