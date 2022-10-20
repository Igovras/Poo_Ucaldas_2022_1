package INTERFACE;

import java.util.Scanner;

public class Ejercicios {
	private Scanner indata;
	private double NumeroA = 89;
	private double NumeroB = 323;
	private int Peso;
	private double Dolar;
	private int Base;
	private double IVA = 0.19;
	private int Num, a, b, c, Num1, Num2, Num3 = 0;
	private double num, comprobacion, contador = 0, Promedio;
	private int odd = 1, size, Spaces;

	Ejercicios(int peso, int Base, int Num, int a, int b, int c, int Num1, double comprobacion, int size ) {
		this.Peso = peso;
		this.Dolar = (Peso * 0.00022);
		this.Base = Base;
		this.Num = Num;
		this.a = a;
		this.b = b;
		this.c = c;
		this.Num1 = Num1;
		this.Num2 = Num1 / 10000;
		this.comprobacion = comprobacion;
		this.size = size;
		this.Spaces = size - 1;
	}

	public void Ejercicio1() {
		System.out.println("Ejercicio 1");
		System.out.println("Suma: " + (NumeroA + NumeroB));
		System.out.println("Resta: " + (NumeroA - NumeroB));
		System.out.println("Multiplicacion: " + (NumeroA * NumeroB));
		System.out.println("Division: " + (NumeroA / NumeroB));
		System.out.println();
	}

	public void Ejercicio2() {
		System.out.println("Ejercicio 2");
		System.out.println("El valor del dolar es de: $" + Dolar + " Dolares");
		System.out.println();
	}

	public void Ejercicio3() {
		System.out.println("Ejercicio 3");
		System.out.println("Base sin IVA: $" + Base);
		System.out.println("Iva: $" + (Base * IVA));
		System.out.println("Total: " + (Base + (Base * IVA)));
		System.out.println();
	}

	public void Ejercicio4() {
		System.out.println("Ejercicio 4");
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
			}
		} else {
			System.out.println("El Nùmero ingresado no es valido");
		}
		System.out.println();
	}

	public void Ejercicio5() {
		System.out.println("Ejercicio 5");
		System.out.println("Normal: " + a + "--" + b + "-" + c);
		System.out.print("Ordenado de Mayor a Menor: ");
		if (a > b && a > c) {
			if (b > c) {
				System.out.println(a + "--" + b + "-" + c);
			} else {
				System.out.println(a + "--" + c + "-" + b);
			}
		} else if (b > c && b > a) {
			if (c > a) {
				System.out.println(b + "--" + c + "-" + a);
			} else {
				System.out.println(b + "--" + a + "-" + c);
			}
		} else if (c > a && c > b) {
			if (a > b) {
				System.out.println(c + "--" + a + "-" + b);
			} else {
				System.out.println(c + "--" + b + "-" + a);
			}
		}
		System.out.println();
	}

	public void Ejercicio6() {
		System.out.println("Ejercicio 6");
		if (Num1 > 9999 && Num1 < 100000) {
			System.out.println("Primera Cifra: " + Num2);
		} 
		else {
			System.out.println("El Número ingresado no es de 5 cifras");
		}
		System.out.println();
	}

	public void Ejercicio7() {
		System.out.println("Ejercicio 7");
		while (Num3 < 100) {
			if (Num3 % 8 == 0) {
				System.out.println(Num3);
			}
			Num3++;
		}
		System.out.println();
	}

	public void Ejercicio8() {
		System.out.println("Ejercicio 8");
		do {			
			if (comprobacion > 0) {
				num += comprobacion;
				contador++;
			}
		} while (comprobacion > 0);
		Promedio = num / contador;
		System.out.println("El promedio es igual a: " + Promedio);
		System.out.println();
	}

	public void Ejercicio9() {
		System.out.println("Ejercicio 9");
		indata = new Scanner(System.in);
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
		System.out.println(contadorN + " Son Negativo");
	}

	public void Ejercicio10() {
		System.out.println("Ejercicio 10");
		for (int i = 1; i <= size; i++) {
			int k = 0;
			for (int j = 1; j <= Spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= odd; j++) {
				if (j <= i) {
					k = k + 1;
				} else {
					k = k - 1;
				}
				System.out.print(k);
			}
			System.out.println();
			odd = odd + 2;
			Spaces = Spaces - 1;
		}
		System.out.println();
	}

	public void Ejercicio11() {
		System.out.println("Ejercicio 11");
		indata = new Scanner(System.in);
		char[] Char = new char[10];
		String Palabra;
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese el Character: ");
			Palabra = indata.next();
			Char[i] = Palabra.charAt(0);
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("");
		for (char c : Char) {
			System.out.print(c + "\t");

		}
		System.out.println();
	}

	public void Ejercicio12() {
		indata = new Scanner(System.in);
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
			j--;
		}
	}

	public void Ejercicio13() {
		indata = new Scanner(System.in);
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
				System.out.println(Num[i] + " es impar");
			}
		}
	}
}
