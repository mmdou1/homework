public class HomeWork3{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("输入天气");
		int i =s.nextInt();
		System.out.println("输入性别");
		int j =s.nextInt();
		if(i==1){
			if(j==1) System.out.println("打一把大黑伞");
			else System.out.println("打一把大花伞");
		}
		else{
			if(j==1) System.out.println("直接走去玩耍");
			else System.out.println("涂防晒霜");
		}
	}
}