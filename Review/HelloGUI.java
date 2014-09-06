//
//  HelloGUI.java
//
//  Created by Nina Baculinao on 9/5/14.
//

// JFrame class belongs to javax.swing package, swing is GUI library nickname 
// and javax refers to fact that swing began as a Java extension
import javax.swing.JFrame;

public class HelloGUI {
	public static void main(String[] args) {

		// Construct a JFrame object, set its size and make it visible
		JFrame frame = new JFrame();

		frame.setSize(300,400);
		frame.setTitle("An Empty Frame for now");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}
}