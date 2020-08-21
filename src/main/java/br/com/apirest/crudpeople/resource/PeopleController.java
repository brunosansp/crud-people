package br.com.apirest.crudpeople.resource;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.crudpeople.dto.PeopleDTO;
import br.com.apirest.crudpeople.entities.People;
import br.com.apirest.crudpeople.repository.PeopleRepository;

@RestController
@RequestMapping("/peoples")
public class PeopleController {

	@Autowired
	private PeopleRepository peopleRepository;

	@GetMapping
	public List<PeopleDTO> list(String name) {
		List<People> people = peopleRepository.findByName(name);
		return PeopleDTO.converter(people);
	}

	public ResponseEntity<People> find(@PathVariable Long peopleId) {
		Optional<PeopleDTO> peopleDTO = peopleRepository.findByName(peopleId);

		if (people.isPresent()) {
			return ResponseEntity.ok(people.get());
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping
	@Transactional
	public People create(@RequestBody People people) {
		return peopleRepository.save(people);
	}

}
