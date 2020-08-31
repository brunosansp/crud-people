package br.com.apirest.crudpeople.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apirest.crudpeople.entities.People;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {

	List<People> findByName(String name);
	Optional<People> findById(Long id);
	People findByEmail(String email);

}
