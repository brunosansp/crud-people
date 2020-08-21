package br.com.apirest.crudpeople.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoas")
public class People {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@NotNull
	@Column(nullable = false, length = 60, unique = true)
	public String name;

	@NotNull
	public String surname;

	public String nickname;

	// Sr, Sra, ...
	public String formalTreatment;

	@NotNull
	public LocalDate dateOfBirth;

	@NotNull
	@Column(nullable = false, length = 10, unique = true)
	public String rg;

	@NotNull
	@Column(nullable = false, length = 11, unique = true)
	public String cpf;

	@NotNull
	@Column(nullable = false, length = 50, unique = true)
	public String email;

	@NotNull
	public String address;

	// cel, zap, trabalho, casa
	public String phone;

	

}
