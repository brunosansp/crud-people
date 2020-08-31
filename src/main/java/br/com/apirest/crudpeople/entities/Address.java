package br.com.apirest.crudpeople.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Address {
	
	@Column(name = "cep_number")
    public String CEP;

	@Column(name = "logradouro")
    public String Logradouro;
	
	@Column(name = "complemento")
    public String Complemento;
    
    @Column(name = "bairro")
    public String Bairro;
    
    @Column(name = "localidade")
    public String Localidade;
    
    @Column(name = "uf")
    public String Uf;
    
    @Column(name = "Ibge")
    public String Ibge;
    
    @Column(name = "Gia")
    public String Gia;

}
