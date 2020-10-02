import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Gramatica map = new Gramatica();
		Derivacao der = new Derivacao();
		boolean continuarInformando = true;
		
		while(continuarInformando)
		{
			System.out.println("\nInforma a gramatica: ");
			String gr = input.next();
			
			map.setGramatica(gr.split("\\=")[0], gr.split("\\=")[1]);
			
			System.out.println("\nDeseja informar mais uma gramatica?\n1 - Sim\n2 - Não\n\nOpção escolhida: ");
			if(input.nextInt() != 1) 
			{
				continuarInformando = false;
			}
		}
			
		int quantidadeElementos = 1;
		System.out.println("\nQual gramatica você deseja derivar?");
		for (Map.Entry<String, String> entry : map.gramatica.entrySet()) {
			String key = entry.getKey();
			System.out.println(quantidadeElementos + " - " + key);
			quantidadeElementos++;
		}
		System.out.println("Elemento escolhido: ");
		String keyEscolhida = input.next();
		
		der.derivarMap(keyEscolhida, map.gramatica);
	}
}
