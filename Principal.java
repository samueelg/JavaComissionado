package br.edu.unifil.lpoo.rh.visao;

import br.edu.unifil.lpoo.rh.controle.Controle;

import javax.swing.plaf.synth.ColorType;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Controle controle = new Controle();
        int opcao = 0;

        while (opcao != 6){
            System.out.println("1.Incluir Funcionario");
            System.out.println("2.Listar Funcionarios");
            System.out.println("3.Consultar Funcionario Especifico");
            System.out.println("4.Excluir Funcionario");
            System.out.println("5.Atualizar salario de Funcionario");
            System.out.println("6.Sair");
            System.out.println("Digite uma opção: ");
            opcao = scan.nextInt();


            switch (opcao){
                case 1:
                    controle.cadastrarFunc();
                    break;

                case 2:
                    System.out.println(controle.listarFuncionarios());
                    break;

                case 3:
                    System.out.println("Digite o funcionario para pesquisar: ");
                    String funcMatri = scan.next();

                    for (int i = 0; i < controle.getListaEmp().size(); i++) {
                        if(controle.getListaEmp().get())
                    }
            }
        }

    }
}
