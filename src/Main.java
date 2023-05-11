import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double emConta = 2000;
        String nome = "Douglas";
        String tipoDeConta = "Corrente";
        Scanner operacao = new Scanner(System.in);
        String mensagem = """
                /////////////////////////////////////////////////////////////////////////
                Dados do Cliente: 
                                
                Nome: %s
                                
                Tipo de conta: %s
                                
                Saldo atual: %.2f
                              
                /////////////////////////////////////////////////////////////////////////
                """.formatted(nome, tipoDeConta, emConta);
        System.out.println(mensagem);

        String operacaU = operacao.nextLine();

            switch (operacaU) {
                //Mostrar o extrato
                case "1":
                    System.out.println("""
                            /////////////////////////////////////////////////////////////////////////
                                                        
                            Seu saldo atual: %f
                                                        
                            /////////////////////////////////////////////////////////////////////////
                            """.formatted(emConta));
                    break;
                case "2":
                    //Deposito
                    System.out.println("""
                            /////////////////////////////////////////////////////////////////////////
                            
                            
                            
                            /////////////////////////////////////////////////////////////////////////
                            """);
                    break;
                case "3":
                    //tranferencia
                    System.out.println("""
                            /////////////////////////////////////////////////////////////////////////
                            
                            
                            
                            /////////////////////////////////////////////////////////////////////////
                            """);
                    break;
            }while(!operacaU.equals("10"));
        }

    }
