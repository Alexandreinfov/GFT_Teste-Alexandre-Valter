package Exercicio_1;

public class Memoria extends Hardware{
    private Double frequencia;
    private Double capacidade;
    private String tipo;

    public Memoria(int id, String descricao, Double valor, String fabricante, Double frequencia, Double capacidade, String tipo) {
        super(id, descricao, valor, fabricante);
        this.frequencia = frequencia;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Double frequencia) {
        this.frequencia = frequencia;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "frequencia=" + frequencia +
                ", capacidade=" + capacidade +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
