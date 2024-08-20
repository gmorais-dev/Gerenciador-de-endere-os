package com.gerencimaneto_endereco.projeto.gerenciamento.de.endereco.Dto;


import com.gerencimaneto_endereco.projeto.gerenciamento.de.endereco.Model.Address;

public class UserDTO {
    private long Id;
    private String name;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;






}
