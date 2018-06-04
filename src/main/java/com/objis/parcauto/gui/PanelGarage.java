package com.objis.parcauto.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class PanelGarage extends JPanel {

	String strIdGarage;
	String strNomGarage;
	String strLocalite;

	JPanel entete = new JPanel();
	JPanel form = new JPanel();
	JPanel bouton = new JPanel();

	JLabel labNomGarage = new JLabel("NOM DU GARAGE :");
	JTextField txtNomGarage = new JTextField();

	JLabel labLocaliteGarage = new JLabel("LOCALITE DU GARAGE:");
	JTextField txtLocaliteGarage = new JTextField();

	JButton bValider = new JButton("Valider");
	JButton bModifier = new JButton("Suprimer");
	JButton bSuprimer = new JButton("Modifier");	

	String[] entetes = {"ID GARAGE","NOM GARAGE","LOCALISATION DU GARAGE" };
	Object[][] donnees = { {"001"," la reference ","YOP toit-rouge"},
	                       {"002","Le boss","YOP selmer"}          };
	JTable table = new JTable(donnees, entetes);
	
	
	public PanelGarage() {
		// TODO Auto-generated constructor stub
		this.setLayout(new BorderLayout(0, 20));

		// ----------------------------
		table.setPreferredSize(new Dimension(200, 50));
		table.setFont(new Font("ariel", Font.BOLD, 12));
		JScrollPane jscroll = new JScrollPane(table);
		JPanel pane = new JPanel();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		pane.add(jscroll);
		//setBackground(Color.pink);		
		add(pane, BorderLayout.CENTER);
		// -------------------------

		entete.setLayout(new BoxLayout(entete, BoxLayout.Y_AXIS));
		entete.setBackground(new Color(100,100,150));

		form.setLayout(new GridLayout(2, 4, 0, 10));
		form.setBackground(new Color(205,205,25));
		form.add(new JLabel());
		
		labNomGarage.setFont(new Font("ariel", Font.BOLD, 14));
		form.add(labNomGarage);
		
		txtNomGarage.setFont(new Font("ariel", Font.BOLD, 13));
		form.add(txtNomGarage);
		
		form.add(new JLabel());
		form.add(new JLabel());
		labLocaliteGarage.setFont(new Font("ariel", Font.BOLD, 14));
		form.add(labLocaliteGarage);
		
		txtLocaliteGarage.setFont(new Font("ariel", Font.BOLD, 13));
		form.add(txtLocaliteGarage);
		form.add(new JLabel());

		entete.add(form);
		bValider.setBackground(new Color(205,255,205));
		bModifier.setBackground(new Color(205,255,205));
		bSuprimer.setBackground(new Color(205,255,205));
		bValider.setFont(new Font("ariel", Font.BOLD, 14));
		bModifier.setFont(new Font("ariel", Font.BOLD, 14));
		bSuprimer.setFont(new Font("ariel", Font.BOLD, 14));
		bouton.add(bValider);
		bouton.add(bModifier);
		bouton.add(bSuprimer);
		bouton.setBackground(new Color(205,205,25));

		entete.add(bouton);
		add(entete, BorderLayout.NORTH);
	}

}
