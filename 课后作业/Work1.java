public class Work1{
	public static void main(String[] args){
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("输入季节");
		int i = s.nextInt();
		String jijie="春";
		if(i<=0||i>12){
			jijie="错误";
		}else if(i>=3&&i<=5){
			jijie="春";
		}else if(i>=6&&i<=8){
			jijie="夏";
		}else if(i>=9&&i<=11){
			jijie="秋";
		}else {
			jijie="冬";
		}
		System.out.println(jijie);
		System.out.print("输入正负");
		int j = s.nextInt();
		if(j>=0){
			System.out.println("正数");
		}else {
			System.out.println("负数");
		}
		System.out.print("输入奇偶");
		int k = s.nextInt();
		if((k%2)==0) {
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}

	}
}