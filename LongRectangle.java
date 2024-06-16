package sim;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

class LongRectangle extends Rectangle {
// Created by: Brodie Friday
	// CS 420
	
	// LongRectangle Constructor
	LongRectangle(int xAxis, int yAxis, int rectangleWidth, int rectangleHeight){
	    super(xAxis,yAxis,rectangleWidth,rectangleHeight);
	}
	
	// Method to draw the long rectangles 
	public void drawRectangle(Graphics g){
		
	      g.setColor(Color.black);
		g.drawRect(x,y,width,height);
	}
}