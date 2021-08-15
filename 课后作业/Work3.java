public class Work3{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.println("输入公里数");
		double i= s.nextDouble();
		double j;
		if(i<3){
			j=8;
		}else if(i<=5){
			j=8+(i-3)*1.2;
		}else {
			j=8+2*1.2+(i-5)*1.5;
		}
		System.out.println("总价格="+j);
	}
}