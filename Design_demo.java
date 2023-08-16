import java.awt.*;
public class Design_demo extends Frame
{
	Design_demo()
	{
		setLayout(null);
		setBackground(Color.pink);
		Button b1=new Button("OK");
		Font f1= new Font ("Times New Roman",Font.ITALIC|Font.BOLD,15);
		setFont(f1);
		
		Label l1=new Label("Enter Name :");
		Label l2=new Label("Enter Phone no. :");
		Label l3=new Label("Enter Address:");
		Label l4=new Label("Enter Class :");

		l1.setBackground(Color.cyan);
		l2.setBackground(Color.cyan);
		l3.setBackground(Color.cyan);
		l4.setBackground(Color.cyan);

		l1.setForeground(Color.red);
		l2.setForeground(Color.red);
		l3.setForeground(Color.red);
		l4.setForeground(Color.red);

		TextField tf1=new TextField(20);
		TextField tf2=new TextField(20);
		TextField tf3=new TextField(20);
		TextField tf4=new TextField(20);
		
		b1.setBounds(150,280,50,30);
		l1.setBounds(50,50,130,30);
		l2.setBounds(50,100,130,30);
		l3.setBounds(50,150,130,30);
		l4.setBounds(50,200,130,30);

		tf1.setBounds(180,50,150,30);
		tf2.setBounds(180,100,150,30);
		tf3.setBounds(180,150,150,30);
		tf4.setBounds(180,200,150,30);		


		add(b1);
		add(l1);
		add(l2);
		add(l3);
		add(l4);

		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		
	}
	public static void main(String arg[])
	{
		Design_demo f1=new Design_demo();
		f1.setVisible(true);
		f1.setTitle("Design");
		f1.setSize(400,400);
	}
}