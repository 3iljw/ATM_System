import java.io.*;
public class hw6{
	public static void main(String[] args)throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int mun=0,a=0,b;
		double aa=0.1,mon;
		do{
			System.out.print("�п�ܥ\��]1.���ڡB2.�s�ڡB3.�d�߾l�B�B4.���}�^�G");
			mun = Integer.parseInt(buf.readLine());
			switch(mun){
				case 1:
					System.out.print("�п�J���ڪ��B�G");
					mon = Double.parseDouble(buf.readLine());
					b = (int)mon;
					while(aa+mon!=b+0.1){
						System.out.print("�п�J���T���ڪ��B�G");
						mon = Double.parseDouble(buf.readLine());
						b = (int)mon;
					}
					if(b>a)
						System.out.println("���B�����A�ثe�l�B�G"+ a);
					else{
						a=a-b;	
						System.out.println("���ڦ��\�A�ثe�l�B�G" + a);
					}
					break;
				case 2:
					System.out.print("�п�J�s�ڪ��B�G");
					mon = Double.parseDouble(buf.readLine());
					b = (int)mon;
					while(aa+mon!=b+0.1){
						System.out.print("�п�J���T�s�ڪ��B�G");
						mon = Double.parseDouble(buf.readLine());;
						b = (int)mon;
					}
					a=a+b;
					System.out.println("�s�ڦ��\�A�ثe�l�B�G"+a);
					break;
				case 3:
					System.out.println("�ثe�l�B�G"+ a);
					break;
				case 4:
					System.out.print("�P�±z���ϥΡA�w��U�������{�C");
					break;
			}
			if (mun>4 || mun<1)
				System.out.println("��J���~�A�S�����\��A�Э��s��J�C");
		}while(mun!=4);
	}
}