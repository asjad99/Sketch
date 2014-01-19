import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;


public class pencil {
	 int prevx;
	 int prevy; 
	 int cux;
 int cuy;
int count=-1;
int prevcount=0;
	int j;
	final int MAXLINES =10000;
	Point pen_array[] = new Point[MAXLINES];
	int iterator=0;
	Color color_array[] = new Color[MAXLINES];
	int stroke_array[] = new int[MAXLINES];

	
	 public void paintLine(Graphics g, int flag, Color color,int stroke){
		 
		 Graphics2D g2 = (Graphics2D)g;
		 g.setColor(Color.black);
		
		 if(flag!=20){
			 for (int j=0; j<iterator-1;j++){
				
				 if((pen_array[j+1].x==-1)&&(pen_array[j+1].y==-1))
				 {
					j++;
					j++;
					//j++;
				// g.setColor(color_array[j]);
				//g2.drawLine(pen_array[j].x, pen_array[j].y,pen_array[j+1].x,pen_array[j+1].y);
				}
				// else{
				 if(color_array[j]!=null){
						g2.setColor( color_array[j]);}
					 if(stroke_array[j]==0)
						 g2.setStroke(new BasicStroke(1.0f));
					   if(stroke_array[j]==1)
						   g2.setStroke(new BasicStroke(4.0f));
						
					   if(stroke_array[j]==2)
						   g2.setStroke(new BasicStroke(5.0f));
					   if(stroke_array[j]==3)
						   g2.setStroke(new BasicStroke(7.0f));
					   if(stroke_array[j]==4)
						   g2.setStroke(new BasicStroke(8.0f));
					   g.setColor(color_array[j]);
						g2.drawLine(pen_array[j].x, pen_array[j].y,pen_array[j+1].x,pen_array[j+1].y);
				 //}
		 }
		 }
//  g2.setXORMode(xorColor);
			
	if(flag==20){	 
		if(count>prevcount){
		pen_array[iterator]= new Point(-1,-1);
			iterator++;
			//pen_array[iterator]= new Point(-1,-1);
			//iterator++;
			prevcount=count;
		}
		//g2.setColor(Color.black);
		g.setColor(color);
		switch (stroke)
		{
		case 0:{
			 g2.setStroke(new BasicStroke(1.0f));
		
			stroke_array[iterator]= 0;
			break;
		}
		case 1:{
			 g2.setStroke(new BasicStroke(4.0f));
		
			stroke_array[iterator]= 1;
			break;
		}
		case 2:{
			 g2.setStroke(new BasicStroke(5.0f));
		
			stroke_array[iterator]= 2;
			break;
		}
		case 3:{
			 g2.setStroke(new BasicStroke(7.0f));
		
			stroke_array[iterator]= 3;
			break;
		}
		case 4:{
			  g2.setStroke(new BasicStroke(8.0f));
		
			stroke_array[iterator]= 4;
			break;
		}}
		
		g2.drawLine(prevx, prevy,cux,cuy);
	pen_array[iterator]= new Point(prevx,prevy);
	color_array[iterator] = g.getColor();
	iterator++;
		prevx=cux;
  		prevy=cuy;}
  		
	    
}
}



