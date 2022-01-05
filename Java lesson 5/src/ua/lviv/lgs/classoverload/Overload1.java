package ua.lviv.lgs.classoverload;

public class Overload1 {
	int a;
	int b;
	

	public Overload1(int a) {
		this.a = a;

	}

	public Overload1(int a, int b) {
		this(a);
		this.b = b;
	}
}
