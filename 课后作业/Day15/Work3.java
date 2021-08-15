/*三、(封装)已知一个类 Student 代码如下：
class Student{
	String name;
	int age;
	String address;
	String zipCode;
	String mobile;
}
要求：
	1、把Student 的属性都作为私有，并提供get/set 方法以及适当的构造方法。
	2、为Student 类添加一个getPostAddress 方法，要求返回Student 对象的地址和邮编。


*/

public class Work3{
	public static void main(String[] args){
		
	}
}



class Student{
	private	String name;
	private int age;
	private	String address;
	private	String zipCode;
	private	String mobile;


	public Student(){
		
	}
	public Student(String name,int age,String address,String zipCode,String mobile){
		this.name=name;
		this.age=age;
		this.address=address;
		this.zipCode=zipCode;
		this.mobile=mobile;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getAddress(){
		return this.address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getZipCode(){
		return this.zipCode;
	}
	public void setZipCode(String zipCode){
		this.zipCode=zipCode;
	}
	public String getMobile(){
		return this.mobile;
	}
	public void setMobile(String mobile){
		this.mobile=mobile;
	}
	public String getPostAddress(String address,String zipCode){
		return address;
	}
}