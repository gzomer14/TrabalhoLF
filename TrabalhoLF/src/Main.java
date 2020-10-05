import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Gramatica gra1 = new Gramatica(1);
		Gramatica gra2 = new Gramatica(2);
		Gramatica gra3 = new Gramatica(3);
		Derivacao der = new Derivacao();
		
		System.out.println("Qual gramatica você deseja derivar?\n");
		
		gra1.imprimirOpcoes();
		gra2.imprimirOpcoes();
		gra3.imprimirOpcoes();
		
		System.out.println("\nGramatica escolhido: ");
		int opcaoEscolhida = input.nextInt();
		
		switch(opcaoEscolhida)
		{
			case 1: der.derivarMap(gra1.gramatica); break;
			case 2: der.derivarMap(gra2.gramatica); break;
			case 3: der.derivarMap(gra3.gramatica); break;
		}
		
		int quantidadeElementos = der.pilhaFinal.size();
		ArrayList<Character> derivacaoFinal = new ArrayList<>(); 
		
		System.out.print("\nGramatica derivada: ");
		for (int i=0; i < quantidadeElementos; i++)
		{
			derivacaoFinal.add(der.pilhaFinal.pop());
		}
		
		for (int i=derivacaoFinal.size()-1; i >= 0 ; i--)
		{
			System.out.print(derivacaoFinal.get(i));
		}
	}
}
