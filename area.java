
 /*6. Write a Java program to print the area and perimeter of a circle. 
 Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/

class demo{
      public static void main(String args[])
	  {
        double radius=7.5;
		double perimeter;
		double area;
		double P_I =3.14;
		perimeter=2*P_I*radius;
		area=P_I*radius*radius;
		System.out.println(+perimeter);
		System.out.println(+area);
		
		}
     }
	 

/*
public class Exercise11 {
 
   private static final double radius = 7.5;

    public static void main(String[] args) {

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}

Sample Output:

Perimeter is = 47.12388980384689    */   
