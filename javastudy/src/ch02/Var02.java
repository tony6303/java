package ch02;

public class Var02 {
	public static void main(String[] args) {
		//code�κ�
		int num = 10; //4Byte = 32bit (-20�� ~ +20��)
		long num2 = 100; //8Byte 
		
		char s = '��'; //2Byte 
		
		double d = 7.5; //8Byte (-20�� ~ +20��)
		boolean b = true; //1Bit
		
		num = (int)d; // 7�ε� (�ٿ� ĳ���� - �ڷ� ����)
		
		num = (int)num2; //������ ����ȯ (�ٿ� ĳ����)
		num2 = num; //������ ����ȯ (�� ĳ����)
	}//end

}