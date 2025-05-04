import Classes.ListaTarefas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        Scanner sc = new Scanner(System.in);
        int num;
        String tarefa;
        boolean cond = true;

        while(cond){
            System.out.println("--------------- MENU --------------");
            System.out.println("\n1 - Adicionar tarefa\n2 - Remover tarefa\n3 - Obter número total de tarefas\n4 - Consultar lista de tarefas\n5 - Sair\n");
            System.out.print("Opção desejada: ");
            num = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (num){
                case 1:
                    System.out.println("Digite a tarefa a ser adicionada ou \"SAIR\" para terminar.");
                    do{
                        System.out.print("Adicionar: ");
                        tarefa = sc.nextLine();
                        if(!tarefa.equalsIgnoreCase("sair")){
                            lista.adicionarTarefa(tarefa);
                        }
                    }while(!tarefa.equalsIgnoreCase("sair"));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Digite a tarefa específica a ser removida, \"SAIR\" para terminar ou \"LIMPAR\" para limpar a lista completamente.");
                    do{
                        System.out.print("Remover: ");
                        tarefa = sc.nextLine();
                        if(!tarefa.equalsIgnoreCase("sair")){
                            lista.removerTarefa(tarefa);
                        }
                    }while(!tarefa.equalsIgnoreCase("sair"));
                    System.out.println();
                    break;
                case 3:
                    if(lista.obterNumeroTotalTarefas() == 1) System.out.println("A lista tem apenas uma tarefa.\n");
                    else if(lista.obterNumeroTotalTarefas() < 1) System.out.println("A lista não possui nenhuma tarefa.\n");
                    else System.out.printf("A lista possui %d tarefas.%n%n", lista.obterNumeroTotalTarefas());

                    break;
                case 4:
                    lista.obterDescricoesTarefas(); break;
                case 5:
                    System.out.println("Até logo!");
                    cond = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}