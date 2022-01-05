package ua.lviv.lgs.pet;

public class Cow extends Pet{
private String name;
private int age;
public Cow(int weight, String name, int age) {
	super(weight);
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Cow [name=" + name + ", age=" + age + ", toString()=" + super.toString() + "]";
}
@Override
void voice() {
	System.out.println("Μσσσ-Μσσσ");
	
}

}
