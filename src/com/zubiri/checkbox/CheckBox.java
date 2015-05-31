package com.zubiri.checkbox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class CheckBox extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBox frame = new CheckBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CheckBox() {
		setTitle("checkbox iosu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEjemploDeEjercicio = new JLabel("ejemplo de ejercicio con checkbox");
		lblEjemploDeEjercicio.setBounds(60, 12, 301, 15);
		contentPane.add(lblEjemploDeEjercicio);
		
		JLabel lblDeportesQuePracticas = new JLabel("¿Que deportes practicas?");
		lblDeportesQuePracticas.setBounds(60, 39, 197, 15);
		contentPane.add(lblDeportesQuePracticas);
		
		JCheckBox chckbxTenis = new JCheckBox("Tenis");
		buttonGroup.add(chckbxTenis);
		chckbxTenis.setBounds(60, 88, 129, 23);
		contentPane.add(chckbxTenis);
		
		JCheckBox chckbxBaloncesto = new JCheckBox("baloncesto");
		buttonGroup.add(chckbxBaloncesto);
		chckbxBaloncesto.setBounds(208, 88, 173, 23);
		contentPane.add(chckbxBaloncesto);
		
		JCheckBox chckbxFutbol = new JCheckBox("futbol");
		buttonGroup.add(chckbxFutbol);
		chckbxFutbol.setBounds(60, 142, 129, 23);
		contentPane.add(chckbxFutbol);
		
		JCheckBox chckbxCiclismo = new JCheckBox("ciclismo");
		buttonGroup.add(chckbxCiclismo);
		chckbxCiclismo.setBounds(208, 142, 129, 23);
		contentPane.add(chckbxCiclismo);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(60, 200, 102, 15);
		contentPane.add(lblResultado);
		
		JLabel lblNewLabel = new JLabel("...");
		lblNewLabel.setBounds(60, 227, 376, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnSeleccionar = new JButton("seleccionar");
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("");
				if(chckbxTenis.isSelected()){
					lblNewLabel.setText(lblNewLabel.getText()+chckbxTenis.getText());
				}else if(chckbxFutbol.isSelected()){
					lblNewLabel.setText(lblNewLabel.getText()+chckbxFutbol.getText());
				}else if(chckbxBaloncesto.isSelected()){
					lblNewLabel.setText(lblNewLabel.getText()+chckbxBaloncesto.getText());
				}else if(chckbxCiclismo.isSelected()){
					lblNewLabel.setText(lblNewLabel.getText()+chckbxCiclismo.getText());
				}
				
			}
		});
		btnSeleccionar.setBounds(180, 195, 117, 25);
		contentPane.add(btnSeleccionar);
		
		JButton btnCancelar = new JButton("cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   /* for (JCheckBox checkBox : buttonGroup) {
			        if (checkBox.isSelected()) {
			        	checkBox.setSelected(false);
			        }
			    }*/
			}
		});
		btnCancelar.setBounds(319, 195, 117, 25);
		contentPane.add(btnCancelar);
	}
}
