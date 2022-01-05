import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Car{
	
	//image related variables
	public int x, y;
	private Image img; 	
	private AffineTransform tx;
	public int vx =0;
	public int vy =0;
	public Car(int x, int y) {
		this.x = x;
		this.y = y;
	
		img = getImage("/imgs/blue-top-car-png-21.png"); //load the image for Tree
		tx = AffineTransform.getTranslateInstance(x, y );
		init(x, y); 				//initialize the location of the image
									//use your variables
	}
	
	
	/* update variables here */
	private void update() {
	y -= vy;	
	x += vx;	
	//vx =0;
	tx.setToTranslation(x, y);
	tx.scale(0.18, 0.18);	
	}
	public void left() {
		vx = -10;
	}
	public void right() {
		vx = 10;
	}
	public void up() {
		vy = 10;
	}
	public void down() {
		vy = -10;
	}
	/* Drawing commands */
	public void paint(Graphics g) {
		//these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;
		//collision boundaries
		//g.setColor(Color.white);
		//g.drawRect(x, y, 52, 110);
		
		//call update to update the actualy picture location
		update();
		
		
		
		
		g2.drawImage(img, tx, null);
		
		

	}
	public void reset() {
		x= 125;
	}

	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(0.18, 0.18);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Car.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

}
