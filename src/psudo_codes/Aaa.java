package psudo_codes;

class Aaa {
	int a = 10;
	Aaa(int a){
		this.a= a;
	}
}
class References{
	public static void main(String[] args) {
		Aaa a = new Aaa(20);
		Aaa  a1 = new Aaa(30);
		Aaa a2;
		a1 = a;
		a2 = a;
		a1.a = 2;
		a2.a = 3;
		System.out.println(a.a);
		System.out.println(a1.a);
		System.out.println(a2.a);
	}
}
