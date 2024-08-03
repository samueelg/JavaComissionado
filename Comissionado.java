package br.edu.unifil.lpoo.rh.modelo;

public class Comissionado extends Funcionario{
    private int comissao;
    private int qtdVenda;


    public Comissionado(String nome, int matricula, double salario, int comissao, int qtdVenda){
        super(nome,matricula,salario);
        this.comissao = comissao;
        this.qtdVenda = qtdVenda;
    }

    @Override
    public double getGanhoMensal() {
        return super.getSalario()+comissao * qtdVenda;
    }

    @Override
    public double getBonificacao() {
        return getGanhoMensal() * 0.08;
    }
}
