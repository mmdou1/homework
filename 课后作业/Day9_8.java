public class Day9_8{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("����һ������");
		int i= s.nextInt();
		int y=0;
		for(int x=1; x<6; x++){
			if(i>(10^x)){
				y++;
				System.out.println(10^x);
			}else break;
		}
		System.out.println("������"+y+"λ����");
	}
}