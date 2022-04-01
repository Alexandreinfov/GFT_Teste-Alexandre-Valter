package Exercicio_4;

public class reptil extends Animal{
    @Override
    public void locomover() {
        System.out.println("Andar e Nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("“Alimentar com mix de Carne e Vegetais");
    }
}
