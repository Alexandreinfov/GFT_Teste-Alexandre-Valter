package Exercicio_1;

//1. Escreva um programa que contenha a estrutura que é apresentada
//no diagrama de classes apresentado a seguir:
//O programa deverá permitir que sejam cadastrados um equipamento
//de cada tipo. Também é necessário que o sistema imprima cada um
//dos equipamentos cadastrados, implemente o método
//getDetalhesHardware seguindo as regras da orientação a
//objetos.(Valor: 3.0 pontos)

public class Main {
    public static void main(String[] args) {
       // Hardware hardware = new Hardware(01,"Pc Gamer",3500d,"HP");
        Cpu cpu = new Cpu(00,"CPU",1500d,"INTEL",3000d,"YY");
        Memoria memoria = new Memoria(00,"Memoria",800d,"xxx",3000d,16d,"RAM");
        DiscoRigido discoRigido = new DiscoRigido(00,"Disco Rigido",900d,"DELL",1000d,6000d,"tre");


        cpu.getDetalhesHardware();

        System.out.println(cpu);
    }
}
