import java.util.Scanner;
public class BMI {

 private static String name; 
 private static int age; 
 private static double weight; 
 private static double feet;
 private static double inches;
 public static final double KILOGRAMS_PER_POUND = 0.45359237;
 public static final double METERS_PER_INCH = 0.0254;  
 public BMI(String name, int age, double weight, double feet, double inches) {
	 this.name = name; 
	 this.age = age; 
	 this.weight = weight; 
	 this.feet = feet;
	 this.inches = inches;
 }
 public BMI(String name, double weight, double feet, double inches) {
	 this(name, 20, weight, feet, inches);
 }
 public static double getBMI() {
	 double bmi = weight * KILOGRAMS_PER_POUND /  
			 ((((feet * 12) + inches) * METERS_PER_INCH) * (((feet * 12) + inches) * METERS_PER_INCH));
	return Math.round(bmi * 100) / 100.0; 
 }
 public static String getStatus() {
	 double bmi = getBMI();
	 if (bmi < 18.5)
		 return"Underweight";
	 else if (bmi < 25)
		 return"Normal";
	 else if (bmi < 30)
		 return"Overweight";
	 else return"Obese"; }
 public static String getName() {
		 return name; }
 public static int getAge() {
	return age; }
 public static double getWeight() {
	 return weight;}
 public static double getFeet() {
	 return feet; }
 public static double getInches() { 
	 return inches;
 }
} 