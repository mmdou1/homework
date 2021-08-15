/*二、写一个名为Account的类模拟账户。
该类的属性和方法如下所示。
该类包括的属性：账户id，余额balance，年利率annualInterestRate；
包含的方法：各属性的set和get方法。取款方法withdraw()，存款方法deposit()

写一个测试程序
（1）创建一个Customer，名字叫Jane Smith，他有一个账号为1000，余额为2000，年利率为1.23%的账户
（2）对Jane Smith操作：
存入100元，再取出960元，再取出2000。
打印Jane Smith的基本信息
信息如下显示：
成功存入：100
成功取出：960
余额不足，取钱失败
Customer [Smith，Jane] has a account ：id is 1000 annualInterestRate is 1.23% balance is 1140.0
*/

public class Work2{
	public static void main(String[] args){
		Account jane=new Account("1000",2000,1.23);
		jane.withdraw(200);
		jane.deposit(960);
		jane.deposit(1300);
		jane.deposit(1240);
	}
}
class Account{
	String id;
	float balance;
	double annualInterestRate;

	public Account(String id,float balance,double annualInterestRate){
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setBalance(float balance){
		this.balance=balance;
	}
	public float getBalance(){
		return balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void withdraw(float i){
		balance+=i;
		System.out.println("成功存入"+i);
	}
	public void deposit(float i){
		balance-=i;
		if(balance>=0){
		System.out.println("成功取出"+i);
		System.out.println("还有"+balance+"余额");
		}
		else{
			System.out.println("余额不足取钱失败");
			balance+=i;
			System.out.println("余额还有"+balance);
		}
	}
}