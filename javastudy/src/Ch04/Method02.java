package Ch04;

class Dog{
	int ����� =100; //����
	
	void eat() { //����
		����� =10;
	}
}

public class Method02 {

	public static void main(String[] args) {
		
		Dog d1=new Dog();
		//d1.����� =10; �̷����ϸ�ȵ� �������ȵ�
		
		d1.eat();
		System.out.println("�������� ����� : "+d1.�����);
		
	}
}//end
