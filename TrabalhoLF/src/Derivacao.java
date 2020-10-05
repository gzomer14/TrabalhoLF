import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

public class Derivacao {
	
	public Stack<Character> pilhaFinal = new Stack<Character>();
	
	public Derivacao() {
		
	}
	
	public void derivarMap(Map<String, String> gramatica) {
		Random random = new Random();
		String keyInicial = getKeyInicial(gramatica);
		String valueSplit[] = gramatica.get(keyInicial).split("\\|");
		String valueInicial = valueSplit[random.nextInt(valueSplit.length)];
		
		adicionarPilha(valueInicial, gramatica);
	}
	
	public void adicionarPilha(String value, Map<String, String> gramatica) {
		Random r = new Random();
		
		for (char c : value.toCharArray())
		{
			if (Character.getType(c) == Character.UPPERCASE_LETTER)
			{
				String[] valoresEncontrado = gramatica.get(String.valueOf(c)).split("\\|");
				String valorEscolhido = valoresEncontrado[r.nextInt(valoresEncontrado.length)];
				
				adicionarPilha(valorEscolhido, gramatica);
				continue;
			}
			
			pilhaFinal.push(c);
		}
	}
	
	public String getKeyInicial(Map<String,String> gramatica) {
		Random random = new Random();
		ArrayList<String> listaKeys = new ArrayList<>();
		
		for (Map.Entry<String, String> entry : gramatica.entrySet()) {
			listaKeys.add(entry.getKey());
		}
		
		int posicaoEscolhida = random.nextInt(listaKeys.size());
		
		return listaKeys.get(posicaoEscolhida);
	}
}
