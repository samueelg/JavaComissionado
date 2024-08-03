package br.edu.unifil.lpoo.rh.modelo;

public class Producao extends Funcionario{
    private int qtdProduzida;

    public Producao(String nome, int matricula, double salario, int qtdProduzida) {
        super(nome, matricula, salario);
        this.qtdProduzida = qtdProduzida;
    }

    public int getQtdProduzida(){
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida){
        this.qtdProduzida = qtdProduzida;
    }

    @Override
    public double getGanhoMensal() {
        return super.salario * qtdProduzida;
    }

    @Override
    public double getBonificacao() {
        return getGanhoMensal() * 0.07;
    }
}
