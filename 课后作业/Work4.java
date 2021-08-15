public class Work4{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("输入一个数字");
		int i = s.nextInt();
		String sum="输出结果=";
		String jie=" ";
		for(int m=i; m>0 ;m--){
			if(m==1){
				jie=m+" ";
			}else{
				jie=m+"*";
			}
			sum=sum+jie;
			System.out.println(jie);
		}
		System.out.println(sum);
	}
}