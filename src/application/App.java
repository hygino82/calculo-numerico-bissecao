package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bissecao;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bissecao questao = new Bissecao();
        double a, b;
        do {
            System.out.print("Informe um intervalo -> ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            questao.setA(a);
            questao.setB(b);

        } while (questao.testeIntervalo(a, b) == false);
        System.out.println("Intervalo é válido");
        questao.resolverMetodo(0.001);
        System.out.println(questao.f(10));
        
        sc.close();
    }
}
