public class HomeWork2{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("����ɼ�");
		double i = s.nextDouble();
		int x=(int)(i/10);
		String j="����";
		switch(x){
		case 0: case 1: case 2: case 3: case 4: case 5:
			j="������";
			break;
		case 6:
			j="����";
			break;
		case 7:
			j="�е�";
			break;	
		case 8:
			j="��";
			break;
		case 9: case 10:
			j="����";
			break;
		default:
			j="�������";

		}
		System.out.println("�ɼ�Ϊ"+j);
	}
}