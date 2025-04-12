import java.util.Scanner;

class InputDemo{
	public static void main(String[] args){
			String name,answer;
			int age;
			byte marks;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Hi, Enter Your Name :");
			name=sc.nextLine(); //read String until you press enter key
			System.out.println("Hello "+name+", How are you? ");
		    answer=sc.nextLine();
			System.out.println("Nice !");
			System.out.println(" ");
			
			System.out.println("Enter Your Age :");
			age=sc.nextInt();//read the int value of age 
			System.out.println("Ohh God! Are you "+age+", years old");
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("Enter Your Marks :");
			marks=sc.nextByte();//read the int value of marks
			System.out.println("Really! You got "+marks+" marks, Thats Great");
			System.out.println(" ");
			System.out.println(" ");
	}
}
