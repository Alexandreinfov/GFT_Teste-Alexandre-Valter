package Exercicio_1;

public class DiscoRigido extends Hardware{
    private Double capacidade;
    private Double velocidade;
    private String tipo;

    public DiscoRigido(int id, String descricao, Double valor, String fabricante, Double capacidade, Double velocidade, String tipo) {
        super(id, descricao, valor, fabricante);
        this.capacidade = capacidade;
        this.velocidade = velocidade;
        this.tipo = tipo;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "DiscoRigido{" +
                "capacidade=" + capacidade +
                ", velocidade=" + velocidade +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
