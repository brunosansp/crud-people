package br.com.apirest.crudpeople.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.apirest.crudpeople.entities.People;
import lombok.Getter;

@Getter
public class PeopleDTO {

	public Long id;

	public String name;

	public String surname;

	public String nickname;

	public String formalTreatment;

	public LocalDate dateOfBirth;

//	public String rg;

//	public String cpf;

	public String email;

//	public String address;

//	public String phone;

	public PeopleDTO(People people) {
		this.id = people.id;
		this.name = people.name;
		this.surname = people.surname;
		this.nickname = people.nickname;
		this.email = people.email;
	}

	public static List<PeopleDTO> converter(List<People> people) {
		return people.stream().map(PeopleDTO::new).collect(Collectors.toList());
	}

}
