public class HomeWork2{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("输入成绩");
		double i = s.nextDouble();
		int x=(int)(i/10);
		String j="优秀";
		switch(x){
		case 0: case 1: case 2: case 3: case 4: case 5:
			j="不及格";
			break;
		case 6:
			j="及格";
			break;
		case 7:
			j="中等";
			break;	
		case 8:
			j="良";
			break;
		case 9: case 10:
			j="优秀";
			break;
		default:
			j="输入错误";

		}
		System.out.println("成绩为"+j);
	}
}