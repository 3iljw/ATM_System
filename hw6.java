import java.io.*;
public class hw6{
	public static void main(String[] args)throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int mun=0,a=0,b;
		double aa=0.1,mon;
		do{
			System.out.print("請選擇功能（1.提款、2.存款、3.查詢餘額、4.離開）：");
			mun = Integer.parseInt(buf.readLine());
			switch(mun){
				case 1:
					System.out.print("請輸入提款金額：");
					mon = Double.parseDouble(buf.readLine());
					b = (int)mon;
					while(aa+mon!=b+0.1){
						System.out.print("請輸入正確提款金額：");
						mon = Double.parseDouble(buf.readLine());
						b = (int)mon;
					}
					if(b>a)
						System.out.println("金額不足，目前餘額："+ a);
					else{
						a=a-b;	
						System.out.println("提款成功，目前餘額：" + a);
					}
					break;
				case 2:
					System.out.print("請輸入存款金額：");
					mon = Double.parseDouble(buf.readLine());
					b = (int)mon;
					while(aa+mon!=b+0.1){
						System.out.print("請輸入正確存款金額：");
						mon = Double.parseDouble(buf.readLine());;
						b = (int)mon;
					}
					a=a+b;
					System.out.println("存款成功，目前餘額："+a);
					break;
				case 3:
					System.out.println("目前餘額："+ a);
					break;
				case 4:
					System.out.print("感謝您的使用，歡迎下次的光臨。");
					break;
			}
			if (mun>4 || mun<1)
				System.out.println("輸入錯誤，沒有此功能，請重新輸入。");
		}while(mun!=4);
	}
}