package Exercicio_3;
//Considerando que no Brasil a expectativa de vida para os homens
//é de 73,1 anos (considere 73), e para as mulheres é de 80,1
//(considere 80). Escreva um programa que contenha uma classe
//Pessoa com os seguintes atributos: nome, sexo, dataNascimento,
//e que tenha o seguinte médoto, imprimeTempoVidaRestante. O
//programa deverá imprimir quantos anos a pessoa deverá viver,
//levando em consideração, sua idade, sexo e expectativa de vida
//para aquele sexo. (Valor: 2.0 pontos)
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria","feminino",1998);

        System.out.println("Seu tempo de vida é " + pessoa.imprimiTempoVIdaRestante() + " anos ");
    }
}
