package br.dev.isabelle.temperatura.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Temperatura;

public class TelaConversor {
	
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahreinheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
	public void criarTelaConversor() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Conversor de Temperatura");
		tela.setSize(400, 450);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		
		//Componentes da tela
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius: ");
		labelCelsius.setBounds(100, 3, 250, 30);
		
		textCelsius = new JTextField();
		textCelsius.setBounds(180, 40, 50, 30);
		
		labelResultado = new JLabel();
		labelResultado.setBounds(180, 80, 100, 20);
		
		buttonFahreinheit = new JButton();
		buttonFahreinheit.setText("FAHREINHEIT");
		buttonFahreinheit.setBounds(20, 155, 150, 30);
		
		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(200, 155, 160, 30);
		
		//painel de conteudo
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(buttonFahreinheit);
		tela.getContentPane().add(buttonKelvin);
	
		//ouvintes de evento aos botões
		buttonFahreinheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Temperatura temperatura = new Temperatura();
				
				String celsius = textCelsius.getText();
				double celsiusDouble = Double.valueOf(celsius);
				temperatura.setCelsius(celsiusDouble);
				
				double fahreinheit = temperatura.converterParaFahreinheit();
				labelResultado.setText(fahreinheit + " Fahreinheit");
				
				
				
			}
			
		});
		
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Temperatura temperatura = new Temperatura();
				
				String celsius = textCelsius.getText();
				double celsiusDouble = Double.valueOf(celsius);
				temperatura.setCelsius(celsiusDouble);
				
				double kelvin = temperatura.converterParaKelvin();
				labelResultado.setText(kelvin + " KELVIN");
				
			}
		});
		
		tela.setVisible(true);
		
	}
	


}
