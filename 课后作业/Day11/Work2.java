public class Work2{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("����һ������");
		int i=s.nextInt();
		int number=find(i);
		System.out.println("��"+i+"�����С������"+number);
	}
	public static int find(int x){
		x++;
		for(;;x++){
			int a=0;
			for(int b=x;b>0;b--){
				if(x%b==0){a++;}
				}
			if(a==2){break;}
			}
			return x;
		}
	}
