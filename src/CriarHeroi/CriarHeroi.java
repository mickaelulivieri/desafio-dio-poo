package CriarHeroi;

import classeheroi.Heroi;
import java.util.Scanner;


// Classe CriadorDeHeroi
public class CriarHeroi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário quantos heróis deseja criar
        System.out.print("Quantos heróis você deseja criar? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        // Criar um array para armazenar os heróis
        Heroi[] herois = new Heroi[n];

        // Loop para criar os heróis
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do herói " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade do herói " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha
            System.out.print("Escolha o tipo do herói! " + (i + 1) + " (guerreiro, mago, monge ou ninja): ");
            String tipo = scanner.nextLine();

            // Criar um novo herói e armazená-lo no array
            herois[i] = new Heroi(nome, idade, tipo);
        }

        // Exibir informações e ataques de todos os heróis
        for (Heroi heroi : herois) {
            heroi.mostrarInformacoes();
            heroi.atacar();
        }

        scanner.close();
    }
}