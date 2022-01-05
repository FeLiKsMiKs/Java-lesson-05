package ua.lviv.lgs.pet;

public abstract class Pet {
private int weight;

public Pet(int weight) {
	super();
	this.weight = weight;
}
abstract void voice();
public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

@Override
public String toString() {
	return "Pet [weight=" + weight + "]";
}


}
