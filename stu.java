import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
class stu 
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("Form");
		
		JLabel l1=new JLabel("Name");
		JLabel l2=new JLabel("Course");
		JLabel l3=new JLabel("Fees");
		JLabel l4=new JLabel("Duration");
		
		String course[]={"C","C++","JAVA","Advanced JAVA"};
		
		JComboBox cb=new JComboBox(course);
	//	cb.addActionListener(this);
		
		
		JButton b1=new JButton("Edit");
		JButton b2=new JButton("Save");
		JButton b3=new JButton("RESET");
		
		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		
		l1.setBounds(50,40,100,30);
		l2.setBounds(50,90,100,30);
		l3.setBounds(50,140,100,30);
		l4.setBounds(50,190,100,30);
		
		t1.setBounds(100,40,110,30);
		cb.setBounds(100,90,110,30);
		t2.setBounds(100,140,110,30);
		t3.setBounds(100,190,110,30);
		
		b1.setBounds(50,270,80,30);
		b2.setBounds(140,270,80,30);
		b3.setBounds(230,270,80,30);
		b2.setVisible(false);b3.setVisible(false);
		
               cb.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
				String d=""+cb.getItemAt(cb.getSelectedIndex());
				//t1.setText(d);
			       
			        if(e.getSource()==cb)
				{
					if(d.equals("C"))
					{
						t2.setText("6000");
						t3.setText("3 Months");
					}
					else if(d.equals("C++"))
					{
						t2.setText("4000");
						t3.setText("4 Months");
					}
					else if(d.equals("JAVA"))
					{
						t2.setText("10000");
						t3.setText("6 Months");
					}
					else if(d.equals("Advanced JAVA"))
					{
						t2.setText("8000");
						t3.setText("5 Months");
					}	
						
				}	
			
			}
			
			
		});	
	     
	     
		
		b1.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
			b2.setVisible(true);
			b3.setVisible(true);
		}
		b1.addMouseListener(new ActionListener()
		{
			
		public void mouseDragged(MouseEvent e)
			{
				b1.getBackgroundColor(Color.red);
			}
		});
		b2.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
			b2.setVisible(false);
			b3.setVisible(false);
		}
		});
		b3.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		});
		b2.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		});
		
		
		

		f.addWindowListener(new WindowAdapter() {
            
                   public void windowClosing(WindowEvent e) {
                
                   System.exit(0);
                     }
                    });
	           f.setSize(400,400);
	           f.add(l1);f.add(l2);f.add(l3);f.add(l4);
                   f.add(t1);f.add(cb);f.add(t2);f.add(t3);
	           f.add(b1);f.add(b2);f.add(b3);
		   
	}
}	
	
		
		
		
		