import java.util.*;

public class Questao03 {

  static int parString(String k){
		HashMap<String, Integer> mapa = new HashMap<>();

		for(int i = 0; i < k.length(); i++){
			for(int j = i; j < k.length(); j++){
				char[] valor = k.substring(i, j+1).toCharArray();
				Arrays.sort(valor);
				String volar = new String(valor);
				if (mapa.containsKey(volar))
        mapa.put(volar, mapa.get(volar)+1);
				else
        mapa.put(volar, 1);
			}
		}
		int contaPares = 0;
		for(String key: mapa.keySet()){
			int n = mapa.get(key);
			contaPares += (n * (n-1))/2;
		}
    return contaPares;    
	}

  static void solutionRender (int par) {
    if (par == 0) {
      System.out.println("\nA palavra não possui anagramas pares. Tente outra vez.\n");
    } else if (par == 1) {
      System.out.println("\nA palavra possui 1 anagrama par.\n");
    } else {
      System.out.println("\nA palavra possui " + par + " anagramas pares.\n");
    }
  }

	public static void main(String[] args) {
    String capture;
    System.out.println("Escreva a palavra e descubra quantos anagramas pares possui:");
    try (Scanner palavra = new Scanner(System.in)) {
      capture = palavra.nextLine();   
    }
    solutionRender(parString(capture));
    System.out.println("---Programa Encerrado---");
	}
}
