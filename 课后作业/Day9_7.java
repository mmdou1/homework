public class Day9_7{
	public static void main(String[] args){
		int sum=0;
		for (int i=1;i<=1000 ;i++ ){
			if(i==1){
				System.out.print(i);
				System.out.print(" ");
				continue;
				}


			for (int m=i;m>0;m-- ){
				if((i%m)==0 && i!=m){
					sum+=m;
				}
			}
			if(i==sum){
				System.out.print(i);
				System.out.print(" ");
			}
			sum=0;
		}
	}
}