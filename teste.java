import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Conta {
       int numero = 1234;
        String titular = "Fulano";
        String cpf = "123.456.789-10";
        double saldo = 1000;
        double limite = 1000;
    }

class Cliente{
    String nome;
    String sobrenome;
    String cpf;
    
}
class Conta{
    int numero;
    double saldo;
    double limite;
    Cliente titular;
}
class Teste{
    public static void main(String[]args){
        Conta minhaConta = new Conta();
        Cliente c = new Cliente();
        minhaConta.titular = c;
        minhaConta.numero = c;
        minhaConta.cpf = c;
        minhaConta.saldo = c;
        minhaConta.limite = c;
    }
}
