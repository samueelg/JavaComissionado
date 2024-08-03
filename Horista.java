package br.edu.unifil.lpoo.rh.modelo;

public class Horista extends Funcionario{
    private int horasTrabalhadas;

    public Horista(String nome, int matricula, double salario, int horasTrabalhadas) {
        super(nome, matricula, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas(){
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getGanhoMensal() {
        return super.salario * horasTrabalhadas;
    }

    @Override
    public double getBonificacao() {
        return getGanhoMensal() * 0.04;
    }
}
