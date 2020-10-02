import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Gramatica gramatica = new Gramatica();
		boolean continuarInformando = true;
		
		while(continuarInformando)
		{
			System.out.println("Informa a gramatica: ");
			String gr = input.next();
			
			
			
			gramatica.setGramatica(gr.split("\\=")[0], gr.split("\\=")[1]);
			
			System.out.println("Deseja informar mais uma gramatica?\n1 - Sim\n2 - Não\n\nOpção escolhida: ");
			if(input.nextInt() != 1) 
			{
				continuarInformando = false;
			}
		}		
	}
	
	
}
