package com.gerencimaneto_endereco.projeto.gerenciamento.de.endereco.Repository;

import com.gerencimaneto_endereco.projeto.gerenciamento.de.endereco.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

