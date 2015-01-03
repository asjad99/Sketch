import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import java.awt.Graphics;


class drawingPanel extends JPanel {
	private int flag = 0;
	 int oflag=0;
	 int clear=0;
	 int zflag=0;
	 String style = "TimesRoman" ;
		int size = 10 ;

	JFileChooser fc = new JFileChooser("Save");
	
	String input;
	private Color color = new Color(0,0,0);
	private Color gcolor = new Color(0,0,0);
	private Color bcolor = new Color(255,255,255);
	private Color cc = new Color(255,255,255);
	int stoke=0;
	
	int done=0;
	 double x = 15, y = 50, w = 70, h = 70;
	private Color  xorColor  = new Color(255,255,255);
	Point first;
	Point second;
	
    

	rectangle dS=new rectangle();
	drawString dS1=new drawString(input);
	
	drawRoundRect dRR=new drawRoundRect();
	 drawFillRect dFR=new drawFillRect();
	 drawOval dO=new drawOval();
	 drawLine dL=new drawLine();

	 drawArc dA = new drawArc();
	 fillOval fO = new fillOval();
	 Eraser eR = new Eraser();
	fillBucket fB = new fillBucket();
	rbrush rb = new rbrush();
	pencil pn = new pencil();
	
	 BufferedImage open_Image;
	
	 BufferedImage off_Image = new BufferedImage(1200,800, BufferedImage.TYPE_INT_ARGB);
	
	

