package br.com.apirest.crudpeople.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.crudpeople.entities.People;

public interface PeopleRepository extends JpaRepository<People, Long> {

	List<People> findByName(String name);

}
