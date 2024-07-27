package entities;

public class Curso {

    private String nome;
    private int quantidadeAlunos;
    private double preco;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidadeAlunoss(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public double totalValorCurso() {
        return preco * quantidadeAlunos;

    }

    public String toString() {


        return ("O nome do curso é " + getNome() +
                "ele tem " + getQuantidadeAlunos() +
                " alunos matriculados e saiu no total de R$" + totalValorCurso());
    }

}


