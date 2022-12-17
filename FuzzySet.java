import java.util.ArrayList;

class FuzzySet {
	String name;
	String type;
	ArrayList<Integer> points;
	
	public FuzzySet(String name, String typeName, ArrayList<Integer> points) {
		this.name = name;
		this.type = typeName;
		this.points = new ArrayList<>(points); 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Integer> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Integer> points) {
		this.points = points;
	}
	
	
}

