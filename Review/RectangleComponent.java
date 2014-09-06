//
//  RectangleComponent.java
//
//  Created by Nina Baculinao on 9/5/14.
//

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

// To display a drawing in a frame, need to define a class that inherits and 
// extends JComponent class
public class RectangleComponent extends JComponent {
	
	// Drawing instructions go inside this class
	// This method is called whenever the component needs to be repainted
	// This method receives an object from primitive Graphics class
	public void paintComponent(Graphics g) {

		// Use a cast to receover the Graphics2D object from the Graphics param
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