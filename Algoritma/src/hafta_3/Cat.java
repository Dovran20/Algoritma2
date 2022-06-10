package hafta_3;

public class Cat {

	int age;
	String color;
	String name;
	
	public Cat() {
		this.age=0;
		this.name="Ýsim girilmedi";
		this.color="Rengi girilmedi";
	}
	
	public Cat(int age, String color, String name) {
		this.age = age;
		this.color = color;
		this.name = name;
	}
	
	public Cat(int age) {
		this.age=age;
		this.name="Ýsim girilmedi";
		this.color="Rengi girilmedi";
	}
	
	public Cat(int age,String name) {
		this.age=0;
		this.name=name;
		this.color="Rengi girilmedi";
	}
}
