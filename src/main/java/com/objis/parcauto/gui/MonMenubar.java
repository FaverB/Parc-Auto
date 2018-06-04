package com.objis.parcauto.gui;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MonMenubar extends JMenuBar {

	JMenu menuChauffeur = new JMenu("CHAUFFEUR");
	JMenuItem itemChauffeur = new JMenuItem("Espace Chauffeur");
	
	JMenu menuGarage = new JMenu("GARAGE");
	JMenuItem itemGarage = new JMenuItem("Espace Garage");
	
	JMenu menuVoiture = new JMenu("VOITURE");
	JMenuItem itemVoiture = new JMenuItem("Espace voiture");
	
	
	public MonMenubar() {
		// TODO Auto-generated constructor stub
	menuChauffeur.add(itemChauffeur);
	itemChauffeur.setBackground(new Color(230,100,100));
	this.add(menuChauffeur);
	
	menuGarage.add(itemGarage);
	itemGarage.setBackground(new Color(230,100,100));
	this.add(menuGarage);
	
	menuVoiture.add(itemVoiture);
	itemVoiture.setBackground(new Color(230,100,100));
	this.add(menuVoiture);
	
	setBackground(new Color(205,205,25));
	
	
	
	this.setVisible(true);

	}
}