	 public drawingPanel() {
		
		
	
        	setBorder(BorderFactory.createLineBorder(Color.black));
        
        	addMouseListener(new MouseAdapter() {
        	
        	 public void mousePressed(MouseEvent e) {
            	if(flag==1){
            		rb.count++;
            	
            		rb.prevx=e.getX();
           		rb.prevy=e.getY();
            		
            	}
            	
            	
            	if(flag==2){
            	dS.ranchor = new Point(e.getX(),e.getY());
            	//System.out.println(""+e.getX()+"y="+e.getY());
            	    	 }
            
            if(flag==3){
            	dFR.ranchor = new Point(e.getX(),e.getY());}
            if(flag==4){
            	dO.ranchor = new Point(e.getX(),e.getY());}
            if(flag==5){
            	dRR.ranchor = new Point(e.getX(),e.getY());}
            if(flag==7){
            	dL.ranchor = new Point(e.getX(),e.getY());
            	}
            if(flag==8){
            	first= new Point(e.getX(),e.getY());
            	}
            if(flag==11){ 
            	
            	repaint();
            }
            if(flag==12){
  		dA.ranchor = new Point(e.getX(),e.getY());
  		}
            if(flag==13){
              	fO.ranchor = new Point(e.getX(),e.getY());
              	}
            if(flag==14){	
        		 eR.prevx=e.getX();
        		 eR.prevy=e.getY();
        	}
            if(flag==20){
            		pn.count++;

            		pn.prevx=e.getX();
           		pn.prevy=e.getY();
            	
            	}

            }
            
     	public void mouseReleased(MouseEvent e) {
        		if(flag==1){
        	       
        		}
        		if(flag==2){        			
        		dS.addRect((e.getX())-(dS.ranchor.x),(e.getY())-(dS.ranchor.y));}
        	
        		if(flag==3){
            		dFR.addRect((e.getX())-(dFR.ranchor.x),(e.getY())-(dFR.ranchor.y));}
        		if(flag==4){
            
        		dO.addRect((e.getX())-(dO.ranchor.x),(e.getY())-(dO.ranchor.y));}
        		
        		if(flag==5){
            		dRR.addRect((e.getX())-(dRR.ranchor.x),(e.getY())-(dRR.ranchor.y));}
        		if(flag==7){
            		dL.addRect(e.getX(),e.getY());
        			}
        		 if(flag==8){
                 	second= new Point(e.getX(),e.getY());
                 	repaint();
                 	}
        		 if(flag==9){
        			dS1.ranchor = new Point(e.getX(),e.getY());
        		        setFlag(0);
        		         repaint();
        		 }
        		 if(flag==12){        			
              		dA.addRect((e.getX())-(dA.ranchor.x),(e.getY())-(dA.ranchor.y));}
        		 if(flag==13){
             		fO.addRect((e.getX())-(fO.ranchor.x),(e.getY())-(fO.ranchor.y));}
        	}
        	
        	}   );
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
            	 
            	if(flag==1){
			rb.cux=e.getX();
             		rb.cuy=e.getY();
            	repaint();
            	
          		 }
            	if(flag==2){	
            	dS.rcurrentpoint = new Point((e.getX())-(dS.ranchor.x),(e.getY())-(dS.ranchor.y));
            	
               	repaint();}
            	if(flag==3){	
                	dFR.rcurrentpoint = new Point((e.getX())-(dFR.ranchor.x),(e.getY())-(dFR.ranchor.y));
                   	repaint();}
            	if(flag==4){	
                	dO.rcurrentpoint = new Point((e.getX())-(dO.ranchor.x),(e.getY())-(dO.ranchor.y));
             
                   	repaint();}
            	if(flag==5){	
                	dRR.rcurrentpoint = new Point((e.getX())-(dRR.ranchor.x),(e.getY())-(dRR.ranchor.y));
                   	repaint();}
            	if(flag==7){	
                	dL.rcurrentpoint = new Point(e.getX(),e.getY());
                	
                	repaint();
                   	}
            
            	if(flag==12){	
                	dA.rcurrentpoint = new Point((e.getX())-(dA.ranchor.x),(e.getY())-(dA.ranchor.y));
                   	repaint();}
            	if(flag==13){	
                	fO.rcurrentpoint = new Point((e.getX())-(fO.ranchor.x),(e.getY())-(fO.ranchor.y));
                   	repaint();}
            	if(flag==14){
           		 eR.cux=e.getX();
           		eR.cuy=e.getY();   
	   		repaint();
       		 }
            	if(flag==20){
     			pn.cux=e.getX();
            		pn.cuy=e.getY();
           		repaint();
           	
         	}
                
            }
        });
     
        
               
    }
  
   public void clear(){
	   repaint();
	   done=0;
	   setFlag(0);
	   bsetColor(cc);
	   for (int i=0; i<dS.rcurrline;i++){
		//   dS.color_array=null;
			dS.rstarts[i].x=0; dS.rstarts[i].y=0; dS.rends[i].x=0; dS.rends[i].y=0;
		}
	   for (int i=0; i<dRR.rcurrline;i++){
		//   dRR.color_array=null;
			dRR.rstarts[i].x=0; dRR.rstarts[i].y=0; dRR.rends[i].x=0; dRR.rends[i].y=0;
		}
	   for (int i=0; i<dFR.rcurrline;i++){
		 //  dFR.color_array=null;
			dFR.rstarts[i].x=0; dFR.rstarts[i].y=0; dFR.rends[i].x=0; dFR.rends[i].y=0;
		}
	   for (int i=0; i<dO.rcurrline;i++){
		 //  dO.color_array=null;
			dO.rstarts[i].x=0; dO.rstarts[i].y=0; dO.rends[i].x=0; dO.rends[i].y=0;
		}
	   for (int i=0; i<dL.rcurrline;i++){
		 //  dL.color_array=null;
			dL.rstarts[i].x=0; dL.rstarts[i].y=0; dL.rends[i].x=0; dL.rends[i].y=0;
		}
	   for (int i=0; i<dS1.rcurrline;i++){
		   //dS1.color_array=null;
			dS1.rstarts[i].x=0; dS1.rstarts[i].y=0; 
		}
	   for (int i=0; i<dA.rcurrline;i++){
		  // dA.color_array=null;
		  // dS.color_array=null;
			dA.rstarts[i].x=0; dA.rstarts[i].y=0; dA.rends[i].x=0; dA.rends[i].y=0;
		}
	   for (int i=0; i<fO.rcurrline;i++){
		  // fO.color_array=null;
			fO.rstarts[i].x=0; fO.rstarts[i].y=0; fO.rends[i].x=0; fO.rends[i].y=0;
		}
	   for (int i=0; i<rb.iterator;i++){
		 //  rb.color_array=null;
			//fO.rstarts[i].x=0; fO.rstarts[i].y=0; fO.rends[i].x=0; fO.rends[i].y=0;
			rb.pen_array[i].x=0; 
			rb.pen_array[i].y=0;
	   }
	   for (int i=0; i<pn.iterator;i++){
		  // pn.color_array=null;
			//fO.rstarts[i].x=0; fO.rstarts[i].y=0; fO.rends[i].x=0; fO.rends[i].y=0;
			pn.pen_array[i].x=0; 
			pn.pen_array[i].y=0;
	   }
	   for (int i=0; i<eR.iterator;i++){
		   
			//fO.rstarts[i].x=0; fO.rstarts[i].y=0; fO.rends[i].x=0; fO.rends[i].y=0;
			eR.pen_array[i].x=0; 
			eR.pen_array[i].y=0;
	   }

	   repaint();

   }
	
 
 public void paintComponent(Graphics g) {
	
	super.paintComponent(g);   
	 AffineTransform transformer = new AffineTransform();
	 AffineTransform transformer1 = new AffineTransform();
	 AffineTransform transformer2 = new AffineTransform();
	 AffineTransform transformer3 = new AffineTransform();
	 
	
	 Graphics2D gc;
	 Graphics2D g21 = (Graphics2D)g; 

	  gc = off_Image.createGraphics();


  if((flag==8 || done==1)&& (((flag!=20)&&(oflag==0))&&(flag!=1))){ 	
	Gradient_Paint(gc);
      }
   else 
    	if((flag!=20)&&(flag!=1)){
    		if(oflag==1){
    		 g21.drawImage(open_Image, 0,0,null);
    			}
    		else{    				
    			  		
    		  gc.setColor(bcolor);
    		  gc.fillRect(0, 0, 1200,800);
    		  }
    }
    
    if (flag!=6 || flag==11){
    	dFR.paintRect(gc,color);
    dS1.paintRect(gc,color,input,style,size);
    
  
    // dp.paintLine(gc,flag,color);
 	
     rb.paintLine(gc,flag,color,stoke);
     pn.paintLine(gc, flag, color, stoke);
     dS.paintRect(gc,color,stoke);     
     dO.paintOval(gc,color,stoke); 
     dRR.paintLine(gc,color,stoke);
     dL.paintLine(gc,color,stoke);
    
     dA.paintRect(gc,color,stoke);
     fO.paintRect(gc,color);
     eR.paintLine(gc,flag);
     
    
    }

    

   if(oflag==1){
    g21.drawImage(open_Image, 0,0,null);
   }
   else{
	   if(zflag==1){
	   transformer.scale(2,2);
	   g21.setTransform(transformer);}
	  
	   if(zflag==0){
	   transformer1.scale(1,1);
	   g21.setTransform(transformer1);}
	   
   if(zflag==2){
	   transformer2.scale(1.5,1.5);
	   g21.setTransform(transformer2);}
   if(zflag==3){
	   transformer3.scale(4,4);
	   g21.setTransform(transformer3);}

   g21.drawImage(off_Image, 0,0,null);
   }
}
 

