public class HomeWork3{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("��������");
		int i =s.nextInt();
		System.out.println("�����Ա�");
		int j =s.nextInt();
		if(i==1){
			if(j==1) System.out.println("��һ�Ѵ��ɡ");
			else System.out.println("��һ�Ѵ�ɡ");
		}
		else{
			if(j==1) System.out.println("ֱ����ȥ��ˣ");
			else System.out.println("Ϳ��ɹ˪");
		}
	}
}