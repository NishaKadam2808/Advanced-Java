import java.awt.*;
import java.awt.event.*;
public class GridBagDemo extends Frame 
{
	GridBagDemo()
	{
		GridBagLayout gb =new GridBagLayout();
		setLayout(gb);
		GridBagConstraints gc =new GridBagConstraints();
		
		Button b1=new Button("Button 1");
		Button b2=new Button("Button 2");
		Button b3=new Button("Button 3");
		Button b4=new Button("Button 4");
		Button b5=new Button("Button 5");

		gc.gridx=0;
		gc.gridy=0;
		add(b1,gc);

		gc.gridx=1;
		gc.gridy=0;
		add(b2,gc);

		gc.gridx=0;
		gc.gridy=1;
		add(b3,gc);

		gc.gridx=1;
		gc.gridy=1;
		add(b4,gc);

		gc.gridx=0;
		gc.gridy=2;
		gc.fill= GridBagConstraints.HORIZONTAL;
		gc.gridwidth=2;
		gc.gridheight=1;
		add(b5,gc);
	}
	public static void main(String arg[])
	{
		GridBagDemo f=new GridBagDemo();
		f.setVisible(true);
		f.setSize(300,300);
		f.setTitle("Grids");
	}

}