public class Work1{
	public static void main(String[] args){
		System.out.print("输入一个数字");
		java.util.Scanner f= new java.util.Scanner(System.in);
		int i=f.nextInt();
		int al=sum(i);
		System.out.println("输入"+i+"所有阶数和为"+al);
	}
	public static int sum(int i){
		int sum=1;
		for(;i>0;i--){
			sum=sum*i;
		}
		return sum;
	}
}