//----------------GPA CALCULATER----------------

import java.util.Scanner;

class GPA{
	float gradePoint(String grade){
		float gp=0;
		switch(grade)
		{
			case "A+":
			    gp=4f;
				break;
			case "A":
			    gp=4f;
				break;
			case "A-":
			    gp=3.7f;
				break;
			case "B+":
			    gp=3.3f;
				break;
			case "B":
			    gp=3f;
				break;
			case "B-":
			    gp=2.7f;
				break;
			case "C+":
			    gp=2.3f;
				break;
			case "C":
			    gp=2f;
				break;
			case "C-":
			    gp=1.7f;
				break;
			case "D+":
			    gp=1.3f;
				break;
			case "D":
			    gp=1f;
				break;
			case "E":
			    gp=0f;
				break;
			default:
			System.out.println("invalid data");		
				
		}
		return gp;
		
	}
}

class Demo{
	
		static Scanner sc=new Scanner(System.in);
		static GPA g=new GPA();
		
		static String name;
		
		static String Subjects[]={"IT1113","IT1122","IT1134","IT1144","IT1152"};
		static int credits[]={3,2,4,4,2};
		
		static String[] grades=new String[5];
		static float[] gps=new float[5];
	
	static float getPoint(String subjectCode,int credit,int index){
		
		System.out.println("Enter the grade for"+subjectCode+": ");
		grades[index]=sc.nextLine();
		gps[index]=g.gradePoint(grades[index])*credit;
		System.out.println("Grade point value of the grade "+grades[index]+" is "+g.gradePoint(grades[index]) );
		System.out.println("Grade point*credit is "+g.gradePoint(grades[index])*credit);
		System.out.println(" ");
		
		return g.gradePoint(grades[index])*credit;
	}
	
	public static void main(String[] args){
		
		//String name;
		float ogp=0;
		//String grade;
		//float point=0;
		
		//Scanner sc=new Scanner(System.in);
		//GPA g=new GPA();
		
		System.out.println("Enter Your Name :");
		name=sc.nextLine();
		System.out.println("Hi, "+name);
		System.out.println(" ");
		
		for(int i=0;i<5;i++){
			ogp+=getPoint(Subjects[i],credits[i],i);
		}
		
		
		
		/*System.out.println("Enter the grade for IT1113:");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogp=point*3;
		System.out.println("Grade point value of the grade "+grade+" is "+point );
		System.out.println("overrole grade point value is "+ogp );
		System.out.println(" ");
		
		System.out.println("Enter the grade for IT1122:");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogp=ogp+point*2;
		System.out.println("Grade point value of the grade "+grade+" is "+point );
		System.out.println("overrole grade point value is "+ogp );
		System.out.println(" ");
		
		System.out.println("Enter the grade for IT1134:");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogp=ogp+point*4;
		System.out.println("Grade point value of the grade "+grade+" is "+point );
		System.out.println("overrole grade point value is "+ogp );
		System.out.println(" ");
		
		System.out.println("Enter the grade for IT1144:");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogp=ogp+point*4;
		System.out.println("Grade point value of the grade "+grade+" is "+point );
		System.out.println("overrole grade point value is "+ogp );
		System.out.println(" ");
		
		System.out.println("Enter the grade for IT1152:");
		grade=sc.nextLine();
		point=g.gradePoint(grade);
		ogp=ogp+point*2;
		System.out.println("Grade point value of the grade "+grade+" is "+point );
		System.out.println("overrole grade point value is "+ogp );
		System.out.println(" ");
		
		
		ogp+=getPoint("IT1113",3);//READ THE GRADE OF IT1113, GET THE POINT VALUE,RETURN THE POINT*CREDIT
		ogp+=getPoint("IT1122",2);
		ogp+=getPoint("IT1134",4);
		ogp+=getPoint("IT1144",4);
		ogp+=getPoint("IT1152",2);
		*/
		
		System.out.println("Final GPA is for current semester is "+ogp/15 );
		
		for(int i=0;i<5;i++){
			System.out.println("Subject "+Subjects[i]+" credit "+credits[i]+" Grade "+grades[i]+" Grade Point "+gps[i]);
		}

	}
	
}
/*
		Name:
		-----------------------------------------
		|Subject Code   | Grade  | Grade Point  |
		-----------------------------------------
		|IT1113         | A+     | 4.0          |
		|IT1122         | A+     | 4.0          |
		|IT1134         | A+     | 4.0          |
		|IT1144         | A      | 4.0          |
		|IT1152         | A+     | 4.0          |
		-----------------------------------------
		
		overole grade point value: 
		grade point average :
		
		*/