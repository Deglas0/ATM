import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double emConta = 2000;
        int limite = 1000;
        System.out.println("""
                /////////////////////////////////////////////////////////////////////////
                
                Digite seu nome e o tipo da sua conta:
                
                /////////////////////////////////////////////////////////////////////////
                """);
        String nome = scanner.nextLine();
        String tipoDeConta = scanner.nextLine();
        int operacao = 0
        String mensagem = """
                /////////////////////////////////////////////////////////////////////////
                Dados do Cliente: 
                                
                Nome: %s
                                
                Tipo de conta: %s
                                
                Saldo atual: %.2f
                              
                /////////////////////////////////////////////////////////////////////////
                """.formatted(nome, tipoDeConta, emConta);
        System.out.println(mensagem);

        do {
            System.out.println("""
                    Qual a operação desejada?
                    1- Checar saldo
                    2-
                    3-
                    4-sair
                    """);

            operacao = scanner.nextInt();

            if (operacao==4){
                limite=1000;
            }
        }while (limite !=1000 || limite <1000 );


        }

    }
