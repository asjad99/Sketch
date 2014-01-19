import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;


public class Eraser {
	
	int prevx;
	 int prevy;
	 int cux;
int cuy;

	
	final int MAXLINES =1000;
	Point pen_array[] = new Point[MAXLINES];
	int iterator=0;

	
	 public void paintLine(Graphics g, int flag){
		 
		 Graphics2D g2 = (Graphics2D)g;
		 g.setColor(Color.white);
		// if(flag!=1){
			 for (int i=0; i<iterator-1;i++){
				 g2.fillRect(pen_array[i].x, pen_array[i].y,20,20);
		 }
		//}
// g2.setXORMode(xorColor);
			
	if(flag==14){	 
		g2.setColor(Color.white);
		g2.fillRect(prevx, prevy,20,20);
		g2.setColor(Color.black);
		g2.drawRect(prevx, prevy,20,20);
	pen_array[iterator]= new Point(prevx,prevy);
	iterator++;
	prevx=cux;
 	prevy=cuy;
 		
 	}
 		
	    
}

}
