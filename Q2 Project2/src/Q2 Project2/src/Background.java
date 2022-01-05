import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Background{
	
	//image related variables
	private Image img; 	
	private AffineTransform tx;
	public int x,y;
	//background moves downward to make it seem as though the car is moving up the road
	public int vy = 9;
	public Background(int x, int y) {
		this.x = x;
		this.y = y;
		img = getImage("/imgs/road.png"); //load the image for road
		tx = AffineTransform.getTranslateInstance(x, y );
		init(x, y); 				//initialize the location of the image
									//use your variables
	}

	
	
	
	/* Drawing commands */
	public void paint(Graphics g) {
		//these are the 2 lines of code needed draw an image on the screen
		
		Graphics2D g2 = (Graphics2D) g;
		
		
		//call update to update the actualy picture location
		update();
		
		
		
		
		g2.drawImage(img, tx, null);
		
		

	}
	/* update variables here */
	private void update() {
	y += vy;	
	
	tx.setToTranslation(x, y);
	tx.scale(2.0, 7.0);	
	}
	public void reset() {
		this.x = -5;
		this.y = -850;
	}
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(2.0, 7.0);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Background.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

}
