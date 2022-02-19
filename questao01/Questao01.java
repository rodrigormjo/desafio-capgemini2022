import java.util.*;

public class Questao01 {

  static String[] criarVetor(int m) {

    String[] stringArray = new String[m]; 
    for (int i = 0; i < stringArray.length; i++){
      stringArray[i] = " ";
    }    
    return stringArray;
  }

  static void renderEscada(String[] n) {
    String[] render = n;
    int j = render.length - 1; 
    for (int i = 0; i < render.length; i++){
      render[j] = "*";          
      for (int k = 0 ; k < render.length - 1; k++){   
        System.out.print(render[k]);
      }      
      System.out.println(render[render.length - 1]);
      j--;         
    }        
  }
  public static void main(String[] args) {
    int capture;
    try (Scanner escada = new Scanner(System.in)) {
      System.out.println("Insira o tamanho n da escada:");
      System.out.print("n = ");
      capture = Integer.parseInt(escada.nextLine());   
    }
    String[] vetor = criarVetor(capture);
    renderEscada(vetor);
    
    // System.out.println(Arrays.toString(vetor));
    
  }
}