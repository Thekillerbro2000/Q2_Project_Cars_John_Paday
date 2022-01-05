  import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

//highscore: 
//1.John 138
//2.
//3.

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	
	//CREATE THE OBJECT (STEP 1)
	Background 	bg 	= new Background(-5, -900);
	Car car = new Car(125,425);
	policecar police = new policecar(0,-900);
	roadconstruction blockade = new roadconstruction(125,-300);
	Font f1 = new Font(Font.SERIF, Font.PLAIN, 25);
	int bscore = 0;
	horse animal = new horse(201,1);
	int temp;
	public void paint(Graphics g) {
		super.paintComponent(g);
		//paints the objects
		
		bg.paint(g);
		car.paint(g);
		police.paint(g);
		blockade.paint(g);
		animal.paint(g);
		
		//scoring
		
		g.setFont(f1);
		g.setColor(Color.white);
		g.drawString(" " + bscore, 265, 30);
		g.drawRect(260, 0, 50, 40);
		//reset method
		if(bg.y >= -20) {
			bg.reset();
		}
		//boundaries for where car can go
		if(car.x <= 0) {
			car.x = 0;
		}
		if(car.x >= 258) {
			car.x = 258;
		}
		if(car.y <= 0) {
			car.y = 0;
		}
		if(car.y >= 490) {
			car.y = 490;
		}
		//blockade reset
		if(blockade.y >700) {
			blockade.reset();
			bscore++;
		}
		// possible spawn locations for the horse and police car
		int[] xpos = {0, 190};
		
		//respawning
		if(animal.y > 600) {
			animal.x = xpos[(int) ((Math.random()*2) +0 )];
			animal.y = (int) ((Math.random()*800) - 900);
			bscore++;
		}
		if(police.y > 600) {
			police.x = xpos[(int) ((Math.random()*2) +0 )];
			police.y = (int) ((Math.random()*1600) - 2500);
			bscore++;
		}
		
		//collision
		if(car.x + 52 >= animal.x && car.x <= animal.x + 80 && car.y <= animal.y + 95 && car.y +110 >= animal.y  ) {
		
			pgO(g);
		}
		if(car.x + 52 >= police.x && car.x <= police.x + 120 && car.y <= police.y + 80 && car.y +110 >= police.y  ) {
			pgO(g);
		}
		if(car.x + 52 >= blockade.x && car.x <= blockade.x + 50 && car.y <= blockade.y + 40 && car.y +110 >= blockade.y  ) {
			pgO(g);
		}
		// makes sure that the police car and animal objects don't collide with each other
		if(animal.y <= police.y + 80 && animal.y + 95 >= police.y && animal.x <= police .x + 120 && animal.x + 80 > police.x) {
			animal.x = xpos[(int) ((Math.random()*2) +0 )];
			animal.y = (int) ((Math.random()*800) - 900);
		}
		//makes it so that the three objects does not come towards the blue car all at the same time, making an impossible obstacle to pass
		if(police.y+ 280 <=100 && animal.y + 95 <= police.y + 280 && animal.y >= police.y - 200 && blockade.y + 40 <= police.y + 280 && blockade.y >= police.y - 200  ) {
			police.x = xpos[(int) ((Math.random()*2) +0 )];
			police.y = (int) ((Math.random()*1600) - 2500);
		}
		
		
	}
		public static void main(String[] arg) {
		Frame f = new Frame();
	}
		//stops all objects and returns score
		private String gameOver() {
			bg.vy = 0;
		    car.vx = 0;
			police.vy = 0;
			animal.vy = 0;
			car.vy=0;
			blockade.vy = 0;
			return "Score: " + bscore;
			
		}
		private void pgO(Graphics g) {
		  super.paintComponent(g);
		  //creates a game over screen that is shows what was returned from the method gameOver
		  	g.setColor(Color.black);
			g.fillRect(0,0,310,600);
			g.setColor(Color.red);
			g.drawString(gameOver(),110,200);
		} 
	
	public Frame() {
		JFrame f = new JFrame("Drift Simulator");
		f.setSize(new Dimension(310, 600));
		f.setBackground(Color.blue);
		f.add(this);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		f.addMouseListener(this);
		f.addKeyListener(this);
		Timer t = new Timer(16, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
			System.out.println(arg0.getKeyCode());
			// keys codes to make the car go left and right and up and down yet will only work if gameOver has not been called upon
			if(animal.vy != 0) {
			if(arg0.getKeyCode() == 37) {
				car.left();
			}
			if(arg0.getKeyCode() == 39) {
				car.right();
			}
			if(arg0.getKeyCode() == 38) {
				car.up();
			}
			if(arg0.getKeyCode() == 40) {
				car.down();
			}
			
			}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyCode());
		//this makes it so that when the key is released, the car will stop and keep it from going left,up,down or right forever
		if(animal.vy != 0) {
		if(arg0.getKeyCode() == 37) {
			car.vx = 0;
		}
		if(arg0.getKeyCode() == 39) {
			car.vx = 0;
		}
		if(arg0.getKeyCode() == 38) {
			car.vy=0;
		}
		if(arg0.getKeyCode() == 40) {
			car.vy=0;
		}
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
