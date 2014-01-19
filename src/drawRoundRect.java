
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;


    class drawRoundRect extends Shape1{
    	
    	Shape shape1;
    	int stroke_array[] = new int[rMAXLINES];
    	

    	 public void paintLine(Graphics2D g2,Color color,int stroke){
    		 //Graphics2D g2 = (Graphics2D) g;
    		
    		 for (int i=0; i<rcurrline;i++){
    			 if(color_array[i]!=null){
 					g2.setColor( color_array[i]);}
    			 if(stroke_array[i]==0)
  				   g2.setStroke(new BasicStroke(1.0f));
  			   if(stroke_array[i]==1)
  				   g2.setStroke(new BasicStroke(4.0f));
  			   if(stroke_array[i]==2)
  				   g2.setStroke(new BasicStroke(5.0f));
  			   if(stroke_array[i]==3)
  				   g2.setStroke(new BasicStroke(7.0f));
  			   if(stroke_array[i]==4)
  				   g2.setStroke(new BasicStroke(8.0f));
    		 
    			RoundRectangle2D roundrect1 = new RoundRectangle2D.Float(rstarts[i].x, rstarts[i].y, rends[i].x, rends[i].y,rends[i].x/3, rends[i].y/3);
    							
    			g2.draw(roundrect1);
    		 }
    		
    	    	    
    		if (rcurrentpoint!= null){
    			g2.setColor(color);
    			
    			switch (stroke)
    			{
    			case 0:{
    				g2.setStroke(new BasicStroke(1.0f));
    			
    				stroke_array[rcurrline]= 0;
    				break;
    			}
    			case 1:{
    				g2.setStroke(new BasicStroke(4.0f));
    			
    				stroke_array[rcurrline]= 1;
    				break;
    			}
    			case 2:{
    				g2.setStroke(new BasicStroke(5.0f));
    			
    				stroke_array[rcurrline]= 2;
    				break;
    			}
    			case 3:{
    				g2.setStroke(new BasicStroke(7.0f));
    			
    				stroke_array[rcurrline]= 3;
    				break;
    			}
    			case 4:{
    				g2.setStroke(new BasicStroke(8.0f));
    			
    				stroke_array[rcurrline]= 4;
    				break;
    			}}
    			RoundRectangle2D roundrect = new RoundRectangle2D.Float(ranchor.x, ranchor.y, rcurrentpoint.x, rcurrentpoint.y,rcurrentpoint.x/3, rcurrentpoint.y/3);   
    			g2.draw(roundrect); 
    			shape1=roundrect;
    			color_array[rcurrline] = g2.getColor();
    		}
    	 }
    	 
    	 
    	 public Shape getShape(){ 
      		 
    	   		return shape1;
    			
    	    		 
    	    		 
    	    	 }
    	 
    	 
    	    }
    