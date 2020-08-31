package br.com.apirest.crudpeople.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "people")
public class People {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@NotBlank
	@Column(nullable = false, length = 60, unique = true)
	public String name;

	@NotNull
	public String surname;

	public String nickname;

	@NotNull
    @JsonFormat(pattern="dd-MM-yyyy")
	public Date birthDate;

	@NotNull
	@Column(nullable = false, length = 10, unique = true)
	public String rg;

	@NotNull
	@Column(nullable = false, length = 11, unique = true)
	public String cpf;

	@Email
	@NotBlank
	@Column(nullable = false, length = 50, unique = true)
	public String email;

	@NotNull
	public String address;

	// cel, zap, trabalho, casa
	@NotBlank
	public String phone;
	
//	// Sr, Sra, ...
//	public String formalTreatment;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
