import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;

public  class Account1 extends JFrame implements ActionListener,MouseListener
{
	
  JFrame f1;
  JComboBox combo;
  JLabel management,dateLabel,moneyLabel,success,chooseLabel,management1,management2,management3;
  JTextField dateTF,moneyTF;
  JButton c2ExitBtn,c2BackBtn,c2NxtBtn;
  Font myFont,myFont12;
  JPanel panel1;

  public Account1()
  {	 
  
    //super("Account Management");
    
        this.setTitle("Account Management");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myFont = new Font("Times New Roman", Font.BOLD, 12);
		myFont12 = new Font("Times New Roman", Font.BOLD, 14);

		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.white);

		
  
	

	 
		

	    management = new JLabel("                                                                                   Account Management");
		management.setBounds(0, 0,800, 30);
		management.setFont(myFont);
		management.setBackground(new Color(198, 65, 83));
		management.setOpaque(true);
		management.setForeground(Color.WHITE);
		management.setFont(myFont12);
		panel1.add(management);

		management1 = new JLabel("");
		management1.setBounds(0, 0,20, 600);
		management1.setBackground(new Color(198, 65, 83));
		management1.setOpaque(true);
		panel1.add(management1);

		management2 = new JLabel("");
		management2.setBounds(780, 0,20, 600);
		management2.setBackground(new Color(198, 65, 83));
		management2.setOpaque(true);
		panel1.add(management2);

		management3 = new JLabel("");
		management3.setBounds(0, 553,800, 20);
		management3.setBackground(new Color(198, 65, 83));
		management3.setOpaque(true);
		panel1.add(management3);

		

		/*dateLabel = new JLabel("Date :");
		dateLabel.setBounds(400, 100, 60, 35);
		dateLabel.setFont(myFont);
		management.setBackground(Color.PINK);
		dateLabel.setOpaque(true);
		dateLabel.setForeground(Color.BLACK);
		panel1.add(dateLabel);*/
		

		/*moneyLabel = new JLabel("Taka :");
		moneyLabel.setBounds(145, 190, 90, 35);
		moneyLabel.setFont(myFont);
		management.setBackground(Color.PINK);
		moneyLabel.setOpaque(true);
		moneyLabel.setForeground(Color.BLACK);
		panel1.add(moneyLabel);*/

		chooseLabel = new JLabel("Vehicle : ");
		chooseLabel.setBounds(300, 208, 65, 18);
		chooseLabel.setBackground(new Color(198, 65, 83));
		chooseLabel.setOpaque(true);
		chooseLabel.setForeground(Color.WHITE);
		chooseLabel.setFont(myFont);
		panel1.add(chooseLabel);

		String items[] = {"Bus", "Truck", "Car", "Bike"};
		combo = new JComboBox(items);
		combo.setBounds(370, 208, 150, 20);
		combo.addActionListener(this);
		panel1.add(combo);

		
		moneyLabel = new JLabel("Taka : ");
		moneyLabel.setBounds(300, 238, 65, 18);
		moneyLabel.setBackground(new Color(198, 65, 83));
		moneyLabel.setOpaque(true);
		moneyLabel.setForeground(Color.WHITE);
		moneyLabel.setFont(myFont);
		panel1.add(moneyLabel);

		moneyTF = new JTextField();
		moneyTF.setBounds(370, 237, 150, 20);
		moneyTF.setBackground(new Color(162, 160, 161));
		moneyTF.setForeground(Color.BLACK);
		moneyTF.setFont(myFont);
		panel1.add(moneyTF);



		dateLabel = new JLabel("Date : ");
		dateLabel.setBounds(300, 267, 65, 18);
		dateLabel.setBackground(new Color(198, 65, 83));
		dateLabel.setOpaque(true);
		dateLabel.setForeground(Color.WHITE);
		dateLabel.setFont(myFont);
		panel1.add(dateLabel);


		dateTF = new JTextField();
		dateTF.setBounds(370, 267, 150, 20);
		dateTF.setBackground(new Color(162, 160, 161));
		dateTF.setForeground(Color.BLACK);
		dateTF.setFont(myFont);
		panel1.add(dateTF);


