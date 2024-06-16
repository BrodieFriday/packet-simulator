package sim;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Counter{
// Created by: Brodie Friday
	// CS 420
	
	  int dropped = 0;
	  int total = 0;
	  // Counter Constructor
	  Counter(int width,int height){
	  }
	  
	  // Method to draw the packet counter object
	  public void draw(Graphics g) {
	
		  g.setColor(Color.black);
		
		  g.setFont(new Font("Dialog",Font.PLAIN,15));
			
		  g.drawString(String.valueOf(dropped/10)+String.valueOf(" packets dropped of ")+String.valueOf(total/10), 370,70);
	
	
	  }
}