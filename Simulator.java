package sim;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Simulator extends JPanel implements Runnable {
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
	Packet packet1;
	Packet packet2;
	Packet packet3;
	Packet packet4;
	Packet packet5;
	Packet packet6;
	Image image;
	Clock clock;
	Counter counter;
	Graphics graphics;
	Thread gameTimer;
	Dimension packetSimScreen = new Dimension(width,height);
	// Simulator Constructor
	public Simulator() {
		longRectangle();
		queueRectangle();
		bufferSquare();
		packet();
		clock = new Clock(400,150);
		counter = new Counter(400,150);
		this.setFocusable(true);
		this.setPreferredSize(packetSimScreen);
		gameTimer = new Thread(this);
		gameTimer.start();
	}
	// Method to create packet objects
	public void packet() {
		packet6 = new Packet(80,130,25,25,6);
		packet5 = new Packet(80,130,25,25,5);
		packet4 = new Packet(80,130,25,25,4);
		packet3 = new Packet(80,130,25,25,3);
		packet2 = new Packet(80,130,25,25,2);
		packet1 = new Packet(80,130,25,25,1);
	}
	// Method to create longRectangle objects
	public void longRectangle() {
		arrivalRectangle = new LongRectangle(80,130,295,25);
		transmissionRectangle = new LongRectangle(585,130,295,25);
	}
	// Method to create queueRectangle objects
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
	// Method to create bufferSquare objects
	public void bufferSquare() {
		bufferSquare = new BufferSquare(525,115,60,60,0);
	}
	// Method to draw all graphics
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
		packet1.drawSquare(g);
		packet2.drawSquare(g);
		packet3.drawSquare(g);
		packet4.drawSquare(g);
		packet5.drawSquare(g);
		packet6.drawSquare(g);
		clock.draw(g);
		counter.draw(g);

		
	}
	// Method to display graphics on screen
	public void paintComponent(Graphics g) {
		image = createImage(getWidth(),getHeight());
		graphics = image.getGraphics();
		draw(graphics);
		g.drawImage(image,0,0,this);
	}
	// Method to move packet1 with arrival speed
	public void movePacket1Arrival() {
		packet1.moveArrivalPacket();
	}
	// Method to move packet2 with arrival speed
	public void movePacket2Arrival() {
		packet2.moveArrivalPacket();
	}
	// Method to move packet3 with arrival speed
	public void movePacket3Arrival() {
		packet3.moveArrivalPacket();
	}
	// Method to move packet4 with arrival speed
	public void movePacket4Arrival() {
		packet4.moveArrivalPacket();
	}
	// Method to move packet5 with arrival speed
	public void movePacket5Arrival() {
		packet5.moveArrivalPacket();
	}
	// Method to move packet6 with arrival speed
	public void movePacket6Arrival() {
		packet6.moveArrivalPacket();
	}
	
	// Method to move packet1 with transmission speed
	public void movePacket1Transmission() {
		packet1.moveTransmissionPacket();
	}
	// Method to move packet2 with transmission speed
	public void movePacket2Transmission() {
		packet2.moveTransmissionPacket();
	}
	// Method to move packet3 with transmission speed
	public void movePacket3Transmission() {
		packet3.moveTransmissionPacket();
	}
	// Method to move packet4 with transmission speed
	public void movePacket4Transmission() {
		packet4.moveTransmissionPacket();
	}
	// Method to move packet5 with transmission speed
	public void movePacket5Transmission() {
		packet5.moveTransmissionPacket();
	}
	// Method to move packet6 with transmission speed
	public void movePacket6Transmission() {
		packet6.moveTransmissionPacket();
	}

	
	// Method to check collision of objects
	public void checkCollision() {
		// Code to count the number of dropped packets
		if(queueRectangle10.queueId == 2) {
			counter.dropped = counter.dropped +1;
		}
		if(queueRectangle10.queueId == 3) {
			counter.dropped = counter.dropped +1;
		}
		if(queueRectangle10.queueId == 4) {
			counter.dropped = counter.dropped +1;
		}
		if(queueRectangle10.queueId == 5) {
			counter.dropped = counter.dropped +1;
		}
		if(queueRectangle10.queueId == 6) {
			counter.dropped = counter.dropped +1;
		}
		
		// Code to change the color of the queueRectangles
		if(bufferSquare.bufferId==1 && packet2.x >= 340 && packet2.x <= 620) {
			if(queueRectangle10.queueId==0) {
				queueRectangle10 = new QueueRectangle(510,90,15,100,2);
			}
			else if(queueRectangle9.queueId==0) {
				queueRectangle9 = new QueueRectangle(495,90,15,100,2);
			}
			else if(queueRectangle8.queueId==0) {
				queueRectangle8 = new QueueRectangle(480,90,15,100,2);
			}
			else if(queueRectangle7.queueId==0) {
				queueRectangle7 = new QueueRectangle(465,90,15,100,2);
			}
			else if(queueRectangle6.queueId==0) {
				queueRectangle6 = new QueueRectangle(450,90,15,100,2);
			}
			else if(queueRectangle5.queueId==0) {
				queueRectangle5 = new QueueRectangle(435,90,15,100,2);
			}
			else if(queueRectangle4.queueId==0) {
				queueRectangle4 = new QueueRectangle(420,90,15,100,2);
			}
			else if(queueRectangle3.queueId==0) {
				queueRectangle3 = new QueueRectangle(405,90,15,100,2);
			}
			else if(queueRectangle2.queueId==0) {
				queueRectangle2 = new QueueRectangle(390,90,15,100,2);
			}
			else if(queueRectangle1.queueId==0) {
				queueRectangle1 = new QueueRectangle(375,90,15,100,2);
			}

		}
		// Code to change the color of the queueRectangles
		if(bufferSquare.bufferId==2 && packet3.x >= 340 && packet3.x <= 620) {
			if(queueRectangle10.queueId==0) {
				queueRectangle10 = new QueueRectangle(510,90,15,100,3);
			}
			else if(queueRectangle9.queueId==0) {
				queueRectangle9 = new QueueRectangle(495,90,15,100,3);
			}
			else if(queueRectangle8.queueId==0) {
				queueRectangle8 = new QueueRectangle(480,90,15,100,3);
			}
			else if(queueRectangle7.queueId==0) {
				queueRectangle7 = new QueueRectangle(465,90,15,100,3);
			}
			else if(queueRectangle6.queueId==0) {
				queueRectangle6 = new QueueRectangle(450,90,15,100,3);
			}
			else if(queueRectangle5.queueId==0) {
				queueRectangle5 = new QueueRectangle(435,90,15,100,3);
			}
			else if(queueRectangle4.queueId==0) {
				queueRectangle4 = new QueueRectangle(420,90,15,100,3);
			}
			else if(queueRectangle3.queueId==0) {
				queueRectangle3 = new QueueRectangle(405,90,15,100,3);
			}
			else if(queueRectangle2.queueId==0) {
				queueRectangle2 = new QueueRectangle(390,90,15,100,3);
			}
			else if(queueRectangle1.queueId==0) {
				queueRectangle1 = new QueueRectangle(375,90,15,100,3);
			}
		}
		// Code to change the color of the queueRectangles
		if(bufferSquare.bufferId==3 && packet4.x >= 340 && packet4.x <= 620) {
			if(queueRectangle10.queueId==0) {
				queueRectangle10 = new QueueRectangle(510,90,15,100,4);
			}
			else if(queueRectangle9.queueId==0) {
				queueRectangle9 = new QueueRectangle(495,90,15,100,4);
			}
			else if(queueRectangle8.queueId==0) {
				queueRectangle8 = new QueueRectangle(480,90,15,100,4);
			}
			else if(queueRectangle7.queueId==0) {
				queueRectangle7 = new QueueRectangle(465,90,15,100,4);
			}
			else if(queueRectangle6.queueId==0) {
				queueRectangle6 = new QueueRectangle(450,90,15,100,4);
			}
			else if(queueRectangle5.queueId==0) {
				queueRectangle5 = new QueueRectangle(435,90,15,100,4);
			}
			else if(queueRectangle4.queueId==0) {
				queueRectangle4 = new QueueRectangle(420,90,15,100,4);
			}
			else if(queueRectangle3.queueId==0) {
				queueRectangle3 = new QueueRectangle(405,90,15,100,4);
			}
			else if(queueRectangle2.queueId==0) {
				queueRectangle2 = new QueueRectangle(390,90,15,100,4);
			}
			else if(queueRectangle1.queueId==0) {
				queueRectangle1 = new QueueRectangle(375,90,15,100,4);
			}
		}
		// Code to change the color of the queueRectangles
		if(bufferSquare.bufferId==4 && packet5.x >= 340 && packet5.x <= 620) {
			if(queueRectangle10.queueId==0) {
				queueRectangle10 = new QueueRectangle(510,90,15,100,5);
			}
			else if(queueRectangle9.queueId==0) {
				queueRectangle9 = new QueueRectangle(495,90,15,100,5);
			}
			else if(queueRectangle8.queueId==0) {
				queueRectangle8 = new QueueRectangle(480,90,15,100,5);
			}
			else if(queueRectangle7.queueId==0) {
				queueRectangle7 = new QueueRectangle(465,90,15,100,5);
			}
			else if(queueRectangle6.queueId==0) {
				queueRectangle6 = new QueueRectangle(450,90,15,100,5);
			}
			else if(queueRectangle5.queueId==0) {
				queueRectangle5 = new QueueRectangle(435,90,15,100,5);
			}
			else if(queueRectangle4.queueId==0) {
				queueRectangle4 = new QueueRectangle(420,90,15,100,5);
			}
			else if(queueRectangle3.queueId==0) {
				queueRectangle3 = new QueueRectangle(405,90,15,100,5);
			}
			else if(queueRectangle2.queueId==0) {
				queueRectangle2 = new QueueRectangle(390,90,15,100,5);
			}
			else if(queueRectangle1.queueId==0) {
				queueRectangle1 = new QueueRectangle(375,90,15,100,5);
			}
		}
		// Code to change the color of the queueRectangles
		if(bufferSquare.bufferId==5 && packet6.x >= 340 && packet6.x <= 620) {
			if(queueRectangle10.queueId==0) {
				queueRectangle10 = new QueueRectangle(510,90,15,100,6);
			}
			else if(queueRectangle9.queueId==0) {
				queueRectangle9 = new QueueRectangle(495,90,15,100,6);
			}
			else if(queueRectangle8.queueId==0) {
				queueRectangle8 = new QueueRectangle(480,90,15,100,6);
			}
			else if(queueRectangle7.queueId==0) {
				queueRectangle7 = new QueueRectangle(465,90,15,100,6);
			}
			else if(queueRectangle6.queueId==0) {
				queueRectangle6 = new QueueRectangle(450,90,15,100,6);
			}
			else if(queueRectangle5.queueId==0) {
				queueRectangle5 = new QueueRectangle(435,90,15,100,6);
			}
			else if(queueRectangle4.queueId==0) {
				queueRectangle4 = new QueueRectangle(420,90,15,100,6);
			}
			else if(queueRectangle3.queueId==0) {
				queueRectangle3 = new QueueRectangle(405,90,15,100,6);
			}
			else if(queueRectangle2.queueId==0) {
				queueRectangle2 = new QueueRectangle(390,90,15,100,6);
			}
			else if(queueRectangle1.queueId==0) {
				queueRectangle1 = new QueueRectangle(375,90,15,100,6);
			}
		}
		
		// Code to empty the queueRectangles
		if(packet1.x >= 600) {
			queueRectangle10 = new QueueRectangle(510,90,15,100,0);
		}
		if(packet2.x >= 600) {
			queueRectangle10 = new QueueRectangle(510,90,15,100,0);
		}
		if(packet3.x >= 600) {
			queueRectangle10 = new QueueRectangle(510,90,15,100,0);
		}
		if(packet4.x >= 600) {
			queueRectangle10 = new QueueRectangle(510,90,15,100,0);
		}
		if(packet5.x >= 600) {
			queueRectangle10 = new QueueRectangle(510,90,15,100,0);
		}
		if(packet6.x >= 600) {
			queueRectangle10 = new QueueRectangle(510,90,15,100,0);
		}
		
		// Code to change the color of the bufferSquare
		if(packet1.x >= 340 && packet1.x <= 600) {
			bufferSquare = new BufferSquare(525,115,60,60,1);
		}
		else {
			bufferSquare = new BufferSquare(525,115,60,60,0);
		}
		if(packet2.x >= 340 && packet2.x <= 600) {
			bufferSquare = new BufferSquare(525,115,60,60,2);
		}
		if(packet3.x >= 340 && packet3.x <= 600) {
			bufferSquare = new BufferSquare(525,115,60,60,3);
		}
		if(packet4.x >= 340 && packet4.x <= 600) {
			bufferSquare = new BufferSquare(525,115,60,60,4);
		}
		if(packet5.x >= 340 && packet5.x <= 600) {
			bufferSquare = new BufferSquare(525,115,60,60,5);
		}
		if(packet6.x >= 340 && packet6.x <= 600) {
			bufferSquare = new BufferSquare(525,115,60,60,6);
		}
		if(packet6.x >=340 && packet1.x <= 600){
			bufferSquare = new BufferSquare(525,115,60,60,0);
		}
		
		// Code to change the color of the packet
		if(packet1.x>=350 && packet1.x <= 585) {
			packet1.packetId=0;
	    }
		else {
			packet1.packetId=1;
		}
		if(packet2.x>=350 && packet2.x <= 585) {
			packet2.packetId=0;
	    }
		else {
			packet2.packetId=2;
		}
		if(packet3.x>=350 && packet3.x <= 585) {
			packet3.packetId=0;
	    }
		else {
			packet3.packetId=3;
		}
		if(packet4.x>=350 && packet4.x <= 585) {
			packet4.packetId=0;
	    }
		else {
			packet4.packetId=4;
		}
		
		if(packet5.x>=350 && packet5.x <= 585) {
			packet5.packetId=0;
	    }
		else {
			packet5.packetId=5;
		}
		
		if(packet6.x>=350 && packet6.x <= 585) {
			packet6.packetId=0;
	    }
		else {
			packet6.packetId=6;
		}
		
		// Code to reset the packets to the start
		if(packet1.x >= 855) {
			packet1.x = 80;
		}
		if(packet2.x >= 855) {
			packet2.x = 80;
		}
		if(packet3.x >= 855) {
			packet3.x = 80;
		}
		if(packet4.x >= 855) {
			packet4.x = 80;
		}
		if(packet5.x >= 855) {
			packet5.x = 80;
		}
		if(packet6.x >= 855) {
			packet6.x = 80;
		}
		
		// Code to keep track of the total number of packets
		if(packet1.x >= 830) {
			counter.total = counter.total +1;
		}
		if(packet2.x >= 830) {
			counter.total = counter.total +1;
		}
		if(packet3.x >= 830) {
			counter.total = counter.total +1;
		}
		if(packet4.x >= 830) {
			counter.total = counter.total +1;
		}
		if(packet5.x >= 830) {
			counter.total = counter.total +1;
		}
		if(packet6.x >= 830) {
			counter.total = counter.total +1;
		}
		
		
		
	}
	// Method to create game timer to create animation
	public void run() {		
		long previousTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double base = 0;
		while(true) {
			long currentTime = System.nanoTime();
			base += (currentTime - previousTime)/ns;
			previousTime = currentTime;
			if(base >= 1) {
				movePacket1Arrival();
				checkCollision();
				repaint();
				base--;
				clock.time = clock.time + 0.1;
				// Sets the arrival speed for packets
				if(packet1.x>=164) {
					movePacket2Arrival();
			}
				if(packet2.x>=172) {
					movePacket3Arrival();
			}
				if(packet3.x>=167) {
					movePacket4Arrival();
			}
				if(packet4.x>=174) {
					movePacket5Arrival();
			}
				if(packet5.x>=166) {
					movePacket6Arrival();
			}
				
				// Sets the transmission speed for packets
				if(packet1.x>=340) {
					movePacket1Transmission();
			}
				if(packet2.x>=340) {
					movePacket2Transmission();
			}
				if(packet3.x>=340) {
					movePacket3Transmission();
			}
				if(packet4.x>=340) {
					movePacket4Transmission();
			}
				if(packet5.x>=340) {
					movePacket5Transmission();
			}
				if(packet6.x>=340) {
					movePacket6Transmission();
			}			
		}
	}

  }
}