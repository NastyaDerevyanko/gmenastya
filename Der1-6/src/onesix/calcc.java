package onesix;
import java.util.Scanner;
public class calcc {
	
	
	    public static void main(String[] args) {
	        System.out.println("Введите операции: ");
	        System.out.println("1. Сложение: ");
	        System.out.println("2. Вычитание: ");
	        System.out.println("3. Умножение: ");
	        System.out.println("4. Деление: ");
	        Scanner scanner = new Scanner(System.in);
	        int operation = scanner.nextInt();
	        
	        System.out.println("Введите первое число: ");
	        int x = scanner.nextInt();
	        System.out.println("Введите второе число: ");
	        int y = scanner.nextInt();
	        
	        int res = 0;
	        
	        if(operation == 1)
	        	res = x + y;
                else if(y == 0)
                    System.out.println("Нельзя делить на 0  ");
	        else if(operation == 2)
	        	res = x - y; 
	        else if(operation == 3)
	        	res = x * y; 
	        else if(operation == 4)
	        	res = x / y; 
                
	        System.out.println("Результат =  "+ res);
	        System.out.println("Анисимова и Деревянко ");
}               
}
