import java.util.*;

public class Questao02 {

  static void segSenha(String pw) {
    if (pw.length() >= 6) {
      System.out.println("\nSenha com 6 ou mais caracteres. Ok!");
      System.out.println("Verifique se sua senha possui caracteres maiúsculos, minúsculos e especiais agora.\n");      
    } else if(pw.length() == 5){
      System.out.println("\nFalta 1 caracter na sua senha.\n");
    } else {
      System.out.println("\nFaltam " + (6 - pw.length()) + " caracteres na sua senha.\n");      
    }
  }

  public static void main(String[] args) {
    String capture;
    System.out.print("Crie sua senha: ");    
    try (Scanner senha = new Scanner(System.in)) {
      capture = senha.nextLine();   
    }
    segSenha(capture);  
    System.out.println("---Programa Encerrado---");  
  }
}
