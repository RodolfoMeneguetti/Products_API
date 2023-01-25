package com.algaworks.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.crm.modal.People;

public interface PeopleRepository extends JpaRepository<People, Long> {

}
