/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.parcauto.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 */
@SuppressWarnings("serial")
public class ParcAutoGUI extends JFrame {
	MonMenubar monMenu = new MonMenubar();

	public ParcAutoGUI() {
		// TODO Auto-generated constructor stub

		this.setTitle("GESTION PARC AUTO MODERNE");
		this.setSize(1500, 1000);
		this.setLocationRelativeTo(null);
		Container conteneur = this.getContentPane();
		conteneur.setLayout(new BorderLayout());		
		JPanel pane = new JPanel();
		ImageIcon img = new ImageIcon("225.gif");
		//this.setIconImage(img.getImage());
		
		JLabel labImg = new JLabel(img);
		pane.add(labImg);
		conteneur.add(pane, BorderLayout.CENTER);
		pane.setBackground(Color.white);
		
		this.setResizable(false);
		this.setJMenuBar(monMenu);

		monMenu.itemChauffeur.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ParcAutoGUI frame = new ParcAutoGUI();
				frame.setTitle("espace chauffeur");
				frame.setJMenuBar(null);				
				frame.setSize(800, 400);
				frame.setLocationRelativeTo(frame.getParent());
				frame.setAlwaysOnTop(true);
				frame.setContentPane(new PanelChauffeur());
				frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
				
			}
		});
		
		monMenu.itemGarage.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ParcAutoGUI frame = new ParcAutoGUI();
				frame.setTitle("espace garage");
				frame.setJMenuBar(null);
				frame.setBounds(300, 170, 800, 400);
				frame.setAlwaysOnTop(true);				 
				frame.setContentPane(new PanelGarage());
				frame.setDefaultCloseOperation(HIDE_ON_CLOSE);	
				
			}
		});	
		PanelGarage garage = new PanelGarage();
		garage.bValider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		});

		monMenu.itemVoiture.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ParcAutoGUI frame = new ParcAutoGUI();
				frame.setTitle("espace voiture");
				frame.setJMenuBar(null);
				frame.setBounds(300, 170, 800, 450);
				frame.setAlwaysOnTop(true);
				frame.setContentPane(new PanelVoiture() );
				frame.setDefaultCloseOperation(HIDE_ON_CLOSE);	
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {

		// PanelGarage panelGarage = new PanelGarage();

		ParcAutoGUI fenetreChauf = new ParcAutoGUI();

	}
}