package methodsDemo;

public class Methods {
	
public static void main(String[] args) {
	
	int sum = add(14,76);
	int diff = subtract(65,87);
	int prod = multiply(67,43);
	double div = divide(56,22);
	
	System.out.print("sum: ");
	System.out.println(sum);
	
	System.out.print("diff: ");
	System.out.println(diff);
	
	System.out.print("product:");
	System.out.println(prod);
	
	System.out.print("div: ");
	System.out.println(div);
	
}
public static  int add(int a, int b) {
	return a+b;
}
public static  int subtract(int a, int b) {
	return a-b;
}
public static  int multiply(int a, int b) {
	return a*b;
}
public static  double divide(double a, int b) {
	return (a/b);
}
}
