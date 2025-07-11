# Iphone
Projeto de diagramação de classe do Iphone Dio
<img width="1097" height="480" alt="image" src="https://github.com/user-attachments/assets/58d34f24-5aa3-4717-a5b0-941cb95b2500" />


abstract class AparelhoTelefonico {
    - modelo: String
    - cor: String
    - altura: double
    - largura: double
    - capacidadeBateria: int
    - anoLancamento: int
    + ligar(numero: String): void
    + atender(): void
    + iniciarCorreioVoz(): void
    + mostrarInformacoes(): void
}

interface ReprodutorMusical {
    + tocar(): void
    + pausar(): void
    + selecionarMusica(musica: String): void
}

interface NavegadorNaInternet {
    + exibirPagina(url: String): void
    + adicionarNovaAba(): void
    + atualizarPagina(): void
}

class Iphone {
}

Iphone --|> AparelhoTelefonico
Iphone ..|> ReprodutorMusical
Iphone ..|> NavegadorNaInternet
