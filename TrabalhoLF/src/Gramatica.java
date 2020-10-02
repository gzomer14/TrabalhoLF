import java.util.HashMap;
import java.util.Map;

public class Gramatica {
	
	public Map<String, String> gramatica = new HashMap<>();
	
	public Gramatica() {
	}

	public Map<String, String> getGramatica() {
		return gramatica;
	}

	public void setGramatica(String key, String value) {
		gramatica.put(key, value);
	}
	
}
