package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Escreva um programa que lê nome, altura e peso de 5 pessoas, calcula o IMC de cada um e
        // ao final informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).

        Scanner scan = new Scanner(System.in);
        People[] person = new People[5];

        for (int i=0; i < person.length; i++){
            System.out.println("Digite o nome, a altura e peso (respeitando essa ordem): ");
            person[i] = new People(scan.next(), scan.nextFloat(), scan.nextFloat());
        }
        

        for (int i=0; i < person.length; i++){
            if (person[i].getBmi() < 18.5 ){
                System.out.println("NOME: " + person[i].getName() +
                        " SEU IMC É: " + person[i].getBmi() +
                        " SEU PESO ESTÁ ABAIXO DO IDEAL.");
            }
            else if (person[i].getBmi() > 25){
                System.out.println("NOME: " + person[i].getName() +
                        " SEU IMC É:  " + person[i].getBmi() +
                        " SEU PESO ESTÁ ACIMA DO IDEAL.");
            }
            else {
                System.out.println("NOME: " + person[i].getName() +
                        " SEU IMC É: " + person[i].getBmi() +
                        " SEU PESO É O IDEAL!!");
            }
        }


    }
}
