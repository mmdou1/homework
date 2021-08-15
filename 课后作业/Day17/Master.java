public class Master{
	public static void main(String[] args){
		Master a1= new Master();
		Pet a2= new Pet();
		Cat a3 = new Cat();
		Dog a4 = new Dog();
		a1.feed(a2);
		a1.feed(a3);
		a1.feed(a4);


	}
	public void feed(Pet pet){
	 pet.eat();
	}
}