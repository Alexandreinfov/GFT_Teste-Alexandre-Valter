package Exercicio_1;

public class Cpu extends Hardware{
    private Double clock;
    private String modelo;


    public Cpu(int id, String descricao, Double valor, String fabricante, Double clock, String modelo) {
        super(id, descricao, valor, fabricante);
        this.clock = clock;
        this.modelo = modelo;
    }

    public Double getClock() {
        return clock;
    }

    public void setClock(Double clock) {
        this.clock = clock;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "clock=" + clock +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
