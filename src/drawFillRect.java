import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;




public class drawFillRect extends Shape1{
	

	

	
	public void paintRect(Graphics g,Color color){
		g.setColor(Color.black);
		for (int i=0; i<rcurrline;i++){
			if(color_array[i]!=null){
			g.setColor( color_array[i]);}
			g.fillRoundRect(rstarts[i].x, rstarts[i].y, rends[i].x, rends[i].y, rends[i].x/3, rends[i].y/3);
		
				}
	if (rcurrentpoint!= null)
	{	
		
		g.setColor(color);
		//g.drawArc(ranchor.x, ranchor.y, rcurrentpoint.x, rcurrentpoint.y,10,10);
		g.fillRoundRect(ranchor.x, ranchor.y,rcurrentpoint.x, rcurrentpoint.y,rcurrentpoint.x/3, rcurrentpoint.y/3);
		color_array[rcurrline] = g.getColor();
	}		
	}

}
