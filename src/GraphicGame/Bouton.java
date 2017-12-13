package GraphicGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bouton extends JButton implements MouseListener {
	private String name;
	private Color c;
	
	public Bouton(String str){
		super(str);
		this.name = str;
		this.addMouseListener(this);
		this.c = Color.white;
	}
	
	public void paintComponent(Graphics g){
		g.setColor(c);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.black);
		FontMetrics fm = g.getFontMetrics();
		int x = (getWidth()-fm.stringWidth(name))/2;
		int y = (getHeight()-fm.getHeight())/2 + fm.getAscent();
		//g.drawString(this.name, this.getWidth()/2 - (this.getWidth()/4), (this.getHeight()/2) + 5);
		g.drawString(this.name, x, y);
	}
	
	public void setName(String n){
		this.name = n;
	}
	
	//M�thode appel�e lors du clic de souris
	  public void mouseClicked(MouseEvent event) { }


	  //M�thode appel�e lors du survol de la souris
	  public void mouseEntered(MouseEvent event) {
		  this.c = Color.yellow;
	  }


	  //M�thode appel�e lorsque la souris sort de la zone du bouton
	  public void mouseExited(MouseEvent event) {
		  this.c = Color.white;
	  }


	  //M�thode appel�e lorsque l'on presse le bouton gauche de la souris
	  public void mousePressed(MouseEvent event) {
		  this.c = Color.red;
	  }

	  //M�thode appel�e lorsque l'on rel�che le clic de souris
	  public void mouseReleased(MouseEvent event) {
		  this.c = Color.white;
	  }       

}