   /*dateTF = new JTextField();
    dateTF.setBounds(485, 120, 120, 40);
	dateTF.setBackground(Color.WHITE);
	panel1.add(dateTF);*/
	  

	  /*moneyTF = new JTextField();
      moneyTF.setBounds(250, 190, 120, 40);
	  moneyTF.setBackground(Color.WHITE);
	  panel1.add(moneyTF);*/

	  c2ExitBtn = new JButton("Exit");
	  c2ExitBtn.setBounds(500, 330, 80, 30);
	  c2ExitBtn.setBackground(new Color(198, 65, 83));
	  c2ExitBtn.setOpaque(true);
	  c2ExitBtn.setForeground(Color.BLACK);
	  c2ExitBtn.addActionListener(this);
	  c2ExitBtn.addMouseListener(this);
	  panel1.add(c2ExitBtn);

	  c2BackBtn = new JButton("Back");
	  c2BackBtn.setBounds(350, 330, 80, 30);
	  c2BackBtn.setBackground(new Color(198, 65, 83));
	  c2BackBtn.setOpaque(true);
	  c2BackBtn.setForeground(Color.BLACK);
	  c2BackBtn.addActionListener(this);
	  c2BackBtn.addMouseListener(this);
	  panel1.add(c2BackBtn);

	  c2NxtBtn = new JButton("Next");
	  c2NxtBtn.setBounds(200, 330, 80, 30);
	  c2NxtBtn.setBackground(new Color(198, 65, 83));
	  c2NxtBtn.setOpaque(true);
	  c2NxtBtn.setForeground(Color.BLACK);
	  c2NxtBtn.addActionListener(this);
	  c2NxtBtn.addMouseListener(this);
	  panel1.add(c2NxtBtn);


		this.add(panel1);
  }
  public void mouseClicked(MouseEvent me){}
  public void mousePressed(MouseEvent me){}
  public void mouseReleased(MouseEvent me){}
  public void mouseEntered(MouseEvent me)
  {
	  if(me.getSource() == c2ExitBtn)
	  {
		  c2ExitBtn.setBackground(new Color(198, 65, 83));
		  c2ExitBtn.setForeground(new Color(198, 65, 83));
	  }
	  else if(me.getSource() == c2BackBtn)
	  {
		  c2BackBtn.setBackground(new Color(198, 65, 83));
		  c2BackBtn.setForeground(new Color(198, 65, 83));
	  }
	  else if(me.getSource() == c2NxtBtn)
	  {
		  c2NxtBtn.setBackground(new Color(198, 65, 83));
		  c2NxtBtn.setForeground(new Color(198, 65, 83));
	  }
	  
	  
	  else
	  {
		  
	  }
  }
  public void mouseExited(MouseEvent me)
  {
	  if(me.getSource() == c2ExitBtn)
	  {
		  c2ExitBtn.setBackground(new Color(198, 65, 83));
		  c2ExitBtn.setForeground(Color.BLACK);
	  }
	  else if(me.getSource() == c2BackBtn)
	  {
		  c2BackBtn.setBackground(new Color(198, 65, 83));
		  c2BackBtn.setForeground(Color.BLACK);
	  }
	  else if(me.getSource() == c2NxtBtn)
	  {
		  c2NxtBtn.setBackground(new Color(198, 65, 83));
		  c2NxtBtn.setForeground(Color.BLACK);
	  }

	  else
	  {
		  
	  }
  }
  @Override

   public void actionPerformed(ActionEvent d)
   
   {

       String vehicle= String.valueOf(combo.getSelectedItem());
	   String date= dateTF.getText();
	   String taka= moneyTF.getText();


   	 String msg=" ";

	   if(d.getSource()==c2NxtBtn)
				{
					this.setVisible(false);
					new AccountInfo(vehicle, date, taka);
			
				}
			
       else if(d.getSource()==c2ExitBtn)
       {
       	msg+="Successfully Exited";
       
       	System.exit(0);
       }

	   else if(d.getSource()==c2BackBtn)
       {

		Employee2 c4 = new Employee2();
		c4.setVisible(true);
		this.setVisible(false);
       
       }
      
		   
   }
   public static void main(String[] args) {  
	Account1 cs = new Account1();
	cs.setVisible(true);
			   
   }

}

