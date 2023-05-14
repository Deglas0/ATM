import java.util.Scanner;

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
        int operacao = 0;
        String inicio = """
                /////////////////////////////////////////////////////////////////////////
                Dados do Cliente: 
                                
                Nome: %s
                                
                Tipo de conta: %s
                                
                Saldo atual: %.2f
                              
                /////////////////////////////////////////////////////////////////////////
                """.formatted(nome, tipoDeConta, emConta);

        String opcoes = """
                    Qual a operação desejada?
                    1- Checar saldo
                    2-
                    3-
                    4-sair
                    """;

        System.out.println(inicio);

    while (operacao != 4){
        System.out.println(opcoes);
        operacao = scanner.nextInt();

        if (operacao==1){
            System.out.println("""
                    /////////////////////////////////////////////////////////////////////////
                    
                    Saldo atual: %.2f
                    
                    /////////////////////////////////////////////////////////////////////////
                    """.formatted(emConta));
        }
        if (operacao==2){

        }
        if (operacao==3){

        }
        else{
            System.out.println("Opção invalida, porvafor consultar as opções possiveis");
        }
    }




    }}