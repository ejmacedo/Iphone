package src;

import classes.Iphone;

public class Main {


	public static void main(String[] args) {
		
		Iphone iphone = new Iphone("16 Pro Max", "Preto", 12.0, 5.0, 5000, 2025);
		
		String ligar = 		iphone.ligar();
		System.out.println(ligar);
		
		String atender = 		iphone.atender();
		System.out.println(atender);
		
		String iniciarCorreioVoz = 		iphone.iniciarCorreioVoz();
		System.out.println(iniciarCorreioVoz);
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Festa no Apê");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.exibirPagina("www.dio.me");
		iphone.adicionarNovaAba();
		
		
	}

}
