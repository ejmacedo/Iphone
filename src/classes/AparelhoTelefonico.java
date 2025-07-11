package classes;

public abstract class AparelhoTelefonico {

	private String modelo;
	private String cor;
	private Double altura;
	private Double largura;
	private int capacidadeBateria;
	private int anoLancamento;

	public AparelhoTelefonico(String modelo, String cor, Double altura, Double largura, int capacidadeBateria,
			int anoLancamento) {
		this.modelo = modelo;
		this.cor = cor;
		this.altura = altura;
		this.capacidadeBateria = capacidadeBateria;
		this.anoLancamento = anoLancamento;
		this.largura = largura;
	}

	public String ligar() {
		return "Ligando...";
	}

	public String atender() {
		return "Atendendo...";
	}

	public String iniciarCorreioVoz() {
		return "Iniciando Correio de Voz...";
	}

}
