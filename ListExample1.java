import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;


public class ListExample1 implements ListSelectionListener
{
 JLabel l,c;
JList list;
  
 ListExample1()
{
   c=new JLabel();
   JFrame f=new JFrame();
   DefaultListModel<String> l1= new DefaultListModel<>();
   l1.addElement("Rasika");
   l1.addElement("Prerana");
    list=new JList<>(l1);
   list.addListSelectionListener(this);
   list.setBounds(100,100,75,75);
   f.add(list);  
   f.add(c);
   c.setBounds(300,100,75,75);

   f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
   
}
public void valueChanged(ListSelectionEvent e)
{
String s=(String)list.getSelectedValue();
c.setText(s);
}
public static void main(String args[])
{
  new ListExample1();
}
}

