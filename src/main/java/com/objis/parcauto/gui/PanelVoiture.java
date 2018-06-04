package com.objis.parcauto.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import com.objis.parcauto.domain.Chauffeur;
import com.objis.parcauto.domain.Garage;

public class PanelVoiture extends JPanel {

	String immatriculation;
	String marque;
	String couleur;
	Chauffeur chauffeur;
	Garage garage;

	JPanel entete = new JPanel();
	JPanel form = new JPanel();
	JPanel bouton = new JPanel();

	JLabel labImm = new JLabel("IMMATRICULATION :");
	JTextField txtImm = new JTextField();

	JLabel labMarque = new JLabel("MARQUE VOITURE");
	JTextField txtMarque = new JTextField();

	JLabel labCouleur = new JLabel("COULEUR VOITURE");
	JTextField txtCouleur = new JTextField();

	JLabel labListChauffeur = new JLabel("NOM CHAUFFEUR");
   

	JLabel labListGarage = new JLabel("NOM GARAGE");	

	JButton bValider = new JButton("Valider");
	JButton bModifier = new JButton("Suprimer");
	JButton bSuprimer = new JButton("Modifier");

	JComboBox cBoxListChauf = new JComboBox();
	JComboBox cBoxListGarage = new JComboBox();
	
	JScrollPane scroll = new JScrollPane();

	String[] entetes = {"IMMATRICULATION","MARQUE","COULEUR","CHAUFFEUR","GARAGE" };
	Object[][] donnees = { {"2585 HG01"," FORD ","NOIR","KOFFI MARC","YOP Selmer"}};
	JTable table = new JTable(donnees, entetes);
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public PanelVoiture() {
		// TODO Auto-generated constructor stub
		this.setLayout(new BorderLayout(0, 5));

//		scroll.setViewportView(table);
//		add(scroll, BorderLayout.CENTER);

		table.setPreferredSize(new Dimension(200, 50));
		table.setFont(new Font("ariel", Font.BOLD, 12));
		JScrollPane jscroll = new JScrollPane(table);
		JPanel pane = new JPanel();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		pane.add(jscroll);
		//setBackground(Color.pink);		
		this.add(pane, BorderLayout.CENTER);
		
		entete.setLayout(new BoxLayout(entete, BoxLayout.Y_AXIS));

		form.setLayout(new GridLayout(5, 4, 0, 10));
		form.setBackground(new Color(205,205,25));
		form.add(new JLabel());
		form.add(labImm);
		form.add(txtImm);
		form.add(new JLabel());
		form.add(new JLabel());
		form.add(labMarque);
		form.add(txtMarque);
		form.add(new JLabel());
		form.add(new JLabel());
		form.add(labCouleur);
		form.add(txtCouleur);
		form.add(new JLabel());
		
		form.add(new JLabel());
		form.add(labListChauffeur);
		cBoxListChauf.setModel(new DefaultComboBoxModel(new String[] {"chauffeur1", "chauffeur2", "chauffeur3"}));
		cBoxListChauf.setBounds(82, 43, 141, 20);
		form.add(cBoxListChauf);
		
		form.add(new JLabel());
		form.add(new JLabel());
		form.add(labListGarage);
		cBoxListGarage.setModel(new DefaultComboBoxModel(new String[] {"garage1", "garage2", "garage3"}));
		cBoxListGarage.setBounds(82, 43, 141, 20);
		form.add(cBoxListGarage);
		
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
		this.add(entete, BorderLayout.NORTH);

	}

}
