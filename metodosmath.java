import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public class TestandoMetodosMath{
          
      
    public static void main(String[] args) {
      double x = 20;
        double quadrado;
        double raizQuadrada;
        int arredondaRaiz;
        quadrado = Math.pow(x,2);
        raizQuadrada = Math.sqrt(x);
        arredondaRaiz = Math.round(raizQuadrada);

        System.out.printIn("O quadrado do valor é:"+quadrado);
        System.out.printIn("A raiz quadrada do valor e o arredondamento são:"+raizQuadrada+arredondaRaiz);
    }
}
