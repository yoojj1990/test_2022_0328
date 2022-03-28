package test_2022_0328;

public class Test_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColorTV myTV = new ColorTV(32, 1024);
		
		myTV.printProperty();
	

		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
	
		iptv.printProperty();
	
	}
}
