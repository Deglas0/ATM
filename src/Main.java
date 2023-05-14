import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double emConta = 2000;
        System.out.println("""
                /////////////////////////////////////////////////////////////////////////
                                
                Digite seu nome e o tipo da sua conta:
                                
                /////////////////////////////////////////////////////////////////////////
                """);
        String nome = scanner.nextLine();
        String tipoDeConta = scanner.nextLine();
        int operacao = 0;
        int terminal ;
        terminal = new Random().nextInt(1000);

        double taxaDeServico = 1.5;

        double total ;
        String inicio = """
                /////////////////////////////////////////////////////////////////////////
                
                ** Terminal: %d **
                
                Dados do Cliente:
                                
                Nome: %s
                                
                Tipo de conta: %s
                                
                Saldo atual: %.2f
                              
                /////////////////////////////////////////////////////////////////////////
                """.formatted( terminal ,nome, tipoDeConta, emConta);

        String opcoes = """
                    Qual a operação desejada?
                    1- Checar saldo
                    2- TED
                    3- Receber
                    4- sair
                    """;

        System.out.println(inicio);

    while (operacao < 99999){
        System.out.println(opcoes);
        operacao = scanner.nextInt();

        if (operacao==1){
            System.out.printf("""
                    /////////////////////////////////////////////////////////////////////////
                                
                    Saldo atual: %.2f
                                
                    /////////////////////////////////////////////////////////////////////////
                    %n""", emConta);
        }
        if (operacao==2){

            System.out.println("""
                    Digite o destinatario o qual vc quer efetuar a trasação:
                    """);

            scanner.nextLine();

            String destinatario = scanner.nextLine();

            System.out.println("""
                    Qual valor irá enviar para o destinatário?
                    """);
            double valorEnviado = scanner.nextDouble();


            System.out.println("Para confirmar digite SIM");

            scanner.nextLine();
            String seg = scanner.nextLine();

            if (Objects.equals(seg, "SIM") || Objects.equals(seg, "sim") || Objects.equals(seg,"Sim")) {
                total = valorEnviado + taxaDeServico;
                String recibo = """
                        /////////////////////////////////////////////////////////////////////////
                                        ATM TRANSACTION
                                        
                        Terminal#                 %d
                                        
                        Remetente:                %s
                                        
                        Destinatario:             %s
                                        
                        Transação:                R$%.2f
                                        
                        Taxa de serviço:          R$%.2f
                                        
                        Total:                    R$%.2f
                                        
                        /////////////////////////////////////////////////////////////////////////
                        """.formatted(terminal, nome, destinatario, valorEnviado, taxaDeServico, total);
                System.out.println(recibo);
                emConta = emConta - total;
            }else{
                System.out.println("Transação cancelada");
        }
        }
        if (operacao==3){
            System.out.println("""
                    Digite o nome de quem é o remetente da transação:
                    """);
            scanner.nextLine();
            String remetente = scanner.nextLine();

            System.out.println("""
                    Qual valor irá a ser recebido?
                    """);
            double valorEnviado = scanner.nextDouble();

            System.out.println("Para confirmar digite SIM");
            scanner.nextLine();
            String seg = scanner.nextLine();

            if (Objects.equals(seg, "SIM") || Objects.equals(seg, "sim") || Objects.equals(seg,"Sim")) {
                total = valorEnviado + taxaDeServico;
                String recibo = """
                        /////////////////////////////////////////////////////////////////////////
                                        ATM TRANSACTION
                                        
                        Terminal#                 %d
                                        
                        Remetente:                %s
                                        
                        Destinatario:             %s
                                        
                        Transação:                R$%.2f
                                        
                        Taxa de serviço:          R$%.2f
                                        
                        Total:                    R$%.2f
                                        
                        /////////////////////////////////////////////////////////////////////////
                        """.formatted(terminal,remetente, nome, valorEnviado, taxaDeServico, total);
                System.out.println(recibo);
                emConta = emConta + total;
            }else{
                System.out.println("Transação cancelada");


        }
        }

        if (operacao==4){
            System.out.println("""
                    /////////////////////////////////////////////////////////////////////////
                    
                    Muito obrigado por usar Nosso ATM.
                    
                    /////////////////////////////////////////////////////////////////////////
                    """);
            operacao =operacao+1000000;
        }
        else{
            System.out.println("Opção invalida, porvafor consultar as opções possiveis");
        }
    }




    }}