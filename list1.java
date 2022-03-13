import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

class list1 extends JFrame implements ListSelectionListener
{


 JList b;
 JLabel l;

list1(){

	 l = new JLabel("Select any one option");
	String name[] = {"Rasika","Prerana","xyz"};

	b=new JList(name);

	b.addListSelectionListener(this);
	
	add(b);
	add(l);

	setLayout(new FlowLayout());

	setSize(400,400);
	setVisible(true);
}

public void valueChanged(ListSelectionEvent e)
{
	// l.setText((String)e.getValuelsAdjusting());
		String s = (String) b.getSelectedValue();
		l.setText(s);
}
 
public static void main(String[] args)
{
list1 ls = new list1();
}

}