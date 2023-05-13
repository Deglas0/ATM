import java.util.Scanner;

Dpublic class Main {
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
            if (operacao==1){
                System.out.println("""
                /////////////////////////////////////////////////////////////////////////
                                
                Saldo atual: %.2f
                              
                /////////////////////////////////////////////////////////////////////////
                        """.formatted(emConta));
            }

        }while(limite !=1000 || limite <1000);

        }

    }