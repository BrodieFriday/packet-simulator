package sim;

import javax.swing.JFrame;

public class Sim {
// Created by: Brodie Friday
	// CS 420
	
	// Main Method
	public static void main(String[] args) {
		// Code to create new instance of simStart object
		SimStart simStart = new SimStart();
		simStart.setTitle("Packet Simulator");
		simStart.setSize(930,325);
        simStart.setVisible(true);
        simStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
