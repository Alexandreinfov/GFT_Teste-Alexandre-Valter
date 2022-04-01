package Exercicio_3;
import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sexo;
    private int dataNascimento;

    public Pessoa(String nome, String sexo, int dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public int imprimiTempoVIdaRestante(){
        LocalDate dta = LocalDate.now();
        int ano = dta.getYear();
        int tempoDeVida;
        int idade = ano - this.dataNascimento ;
        if (this.sexo == "feminino"){
            tempoDeVida = 77 - idade ;
        }else{
            tempoDeVida = 75 - idade ;

        }
        return tempoDeVida;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
