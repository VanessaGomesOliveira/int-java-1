package com.company;

import java.util.Scanner;

public class Exercicio1 {

    public void executar() {
        // Exercicio 1

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        int contador = 0;
        int valorAtual = 0;

        while (contador < n) {
            valorAtual++;
            if (valorAtual % 2 == 0) {
                contador += 1;
                System.out.println(valorAtual);
            }
        }
    }

}
