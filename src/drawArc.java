import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Arc2D;

import javax.swing.JFrame;


public class drawArc extends Shape1{

	int stroke_array[] = new int[rMAXLINES];
	
	
	
	public void paintRect( Graphics2D gc, Color color,int stroke){
		
		//    Graphics2D g2d = (Graphics2D) g;
		
		
		//gc.setColor(Color.blue);
	//	gc.drawLine(10, 10, 50, 50);
		 //if(flag==6){
			
			
			for (int i=0; i<rcurrline;i++){
				if(color_array[i]!=null){
					gc.setColor( color_array[i]);}
				if(stroke_array[i]==0)
					   gc.setStroke(new BasicStroke(1.0f));
				   if(stroke_array[i]==1)
					   gc.setStroke(new BasicStroke(4.0f));
				   if(stroke_array[i]==2)
					   gc.setStroke(new BasicStroke(5.0f));
				   if(stroke_array[i]==3)
					   gc.setStroke(new BasicStroke(7.0f));
				   if(stroke_array[i]==4)
					   gc.setStroke(new BasicStroke(8.0f));
				Arc2D.Double top = new Arc2D.Double(rstarts[i].x, rstarts[i].y, rends[i].x, rends[i].y,15,150,Arc2D.OPEN);
				 gc.draw(top); 
			}
		//g.setColor(Color.black);
		if (rcurrentpoint!= null){
			gc.setColor(color);
			
			switch (stroke)
			{
			case 0:{
				gc.setStroke(new BasicStroke(1.0f));
			
				stroke_array[rcurrline]= 0;
				break;
			}
			case 1:{
				gc.setStroke(new BasicStroke(4.0f));
			
				stroke_array[rcurrline]= 1;
				break;
			}
			case 2:{
				gc.setStroke(new BasicStroke(5.0f));
			
				stroke_array[rcurrline]= 2;
				break;
			}
			case 3:{
				gc.setStroke(new BasicStroke(7.0f));
			
				stroke_array[rcurrline]= 3;
				break;
			}
			case 4:{
				gc.setStroke(new BasicStroke(8.0f));
			
				stroke_array[rcurrline]= 4;
				break;
			}}
			Arc2D.Double top = new Arc2D.Double(ranchor.x, ranchor.y, rcurrentpoint.x, rcurrentpoint.y,15,150,Arc2D.OPEN);
		gc.draw(top); 
		color_array[rcurrline] = gc.getColor();
		}

	 
	
	}
}
