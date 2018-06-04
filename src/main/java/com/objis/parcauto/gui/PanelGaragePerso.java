package com.objis.parcauto.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelGaragePerso extends JPanel {

	String strIdGarage;
	String strNomGarage;
	String strLocalite;
	

	Label labGarage = new Label("GESTION GARAGE");

	Label labIdGarage = new Label("ID DU GARAGE :");
	TextField idGarage = new TextField();

	Label labNomGarage = new Label("NOM DU GARAGE :");
	TextField nomGarage = new TextField();

	Label labLocaliteGarage = new Label("LOCALITE DU GARAGE:");
	TextField textLocaliteGarage = new TextField();

	JButton bAjouter = new JButton("AJOUTER");
	JButton bModifier = new JButton("MODIFIER");
	JButton bSuprimer = new JButton("SUPRIMER");

	//parametre du tableau
	Object[][] enrg = {
			{"01","Garage le choco","Yop toit-rouge"},
			{ "02","Garage la reference","Yop SICIGI"},
			{"03","Garage du boss","Yop GESCO"}
	};

	String header[] = {" ID "," NOM DU GARAGE "," LOCALITE DU GARAGE "};
	JTable table = new JTable(enrg,header);
	
	//DefaultTableModel table1 = new DefaultTableModel(enrg, header);
	
	public PanelGaragePerso() {
		// TODO Auto-generated constructor stub
	}
	
	public PanelGaragePerso(JFrame frame, JPanel panelFinal) {
		// TODO Auto-generated constructor stub
		this.setBackground(Color.lightGray);

		PanelGarage panel1 = new PanelGarage();
		panel1.setBackground(Color.pink);
		GridLayout gridLayout1 = new GridLayout(1, 3, 50, 0);
		panel1.setLayout(gridLayout1);
		panel1.add(new Label());
		labGarage.setFont(new Font("Castellar", Font.BOLD, 20));
		panel1.add(labGarage);
		panel1.add(new Label());
		panel1.setPreferredSize(new Dimension(400, 30));

		PanelGarage panel2 = new PanelGarage();
		panel2.setBackground(Color.cyan);		
		GridLayout gridLayout2 = new GridLayout(4, 3, 2, 5);
		panel2.setLayout(gridLayout2);
		panel2.add(new Label());
		panel2.add(new Label());
		panel2.add(new Label());
		panel2.add(new Label());
		
		panel2.add(new Label());
		labIdGarage.setFont(new Font("Castellar", Font.BOLD, 15));
		panel2.add(labIdGarage);
		idGarage.setFont(new Font("Castellar", Font.PLAIN, 18));
		panel2.add(idGarage);
		panel2.add(new Label());
		
		panel2.add(new Label());
		labNomGarage.setFont(new Font("Castellar", Font.BOLD, 15));
		panel2.add(labNomGarage);
		nomGarage.setFont(new Font("Castellar", Font.PLAIN, 18));
		panel2.add(nomGarage);
		panel2.add(new Label());
		
		panel2.add(new Label());
		labLocaliteGarage.setFont(new Font("Castellar", Font.BOLD, 15));
		panel2.add(labLocaliteGarage);
		textLocaliteGarage.setFont(new Font("Castellar", Font.PLAIN, 18));
		panel2.add(textLocaliteGarage);
		panel2.add(new Label());

		PanelGarage panel3 = new PanelGarage();
		panel3.setBackground(Color.cyan);
		GridLayout gridLayout3 = new GridLayout(3, 5, 5, 5);
		panel3.setLayout(gridLayout3);
		panel3.add(new Label());
		panel3.add(new Label());
		panel3.add(new Label());
		panel3.add(new Label());
		panel3.add(new Label());
		
		panel3.add(new Label());
		bAjouter.setFont(new Font("Castellar", Font.BOLD, 13));
		bAjouter.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				strIdGarage = idGarage.getText();
				strNomGarage = nomGarage.getText();
				strLocalite = textLocaliteGarage.getText();
				System.out.println(strIdGarage);
				
				Object[] enrg0 =  {strIdGarage,strNomGarage,strLocalite} ;
				Object[] enrg1 =  null;
				for (int i = 0; i < table.getRowCount(); i++) {
					if(table.getValueAt(i, 1) != null){
					enrg1[i] = table.getValueAt(i, 0);
					enrg1[i] = table.getValueAt(i, 1);
					enrg1[i] = table.getValueAt(i, 2);
					}
				}
				if(enrg0.length != 0){
				for (int i = 0; i < (enrg1.length+enrg0.length); i++) {
					//enrg1[enrg1.length+i-1]e = enrg0[i];
				}
				}
				
				DefaultTableModel model = new DefaultTableModel();	
				model.addColumn(" ID ");
				model.addColumn(" NOM DU GARAGE ");
				model.addColumn(" LOCALITE DU GARAGE ");		
				model.addRow(enrg1);
				table.setModel(model);
			}
		});
				
		bModifier.setFont(new Font("Castellar", Font.BOLD, 13));
		bSuprimer.setFont(new Font("Castellar", Font.BOLD, 13));
		panel3.add(bAjouter);
		panel3.add(bModifier);
		panel3.add(bSuprimer);
		panel3.add(new Label());
		
		panel3.add(new Label());
		panel3.add(new Label());
		panel3.add(new Label());
		panel3.add(new Label());
		panel3.add(new Label());
		//panel3.setPreferredSize(new Dimension(300, 10));
		
		PanelGarage panel4 = new PanelGarage();
		panel4.setBackground(Color.pink);
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));	
		
        table.setFont(new Font("ariel", Font.BOLD, 12));
		table.setPreferredSize(new Dimension(600, 150));
		JScrollPane jscrol = new JScrollPane(table);
		panel4.add(jscrol);	
		
		panelFinal.setLayout(new BoxLayout(panelFinal, BoxLayout.PAGE_AXIS));
		panelFinal.add(panel1);
		panelFinal.add(panel2);
		panelFinal.add(panel3);
		panelFinal.add(panel4);

		Container contener = frame.getContentPane();
		contener.add(panelFinal);
		frame.setVisible(true);
		
	  }
	

	}
