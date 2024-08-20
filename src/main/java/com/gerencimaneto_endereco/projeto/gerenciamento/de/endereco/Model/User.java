package com.gerencimaneto_endereco.projeto.gerenciamento.de.endereco.Model;


import jakarta.persistence.*;

@Entity
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
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

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public User() {

        }

        public User(Long id, String name, String email, Address address) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.address = address;
        }

        private String email;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "address_id", referencedColumnName = "id")
        private Address address;


    }


