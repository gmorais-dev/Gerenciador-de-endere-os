package com.gerencimaneto_endereco.projeto.gerenciamento.de.endereco.Model;

import jakarta.persistence.*;
@Entity

    public class Address {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String street;
        private String city;
        private String zipcode;

        public Address(Long id, String street, String city, String zipcode, User user) {
            this.id = id;
            this.street = street;
            this.city = city;
            this.zipcode = zipcode;
            this.user = user;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Address() {

        }

        @OneToOne(mappedBy = "address")
        private User user;

    }

