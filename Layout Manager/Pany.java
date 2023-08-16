import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Pany extends Applet implements ActionListener
{
	Panel p1,p2,p3;
	Checkbox c1,c2,c3,c4;
	CheckboxGroup chg;
	Button b1,b2;
	CardLayout c;
	public void init()
	{
		c=new CardLayout();
		b1=new Button("Flavours");
		b2=new Button("Colours");
		add(b1);
		add(b2);
		p1=new Panel();
		p1.setLayout(c);
		
		chg=new CheckboxGroup();
		c1=new  Checkbox("Vnilla",false,chg);
		c2=new  Checkbox("Strawberry",false,chg);
		c3=new  Checkbox("Red",false,chg);
		c4=new  Checkbox("Blue",false,chg);

		p2=new Panel();
		p2.add(c1);
		p2.add(c2);
			
		p3=new Panel();
		p3.add(c3);
		p3.add(c4);

		p1.add(p2,"Flavours");
		p1.add(p3,"Colours");

		
		add(p1);
		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			c.show(p1,"Flavours");
		}
		else
		{
			c.show(p1,"Colours");
		}

	}	

}
/*<applet code="Pany.class" width=500 height=500></applet>*/