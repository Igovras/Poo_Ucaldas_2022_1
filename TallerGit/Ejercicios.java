import java.security.PublicKey;
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio();
		Ejercicio2();
		//Ejercicio3();
		//Ejercicio4();
		//Ejercicio5();
		//Ejercicio6();
		//Ejercicio7();
		//Ejercicio8();
		//Ejercicio9();
		//Ejercicio10();
		//Ejercicio11();
		//Ejercicio12();
		//Ejercicio13();			
		}
		
		public static void Ejercicio(){
			double NumeroA = 89;
			double NumeroB = 323;
			System.out.println("Suma: " + (NumeroA + NumeroB));
			System.out.println("Resta: " + (NumeroA - NumeroB));
			System.out.println("Multiplicacion: " + (NumeroA * NumeroB));
			System.out.println("Division: " + (NumeroA / NumeroB));
		}
		
		public static void Ejercicio2(){
			Scanner Indata = new Scanner(System.in);
			int Peso;
			double Dolar;
			System.out.print("Ingrese el valor a convertir: ");
			Peso = Indata.nextInt();
			Dolar = (Peso * 0.00022);
			System.out.println("El valor del dolae es: $" + Dolar + " Dolares");}
		
		public static void Ejercicio3(){
			Scanner Indata = new Scanner(System.in);
			int Base; 
			double IVA = 0.19;
			System.out.print("Ingrese el valor del producto: ");
			Base = Indata.nextInt();
			System.out.println("Base sin IVA: $" + Base);
			System.out.println("Iva: $" + (Base * IVA));
			System.out.println("Total: " + (Base + (Base * IVA)));}
		
		public static void Ejercicio4(){
			Scanner Indata = new Scanner(System.in);
			int Num;
			System.out.print("Ingrese un Nùmero del 1 al 7: ");
			Num = Indata.nextInt();
			if (Num > 1 && Num <= 7) {
				switch (Num) {
				case 1:
					System.out.println("Lunes");
					break;
				case 2:
					System.out.println("Martes");
					break;
				case 3:
					System.out.println("Miercoles");
					break;
				case 4:
					System.out.println("Jueves");
					break;
				case 5:
					System.out.println("Viernes");
					break;
				case 6:
					System.out.println("Sabado");
					break;
				case 7:
					System.out.println("Domindo");
					break;
				}}
				else{					
					System.out.println("El Nùmero ingresado no es valido");
					}}
		
		public static void Ejercicio5(){
			Scanner Indata = new Scanner(System.in);
			int a = 0, b = 0, c = 0;
			System.out.print("Ingrese un Primer Valor: ");
			a = Indata.nextInt();
			System.out.print("Ingrese un Segundo Valor: ");
			b = Indata.nextInt();
			System.out.print("Ingrese un Tercer Valor: ");
			c = Indata.nextInt();
			System.out.println("Normal: ");
			System.out.println(a + " " + b + " " + c);
			System.out.println("Ordenado: ");
			if (a > b && a > c) {
				if (b > c) {
					System.out.println(a + " " + b + " " + c);
				} else {
					System.out.println(a + " " + c + " " + b);
				}
			} else if (b > c && b > a) {
				if (c > a) {
					System.out.println(b + " " + c + " " + a);
				} else {
					System.out.println(b + " " + a + " " + c);
				}
			} else if (c > a && c > b) {
				if (a > b) {
					System.out.println(c + " " + a + " " + b);
				} else {
					System.out.println(c + " " + b + " " + a);}}}
		
		public static void Ejercicio6(){
			Scanner indata = new Scanner(System.in);
			int Num1 = 0, Num2;
			System.out.print("Ingrese un Números de 5 cifras: ");
			Num1 = indata.nextInt();
			if (Num1 > 9999 && Num1 < 100000) {
				Num2 = Num1 / 10000;
				System.out.println("Primera Cifra: " + Num2);
			} else {
				System.out.println("El Número ingresado no es de 5 cifras");}}

		public static void Ejercicio7(){
			System.out.print("Números Multiplos de 8, del o al 100");
			int Num = 0;
			while (Num < 100) {
				if (Num % 8 == 0) {
					System.out.println(Num);
				}
				Num++;}}
		
		public static void Ejercicio8(){
			Scanner indata = new Scanner(System.in);
			double num = 0, comprobacion = 0, contador = 0, Promedio;
			do {
				System.out.print("Ingrese un Núnero: ");
				comprobacion = indata.nextInt();
				if (comprobacion > 0) {
					num += comprobacion;
					contador++;
				}
			} while (comprobacion > 0);
			Promedio = num / contador;
			System.out.println("El promedio es igual a: " + Promedio);}
		
		public static void Ejercicio9(){
			Scanner indata = new Scanner(System.in);
			System.out.println("Ingrese 10 números");
			int[] Num = new int[10];
			int contadorP = 0, contadorN = 0;
			for (int i = 0; i < 10; i++) {
				System.out.print("Ingrese el " + (i + 1) + " Número: ");
				Num[i] = indata.nextInt();
			}
			for (int i = 0; i < 10; i++) {
				if (Num[i] > 0) {
					contadorP++;
				} else if (Num[i] < 0) {
					contadorN++;
				}
			}
			System.out.println(contadorP + " Son Positivos");
			System.out.println(contadorN + " Son Negativo");}
		
		public static void Ejercicio10(){
			Scanner indata = new Scanner(System.in);
			System.out.print("Ingrese el Número: ");
			int odd = 1;
			int size = indata.nextInt();
			int noOfSpaces=size-1;
			for(int i = 1; i <= size; i++){
				int k=0;
				for(int j = 1; j <= noOfSpaces; j++){
					System.out.print(" ");}		
				for(int j = 1; j <= odd; j++){
					if (j<=i){
						k=k+1;}
					else {
						k=k-1;}
					System.out.print(k);}
				System.out.println();
				odd=odd+2;
				noOfSpaces=noOfSpaces-1;}}	
		
		public static void Ejercicio11(){
			Scanner indata = new Scanner(System.in);
			char[] Char = new char[10];
			String Palabra;			
			for (int i = 0; i < 10; i++) {
				System.out.print("Ingrese el Character: ");
				Palabra = indata.next();
				Char[i] = Palabra.charAt(0);
			}
			for (int i = 0; i < 10; i++) {
				System.out.print(i + "\t");
			}System.out.println("");
			for (char c : Char) {
				System.out.print(c + "\t");

			}
		}
		
		public static void Ejercicio12(){
			Scanner indata = new Scanner(System.in);
			System.out.println("Ingrese 10 números");
			int[] Num = new int[10];
			for (int i = 0; i < 10; i++) {
				System.out.print("Ingrese el " + (i + 1) + " Número: ");
				Num[i] = indata.nextInt();
			}
			System.out.println("El orden inverso de los números ingresados es: ");
			int j = 9;
			while (j >= 0) {
				System.out.println(Num[j]);
				j--;}}	
		
		public static void Ejercicio13(){
			Scanner indata = new Scanner(System.in);
			System.out.println("Ingrese 8 números");
			int[] Num = new int[8];
			for (int i = 0; i < 8; i++) {
				System.out.print("Ingrese el " + (i + 1) + " Número: ");
				Num[i] = indata.nextInt();
			}
			for (int i = 0; i < 8; i++) {
				if (Num[i] % 2 == 0) {
					System.out.println(Num[i] + " es Par");
				} else if (Num[i] % 2 != 0) {
					System.out.println(Num[i] + " es impar");}}}
		
        }


