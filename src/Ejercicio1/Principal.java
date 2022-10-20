package Ejercicio1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> resultPositivos = new ArrayList<Integer>();
		ArrayList<Integer> resultNegativos = new ArrayList<Integer>();
		
		int n; 
		int num;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros: "));
		
		for (int i = 0; i < n; i++) {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero  " + (i+1)));
			numeros.add(num);
			
				
			if (num < 0) {
				
				resultNegativos.add(num);	
				
			}
			if (num > 0) {
				
				resultPositivos.add(num);	
				
			}
			
			
			}
		
		System.out.println(numeros);
		System.out.println("Negativos: ");
		System.out.println(resultNegativos);
		System.out.println("Positivos: ");
		System.out.println(resultPositivos);
		
			
		}
		
		
	}

