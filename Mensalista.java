package br.edu.unifil.lpoo.rh.modelo;

public class Mensalista extends Funcionario{
    public Mensalista(String nome, int matricula, double salario) {
        super(nome, matricula, salario);
    }

    @Override
    public double getGanhoMensal() {
        return super.getSalario();
    }

    @Override
    public double getBonificacao() {
        return getGanhoMensal() * 0.05;
    }
}
