package ua.lviv.lgs.pet;

public class Main {
public static void main(String[] args) {
	Cow c = new Cow(150, "Mika",11);
	System.out.println(c);
	c.voice();
	System.out.println();
	Cat k= new Cat(3, "Barsik",4);
	System.out.println(k);
	k.voice();
	System.out.println();
	Dog d= new Dog(15, "Lapus",7);
	System.out.println(d);
	d.voice();
}
}
