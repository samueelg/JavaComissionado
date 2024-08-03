package br.edu.unifil.lpoo.rh.controle;

import br.edu.unifil.lpoo.rh.modelo.*;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    private ArrayList<Funcionario> listaEmp = new ArrayList<>();

    public Controle(){
        listaEmp = new ArrayList<>();
    }

    public ArrayList<Funcionario> getListaEmp() {
        return listaEmp;
    }

    public void setListaEmp(ArrayList<Funcionario> listaEmp) {
        this.listaEmp = listaEmp;
    }

    public void cadastrarFunc() {
        Funcionario funcionario = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario: ");
        String nome = scan.next();

        System.out.println("Digite a matricula do funcionario: ");
        int matricula = scan.nextInt();

        System.out.println("Digite o salario do funcionario: ");
        double salario = scan.nextDouble();

        System.out.println("Digite o tipo de funcionario: ");
        System.out.println("1.Mensalista | 2.Horista | 3.Comissionado | 4.Producao");
        int tec = scan.nextInt();
        switch (tec) {

            case 1:
                funcionario = new Mensalista(nome, matricula, salario);
                listaEmp.add(funcionario);
                break;

            case 2:
                System.out.println("Digite o numero de horas trabalhadas: ");
                int hTr = scan.nextInt();

                funcionario = new Horista(nome, matricula, salario, hTr);
                listaEmp.add(funcionario);
                break;

            case 3:
                System.out.println("Digite a comissão: ");
                int comissao = scan.nextInt();

                System.out.println("Digite a quantidade de vendas: ");
                int qtdV = scan.nextInt();

                funcionario = new Comissionado(nome, matricula, salario, comissao, qtdV);
                listaEmp.add(funcionario);
                break;

            case 4:
                System.out.println("Digite a quantidade produzida: ");
                int qtdP = scan.nextInt();
                funcionario = new Producao(nome, matricula, salario, qtdP);
                listaEmp.add(funcionario);
                break;

            default:
                System.out.println("Entrada invalida, por favor digite novamente: ");
                return;
        }

    }

    public String listarFuncionarios() {
        StringBuilder sb = new StringBuilder();

        for (Funcionario func : listaEmp) {
            sb.append("Nome: " + func.getNome() + "\n");
            sb.append("Salario: " + func.getSalario() + "\n");
            sb.append("Matricula: " + func.getMatricula() + "\n");
            sb.append("\n");
        }
        return sb.toString();
    }

    public Funcionario getFuncionario(int matricula) {
        StringBuilder sb = new StringBuilder();


        for (Funcionario func : listaEmp) {
            if (matricula == func.getMatricula()) {
            }
            return func;
        }
        return null;
    }

    public void excluiFuncionario(Funcionario funcionario){
        listaEmp.remove(funcionario);
    }
}

