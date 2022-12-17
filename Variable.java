import java.util.ArrayList;

public class Variable {
	String name;
	ArrayList<FuzzySet> fuzzySets;
	
	public Variable(String name)
	{
		this.name = name;
		this.fuzzySets = new ArrayList<>();
	
	}
	
	public Variable(String name, ArrayList<FuzzySet> fuzzySets) {
		this.name = name;
		this.fuzzySets = new ArrayList<>(fuzzySets);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<FuzzySet> getFuzzySets() {
		return fuzzySets;
	}

	public void setFuzzySets(ArrayList<FuzzySet> fuzzySets) {
		this.fuzzySets = fuzzySets;
	}
	
	
}
