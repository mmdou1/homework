public class Work1{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("���뼾��");
		int i = s.nextInt();
		String jijie="��";
		if(i<=0||i>12){
			jijie="����";
		}else if(i>=3&&i<=5){
			jijie="��";
		}else if(i>=6&&i<=8){
			jijie="��";
		}else if(i>=9&&i<=11){
			jijie="��";
		}else {
			jijie="��";
		}
		System.out.println(jijie);
		System.out.print("��������");
		int j = s.nextInt();
		if(j>=0){
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		System.out.print("������ż");
		int k = s.nextInt();
		if((k%2)==0) {
			System.out.println("ż��");
		}else{
			System.out.println("����");
		}

	}
}