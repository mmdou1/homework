public class Work2{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.println("输入两个数字");
		int i= s.nextInt();
		int j= s.nextInt();
		if(i>j){
			System.out.println(">");
		}else if(i==j){
			System.out.println("=");
		}else {
			System.out.println("<");
		}


		System.out.println("输入三个数字");
		int num1= s.nextInt();
		int num2= s.nextInt();
		int num3= s.nextInt();
		int t;
		if(num1>num2){
			t=num2;
			num2=num1;
			num1=t;
		}
		if(num1>num3){
			t=num3;
			num3=num1;
			num1=t;
		}
		if (num2>num3){
			t=num3;
			num3=num2;
			num2=t;
		}
		System.out.println(num1+"<"+num2+"<"+num3);
	}
}