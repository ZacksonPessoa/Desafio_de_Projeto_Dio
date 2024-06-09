import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Banco banco;
        try {
            System.out.print("[1] - Abrir Conta:\n");
            //System.out.print("[2] - Acessar Conta:\n");
            int opcao = sc.nextInt();
            switch (opcao) {

                case 1:
                    sc.nextLine();
                    System.out.print("Nome:");
                    String name = sc.nextLine();

                    System.out.println("Qual tipo de conta: ");
                    System.out.println("[1] - Conta Corrente:");
                    System.out.print("[2] - Conta Poupança:");
                    int tipo = sc.nextInt();
                    if (tipo == 1) {
                        ContaCorrente cc = new ContaCorrente(new Cliente(name));
                        cc.imprimirExtrato();
                        banco = new Banco();
                        banco.addConta(cc);
                    } else {
                        ContaPoupanca contapoupanca = new ContaPoupanca(new Cliente(name));
                        contapoupanca.imprimirExtrato();
                        banco = new Banco();
                        banco.addConta(contapoupanca);
                    }
                    break;

                case 2:
                    System.out.print("Função em desenvolvimento temporáriamente indisponível...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("Opção inválida! Digite o valor correspondente do texto.");
        }




        sc.close();
    }
}