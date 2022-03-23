package demo;

class A{
	int sum(int a,int b){
		return a+b;
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.sum(10, 20);
	}
}
