public class Day9_6{
	public static void main(String[] args){
		double sum=0;
		int i=0;
		do{
				sum=sum+2.5;
				i++;
				if(i%5==0){
					sum=sum-6;
			}
		  }while(sum<100.0);



		System.out.println("需要花"+i+"天");
		System.out.println(sum);
	}
}