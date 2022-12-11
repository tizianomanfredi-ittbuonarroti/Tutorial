package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2, risultato;
        int scelta;
        boolean continua = true;

        while (continua) {
            do {
                System.out.println("Menù: ");
                System.out.println("---");
                System.out.println("1. Somma di due numeri");
                System.out.println("2. Moltiplicazione di due numeri");
                System.out.println("0. Esci");
                System.out.println("---");
                System.out.println("Inserisci la tua scelta: ");
                scelta = input.nextInt();
            } while (scelta < 0 || scelta > 2);

            switch (scelta) {
                case 1: {
                    System.out.println("Inserisci il primo numero: ");
                    numero1 = input.nextInt();
                    System.out.println("Inserisci il secondo numero: ");
                    numero2 = input.nextInt();

                    risultato = somma(numero1, numero2);
                    System.out.println("Il risultato è: " + risultato);
                    break;
                }
                case 2: {
                    System.out.println("Inserisci il primo numero: ");
                    numero1 = input.nextInt();
                    System.out.println("Inserisci il secondo numero: ");
                    numero2 = input.nextInt();

                    risultato = moltiplicazione(numero1, numero2);
                    System.out.println("Il risultato è: " + risultato);
                    break;
                }
                case 0: {
                    System.out.println("Grazie e arrivederci");
                    continua = false;
                    break;
                }
            }
        }
    }

    public static int somma(int n1, int n2){
        int somma = n1 + n2;
        return somma;
    }

    public static int moltiplicazione(int n1, int n2){
        int molti = n1 * n2;
        return molti;
    }
}
