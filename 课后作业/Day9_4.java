public class Day9_4
{
	public static void main(String[] args)
	{
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("输入一个数字");
		int i= s.nextInt();
		int m;
		int sum=0;
		for (m=i; m>0 ; m-- )
		{
			if(i%m==0)
			{
				sum++;
			}
		}
		if(sum==2){
			System.out.println("输入的数字为质数");
		}else {
			System.out.println("输入的数字不是质数");
		}

	}
}