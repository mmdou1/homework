public class Work2{
	public static void main(String[] args){
		Man c=new Man("12312312312","索连政","男",null);
		Woman d=new Woman("23552342531312","小索","女",null);
		c.woman=d;
		d.man=c;
		System.out.println(c.name+c.id+c.sex+c.woman.name);
		System.out.println(d.name+d.id+d.sex+d.man.name);
	}
}

class Man{
	String id;
	String name;
	String sex;
	Woman woman;
  public Man(){
	
  }
  public Man(String a, String b,String c,Woman d){
	id=a;
	name=b;
	sex=c;
	woman=d;

  }
}


class Woman{
	String id;
	String name;
	String sex;
	Man man;
  public Woman(){
	
  }
  public Woman(String a, String b,String c,Man d){
	id=a;
	name=b;
	sex=c;
	man=d;
  }
}