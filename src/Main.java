import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int op = 0;
        
        while (op != 8) {
            mostrarMenu();
            op = lerInteiro(scanner, "Informe uma opção do menu");
            
            switch (op) {
                
                case 1:
                
                
            }
            
        }
        
        
        
        
        
        
        
    }
    
    private static void mostrarMenu() {
        System.out.println("----MENU ACADEMIA----");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Vincular plano a aluno");
        System.out.println("3 - Cadastrar aula");
        System.out.println("4 - Agendar aluno em aula");
        System.out.println("5 - Ver aulas de um aluno");
        System.out.println("6 - Registrar pagamento");
        System.out.println("7 - Ver relatório da academia");
        System.out.println("8 - Sair");
        System.out.println("");
    }

    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números.");
            }
        }
    }
    
    
    
}