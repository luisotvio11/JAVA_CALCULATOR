package br.com.devnetserra;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{ //extendendo JFrame
	
	
		public Calculadora () {
			
			
			organizarLayout();
			
			setSize(232,322); // defininado tamanho da tela
			setDefaultCloseOperation(EXIT_ON_CLOSE); //sai da aplicação
			setLocationRelativeTo(null);
			setVisible(true); // deixar visivel
			
		} 
		
		
		private void organizarLayout () {
			
			setLayout(new BorderLayout ());
			
			Display display = new Display ();
			display.setPreferredSize(new Dimension (233,60));
			
			add (display, BorderLayout.NORTH); // adicionando o componente display no norte da tela 
			
			Teclado teclado = new Teclado ();
			
			add (teclado, BorderLayout.CENTER); //adicionando o componente teclado no centro
		}
		
		public static void main(String[] args) {
			
			new Calculadora();
			
			
			
		}
}
