package sim;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
import java.text.*;

public class SimStart extends JFrame implements ActionListener{
// Brodie Friday
	// CS 420
	
	public static String frameArrivalRate = null;
	public static String frameRelayRate = null;
	Simulator simulator;
	static JComboBox<String> arrival;
	static JComboBox<String> transmission;
	JLabel emissionRate,transmissionRate,msec,dropped;
	JButton startButton;
	// SimStart Constructor
	SimStart(){
		SimulatorStart simulator = new SimulatorStart();
		
	  	this.add(simulator);
	  	this.setResizable(false);
	  	this.setBackground(Color.white);
	  	this.setTitle("Packet Simulator");
	  	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  	this.pack();
	  	this.setVisible(true);
	  	Color lightGray = new Color(189, 189, 189);
	  	
	  	
	  	String[] arrivalRate = {"100 packet/s","300 packet/s","500 packet/s"};
	    String[] relayRate = {"300 packet/s","500 packet/s","800 packet/s"};
	  		
	       // Code to create emissionRate JComboBox
	  	   emissionRate = new JLabel("Emmission rate");
	       simulator.add(emissionRate);
	       emissionRate.setBounds(80, 190, 100, 20);
	       
	       // Code to create arrival JComboBox
	       arrival = new JComboBox<>(arrivalRate);
		   simulator.add(arrival);
		   arrival.setBounds(125,92,120,20);
		   arrival.setBackground(lightGray);
		   arrival.setOpaque(true);
		   arrival.setVisible(true);
	       
		   // Code to create transmissionRate label
	       transmissionRate = new JLabel("Transmission rate");
	       simulator.add(transmissionRate);
	       transmissionRate.setBounds(140, 190, 100, 20);
	      
	       // Code to create transmission JComboBox
	       transmission = new JComboBox<>(relayRate);
	       simulator.add(transmission);
	       transmission.setBounds(150,92,120,20);
	       transmission.setBackground(lightGray);
	       transmission.setOpaque(true);
	       transmission.setVisible(true);
	       
	       // Code to create start button
	       JButton startButton = new JButton("Start");
		   simulator.add(startButton);
		   startButton.setBounds(185, 100, 100, 20);
		   Color startColor = new Color(76, 228, 53);
		   startButton.setBackground(startColor);
		   startButton.setOpaque(true);
		   startButton.addActionListener(this);
		   
		   // Code to create reset button
		   JButton resetButton = new JButton("Reset");
		   simulator.add(resetButton);
		   resetButton.setBounds(250, 400, 100, 20);
		   Color resetColor = new Color(199, 56, 56);
		   resetButton.setBackground(resetColor);
		   resetButton.setOpaque(true);
		   resetButton.addActionListener(this);
	}
	// Method to detect when start button is pushed
	public void actionPerformed(ActionEvent e) {
		// If start button is pushed simulation is started with correct speeds
		if (e.getActionCommand().equals("Start")) {
			frameArrivalRate = (String) arrival.getSelectedItem();
		    frameRelayRate =  (String) transmission.getSelectedItem();
			dispose();
			SimFrame simFrame = new SimFrame();
			simFrame.setTitle("Packet Simulator");
			simFrame.setSize(930,325);
	        simFrame.setVisible(true);
	        simFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
				
			
		}
		
	}

}
