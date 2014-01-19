import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class drawOval extends Shape1{
	
	Ellipse2D shape2;
	
	//Color color_array[] = new Color[rMAXLINES];
	int stroke_array[] = new int[rMAXLINES];
	
	
	public void paintOval(Graphics2D gc,Color color,int stroke){
		
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
			//g.drawOval(rstarts[i].x, rstarts[i].y, rends[i].x, rends[i].y);
			Ellipse2D oval1 = new Ellipse2D.Double(rstarts[i].x, rstarts[i].y, rends[i].x, rends[i].y);
			gc.draw(oval1);
		}

	if (rcurrentpoint!= null){
		gc.setColor(color);
		color_array[rcurrline] = gc.getColor();
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
		//g.drawOval(ranchor.x, ranchor.y, rcurrentpoint.x, rcurrentpoint.y);
		Ellipse2D oval = new Ellipse2D.Double(ranchor.x, ranchor.y, rcurrentpoint.x, rcurrentpoint.y);
		gc.draw(oval);
		shape2=oval;
	
	}
	 
	
	}
	public Ellipse2D getShape(){ 
 		 
   		return shape2;
		
    		 
    		 
    	 }
}