package Ejercicio3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Integer> listA = new ArrayList<Integer>();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		ArrayList<Integer> listC = new ArrayList<Integer>();
		
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño: "));
		int a = 0;
		
		for (int i = 0; i < tam; i++) {
			
			a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + " en la Lista A"));
			listA.add(a);
			
			int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero " + (i+1) + " en la Lista B"));
			listB.add(b);
			
			listC.add(listA.get(i) * listB.get(i));
		}
		
		System.out.println(listA);
		System.out.println(listB);
		System.out.println(listC);
		
	}

}
