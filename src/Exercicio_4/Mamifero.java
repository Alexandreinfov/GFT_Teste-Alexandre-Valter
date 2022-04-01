package Exercicio_4;

public class Mamifero extends Animal {
    @Override
    public void locomover() {
        System.out.println("Andar");
    }

    @Override
    public void alimentar() {
        System.out.println("“Alimentar com mix de Carne e Vegetais");
    }
}
