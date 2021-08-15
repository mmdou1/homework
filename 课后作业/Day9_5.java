public class Day9_5{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("输入一个数字");
		int i=s.nextInt();
		int j=i-1;
		int sum=1;
		for (int m=i;m>0 ; m--){

			for (int x=j;x>0 ;x-- ){
				System.out.print(" ");
			}
			j--;
			for(int y=sum;y>0;y--){
				System.out.print("*");
			}
			sum+=2;
			System.out.print("\n");
		}
	}
}