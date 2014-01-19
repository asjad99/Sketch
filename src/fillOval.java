import java.awt.Color;
import java.awt.Graphics;


public class fillOval extends Shape1 {
	

	public void paintRect(Graphics g,Color color){
		
		for (int i=0; i<rcurrline;i++){
			if(color_array[i]!=null){
				g.setColor( color_array[i]);}
			g.fillOval(rstarts[i].x, rstarts[i].y, rends[i].x, rends[i].y);
		
				}
	if (rcurrentpoint!= null)
	{	
		g.setColor(color);
		//g.drawArc(ranchor.x, ranchor.y, rcurrentpoint.x, rcurrentpoint.y,10,10);
		g.fillOval(ranchor.x, ranchor.y,rcurrentpoint.x, rcurrentpoint.y);
		color_array[rcurrline] = g.getColor();
	}		
	}
	
	

}
