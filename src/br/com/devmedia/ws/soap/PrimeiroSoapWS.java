package br.com.devmedia.ws.soap;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.validation.constraints.NotNull;

@WebService
public class PrimeiroSoapWS {

	
	@WebMethod
	public String buscaNome(@WebParam(name = "nome") @NotNull String nome) {
		return "Nome: " + nome;
	}
	
	
	@WebMethod(operationName = "consultaIdade", exclude = true)
	public Integer getAge() {
		return new Random().nextInt();	
	}
	
	@WebMethod(operationName = "primeiraLista")
	public List<String> getMinhaPrimeiraLista(){
		List<String> items = new LinkedList<>();
		
		items.add("Meu item 1");
		items.add("Meu item 2");
		items.add("Meu item 3");
		items.add("Meu item 4");
		items.add("Deivison");
		
		return items;
	}
	
	@WebMethod(operationName = "listaCarros")
	public List<Carro> getMeusCarros(){
		List<Carro> carros = new LinkedList<>();
		
		carros.add(new Carro("Ferrari", "Mégane GT", TipoCor.BRANCO));
		carros.add(new Carro("Ford", "KA", TipoCor.VERMELHO));
		
		return carros;
	}
}































































