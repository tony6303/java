package ch02;

public class Oper01 {
	public static void main(String[] args) {
	System.out.println(1+1);
	System.out.println(1+"1"); //결합
	
	int num = 10;
	String s="5";
	
	String sum = num+s; //타입이 String 으로됨
	System.out.println(sum);
	
	System.out.println(10-5);
	System.out.println(10/3); //타입이 int로 바뀜
	System.out.println(10.0/3); //타입이 double 됨
	System.out.println(10%3); //나머지 구하기
	System.out.println(10*3); //곱하기
	
	}
}//end
