package sim;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimFrame extends JFrame implements ActionListener{
// Created by: Brodie Friday
	// CS 420
	
	Simulator simulator;
	JComboBox<String> arrival,transmission;
	JLabel emissionRate,transmissionRate;
	static JLabel msec;
	// SimFrame Constructor
	SimFrame(){
		simulator = new Simulator();
		
	  	this.add(simulator);
	  	this.setResizable(false);
	  	this.setBackground(Color.white);
	  	this.setTitle("Packet Simulator");
	  	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  	this.pack();
	  	this.setVisible(true);
	  	//this.setLocationRelativeTo(null);
	  	Color lightGray = new Color(189, 189, 189);
	  	
	  	
	  String[] a = {SimStart.frameArrivalRate};
	  String[] b = {SimStart.frameRelayRate};
	  		
	  	   // Code to create emmission label
	  	   emissionRate = new JLabel("Emmission rate");
	       simulator.add(emissionRate);
	       emissionRate.setBounds(80, 190, 100, 20);
	       
	       // Code to create arrival JComboBox
	       arrival = new JComboBox<>(a);
		   simulator.add(arrival);
		   arrival.setBounds(125,92,120,20);
		   arrival.setBackground(lightGray);
		   arrival.setOpaque(true);
		   arrival.setVisible(true);
	       
		   // Code to create transmission label
	       transmissionRate = new JLabel("Transmission rate");
	       simulator.add(transmissionRate);
	       transmissionRate.setBounds(140, 190, 100, 20);
	      
	       // Code for creating transmission JComboBox
	       transmission = new JComboBox<>(b);
	       simulator.add(transmission);
	       transmission.setBounds(150,92,120,20);
	       transmission.setBackground(lightGray);
	       transmission.setOpaque(true);
	       transmission.setVisible(true);
	       
	       // Code for start button
	       JButton startButton = new JButton("Start");
		   simulator.add(startButton);
		   startButton.setBounds(185, 100, 100, 20);
		   Color startColor = new Color(76, 228, 53);
		   startButton.setBackground(startColor);
		   startButton.setOpaque(true);
		   startButton.addActionListener(this);
		    
		   // Code for creating reset button
		   JButton resetButton = new JButton("Reset");
		   simulator.add(resetButton);
		   resetButton.setBounds(250, 400, 100, 20);
		   Color resetColor = new Color(199, 56, 56);
		   resetButton.setBackground(resetColor);
		   resetButton.setOpaque(true);
		   resetButton.addActionListener(this);
		   
	       
	}

	

	// Method to detect reset button pushed
	public void actionPerformed(ActionEvent e) {
		
		// Condition to create simStart object when Reset button is pushed
		if (e.getActionCommand().equals("Reset")) {
			dispose();
			SimStart simStart = new SimStart();
			simStart.setTitle("Packet Simulator");
			simStart.setSize(930,325);
	        simStart.setVisible(true);
	        simStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	}

}
