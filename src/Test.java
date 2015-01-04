import javax.imageio.ImageIO;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.colorchooser.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
import javax.swing.*; 

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;



public class Test extends JFrame implements ActionListener,ItemListener {
	 
	private Color color = Color.black;
	 

ImageIcon buttonIcon1 = new ImageIcon("C:\\icons\\resize\\pencil.png");
ImageIcon buttonIcon2 = new ImageIcon("C:\\icons\\resize\\brush1.png");
ImageIcon buttonIcon3 = new ImageIcon("C:\\icons\\reszie\\fcircle.png");
ImageIcon buttonIcon4 = new ImageIcon("C:\\icons\\resize\\rcircle.png");
ImageIcon buttonIcon5 = new ImageIcon("C:\\icons\\resize\\eraser.png");
ImageIcon buttonIcon6 = new ImageIcon("C:\\icons\\resize\\frectangle.png");
ImageIcon buttonIcon7 = new ImageIcon("C:\\icons\\resize\\text.png");
ImageIcon buttonIcon8 = new ImageIcon("C:\\icons\\resize\\gradient.png");
ImageIcon buttonIcon9 = new ImageIcon("C:\\icons\\resize\\zoom.png");
ImageIcon buttonIcon10 = new ImageIcon("C:\\icons\\resize\\eraser.png");
ImageIcon buttonIcon11 = new ImageIcon("C:\\icons\\resize\\fbucket.png");
ImageIcon buttonIcon12 = new ImageIcon("C:\\icons\\resize\\rectangle.png");
ImageIcon buttonIcon13 = new ImageIcon("C:\\icons\\resize\\rrectangle.png");
ImageIcon buttonIcon14 = new ImageIcon("C:\\icons\\resize\\fcircle.png");
ImageIcon buttonIcon15 = new ImageIcon("C:\\icons\\resize\\line1.png");
ImageIcon buttonIcon16 = new ImageIcon("C:\\icons\\resize\\s11.png");
ImageIcon buttonIcon17 = new ImageIcon("C:\\icons\\resize\\s2.png");
ImageIcon buttonIcon18 = new ImageIcon("C:\\icons\\resize\\s3.png");
ImageIcon buttonIcon19 = new ImageIcon("C:\\icons\\resize\\s4.png");
ImageIcon buttonIcon20 = new ImageIcon("C:\\icons\\resize\\s5.png");
ImageIcon buttonIcon21 = new ImageIcon("C:\\icons\\resize\\arc.png");

private Color  cc = new Color(255,255,255);
//private JButton penButton = new JButton(buttonIcon);
//penButton.setMaximumSize(new Dimension(5,5));  
//penButton.SetPrefferedSize=(new Dimension(10,10));

//Icon tigerIcon = new ImageIcon("SmallTiger.gif");
private JButton pen = new JButton(buttonIcon2);


private JButton round_rectangle = new JButton( buttonIcon13);
private JButton text = new JButton(buttonIcon7);
private JButton rectangle = new JButton(buttonIcon12 );
private JButton filled_rectangle = new JButton(buttonIcon6);

private JButton  line = new JButton(buttonIcon15);
private JButton zoom = new JButton(buttonIcon9);
private JButton gradient = new JButton( buttonIcon8);
private JButton Brush = new JButton(buttonIcon1);
private JButton oval = new JButton(buttonIcon4);
private JButton fillBucket = new JButton(buttonIcon11);
private JButton DrawArc = new JButton( buttonIcon21);
private JButton FillOval = new JButton(buttonIcon14);
private JButton EraserButton = new JButton(buttonIcon10);

private JButton b5= new JButton( buttonIcon16);
private JButton b1= new JButton(buttonIcon17);
private JButton b2= new JButton(buttonIcon18);
private JButton b3= new JButton(buttonIcon19);
private JButton b4= new JButton(buttonIcon20);


//lineButton.setSize(50,50);

private JButton background       =   new JButton("                 ");
private JButton currentcolor     =   new JButton("                 ");

private JButton blackButton       =   new JButton("       ");
private JButton grayButton       =   new JButton("       ");
private JButton DarkGray      =   new JButton("       ");
private JButton redButton       =   new JButton("       ");
private JButton orangeButton       =   new JButton("       ");
private JButton yellowButton       =   new JButton("       ");
private JButton greenButton       =   new JButton("       ");
private JButton blueButton       =   new JButton("       ");
private JButton magnetaButton       =   new JButton("       ");
private JButton pinkButton       =   new JButton("       ");
private JButton cyanButton       =   new JButton("       ");
private JButton White       =   new JButton("       ");
private JButton LightGray       =   new JButton("       ");
private JButton moreColorButton       =   new JButton(" >> ");
Color cp = new Color(0,0,0);


JToggleButton tb=new JToggleButton("Bold",false);
JToggleButton tb1=new JToggleButton("Italic",false);

private String styleNames[]={"TimesRoman","Arial","Imapct","ALGERIAN"}; 
private String fontSize[]={"10","12","14","16","18","20","25","30","40","50"}; 
JComboBox jlist=new JComboBox(styleNames);
JComboBox jlist1=new JComboBox(fontSize);

JFileChooser chooser;
JFrame frame;

//public static final int CROSSHAIR_CURSOR;

private JPanel drawpanel = new JPanel();
private JPanel drawpanel2 = new JPanel();
private JPanel drawpanel3 = new JPanel();
private JPanel minor_drawpanel = new JPanel();
private JPanel major_drawpanel = new JPanel();
private JPanel major_drawpanel2 = new JPanel();


private JPanel colorpanel = new JPanel();
private JPanel colorpanel2 = new JPanel();
private JPanel colorpanel3 = new JPanel();
private JPanel major_colorpanel = new JPanel();
private JPanel minor_colorpanel = new JPanel();
private JPanel font_panel = new JPanel();
private JPanel upperpanel = new JPanel();

//private JToolBar major_colorpanel  = new JToolBar();

Color array[] = new Color[20];

Icon tigerIcon = new ImageIcon("SmallTiger.gif");
JButton myButton = new JButton("Tiger", tigerIcon);


drawingPanel drp;
JScrollPane scrolls;
Dimension dim= new Dimension(1200,800);

public Test(final drawingPanel drp){
	this.drp=drp;
	scrolls = new JScrollPane(drp,
	        ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
	        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
this.drp=drp;
	

	try {
	    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	 } 
	 catch (Exception e) {
	    e.printStackTrace();
	  }
	Toolkit.getDefaultToolkit().setDynamicLayout(true);

JFrame f = new JFrame();
f.setTitle("AHA Editor");
f.setSize(1300,850);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
f.add(drawpanel);

drawpanel2.add(line);
drawpanel2.add(rectangle);
drawpanel2.add(filled_rectangle);
drawpanel2.add(oval);
drawpanel2.add(round_rectangle);
drawpanel2.add(pen);
drawpanel2.add(zoom);
drawpanel.add(gradient);
drawpanel.add(text);
drawpanel.add(Brush);
drawpanel.add(fillBucket);
drawpanel.add(DrawArc);
drawpanel.add(FillOval);
drawpanel.add(EraserButton);
drawpanel3.add(b5);
drawpanel3.add(b1);
drawpanel3.add(b2);
drawpanel3.add(b3);
drawpanel3.add(b4);


colorpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
colorpanel2.setLayout(new FlowLayout(FlowLayout.LEFT));
colorpanel3.setLayout(new BorderLayout());

minor_colorpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
font_panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
upperpanel.setLayout(new BorderLayout());

redButton.setBackground(Color.red);
blueButton.setBackground(Color.blue);
greenButton.setBackground(Color.green);
magnetaButton.setBackground(Color.magenta);
orangeButton.setBackground(Color.orange);
pinkButton.setBackground(Color.pink);
grayButton.setBackground(Color.gray);
yellowButton.setBackground(Color.yellow);
cyanButton.setBackground(Color.cyan);
blackButton.setBackground(Color.black);
DarkGray.setBackground(Color.DARK_GRAY);
LightGray.setBackground(Color.LIGHT_GRAY);
White.setBackground(Color.WHITE);
currentcolor.setBackground(color);
background.setBackground(Color.white);

White.setBorder(BorderFactory.createLoweredBevelBorder());
blackButton.setBorder(BorderFactory.createLoweredBevelBorder());
DarkGray.setBorder(BorderFactory.createLoweredBevelBorder());
redButton.setBorder(BorderFactory.createLoweredBevelBorder());
orangeButton.setBorder(BorderFactory.createLoweredBevelBorder());
yellowButton.setBorder(BorderFactory.createLoweredBevelBorder());
blueButton.setBorder(BorderFactory.createLoweredBevelBorder());
greenButton.setBorder(BorderFactory.createLoweredBevelBorder());
magnetaButton.setBorder(BorderFactory.createLoweredBevelBorder());
pinkButton.setBorder(BorderFactory.createLoweredBevelBorder());
LightGray.setBorder(BorderFactory.createLoweredBevelBorder());
cyanButton.setBorder(BorderFactory.createLoweredBevelBorder());
grayButton.setBorder(BorderFactory.createLoweredBevelBorder());
moreColorButton.setBorder(BorderFactory.createRaisedBevelBorder());
currentcolor.setBorder(BorderFactory.createRaisedBevelBorder());
background.setBorder(BorderFactory.createRaisedBevelBorder()); 

colorpanel2.add(White);
colorpanel.add(blackButton);
colorpanel.add(DarkGray);
colorpanel.add(grayButton);
colorpanel2.add(LightGray);

colorpanel.add(redButton);
colorpanel.add(orangeButton);
colorpanel.add(yellowButton);
colorpanel.add(blueButton);
colorpanel2.add(greenButton);
colorpanel2.add(magnetaButton);
colorpanel2.add(pinkButton);
colorpanel2.add(cyanButton);
colorpanel2.add(moreColorButton);

colorpanel3.add(background,BorderLayout.EAST);
colorpanel3.add(currentcolor,BorderLayout.CENTER);


font_panel.add(tb);
font_panel.add(tb1);
font_panel.add(jlist);
font_panel.add(jlist1);

major_colorpanel.setLayout(new BorderLayout());
minor_colorpanel.setLayout(new BorderLayout());
minor_colorpanel.add(colorpanel,BorderLayout.NORTH);
minor_colorpanel.add(colorpanel2,BorderLayout.SOUTH);
major_colorpanel.add(colorpanel3,BorderLayout.WEST);
major_colorpanel.add(minor_colorpanel,BorderLayout.CENTER);


drawpanel.setLayout(new BoxLayout(drawpanel, BoxLayout.PAGE_AXIS));
drawpanel2.setLayout(new BoxLayout(drawpanel2, BoxLayout.PAGE_AXIS));
drawpanel3.setLayout(new BoxLayout(drawpanel3, BoxLayout.PAGE_AXIS));
minor_drawpanel.setLayout(new BorderLayout());

minor_drawpanel.add(drawpanel2,BorderLayout.WEST);
minor_drawpanel.add(drawpanel,BorderLayout.CENTER);
//minor_drawpanel.add(drawpanel3,BorderLayout.SOUTH);
major_drawpanel.setLayout(new BorderLayout());
major_drawpanel.add(minor_drawpanel,BorderLayout.NORTH);
major_drawpanel.add(drawpanel3,BorderLayout.CENTER);
major_drawpanel2.setLayout(new BorderLayout());
major_drawpanel2.add(major_drawpanel,BorderLayout.CENTER);





//drawpanel.setLayout(new GridLayout(6,2,3,3));
//drawpanel.setPreferredSize(new Dimension(250,0));


line.addActionListener(this);
rectangle.addActionListener(this);
filled_rectangle.addActionListener(this);
oval.addActionListener(this);
round_rectangle.addActionListener(this);
pen.addActionListener(this);
zoom.addActionListener(this);
gradient.addActionListener(this);
text.addActionListener(this);
//stokeButton1.addActionListener(this);
//stokeButton2.addActionListener(this);
//stokeButton3.addActionListener(this);
//stokeButton4.addActionListener(this);
Brush.addActionListener(this);
fillBucket.addActionListener(this);
DrawArc.addActionListener(this);
FillOval.addActionListener(this);
EraserButton.addActionListener(this);

b1.setActionCommand("disable");
b2.setActionCommand("disable1");
b3.setActionCommand("disable2");
b4.setActionCommand("disable3");
b5.setActionCommand("disable4");

//b2.setEnabled(false);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);


redButton.addActionListener(this);
blueButton.addActionListener(this);
greenButton.addActionListener(this);
magnetaButton.addActionListener(this);
orangeButton.addActionListener(this);
pinkButton.addActionListener(this);
grayButton.addActionListener(this);
yellowButton.addActionListener(this);
cyanButton.addActionListener(this);
blackButton.addActionListener(this);
DarkGray.addActionListener(this);
White.addActionListener(this);
LightGray.addActionListener(this);
moreColorButton.addActionListener(this);
background.addActionListener(this);



tb.addActionListener(this);
jlist.addItemListener(this);
jlist1.addItemListener(this);




JToolBar toolbar = new JToolBar();
//toolbar.add(line);
toolbar.setPreferredSize(new Dimension(100,50));    //does nothin



f.setLayout(new BorderLayout());
f.add(major_drawpanel2, BorderLayout.WEST);   //adds DrawingTools Toolbar;


drp.setPreferredSize(dim);


f.add(scrolls, BorderLayout.CENTER);//add Drawing Space Toolabr;
scrolls.setPreferredSize(new Dimension(200,200));

//major_colorpanel.setMinimumSize(null);


f.add(major_colorpanel,BorderLayout.SOUTH);



//implements the Menu Bar
JMenuBar mb = new JMenuBar(); 
JToolBar ftoolbar = new JToolBar();
toolbar.add(mb);

setJMenuBar(mb);
upperpanel.add(mb,BorderLayout.NORTH);
upperpanel.add(font_panel,BorderLayout.SOUTH);
f.add(upperpanel,BorderLayout.NORTH);

JMenu fileMenu = new JMenu("File");
JMenu zoom= new JMenu("Zoom");
JMenu edit= new JMenu("Edit");
JMenu help= new JMenu("Help");

JMenuItem Item1, Item2,Item3,Item4,Item5,Item6,Item7,Item8,Item9;
final JFileChooser fc = new JFileChooser();

mb.add(fileMenu);
mb.add(zoom);
mb.add(edit);
mb.add(help);


fileMenu.setMnemonic('F');
zoom.setMnemonic('Z');
edit.setMnemonic('E');
help.setMnemonic('H');


fileMenu.add(Item1= new JMenuItem("New"));
//mb.fileMenu.New.addActionListener(this);
Item1.addActionListener(

		 // anonymous inner class to handle menu item event
		 new ActionListener() {

		 // display message dialog when user selects About...
		 public void actionPerformed( ActionEvent event )
		 {
			 String arg = (String)event.getActionCommand();
			 
			 if(arg.equals("New")){
				 
				  drp.zflag=0;
				  dim.height=800;
				  dim.width=1200;
				  drp.revalidate();
				  drp.clear();
		 }
		 }
		}
		 );
fileMenu.add(Item2= new JMenuItem("Open"));
Item2.addActionListener(

		 // anonymous inner class to handle menu item event
		 new ActionListener() {

		 // display message dialog when user selects About...
		 public void actionPerformed( ActionEvent event )
		 {
			 String arg = (String)event.getActionCommand();
			 
			 if(arg.equals("Open")){
				  drp.openimage();
				  drp.oflag=1;
				  drp.setFlag(66);
					
		 }
		 }
		}
		 );
fileMenu.addSeparator();

fileMenu.add(Item3 = new JMenuItem ("Save"));
Item3.addActionListener(

		 // anonymous inner class to handle menu item event
		 new ActionListener() {

		 // display message dialog when user selects About...
		 public void actionPerformed( ActionEvent event )
		 {
			 String arg = (String)event.getActionCommand();
			 
			 if(arg.equals("Save")){
				  drp.saveimage();
					
		 }
		 }
		}
		 );
fileMenu.addSeparator();
fileMenu.add("Print");
fileMenu.add(Item4= new JMenuItem("Exit"));
Item4.addActionListener(

		 // anonymous inner class to handle menu item event
		 new ActionListener() {

		 // display message dialog when user selects About...
		 public void actionPerformed( ActionEvent event )
		 {
			 String arg = (String)event.getActionCommand();
			 
			 if(arg.equals("Exit")){
				 System.exit(0);
					//System.out.println("hi");
					
		 }
		 }
		}
		 );



zoom.add(Item5=new JMenuItem("Normal"));
Item5.addActionListener(

		 // anonymous inner class to handle menu item event
		 new ActionListener() {

		 // display message dialog when user selects About...
		 public void actionPerformed( ActionEvent event )
		 {
			 String arg = (String)event.getActionCommand();
			 
			 if(arg.equals("Normal")){
				 drp.zflag=0;
				  dim.height=800;
				  dim.width=1200;					
				  drp.repaint();
				  drp.revalidate();
		 }
		 }
		}
		 );


zoom.addSeparator();
zoom.add(Item6=new JMenuItem("1.5X"));
Item6.addActionListener(

		 // anonymous inner class to handle menu item event
		 new ActionListener() {

		 // display message dialog when user selects About...
		 public void actionPerformed( ActionEvent event )
		 {
			 String arg = (String)event.getActionCommand();
			 
			 if(arg.equals("1.5X")){
				 drp.zflag=2;
				  dim.height=1200;
				  dim.width=1800;
				  drp.repaint();
				  drp.revalidate();
		 }
		 }
		}
		 );

zoom.add(Item7= new JMenuItem("2X"));
Item7.addActionListener(

		 // anonymous inner class to handle menu item event
		 new ActionListener() {

		 // display message dialog when user selects About...
		 public void actionPerformed( ActionEvent event )
		 {
			 String arg = (String)event.getActionCommand();
			 
			 if(arg.equals("2X")){
				 drp.zflag=1;
				  dim.height=1600;
				  dim.width=2400;
				  drp.repaint();
				  drp.revalidate();
		 }
		 }
		}
		 );
zoom.add(Item8=new JMenuItem("4X"));
Item8.addActionListener(

		 // anonymous inner class to handle menu item event
		 new ActionListener() {

		 // display message dialog when user selects About...
		 public void actionPerformed( ActionEvent event )
		 {
			 String arg = (String)event.getActionCommand();
			 
			 if(arg.equals("4X")){
				 
				 drp.zflag=3;
				  dim.height=3200;
				  dim.width=4800;
				  drp.repaint();
				  drp.revalidate();
		 }
		 }
		}
		 );


edit.add("Undo");
edit.addSeparator();
edit.add("Redo");


help.add(Item9=new JMenuItem("About"));
Item9.addActionListener(

		 // anonymous inner class to handle menu item event
		 new ActionListener() {

		 // display message dialog when user selects About...
		 public void actionPerformed( ActionEvent event )
		 {
			 String arg = (String)event.getActionCommand();
			 
			 if(arg.equals("About")){
				 JOptionPane.showMessageDialog(frame,
						    "Brought to U by AHA ... :-)", 
						    "Message", getDefaultCloseOperation());
		 }
		 }
		}
		 );


}




String input= null;


public void itemStateChanged(ItemEvent e) {
    int styleSelection,sizeSelection;
    styleSelection = jlist.getSelectedIndex();
    sizeSelection = jlist1.getSelectedIndex();
    if (styleSelection == 0) {
     drp.setFontStyle("TimesRoman");
    } 
    if (styleSelection == 1) {
    	//System.out.println("who am i");
    	drp.setFontStyle("Arial");
    }
    if (styleSelection == 2) 
    {
    	drp.setFontStyle("Impact");
    }
    if (styleSelection == 2) 
    {
	drp.setFontStyle("ALGERIAN");
     }
    
    if(sizeSelection == 0)
    {
    	drp.setFontSize(10);
    }
    if(sizeSelection == 1)
    {
    	drp.setFontSize(12);
    }
    if(sizeSelection == 2)
    {
    	drp.setFontSize(14);
    }
    if(sizeSelection == 3)
    {
    	drp.setFontSize(16);
    }
    if(sizeSelection == 4)
    {
    	drp.setFontSize(18);
    }
    if(sizeSelection == 5)
    {
    	drp.setFontSize(20);
    }
    if(sizeSelection == 6)
    {
    	drp.setFontSize(25);
    }
    if(sizeSelection == 7)
    {
    	drp.setFontSize(30);	
    }
    if(sizeSelection == 8)
    {
    	drp.setFontSize(40);
    }
    if(sizeSelection == 9)
    {
    	drp.setFontSize(50);
    }
    
  } 
@Override


public void actionPerformed(ActionEvent e) {
	  if (e.getSource() == pen){
		  drp.setFlag(1);
           }
	  
	  if (e.getSource() == rectangle){
		  drp.setFlag(2);		 
	  }
	 
	  if (e.getSource() == filled_rectangle){
		  drp.setFlag(3);  }
	  
	  if (e.getSource() == oval){
		  drp.setFlag(4);  }
	  
	  if (e.getSource() == round_rectangle){
		  drp.setFlag(5);  }
	  
	  if (e.getSource() == zoom){
		}
	  if (e.getSource() == line){
		  drp.setFlag(7);
			  }
	  if (e.getSource() == gradient){
		  drp.setColor(color);
		  drp.gsetColor(color);
		  drp.setFlag(8);
		drp.repaint();
			  }
	  if (e.getSource() == b5 ){
		  
			drp.setStoke(0);
				  }
	  if (e.getSource() == b1 ){
		  
		drp.setStoke(1);
			  }
	  if (e.getSource() == b2 ){
		  
			drp.setStoke(2);
				  }
	  if (e.getSource() == b3 ){
		  
			drp.setStoke(3);
				  }
	  if (e.getSource() == b4 ){
		  
			drp.setStoke(4);
				  }
	  
	  if (e.getSource() == Brush ){
		  
			drp.setFlag(20);
				  }
if(e.getSource() ==fillBucket){ 
	drp.setFlag(11);
		  }
if(e.getSource() ==DrawArc){ 
	  
	  drp.setFlag(12);
	  
}
if(e.getSource() ==FillOval){ 
	  
	  drp.setFlag(13);
	  
}
if(e.getSource() ==EraserButton){ 
	  
	  drp.setFlag(14);
	  
}
if(e.getSource() ==background){ 
	  
	  drp.setFlag(16);
	  
	  drp.setColor(color);
	  drp.bsetColor(color);
	
	  //drp.setBackground(color);
	  background.setBackground(color);
	  drp.repaint();
	 
	  
}
if ("disable".equals(e.getActionCommand())) {
    //b2.setEnabled(false);
    b1.setEnabled(false);
    b2.setEnabled(true);
    b3.setEnabled(true);
    b4.setEnabled(true);
    b5.setEnabled(true);
} else if ("disable1".equals(e.getActionCommand())) {
    //b2.setEnabled(true);
    b1.setEnabled(true);
    b2.setEnabled(false);
    b3.setEnabled(true);
    b4.setEnabled(true);
    b5.setEnabled(true);
} else if ("disable2".equals(e.getActionCommand())) { 
	b1.setEnabled(true);
    b2.setEnabled(true);
    b3.setEnabled(false);
    b4.setEnabled(true);
    b5.setEnabled(true);
	
}else if ("disable3".equals(e.getActionCommand())) {
    //b2.setEnabled(true);
    b1.setEnabled(true);
    b2.setEnabled(true);
    b3.setEnabled(true);
    b4.setEnabled(false);
    b5.setEnabled(true);
}else if ("disable4".equals(e.getActionCommand())) {
    //b2.setEnabled(true);
    b1.setEnabled(true);
    b2.setEnabled(true);
    b3.setEnabled(true);
    b4.setEnabled(true);
    b5.setEnabled(false);
}

if(e.getSource()==("Exit"))
	{	   
	System.exit(0);	
	}
	  if(e.getSource()== text){ 
		  input = JOptionPane.showInputDialog("Enter Input:");
		    
		    drp.setFlag1(9,input);
		  
		  
	  }
	  
	  if(e.getSource() == redButton)
	  {
		  color = Color.red;
		  drp.setColor(color);
		  currentcolor.setBackground(color);
	  }
	  if(e.getSource() == blueButton)
	  {
		  color = Color.blue;
		  drp.setColor(color);
		  currentcolor.setBackground(color);
	  }
	  if(e.getSource() == greenButton)
	  {
		  color = Color.green;
		  drp.setColor(color);
		  currentcolor.setBackground(color);
	  }
	  
	  if(e.getSource() == orangeButton)
	  {
		  color = Color.orange;
		  drp.setColor(color);
		  currentcolor.setBackground(color);
	  }
	  if(e.getSource() == pinkButton)
	  {
		  color = Color.pink;
		  drp.setColor(color);
		  currentcolor.setBackground(color);
	  }
	 
	  if(e.getSource() ==magnetaButton)
	  {
		  color = Color.magenta;
		  drp.setColor(color);
		  currentcolor.setBackground(color);
	  }
	  if(e.getSource() == grayButton)
	  {
		  color = Color.gray;
		  drp.setColor(color);
		  currentcolor.setBackground(color);
	  }
	  if(e.getSource()== yellowButton)
	  {
		  color = Color.yellow;
		  drp.setColor(color);
		  currentcolor.setBackground(color);
	  }
	  if(e.getSource() == cyanButton)
	  {
		  color = Color.cyan;
		  drp.setColor(color);
		  currentcolor.setBackground(color);
	  }
	  
	  if(e.getSource() ==blackButton)
	  {
		  color = Color.black;
		  drp.setColor(color);
		  currentcolor.setBackground(color);
	  }
	  if(e.getSource() == DarkGray)
	  {
		  color = Color.DARK_GRAY;
		  drp.setColor(color);
		  currentcolor.setBackground(color);
	  }
	  if(e.getSource() == LightGray){ 
		  color = Color.LIGHT_GRAY;
		  drp.setColor(color); 
		  currentcolor.setBackground(color);
		  
	  }
	  if(e.getSource() == White){ 
		  color = Color.WHITE;
		  drp.setColor(color); 
		  currentcolor.setBackground(color);
		  
	  }
	  
	  if(e.getSource() == moreColorButton)
	  {
		  Color custom_color = JColorChooser.showDialog(this, "Select Custom Color", cp);
		if(custom_color != null){
			  color = custom_color;
			 drp.setColor(color);
		  }
		 currentcolor.setBackground(color);
	  }
	  
	  if(e.getSource()==tb)
	  {
		  AbstractButton abstractButton =  (AbstractButton) e.getSource();
	        boolean selected = abstractButton.getModel().isSelected();
	        System.out.println("Action - selected=" + selected + "\n");
	  }

}

}

