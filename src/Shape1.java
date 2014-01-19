import java.awt.Color;
import java.awt.Point;

import javax.swing.JPanel;


public class Shape1 extends JPanel {

	final int rMAXLINES =1000;
	Point rstarts[] = new Point[rMAXLINES];
	Point rends[]=new Point[rMAXLINES];
	Point ranchor;
	Point rcurrentpoint;
	int rcurrline=0;
	Color color_array[] = new Color[rMAXLINES];
	
	void addRect(int x, int y){
		rstarts[rcurrline]=ranchor;
		rends[rcurrline]= new Point(x,y);
		rcurrline++;
		rcurrentpoint= null;
		repaint();
	}
	
}
