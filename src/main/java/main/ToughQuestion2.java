package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
                        
		Integer bread;
        Integer butter;
        Integer jam;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Calories cal=new Calories();
        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
        System.out.println("Enter the choice");
        Integer choice = Integer.parseInt(br.readLine());
        switch(choice)
        {
        	case 1 : System.out.println("Enter the number of Slice of bread");
        			 bread = Integer.parseInt(br.readLine());
        			 int calorie=cal.calculateCalories(bread);
        			 System.out.printf("%.3f",cal.calculateEnergy(calorie));
        			 System.out.println(" kJ of energy generated from "+calorie+".0 calories");
        			 System.out.println();
        			 break;
        	case 2 : System.out.println("Enter the number of Slice of bread");
        		     bread = Integer.parseInt(br.readLine());
        		     System.out.println("Enter the number teaspoon of Jam");
        		     jam = Integer.parseInt(br.readLine());
        		     int calorie1=cal.calculateCalories(bread,jam);
        			 System.out.printf("%.3f",cal.calculateEnergy(calorie1));
        			 System.out.println(" kJ of energy generated from "+calorie1+".0 calories");
        		     System.out.println();
        		     break;
        	case 3 : System.out.println("Enter the number of Slice of bread");
        			 bread = Integer.parseInt(br.readLine());
        			 System.out.println("Enter the number teaspoon of Jam");
        			 jam = Integer.parseInt(br.readLine());
        			 System.out.println("Enter the number teaspoon of Butter");
        			 butter = Integer.parseInt(br.readLine());
        		     int calorie2=cal.calculateCalories(bread,jam,butter);
        			 System.out.printf("%.3f",cal.calculateEnergy(calorie2));
        			 System.out.println(" kJ of energy generated from "+calorie2+".0 calories");
        			 System.out.println();
        			 break;
        }
	}
}
class Calories 
{            
	int calculateCalories(int a) 
	{
		return (74*a);
	}
	int calculateCalories(int a, int b) 
	{
		return (74*a+26*b);
	}
	int calculateCalories(int a, int b, int c) 
	{
		return (74*a+26*b+102*c);
	}
	float calculateEnergy(int calorie)
	{
		float energy=((float)calorie);
		System.out.println(energy);
		return energy*(float)4.1868;
	}
}