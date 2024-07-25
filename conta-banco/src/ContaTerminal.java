

public class ContaTerminal {

   
        public static void main(String[] args) {
         
          // Definição direta dos valores fornecidos
          int numero = 1111;
          String agencia = "211-1";
          String nomeCliente = "ANA JULIA";
          double saldo = 1000.00;
  
          // Criação da mensagem utilizando concatenação
          String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                  + agencia + ", conta " + numero + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.";
  
          // Exibição da mensagem
          System.out.println(mensagem);
      }
  }             
                           