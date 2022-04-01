package Exercicio_2;

//Escreva um programa que permita a criação de um vetor com N
//posições (sendo N um valor informado pelo usuário). Após
//definido o tamanho do vetor, o programa deverá permitir que o
//usuário preencha o vetor com valores inteiros. Uma vez que o
//vetor esteja preenchido, o programa deverá imprimir as
//seguintes informações. (Valor: 3.0 pontos)
//a. Quantidade de números pares.
//b. Quantidade de números ímpares.
//c. Quantidade de números repetidos.
//d. Quais são os números repetidos.

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe o tamanho do vetor: ");
        Scanner entrada1 = new Scanner(System.in);
        int N = entrada1.nextInt();
        int x[]= new int[N];

        int par=0;
        int impar =0;
       Scanner entrada2 = new Scanner(System.in);
        for(int i=0; i<x.length;i++){
            System.out.println("Informe um número: ");
            x[i] = entrada2.nextInt();
            if(x[i]%2==0){
                par++;
            }else {
                impar++;
            }
        }
        System.out.println("No total temos " + par + " números pares." );
        System.out.println("No total temos " + impar + " números ímpares." );
    }
}
