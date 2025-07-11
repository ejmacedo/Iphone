package classes;

import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class Iphone extends AparelhoTelefonico implements NavegadorNaInternet, ReprodutorMusical{

	public Iphone(String modelo, String cor, Double altura, Double largura, int capacidadeBateria, int anoLancamento ) {
		super(modelo, cor, altura, largura, anoLancamento, capacidadeBateria);
	}

	@Override
	public void tocar() {
		System.out.println("Tocando...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausado...");		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musíca " + musica + " selecionada...");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página de url: " + url);		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionado nova aba...");		
	}

	

}
