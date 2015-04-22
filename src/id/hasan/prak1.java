package id.hasan;

public class prak1 {
	static String Praktikum = "Praktikum Pertama bro"; //varglobal
	public static void main (String[] args) {
	System.out.println("cobacoba");
	coba(); // pemanggilan method
	pembagian(); // pemanggilan method
	biodata(); //pemanggilan method
}
	public static void coba() //method
	{
		System.out.println("Praktikum1");
	}
	
	public static void pembagian() //method
	{
		int a = 6/2 ; //varlocal
		float b= 5/2 ; //varlocal
		System.out.println("pembagian1 =" +a);
		System.out.println("pembagian2 =" +b);
	}
	
	public static void biodata () //method
	{
		String nama= "Hasan"; //varlocal
		String alamat= "Tidung"; //varlocal
		System.out.println("nama saya = "+nama + " alamat ="+alamat);
		
	}
}
