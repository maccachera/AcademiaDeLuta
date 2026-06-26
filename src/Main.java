//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("🥊 INICIALIZANDO SISTEMA DE GERENCIAMENTO DE LUTAS 🥊\n");


        Treinador mestreTata = new Treinador("Mestre Tata", "111.222.333-44", LocalDate.of(1975, 5, 20), "Muay Thai");
        Treinador mestreDorea = new Treinador("Luiz Dórea", "999.888.777-66", LocalDate.of(1965, 3, 15), "Boxe");

        // 2. Criando os Lutadores (Herança)
        LutadorBoxe minotouro = new LutadorBoxe("Rogério Minotouro", "222.333.444-55", LocalDate.of(1976, 6, 2), 93.0);



        System.out.println("\n-----------------------------------");


        Academia tft = new Academia("Tata Fight Team");


        Academia teamNogueira = new Academia("Team Nogueira");




        System.out.println("\n-----------------------------------");

        // 4. Configurando o Torneio usando Map (Dicionário)
        Torneio campeonato = new Torneio("Campeonato Carioca de Combate");

        // Inscrevendo em categorias diferentes
        Lutador lutador1 = null;
        campeonato.inscreverParaLuta("Peso Leve", null);





        System.out.println("\n-----------------------------------");




        minotouro.baterPeso();


        System.out.println("");
        minotouro.atacar();

        System.out.println("... contra-ataque ...");


    }
}