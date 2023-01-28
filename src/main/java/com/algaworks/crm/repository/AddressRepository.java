package com.algaworks.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.crm.modal.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
