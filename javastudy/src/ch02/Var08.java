package ch02;

//heap
class Zelot{
	String name ="����";
	int attack =10;
	int armor =5;
	
	static int hp =100;
}

public class Var08 {
	public static void main(String[] args) {
		Zelot z = new Zelot(); //static�� �ƴ�heap�� �θ���
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		Zelot z2= new Zelot();
		System.out.println(z2.name);
		System.out.println(z2.attack);
		System.out.println(z2.armor);
		
		z.attack=50;
		System.out.println("��ȭ����");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		Zelot.hp =50;
		System.out.println(Zelot.hp);
		System.out.println(Zelot.hp);
		
		//����
		z.attack = 11;
		System.out.println(z.attack);
		System.out.println(z2.attack);
	}
}//end