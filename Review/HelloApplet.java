//
//  HelloApplet.java
//
//  Created by Nina Baculinao on 9/5/14.
//

// Advantages of applets:
// 1. Don't need separate component and viewer classes, only a single class
// 2. Run on web browsers for all the world to admire (doesn't run in Terminal)
// 3. Coding differences from JComponent are very minor:
//    a. Extend JApplet class, not JComponent
//    b. Place drawing code in paint method, not paintComponent method

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JApplet;

// An applet that draws two rectangles
public class HelloApplet extends JApplet {
	
	// Drawing instructions go inside this class
	// This method is called whenever the component needs to be repainted
	public void paint(Graphics g) {

		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;

		// Construct a rectangle and draw it
		Rectangle box = new Rectangle(5, 10, 20, 30);
		g2.draw(box);

		// Move rectangle 15 units to the right and 25 units down
		box.translate(15,25);

		// Draw moved rectangle
		g2.draw(box);

	}
}