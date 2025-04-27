import java.util.*;
import java.util.Scanner;

public class Jogos {
    public static void main(String[] args) {
        Scanner input = new;
        Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome = input.nextLine();

        Scanner idade = new;
        Scanner(System.in);
        System.out.print("Sua idade:");
        int idade = idade.nextInt();

        Scanner jogo = new;
        Scanner(System.in);
        System.out.print("Qual seu jogo favorito?");
        String jogo = jogo. nextLine();

        System.out.printIn("Seu nome é "+nome+",você tem" +idade+ "anos e gosta de "+jogo+".");

        
    }
}