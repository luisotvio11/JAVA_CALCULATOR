package br.com.devnetserra;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel {

	private final JLabel label;
	
	public Display() {
	
	setBackground(new Color(149,213,255)); // criando uma nova cor
	label = new JLabel("123456789"); 
	label.setForeground(Color.DARK_GRAY); // alterar a letra do lavel
	label.setFont(new Font("courier",Font.PLAIN,30));	 // definindo tipo de fonte e tamanho
	
	setLayout (new FlowLayout(FlowLayout.RIGHT));
		
	add(label);
	
	@Override
	
	public void valorAlterado(String novoValor) {
		
		label.setText(novoValor);
	}
		// setBackground(Color.WHITE); set o Fundo Branco 
	}
}
