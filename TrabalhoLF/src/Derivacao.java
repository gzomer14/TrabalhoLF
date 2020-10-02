import java.util.Map;
import java.util.Random;
import java.util.Stack;

public class Derivacao {
	
	public Derivacao() {
		
	}
	
	public void derivarMap(String key, Map<String, String> gramatica) {
		Random random = new Random();
		Stack<Character> pilha = new Stack<>();
		String[] splitValue = gramatica.get(key).split("\\|");
		String valueInicial = splitValue[random.nextInt(splitValue.length)];
		
		for (char c : valueInicial.toCharArray())
		{
			if(Character.getType(c) == Character.UPPERCASE_LETTER)
			{
				String substituirMaiusculo = gramatica.get(Character.toString(c));
			}
		}
		
			
	}
}