public void setFlag(int x){
	this.flag=x;
}

public void setFlag1(int x,String input){
	this.flag=x;
	this.input=input;
}
public void setColor(Color color)
{
	this.color = color;
}

public void gsetColor(Color color)
{
	this.gcolor = color;
}
public void bsetColor(Color color)
{
	this.bcolor = color;
}
public void setStoke (int stoke)
{
	this.stoke = stoke;
}

public void setFontStyle(String style)
{
	this.style = style;
}
public void setFontSize(int size)
{
	this.size = size;
}



public void saveimage(){
	
    
	BufferedImage bi =off_Image; 
    File saveFile = new File("mouse1.png");
	 int result =fc.showSaveDialog(this);
	 if (result == JFileChooser.APPROVE_OPTION) {
		 
		saveFile = fc.getSelectedFile();
		 
		 try {
	            ImageIO.write(bi, "png", saveFile);
	        } catch (IOException ex) {
	        }
	 
	 }
	
	 repaint();

}

public void openimage(){
	 int result =fc.showOpenDialog(this);
	 if (result == JFileChooser.APPROVE_OPTION){
		 File file = fc.getSelectedFile();
           
		
		 try {
			 open_Image= ImageIO.read(file);
		          
		       } catch (IOException e) {
		       System.out.println("Image not found:Error");
		       }
		 
		 
		 
	 }
	 repaint();
}

public void Gradient_Paint(Graphics2D gc){

	GradientPaint gel = new GradientPaint(50,50, Color.WHITE,1200,1200, gcolor,true);
  	gc.setPaint(gel);	
	gc.fillRect(0, 0, 1200,800);
	done=1;
		
	}



}
