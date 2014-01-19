import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

    class drawLine extends Shape1{
    	
    	int stroke_array[] = new int[rMAXLINES];
    	
    	BasicStroke strokes =new BasicStroke(10.0f);
		//gc.setStroke(new BasicStroke(10.0f));
    	
    	
    	 public void paintLine(Graphics2D gc,Color color,int stroke){
    		// Graphics2D g2 = (Graphics2D)g;
    		
    		
    		//  Graphics2D gc = img.createGraphics();
    	      // gc.setColor(Color.black);
    //g1.setColor(Color.white);
 	//g1.fillRect(0, 0, this.getWidth(),this.getHeight());
    		 
    		 
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
    		 gc.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                        RenderingHints.VALUE_ANTIALIAS_ON);
    			gc.drawLine(rstarts[i].x, rstarts[i].y, rends[i].x, rends[i].y);    									
    		
    		 }
    		
    	      //  g.setColor(Color.black);
    		if (rcurrentpoint!= null){
    			gc.setColor(color);
    		 gc.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                        RenderingHints.VALUE_ANTIALIAS_ON);
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
    		}
    			
    			
    			
    		}
		 	//}
    		gc.drawLine(ranchor.x, ranchor.y, rcurrentpoint.x, rcurrentpoint.y); 
			color_array[rcurrline] = gc.getColor();
    		}
    	    }  
    	    }