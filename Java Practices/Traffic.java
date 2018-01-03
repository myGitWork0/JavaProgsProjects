import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Traffic extends Applet implements ActionListener
{	
	int r=0,gr=00,o=0;
	int bl=0,gre=0;
	String msg="HELLO";
	Button red,green,orange,reset;
	public void init()
	{
		red= new Button("RED");
		green=new Button("GREEN");
		orange=new Button("ORANGE");
		reset=new Button("RESET");
		add(red);
		add(green);
		add(orange);
		add(reset);
		red.addActionListener(this);
		green.addActionListener(this);
		orange.addActionListener(this);
		reset.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae )
	{
		if(ae.getSource()==red)
		{
			showStatus("Initial Value of r "+r);
			r=255;
			gr=0;
			o=0;
			msg="STOP!";
			showStatus("Button at Red"+",r="+r+",gr="+gr+",o="+o+",bl="+bl+",gre="+gre);
			repaint();
		}
		else if(ae.getSource()==green)
		{
			showStatus("Initial Value of r "+gr);
			gr=255;
			r=0;
			o=0;
			msg="GO!";
			showStatus("Button at Green"+",r="+r+",gr="+gr+",o="+o+",bl="+bl+",gre="+gre);
			repaint();
		}
		else if(ae.getSource()==orange)
		{
			showStatus("Initial Value of r "+o);
			o=2;
			bl=255;
			gre=150;
			msg="WAIT";
			showStatus("Button at Orange"+",r="+r+",gr="+gr+",o="+o+",bl="+bl+",gre="+gre);
			repaint();
		}
		else if(ae.getSource()==reset)
		{	
			r=0;
			gr=0;
			o=0;
			msg="";
			showStatus("Button at Reset"+",r="+r+",gr="+gr+",o="+o+",bl="+bl+",gre="+gre);
			repaint();
		}			
	}
	public void paint(Graphics g)
	{	
		Color c0 = new Color(190,188,57);
		g.setColor(c0);
		g.fillRoundRect(100, 100, 60, 250, 15, 15);
		g.setColor(Color.black);
		g.drawRoundRect(100,100, 60,250,15,15);
		g.drawRoundRect(100,100, 61,251,15,15);
		g.drawRoundRect(100,100, 62,252,15,15);
		g.drawOval(105, 135, 51, 51);
		g.drawOval(105, 195, 51, 51);
		g.drawOval(105, 255, 51, 51);
		g.setColor(Color.red);
		Color c1 = new Color(r, 0, 0);
		g.setColor(c1);
		g.fillOval(105, 135, 50, 50);
		Color c2 = new Color(0, gr, 0);
		g.setColor(c2);
		g.fillOval(105, 195, 50, 50);
		Color c3 = new Color(r=bl,gr=gre, o);
		g.setColor(c3);
		g.fillOval(105, 255, 50, 50);
		bl=0;
		gre=0;
		r=0;
		gr=0;
		g.setFont(new Font("Segoe Print",Font.ITALIC ,25));
		Color c4=new Color(208,25,200);
		g.setColor(c4);
		g.drawString(msg,250,250);
		msg="";
	}
	
}