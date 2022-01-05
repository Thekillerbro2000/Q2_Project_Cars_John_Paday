import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class roadconstruction{
	
	//image related variables
	private Image img; 	
	private AffineTransform tx;
	public int x,y;
	public int vy = 9;
	public roadconstruction(int x, int y) {
		this.x = x;
		this.y = y;
		img = getImage("/imgs/blockade.gif"); //load the image for road construction
		tx = AffineTransform.getTranslateInstance(x, y );
		init(x, y); 				//initialize the location of the image
									//use your variables
	}

	
	
	
	/* Drawing commands */
	public void paint(Graphics g) {
		//these are the 2 lines of code needed draw an image on the screen
		
		Graphics2D g2 = (Graphics2D) g;
		//collision boundaries
		//g.setColor(Color.white);
		//g.drawRect(x, y, 50, 40);
		
		//call update to update the actualy picture location
		update();
		
		
		
		
		g2.drawImage(img, tx, null);
		
		

	}
	
	/* update variables here */
	private void update() {
	y += vy;	
	
	tx.setToTranslation(x, y);
	tx.scale(0.1, 0.1);	
	}
	public void reset() {
		this.x = 125;
		this.y = -400;
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(0.1, 0.1);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = roadconstruction.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

}
