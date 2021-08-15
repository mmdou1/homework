public class Work1{
	public static void main(String[] args){
		RiQi c= new RiQi();
		System.out.println(c.nian);
		System.out.println(c.yue);
		System.out.println(c.ri);

		RiQi d= new RiQi("2021","7","11");
		System.out.println(d.nian);
		System.out.println(d.yue);
		System.out.println(d.ri);
		System.out.println(d);
		System.out.println(d.nian+"Äê"+d.yue+"ÔÂ"+d.ri+"ÈÕ");

	}
}




class RiQi{
	String nian;
	String yue;
	String ri;
	public RiQi(){
		
	}
	public RiQi(String n,String y,String r){
		nian=n;
		yue=y;
		ri=r;
	}
}