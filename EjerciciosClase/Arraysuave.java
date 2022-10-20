package INTERFACE;

import java.util.Scanner;

public class Arraysuave {

	private static Scanner indata;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio();
		// Ejercicio2();
		// Ejercicio3();
		// Ejercicio4();
		// Ejercicio5();
		// Ejercicio6();
		// Ejercicio7();
		// Ejercicio8();
		// Ejercicio9();
		// Ejercicio10();
		// Ejercicio11();
		// Ejercicio12();
		// Ejercicio13();
	}	
	
		public static void Ejercicio(){	
	    indata = new Scanner(System.in);
		int[] Num = new int[10];
		int[] NumPares = new int[10];
		int[] NumImpar = new int[10];
		int contadorPar = 0;
		int contadorImp = 0;		
		System.out.print("Ingrese Números para analizar: ");
		for (int i = 0; i < 10 ; i++){		
		Num[i] = indata.nextInt();
		if ( Num[i] % 2 == 0 ){
		NumPares[contadorPar] = Num[i];	
		contadorPar+= 1;}
		else if ( Num[i] % 2 != 0){
		NumImpar[contadorImp] = Num[i];	
		contadorImp+= 1;}}
		for (int i = 0; i < Num.length ; i++){
			System.out.println("Números a analizar son: " + Num[i]);}
		for (int i = 0; i < contadorPar ; i++){
		System.out.println("Los Números pares son: " + NumPares[i]);}
		for (int i = 0; i < contadorImp ; i++){			
			System.out.println("Los Números Impares son: " + NumImpar[i]);}}

        public static void Ejercicio2(){
        	indata = new Scanner(System.in);
    		int[] Num = new int[10];
    		int contadorP = 0;
    		int contadorN = 0;
    		int contadorC = 0;
    		System.out.println("Ingrese Números para analizar: ");
    		for (int i = 0; i < 10 ; i++){		
    		Num[i] = indata.nextInt();
    		if ( Num[i] > 0 ){
    		contadorP+= 1;}
    		else if ( Num[i] < 0){
    		contadorN+= 1;}
    		else if ( Num[i] == 0){
        	contadorC+= 1;}}        		
    		System.out.println("Los Números Positivos son: " + contadorP);
    		System.out.println("Los Números Negativos son: " + contadorN);
    		System.out.println("Los Ceros son: " + contadorC);}
        
        public static void Ejercicio3(){		
			String Nombres[] = {"Martha","Julian","Maria","Pedro"};
			int Edad[] = {19,45,12,31};
			char Sexo[] = {'F','M','F','M'};		
			System.out.println("Datos personales");
			System.out.println("NOMBRE \t" + "EDAD \t" + "SEXO");
			for (int i = 0; i < 4; i++ ){
				System.out.println(Nombres[i] +"\t"+ Edad[i] +"\t"+  Sexo[i]);}}
        
        public static void Ejercicio4(){
        	indata = new Scanner(System.in);
            System.out.print("Ingrese la palabra: ");            
            String Palabra = indata.next().toLowerCase();
            int NumL = Palabra.length();                            
    		char[] Char = new char[NumL];    		
    		for (int i = 0; i < NumL ; i++){			 
    		Char[i] =  Palabra.charAt(i);}
    		for (char c : Char){
    		System.out.println(c);}    		
    		System.out.println("El total de Caracteres: " + NumL);}
        
        public static void Ejercicio5(){
        	indata = new Scanner(System.in);
        	int[] Vector = new int[10];
        	int Mayor = 0 , Menor = 0;
			int contadorMa = 0, contadorMe = 0;
        	System.out.println("Ingrese Números para analizar: ");
    		for (int i = 0; i < 10 ; i++){		
    		Vector[i] = indata.nextInt();}    		
			for (int i = 0; i < Vector.length ; i++){			 
			if ( Vector[i] > Mayor ){
		    Mayor = Vector[i];
		    contadorMa = i;}
		    else if ( Vector[i] < Menor){
		    Menor = Vector[i];
		    contadorMe += i;}}
			System.out.println("El Número Mayor es: " + Mayor + " Su posición es: " + contadorMa);
			System.out.println("El Número Menor es: " + Menor + " Su posición es: " + contadorMe);}
        
        public static void Ejercicio6(){        	
        	int[][] Aleatorio = new int [10][20];
        	for (int i = 0; i < 10 ; i++){
        	for (int j = 0; j < 2 ; j++){
        	Aleatorio[i][j] = (int) (Math.random() * 100);}}        	
        	for (int i = 0; i < 2 ; i++){        	
        	for (int j = 0; j < 10 ; j++){
        	System.out.print(Aleatorio[j][i] + "\t");}
        	System.out.println();}System.out.println("...");}
        
        public static void Ejercicio7(){ 
        	int[][] Aleatorio = new int [4][5];
        	int SumaTotal = 0;
        	for (int i = 0; i < 4 ; i++){
        	for (int j = 0; j < 5 ; j++){
        	Aleatorio[i][j] = (int) (Math.random() * 9);}}        	
        	for (int i = 0; i < 4 ; i++){
        	int SumaFil = 0;        	
        	for (int j = 0; j < 5 ; j++){        		
        	SumaFil += Aleatorio[i][j];
        	System.out.print(Aleatorio[i][j] + "\t" + "\t|");}SumaTotal += SumaFil;
        	System.out.println("Σ Fil " + i + ": " + SumaFil + "\t|");}
        	for (int j = 0; j < 5 ; j++){
        	int SumaCol = 0;
            for (int i = 0; i < 4 ; i++){
            SumaCol += Aleatorio[i][j];}
            SumaTotal += SumaCol;
            System.out.print(("Σ Col " + j + ": " + SumaCol) + "\t|");}System.out.println("Total: " + SumaTotal + "\t|");}
        
        public static void Ejercicio8(){
        	indata = new Scanner(System.in);
        	System.out.println("Ingrese 10 números");        	
    		int[] Num = new int[10];    		
    		for (int i = 0; i < 10 ; i++){
    		System.out.print("Ingrese el " + (i + 1) + " Número: ");
    		Num[i] = indata.nextInt();}
    		System.out.println("El orden inverso de los números ingresados es: ");
    		int j = 9;	while ( j >= 0 ){
   			System.out.println(Num[j]);
   			j--;}}
        
        public static void Ejercicio9(){
        	indata = new Scanner(System.in);
        	System.out.println("Ingrese 8 números");        	
    		int[] Num = new int[8];    		
    		for (int i = 0; i < 8 ; i++){
    		System.out.print("Ingrese el " + (i + 1) + " Número: ");
    		Num[i] = indata.nextInt();}
    		for (int i = 0; i < 8 ; i++){
    		if(Num[i] % 2 == 0) 
    		{
    		System.out.println(Num[i] + " es Par");	
    		}
    		else if (Num[i] % 2 != 0) {    			
    		System.out.println(Num[i] + " es impar");}}}
        
        public static void Ejercicio10(){        	
        	indata = new Scanner(System.in);
    		System.out.print("Ingrese el Número: ");
    		int odd = indata.nextInt();
    		int size = odd;
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
        	indata = new Scanner(System.in);
        	double num = 0, comprobacion = 0, contador = 0, Promedio;
        	do {
   			System.out.print("Ingrese un Núnero: ");
       		comprobacion = indata.nextInt();
       		if (comprobacion > 0){
    		num += comprobacion;
    		contador++;}}while(comprobacion > 0);
    		Promedio = num / contador;
    		System.out.println("El promedio es igual a: " + Promedio);}
        
        public static void Ejercicio12(){
        	indata = new Scanner(System.in);
            System.out.println("Ingrese 10 números");
            int[] Num = new int[10];
    	    int contadorP = 0, contadorN = 0;
    	    for (int i = 0; i < 10 ; i++){
    	    System.out.print("Ingrese el " + (i + 1) + " Número: ");
    	    Num[i] = indata.nextInt();}
    	    for (int i = 0; i < 10 ; i++){
    	    if(Num[i] > 0){    	
    	    contadorP++;}
    	    else if (Num[i] < 0) {    			
     	    contadorN++;}}
    	    System.out.println(contadorP + " Son Positivos");
    	    System.out.println(contadorN + " Son Negativo");}
         
        public static void Ejercicio13(){
        	indata = new Scanner(System.in);
            int Num1 = 0, Num2;            
            System.out.print("Ingrese un Números de 5 cifras: ");
            Num1 = indata.nextInt();
            if ( Num1 > 9999 && Num1 < 100000){
            Num2 = Num1 / 10000;
            System.out.println(Num2);}
            else {
            System.out.println("El Número ingresado no es de 5 cifras");}}
        
        public static void Ejercicio14(){        	
            System.out.print("Números Multiplos de 8, del o al 100");            
            int Num = 0;
            while (Num < 100){
            if (Num % 8 == 0){
            System.out.println(Num);}
            Num++;}}
                
}
        