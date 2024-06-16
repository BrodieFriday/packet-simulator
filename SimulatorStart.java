package sim;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class SimulatorStart extends JPanel{
// Created by: Brodie Friday
	// CS 420
	
	int width = 900;
	int height = 325;
	LongRectangle arrivalRectangle;
	LongRectangle transmissionRectangle;
	BufferSquare bufferSquare;
	QueueRectangle queueRectangle1;
	QueueRectangle queueRectangle2;
	QueueRectangle queueRectangle3;
	QueueRectangle queueRectangle4;
	QueueRectangle queueRectangle5;
	QueueRectangle queueRectangle6;
	QueueRectangle queueRectangle7;
	QueueRectangle queueRectangle8;
	QueueRectangle queueRectangle9;
	QueueRectangle queueRectangle10;
	Counter counter;
	Clock clock;
	Image image;
	Graphics graphics;
	Dimension packetSimScreen = new Dimension(width,height);
	// SimulatorStart Constructor
	public SimulatorStart() {
		longRectangle();
		queueRectangle();
		bufferSquare();
		packet();
		counter = new Counter(400,150);
		clock = new Clock(400,150);
		this.setFocusable(true);
		this.setPreferredSize(packetSimScreen);
	}
	public void packet() {
	}
	// Method to create all the new longRectangle objects
	public void longRectangle() {
		arrivalRectangle = new LongRectangle(80,130,295,25);
		transmissionRectangle = new LongRectangle(585,130,295,25);
	}
	
	// Method to create all the new queRectangle objects
	public void queueRectangle() {
		queueRectangle1 = new QueueRectangle(375,90,15,100,0);
		queueRectangle2 = new QueueRectangle(390,90,15,100,0);
		queueRectangle3 = new QueueRectangle(405,90,15,100,0);
		queueRectangle4 = new QueueRectangle(420,90,15,100,0);
		queueRectangle5 = new QueueRectangle(435,90,15,100,0);
		queueRectangle6 = new QueueRectangle(450,90,15,100,0);
		queueRectangle7 = new QueueRectangle(465,90,15,100,0);
		queueRectangle8 = new QueueRectangle(480,90,15,100,0);
		queueRectangle9 = new QueueRectangle(495,90,15,100,0);
		queueRectangle10 = new QueueRectangle(510,90,15,100,0);
	}
	// Method to create the new bufferSquare object
	public void bufferSquare() {
		bufferSquare = new BufferSquare(525,115,60,60,0);
	}
	// Method to draw all of the new objects
	public void draw(Graphics g) {
		arrivalRectangle.drawRectangle(g);
		transmissionRectangle.drawRectangle(g);
		bufferSquare.drawSquare(g);
		queueRectangle1.drawRectangle(g);
		queueRectangle2.drawRectangle(g);
		queueRectangle3.drawRectangle(g);
		queueRectangle4.drawRectangle(g);
		queueRectangle5.drawRectangle(g);
		queueRectangle6.drawRectangle(g);
		queueRectangle7.drawRectangle(g);
		queueRectangle8.drawRectangle(g);
		queueRectangle9.drawRectangle(g);
		queueRectangle10.drawRectangle(g);
		counter.draw(g);
		clock.draw(g);
	}
	// Method to display graphics on screen
	public void paintComponent(Graphics g) {
		image = createImage(getWidth(),getHeight());
		graphics = image.getGraphics();
		draw(graphics);
		g.drawImage(image,0,0,this);
	}
}