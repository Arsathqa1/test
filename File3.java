import java.util.Scanner;



public class test {
	
	public static void main(String[] args) {
		String s = "s";
		One.main("sa");
		System.out.print(One.newOne("Arsath1"));
		
	}
}
class One{
	public static void main(String args) {
		System.out.println("One class");
		System.out.println(args);
	}
	public static String newOne(String parse){
		String s1 = parse;
		return s1;
	}
}
class Two{
	public static void main(String[] args) {
		System.out.println("Two class");
	}
}
