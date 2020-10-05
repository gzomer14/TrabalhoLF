import java.util.HashMap;
import java.util.Map;

public class Gramatica {
	
	public int ordem;
	public Map<String, String> gramatica = new HashMap<>();
	
	public Gramatica(int ordemEscolhida) {
		
		switch(ordemEscolhida)
		{
			case 1: setOrdem(ordemEscolhida);
					setGramatica("S", "aSb|aAbb");
					setGramatica("A", "bAc|fSc|bfc");
					setGramatica("B", "cBf|abc");
					break;
			case 2: setOrdem(ordemEscolhida);
					setGramatica("F", "cFa|aCb|hgj");
					setGramatica("C", "abdc|ab");
					break;
			case 3: setOrdem(ordemEscolhida);
					setGramatica("S", "aSb|ab");
					break;
		}
		
	}
	
	public void imprimirOpcoes() {
		System.out.println(this.ordem + " - ");
		for (Map.Entry<String, String> entry : this.gramatica.entrySet()) {
			String key = entry.getKey();
		    String value = entry.getValue();
			System.out.println(key + " - " + value);
		}
		System.out.println("-------------");
	}

	public Map<String, String> getGramatica() {
		return this.gramatica;
	}

	public void setGramatica(String key, String value) {
		gramatica.put(key, value);
	}
	
	public int getOrdem() {
		return this.ordem;
	}
	
	public void setOrdem(int ordemEscolhida) {
		this.ordem = ordemEscolhida;
	}
	
	public int getSize() {
		return this.gramatica.size();
	}
	
}
