import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
Ewwww
Machines
public class Calculator extends Frame implements ActionListener
{
 Panel p;
 TextField t;
 Button b[];
 Calculator()
{
	t=new TextField("0");
	t.setBounds(10,10,300,50);
	p=new Panel();
	String str[]={"0","1","2","3","4","5","6","7","8","9","+","-","*","/"};
		b=new Button[16];
	for(int i=0;i<str.length;i++){
		b[i]=new Button(str[i]);
		b[i].addActionListener(this);
			p.add(b[i]);
	}
    p.setLayout(new GridLayout(3,3,3,3));
	add(p,BorderLayout.CENTER);
p.setBounds(100,100,200,200);
	add(t);
    setSize(300,300);
    setLayout(null);
    setVisible(true);
   
}
public void actionPerformed(ActionEvent e)
{

}
public static void main(String args[])
{
  new Calculator();
}
}

