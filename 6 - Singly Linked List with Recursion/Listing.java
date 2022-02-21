
public class Listing {
private String name; // key field
private String species;
private String type;

public Listing(String n, String s, String t) {
	name = n;
	species = s;
	type = t;
}

public String toString() {
	return(name + "\n" + species + "\n" + type + "\n");
}

public Listing deepCopy() {
	Listing clone = new Listing(name, species, type);
	return clone;
}
public int compareTo(String targetKey) {
	return(name.compareTo(targetKey));
}
}