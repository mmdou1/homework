public class HomeWork{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("����ɼ�");
		double i = s.nextDouble();
		System.out.println("����ĳɼ���"+i);
		if(i<0||i>100){
			System.out.println("�������");
		}
		else if (i<60){
			System.out.println("�ɼ�������");
		}
	    else if (i<70){
			System.out.println("�ɼ�����");
		}
		else if (i<80){
			System.out.println("�ɼ��е�");
		}
		else if (i<90){
			System.out.println("�ɼ���");
		}
		else {
			System.out.println("�ɼ�����");
		}

	}

}