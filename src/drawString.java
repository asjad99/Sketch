import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import java.awt.Point;

import javax.swing.JPanel;

public class drawString extends JPanel{
	final int rMAXLINES =1000;
	Point rstarts[] = new Point[rMAXLINES];

	Point ranchor;
	String input;
	Color color_array[] = new Color[rMAXLINES];
	String saveString[] = new String[rMAXLINES] ;
	String fontStyle[] = new String[rMAXLINES];
	int fontSize[] = new int[rMAXLINES];
	int rcurrline=0;
	Point rcurrentpoint;
	
	void addString(String input){
		
		
	}
	public drawString(String input)
	{
		this.input = input;
	}
	//Point rcurrentpoint;

	
	
	//Color color_array[] = new Color[rMAXLINES];
	//int j = 0;

	

	public void paintRect( Graphics2D gc,Color color,String input,String style,int size){
		
		//    Graphics2D g2d = (Graphics2D) g;
		// int fontSize = 50;
		for (int i=0; i<rcurrline;i++){
			if(color_array[i]!=null){
				gc.setColor( color_array[i]);}
		//	gc.setColor( color_array[i]);
			Font font = new Font(fontStyle[i], Font.PLAIN, fontSize[i]);
			gc.setFont(font);
		    gc.drawString(saveString[i],rstarts[i].x, rstarts[i].y);
		   
		}
		 
		   
		   if ( ranchor!= null){
				gc.setColor(color);
				//rstarts[rcurrline]= new Point(ranchor.x, ranchor.y);
				//saveString[rcurrline] = input;
				//rcurrline++;
				 //Font font = new Font("TimesRoman", Font.PLAIN, 25);
				// gc.setFont(font);
			//	 gc.setFont(new Font(style, Font.PLAIN, size));
				
				  gc.setFont(new Font(style, Font.PLAIN, size));
							    gc.drawString(input,ranchor.x, ranchor.y);
				//addString(ranchor.x,ranchor.y,input);
				    fontStyle[rcurrline] = style;
					 fontSize[rcurrline] = size;
					 rstarts[rcurrline]= new Point(ranchor.x,ranchor.y);
						saveString[rcurrline] = input;
						color_array[rcurrline] = gc.getColor();
						rcurrline++;
						ranchor=null;
						
					// dS.addString(e.getX(),e.getY(),input);
					 //addString(input);
		}
		
	//	gc.drawLine(10, 10, 50, 50);
		 //if(flag==6){
			
		//if(chk==0){	
		
		//}
				//color_array[rcurrline] = gc.getColor();
				
			
			//}
		

	 
	
	}

	
}
	
