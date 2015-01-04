import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;


public class rectangle extends Shape1{

	Rectangle2D shape;
	//Color color_array[] = new Color[rMAXLINES];
	int stroke_array[] = new int[rMAXLINES];
	public void paintRect( Graphics2D gc,Color color,int stroke){
		
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
				 Rectangle2D rectangle1 = new Rectangle2D.Float(rstarts[i].x, rstarts[i].y, rends[i].x, rends[i].y);
				 
				 gc.draw(rectangle1); 
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
			Rectangle2D	rectangle= new Rectangle2D.Float(ranchor.x, ranchor.y, rcurrentpoint.x, rcurrentpoint.y);
		gc.draw(rectangle); 
		shape=rectangle;
		color_array[rcurrline] = gc.getColor();
		}

	
	}

	public Rectangle2D getShape(){ 
   		return shape;
   		 
    	 }
}


