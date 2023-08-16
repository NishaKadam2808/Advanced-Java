import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5;
	Calculator()
	{
		setBackground(Color.cyan);
		setLayout(null);
		Label l4=new Label("Simple Calculator");
		l4.setBackground(Color.red);
		
		Label l1=new Label("Enter 1 no. : ",Label.LEFT);
		Label l2=new Label("Enter 2 no. : ",Label.LEFT);
		Label l3=new Label("result : ",Label.LEFT);
		

		t1=new TextField(20);
		t2=new TextField(20);				
		t3=new TextField(20);


		 b1=new Button("add");
		b2=new Button("sub");
		b3=new Button("mul");
		b4=new Button("div");		
		 b5=new Button("clear");	

		t1.setBounds(200,100,100,20);
		t2.setBounds(200,150,100,20);
		t3.setBounds(200,200,100,20);
		l1.setBounds(100,100,100,20);
		l2.setBounds(100,150,100,20);
		l3.setBounds(100,200,100,20);
		l4.setBounds(150,50,100,20);		
		b1.setBounds(100,250,50,20);
		b2.setBounds(150,250,50,20);
		b3.setBounds(200,250,50,20);
		b4.setBounds(250,250,50,20);	
		b5.setBounds(180,300,50,20);	

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);	
	
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(b5);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(t1);
		add(t2);
		add(t3);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String x=t1.getText();
		String y=t2.getText();
		int a=Integer.parseInt(x);
		int b=Integer.parseInt(y);
		
		String str=ae.getActionCommand();
		if(str.equals("add"))
		{
			int c=a+b;
			t3.setText(c+" ");
		}
		else if(ae.getSource()==b2)
		{
			int c=a-b;
			t3.setText(c+" ");
		}
		else if(str.equals("mul"))
		{
			int c=a*b;
			t3.setText(c+" ");
		}
		else if(str.equals("div"))
		{
			int c=a/b;
			t3.setText(c+" ");
		}
		else
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}

	}
	public static void main(String arg[])
	{
		Calculator f1=new Calculator();
		f1.setVisible(true);
		f1.setTitle("Calculator");
		f1.setSize(400,400);
	}

}