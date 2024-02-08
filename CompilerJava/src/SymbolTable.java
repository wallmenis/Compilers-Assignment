import java.util.HashMap;
import java.util.Map;
public class SymbolTable {
	private Map<String, Double> variables;
	public SymbolTable()
	{
		variables = new HashMap<>();
	}
	public void setVariable(String name, Double value)
	{
		variables.put(name, value);
	}
	public Double getVariable(String name)
	{
		return variables.get(name);
	}
	public boolean variableExists(String name)
	{
		return variables.containsKey(name);
	}
}
