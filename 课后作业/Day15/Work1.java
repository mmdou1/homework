/*һ����ͨ�������װ��ʵ����������
	��дһ����Book������̲�:	
	1.�������ԣ����ƣ�title����ҳ����pageNum��
	2.����ҳ����������200ҳ���������������Ϣ��������Ĭ��ֵ200
	3.Ϊ�������ṩ��ֵ��ȡֵ����
	4.���з���:detail�������ڿ���̨���ÿ���̲ĵ����ƺ�ҳ��
	5.��д������BookTest���в��ԣ�ΪBook��������Ը����ʼֵ��������Book�����detail��������������Ƿ���ȷ
*/


public class Work1{
	public static void main(String[] args){
		Book c= new Book("���",300);
		c.jianCha();
		System.out.println(c.detail());

	}

}

class Book{
	String title;
	private int pageNum;
	public Book(){
		
	}
	public Book(String s1,int s2){
		title=s1;
		pageNum=s2;
	}

	public void jianCha(){
		if(pageNum<200){
			System.out.println("ҳ������");
			pageNum=200;
		}
	}
	public int detail(){
		return pageNum;
	}
		
}