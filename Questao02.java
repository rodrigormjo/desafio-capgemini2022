import java.util.*;

public class Questao02 {

  static void segSenha(String pw) {
    if (pw.length() >= 6) {
      System.out.println("Senha com 6 ou mais caracteres. Ok!");
      System.out.println("Verifique se sua senha possui caracteres maiúsculos, minúsculos e especiais agora.");      
    } else if(pw.length() == 5){
      System.out.println("Falta 1 caracter na sua senha.");
    } else {
      System.out.println("Faltam " + (6 - pw.length()) + " caracteres na sua senha.");
    }
  }

  public static void main(String[] args) {
    String capture;
    System.out.print("Crie sua senha: ");    
    try (Scanner senha = new Scanner(System.in)) {
      capture = senha.nextLine();   
    }
    segSenha(capture);    
  }
}
