public class HomeWork{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("输入成绩");
		double i = s.nextDouble();
		System.out.println("输入的成绩是"+i);
		if(i<0||i>100){
			System.out.println("输入错误");
		}
		else if (i<60){
			System.out.println("成绩不及格");
		}
	    else if (i<70){
			System.out.println("成绩及格");
		}
		else if (i<80){
			System.out.println("成绩中等");
		}
		else if (i<90){
			System.out.println("成绩良");
		}
		else {
			System.out.println("成绩优秀");
		}

	}

}