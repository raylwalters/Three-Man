import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*; 
import javax.swing.event.*;
import java.util.Scanner;
import java.util.Random;

public class ThreeMan extends JFrame 
implements ActionListener
{
private JButton b1,b2;
private Container c;
 private JTextArea jt;


public ThreeMan()
{
 c= getContentPane();
 c.setLayout(new FlowLayout());
 Font f= new Font("Times new Romans",Font.BOLD,16);
 c.setFont(f);
 b1 = new JButton("Roll");
 b1.addActionListener(this);
 c.add(b1);
 b2 = new JButton("Next Player");
 b2.addActionListener(this);
 c.add(b2);
 jt= new JTextArea(20,35);jt.setFont(f);
 jt.setBackground(Color.BLUE);
 jt.setForeground(Color.YELLOW);
 JScrollPane sr=new JScrollPane(jt);
 c.add(sr);
 setSize(500,500);
 setVisible(true);
 
 }
 public void actionPerformed(ActionEvent e)
 {
   if(e.getSource()==b1)
 {
   Random randomNumbers = new Random();
	  int die1;
	  int die2;
	  int add;
	  die1 = 1 + randomNumbers.nextInt(6);
	  die2 = 1 + randomNumbers.nextInt(6);
	  add = (die1 + die2);

	 jt.append("die 1 = "+die1+"\n");
	 jt.append("die 2 = "+die2+"\n");
	 
	if (die1 == 3 && die2 == 4&& add == 7)
	  {
		  jt.append("Threeman"+"\n");
		  jt.append("Social"+"\n");
		  jt.append("Person to the left wins"+"\n\n");
	
	  }
	  else if (die1 == 4 && die2 == 3 && add == 7)
	  {
		  jt.append("Threeman"+"\n");
		  jt.append("Social"+"\n");
		  jt.append("Person to the left wins"+"\n\n");
	
	  }
	  else if (die1 == die2&& die1 == 3|die2 == 3)
	  {
		  jt.append("Doubles! Split up dice or give to one player"+"\n");
		  jt.append("Threeman"+"\n\n");
	  }
	   else if (die1 == die2&& die1 == 4|die2 == 4)
	  {
		 jt.append("Doubles! Split up dice or give to one player"+"\n");
		 jt.append("Social"+"\n\n");
	  }
	  else if (die1 == die2&& add == 4)
	  {
		 jt.append("Doubles! Split up dice or give to one player"+"\n");
		 jt.append("Social"+"\n\n");
	  }
	  else if (add == 4&& die1 == 3|die2 == 3)
	  {
		  jt.append("Social"+"\n");
		 jt.append("Threeman"+"\n\n");
	  }
	 else if (die1 == 3)
	  {
		 jt.append("Threeman"+"\n\n");
	  }
	  else if (die1 == 4)
	  {
		  jt.append("Social"+"\n\n");
	  }
	  else if (die2 == 3)
	  {
		 jt.append("Threeman"+"\n\n");
	  }
	  else if (die2 == 4)
	  {
		  jt.append("Social"+"\n\n");
	  }
	  
	  else if (add == 3)
	  {
		jt.append("Threeman"+"\n\n");
		
	  }
	  else if (add == 7)
	  {
		jt.append("Person to the left wins"+"\n\n");
	  }
	  else if (add == 11)
	  {
		jt.append("Person to the right wins"+"\n\n");
	  }
	  else if (die1 == die2)
	  {
		jt.append("Doubles! Split up dice or give to one player"+"\n\n");
	  }
	  else
	  {
		jt.append("Next player rolls"+"\n");
	  }
	  
	}
	if (e.getSource() == b2)
	{
	jt.setText("");
	}
 }
 public static void main( String args[])
 {
  ThreeMan ThreeMan = new ThreeMan();
  ThreeMan.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  
  }
  
  
 
