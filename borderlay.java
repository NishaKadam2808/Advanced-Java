import java.awt.*;
import java.awt.event.*;
public class borderlay extends Frame
{
	borderlay()
	{
		//BorderLayout b =new BorderLayout();
		Button b1=new Button("center");
		Button b2=new Button("center");

		add(b1,BorderLayout.CENTER);
		add(b2,BorderLayout.NORTH);

	}
	public static void main(String s[])
	{
			borderlay f =new borderlay();
	f.setVisible(true);
	f.setSize(100,100);
	f.setTitle("BorderLayout");
	}

}
