/*����дһ����ΪAccount����ģ���˻���
��������Ժͷ���������ʾ��
������������ԣ��˻�id�����balance��������annualInterestRate��
�����ķ����������Ե�set��get������ȡ���withdraw()������deposit()

дһ�����Գ���
��1������һ��Customer�����ֽ�Jane Smith������һ���˺�Ϊ1000�����Ϊ2000��������Ϊ1.23%���˻�
��2����Jane Smith������
����100Ԫ����ȡ��960Ԫ����ȡ��2000��
��ӡJane Smith�Ļ�����Ϣ
��Ϣ������ʾ��
�ɹ����룺100
�ɹ�ȡ����960
���㣬ȡǮʧ��
Customer [Smith��Jane] has a account ��id is 1000 annualInterestRate is 1.23% balance is 1140.0
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
		System.out.println("�ɹ�����"+i);
	}
	public void deposit(float i){
		balance-=i;
		if(balance>=0){
		System.out.println("�ɹ�ȡ��"+i);
		System.out.println("����"+balance+"���");
		}
		else{
			System.out.println("����ȡǮʧ��");
			balance+=i;
			System.out.println("����"+balance);
		}
	}
}