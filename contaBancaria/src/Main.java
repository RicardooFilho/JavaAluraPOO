import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        String name = "Ricardo Tagami";
       String accountType = "Corrente";
       Double balance = 2700.00;
       Integer choice = 0;
       Double value = 0.00;

        String initMessage = String.format("""
                *******************************************************
                Dados iniciais do cliente: 
                
                Nome:  %s
                Tipo Conta: %s 
                Saldo inicial: R$%.2f
                *******************************************************
                """, name, accountType, balance);

        System.out.println(initMessage);

        do {
            System.out.println("""
                    Operações
                                        
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                                        
                    Digite a opção desejada
                    """);

            choice = reading.nextInt();

            if (choice == 1) {
                System.out.println("Saldo atual: " + String.format("%.2f", balance));
            } else {
                if (choice == 2) {
                    System.out.println("Informe o valor que deseja receber: ");
                    value = reading.nextDouble();
                    balance += value;
                } else if (choice == 3) {
                    System.out.println("Informe o valor que deseja transferir: ");
                    value = reading.nextDouble();
                    balance -= value;
                }
            }
        } while (choice != 4);
    }
}