

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class game
{
	public static void main(String args[])
	{
		
		JFrame f=new JFrame("GUESS MY NUMBER");
		
		JLabel title,no,inst;
		JButton guess,pa,close;
		JTextField t1;
		
		title=new JLabel ("GUESS MY NUMBER");
		title.setBounds(70,5,180,50);
		title.setForeground(Color.BLUE);
		f.add(title);
		
		inst=new JLabel ("Enter any number between 1 to 100");
		inst.setBounds(40,50,220,50);
		f.add(inst);
		
		no=new JLabel ("Your Number here:");
		no.setBounds(40,100,120,40);
		f.add(no);
		
		t1=new JTextField("");
		t1.setBounds(160,100,50,40);
		f.add(t1);
		
		guess=new JButton ("GUESS");
		guess.setBounds(90,150,80,50);
		f.add(guess);
		
		pa=new JButton ("PLAY AGAIN");
		pa.setBounds(20,230,130,50);
		f.add(pa);
		
		close=new JButton ("QUIT");
		close.setBounds(160,230,100,50);
		f.add(close);
		
		
		f.addWindowListener(new WindowAdapter()
		{									
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
		});
		
		
		f.setLayout(null);
        f.setSize(300,400);
		f.setVisible(true);
		
			
			
		
		guess.addActionListener(new ActionListener()									
			{
            public void actionPerformed(ActionEvent e)
            {			
				try
				{
					int r = (int)(Math.random() * 100) + 1;

					int i= Integer.parseInt(t1.getText());
					
					if(i==r)
					{
						JOptionPane.showMessageDialog(f,"Your Guess is Correct");
						JOptionPane.showMessageDialog(f,"CONGRATULATIONS!!!");
					}
					else if (i<1)
					{
						JOptionPane.showMessageDialog(f,"Enter number greater than 1");
					}
					else if (i>100)
					{
						JOptionPane.showMessageDialog(f,"Enter number less than 100");
					}
					else 
					{
						JOptionPane.showMessageDialog(f,"Wrong Guess number is: " +r);
						JOptionPane.showMessageDialog(f,"Better Luck Next Time");
					}
					
				}
				catch (NumberFormatException n) 
				{
					JOptionPane.showMessageDialog(f,"Invalid Input");
				}
					
			}
			});
			
		pa.addActionListener(new ActionListener()									
			{
            public void actionPerformed(ActionEvent e)
            {			
				t1.setText(null);	
			}
			});
		
		
		close.addActionListener(new ActionListener()									
			{
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
			});
	}
}
			
			