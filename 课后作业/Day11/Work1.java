public class Work1{
	public static void main(String[] args){
		System.out.print("����һ������");
		java.util.Scanner f= new java.util.Scanner(System.in);
		int i=f.nextInt();
		int al=sum(i);
		System.out.println("����"+i+"���н�����Ϊ"+al);
	}
	public static int sum(int i){
		int sum=1;
		for(;i>0;i--){
			sum=sum*i;
		}
		return sum;
	}
}