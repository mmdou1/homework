public class Day9_8{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("输入一个数字");
		int i= s.nextInt();
		int y=0;
		for(int x=1; x<6; x++){
			if(i>(10^x)){
				y++;
				System.out.println(10^x);
			}else break;
		}
		System.out.println("输入了"+y+"位数字");
	}
}