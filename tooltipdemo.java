import javax.swing.*;
import java.awt.*;
public class tooltipdemo extends JFrame
{
	tooltipdemo()
	{
		Container ct=getContentPane();
		JButton b1=new JButton("HELLO");
		b1.setToolTipText("#hello button");
		ct.add(b1);
	}	
	public static void main(String arg[])
	{
		tooltipdemo f=new tooltipdemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setTitle("tooltipdemo ");
	}
}