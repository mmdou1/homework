public class Work2{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("输入一个数字");
		int i=s.nextInt();
		int number=find(i);
		System.out.println("比"+i+"大的最小质数是"+number);
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
