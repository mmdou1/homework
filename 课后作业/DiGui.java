public class DiGui{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("输入一个数字");
		int i= s.nextInt();
		System.out.println(m1(i));
	}
	public static int m1(int x){
		if(x==1){
			return 1;
		}
		return (x*m1(x-1));
	}
}