package Exercicio_4;

public class Ave extends Animal{
    @Override
    public void locomover() {
        System.out.println("Voar");
    }

    @Override
    public void alimentar() {
        System.out.println("“Alimentar com mix de Carne e Vegetais");
    }
}
