/*Type conversion and Type Casting

assending order
		boolean
		short
		char
		long
		int
		float
		double
		string 
*/

class ConverterDemo{
	public static void main(String[] args){
		boolean bo =true ; // true or false
		byte by = 10 ; // -128 to 127
		short sh = 45; 
		char ch = 'a';
		long lo = 452;
		int in = 456;
		float fl = 33.333f;
		double db = 78.45;
		
		String st = "Hi from ConverterDemo";
		
		lo = by; //type conversion
		
		sh=(short)lo;//casting
		
		fl=in;//type conversion
		
		in=(int)db;//type casting
		
		in=100;
		ch=(char)in;
		
		System.out.println("Value of boolean bo is : "+bo);
		System.out.println("Value of  byte by is : "+by);
		System.out.println("Value of short sh  is : "+sh);
		System.out.println("Value of char ch  is : "+ch);
		System.out.println("Value of long lo  is : "+lo);
		System.out.println("Value of int in  is : "+in);
		System.out.println("Value of float fl  is : "+fl);
		System.out.println("Value of double db  is : "+db);
		System.out.println("Value of String st  is : "+st);
	}
	
}

