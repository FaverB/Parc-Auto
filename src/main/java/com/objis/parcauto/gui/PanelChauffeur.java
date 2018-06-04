package com.objis.parcauto.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.objis.parcauto.domain.Chauffeur;
import com.objis.parcauto.gui.model.ChauffeurModel;

public class PanelChauffeur extends JPanel {

	JPanel entete = new JPanel();
	JPanel form = new JPanel();
	JPanel bouton = new JPanel();

	JLabel labNom = new JLabel("NOM");
	JLabel labPreom = new JLabel("PRENOM");

	JTextField txtNom = new JTextField("");
	JTextField txtPrenom = new JTextField("");

	JButton bValider = new JButton("Valider");
	JButton bSuprimer = new JButton("Suprimer");
	JButton bModifier = new JButton("Modifier");

	// String[] entetes = {"NOM GARAGE","LOCALISATION DU GARAGE" };
	// Object[][] donnees = { {" la reference ","YOP toit-rouge"},
	// {"Le boss","YOP selmer"} };
	// JTable table = new JTable(donnees, entetes);

	ChauffeurModel chModel = new ChauffeurModel();
	JTable table = new JTable(chModel);
	JScrollPane jscroll = new JScrollPane(table);

	public PanelChauffeur() {
		// TODO Auto-generated constructor stub
		this.setLayout(new BorderLayout(0, 5));

		// table.setPreferredSize(new Dimension(200, 50));
		table.setFont(new Font("ariel", Font.BOLD, 12));
		JPanel pane = new JPanel();
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		pane.add(jscroll);
		add(pane, BorderLayout.CENTER);

		// ********************************************************
		bValider.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				chModel.addChauffeur(new Chauffeur(0L, txtNom.getText(),
						txtPrenom.getText()));
				txtNom.setText("");
				txtPrenom.setText("");
			}
		});

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				txtNom.setText((String) chModel.getValueAt(
						table.getSelectedRow(), 0));
				txtPrenom.setText((String) chModel.getValueAt(
						table.getSelectedRow(), 1));
				bSuprimer.setEnabled(true);
				bSuprimer.setBackground(new Color(205, 255, 205));
				bModifier.setEnabled(true);
				bModifier.setBackground(new Color(205, 255, 205));
				bValider.setBackground(new Color(205, 191, 205));
				bValider.setEnabled(false);
			}
		});

		bSuprimer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtNom.setText("");
				txtPrenom.setText("");
				chModel.suprChauffeur(table.getSelectedRow());
				// table.setModel(new ChauffeurModel());

			}
		});

		bModifier.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				chModel.modifChauffeur(table.getSelectedRow(),
						txtNom.getText(), txtPrenom.getText());
				txtNom.setText("");
				txtPrenom.setText("");
			}
		});

		entete.setLayout(new BoxLayout(entete, BoxLayout.Y_AXIS));

		form.setLayout(new GridLayout(2, 4, 0, 10));
		form.setBackground(new Color(205, 205, 25));
		form.add(new JLabel());
		form.add(labNom);
		form.add(txtNom);
		form.add(new JLabel());
		form.add(new JLabel());
		form.add(labPreom);
		form.add(txtPrenom);
		form.add(new JLabel());

		entete.add(form);
		bValider.setBackground(new Color(205, 255, 205));
		bModifier.setBackground(new Color(200, 191, 200));
		bModifier.setEnabled(false);
		bSuprimer.setBackground(new Color(200, 191, 200));
		bSuprimer.setEnabled(false);
		bValider.setFont(new Font("ariel", Font.BOLD, 14));
		bModifier.setFont(new Font("ariel", Font.BOLD, 14));
		bSuprimer.setFont(new Font("ariel", Font.BOLD, 14));
		bouton.add(bValider);
		bouton.add(bModifier);
		bouton.add(bSuprimer);
		bouton.setBackground(new Color(205, 205, 25));

		entete.add(bouton);
		add(entete, BorderLayout.NORTH);
	}

}
