package br.com.apirest.crudpeople.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.apirest.crudpeople.viacep.ViaCEP;
import br.com.apirest.crudpeople.viacep.ViaCEPException;

@Service
public class AddressService {

	Scanner sc = new Scanner(System.in);

	private void WsViaCep() throws Exception {

		System.out.println("Digite o CEP da sua residência: ");
		String cep = sc.nextLine();

		try {
			ViaCEP viaCep = new ViaCEP();
			viaCep.buscar(cep);
			viaCep.getBairro();
		} catch (Exception e) {
			throw new Exception(e);
		}

		sc.close();
	}

}
