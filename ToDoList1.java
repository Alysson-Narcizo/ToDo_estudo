import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList1 {

    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada por nextInt()

            switch (escolha) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada!");
                    break;
                case 2:
                    System.out.println("\n--- Suas Tarefas ---");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                    break;
                case 3:
                    System.out.println("\n--- Remover Tarefa ---");
                    System.out.print("Digite o número da tarefa para remover: ");
                    int index = scanner.nextInt() - 1;
                    if (index >= 0 && index < tarefas.size()) {
                        tarefas.remove(index);
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Número inválido!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (escolha != 4);

        scanner.close();
    }
}
