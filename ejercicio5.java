import java.util.*;

public class ejercicio5{
	
	public static void main(String[] args){
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuantas edades y sexos desea ingresar: ");
		num = scanner.nextInt();
		
		int contadormenoredad = 0;
		int contadormayoredad = 0;
		int i = 0;
		
		while (i < num){
			int edad;
			int sexo;
			
			i = i+1;
			System.out.println("Ingrese la edad de la persona: "+i+":");
			edad = scanner.nextInt();
			System.out.println("Ingrese el sexo de la persona (1. Femenino / 0.Masculino): "+i+":");
			sexo = scanner.nextInt();
			
			if ((edad>=18) && (sexo == 1)){
				contadormayoredad = contadormayoredad + 1;
			}else
				if((edad < 18) && (sexo == 0)){
					contadormenoredad = contadormenoredad + 1;
				}
		}
		
		System.out.println("La cantida de mujeres mayores de edad es: "+contadormayoredad);
		System.out.println("La cantida de hombres menores de edad es: "+contadormenoredad);
	} 
}