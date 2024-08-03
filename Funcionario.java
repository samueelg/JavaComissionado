package br.edu.unifil.lpoo.rh.modelo;

public abstract class Funcionario extends Pessoa {
    private int matricula;
    protected double salario;

    public Funcionario(String nome, int matricula, double salario){
        super(nome);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getGanhoMensal();

    public abstract double getBonificacao();

}
