public class Work1{
	public static void main(String[] args){
		System.out.print("����һ������");
		java.util.Scanner s = new java.util.Scanner(System.in);
		 int a = s.nextInt();
		 A a1= new A(a);
		 B b= new B();
		 b.cai(a1.getA());

	}
}


class A{
	private int b;
	public A(){
		
	}
	public A(int b){
		this.b=b;
	}
	public void setA(int b){
		this.b=b;
	}
	public int getA(){
		return b;
	}
}


class B{
	public B(){
		
	}
 public void cai(int a){
	while(true){
	System.out.print("����һ���²������");
	java.util.Scanner s = new java.util.Scanner(System.in);
	int b=s.nextInt();
	if(b==a){
		System.out.println("�¶���");
		return;
	}
	else if(b>a){
		System.out.println("�´���");
	}
	else {
		System.out.println("��С��");
	}
	}
 }
}