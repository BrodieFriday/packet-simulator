package sim;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Clock {
// Created by: Brodie Friday
	// CS 420
	
	  double time = 0.0;
	  // Clock Constructor
	  Clock(int width,int height){
	  }
	  // Method to draw the clock object
	  public void draw(Graphics g) {
	
		  g.setColor(Color.black);
		  	
		  g.setFont(new Font("Dialog",Font.PLAIN,30));
		  g.drawString(String.valueOf(0%10)+String.valueOf(time/10), 845,30);
		  
		  g.setFont(new Font("Dialog",Font.PLAIN,13));
		  g.drawString(String.valueOf("msec"),867,40);
	
	  }
}
