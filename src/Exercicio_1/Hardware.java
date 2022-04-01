package Exercicio_1;

public class Hardware {
    private int id;
    private String descricao;
    private Double valor;
    private String fabricante;

    public Hardware(int id, String descricao, Double valor, String fabricante) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.fabricante = fabricante;
    }

    public String getDetalhesHardware() {
        return "Hardware{" +
                "id=" + this.id +
                ", descricao='" + this.descricao + '\'' +
                ", valor=" + this.valor +
                ", fabricante='" + this.fabricante + '\'' +
                '}';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
