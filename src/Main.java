// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double emConta = 2000 ;
        String nome = "Douglas"  ;
        String tipoDeConta = "Corrente";
        String mensagem = """
                /////////////////////////////////////////////////////////////////////////
                Dados do Cliente: 
                
                Nome: %s
                
                Tipo de conta: %s
                
                Saldo atual: %f
              
                /////////////////////////////////////////////////////////////////////////
                """.formatted(nome,tipoDeConta,emConta);

        System.out.println(mensagem);
    }
    }