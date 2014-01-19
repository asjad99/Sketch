import java.awt.Color;
		import java.awt.Graphics2D;
		import java.awt.Point;
		import java.awt.Shape;
import java.awt.geom.*;


public class fillBucket extends Shape1{
	rectangle R= new rectangle();
	drawRoundRect RR= new drawRoundRect();
	drawOval O=new drawOval();
	
	private Rectangle2D shape1 = R.getShape();
	private Shape shape2 = RR.getShape();
	private 	Shape shape3 = O.getShape();
	
	public void paintRect( Graphics2D gc){ 
		
		
		
		if(shape1!=null){
		//gc.setColor(color);
		gc.setPaint(Color.red);
		gc.fill(R.getShape());
		}
		
		if(shape2!=null){
		gc.setPaint(Color.blue);
		gc.fill(shape2);
		}
		
		if(shape3!=null){
		gc.setPaint(Color.orange);
		gc.fill(shape3);
		}
		if(shape1==null ){ 
			System.out.println(" kch kr haris !!!");
			
		}
		if(shape2==null ){ 
			System.out.println("  haris !!!");
			
		}
		if(shape3==null ){ 
			System.out.println("  kr haris !!!");
			
		}
		
		
		
	}



}
