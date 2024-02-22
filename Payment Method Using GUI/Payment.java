import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Payment extends JFrame implements MouseListener, ActionListener
{	
	JLabel imgLabel,c3Text3,login1,userLabel1,passLabel1,imgLabel1,c1ImgLabel1,newbox,c1Option,login12;
	JTextField userTF1;
	JPasswordField passPF1;
	JButton exitBtn1,loginBtn1;
	JPanel panel1;
	ImageIcon icon1, image1, c1image1;
	Font myFont,myFont12,myFont02;
	JComboBox c1Combo;
    String time;
	JRadioButton c3r1, c3r2,c3r3;
	ButtonGroup c3Bg1;
	ImageIcon img,img2,img3;
	public Payment()
	{
		this.setTitle("Moviebuzz");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myFont = new Font("Times New Roman", Font.BOLD, 12);
		myFont12 = new Font("Times New Roman", Font.BOLD, 14);
		myFont02 = new Font("Times New Roman", Font.BOLD, 24);

		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(new Color(184, 191, 235));


		img = new ImageIcon("a.png");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(200, 150, 170, 100);
		panel1.add(imgLabel);
		
		this.add(panel1);

		img2 = new ImageIcon("b.jpg");
		imgLabel = new JLabel(img2);
		imgLabel.setBounds(400, 150, 170, 100);
		panel1.add(imgLabel);

		this.add(panel1);

		img3 = new ImageIcon("c.png");
		imgLabel = new JLabel(img3);
		imgLabel.setBounds(600, 150, 170, 100);
		panel1.add(imgLabel);
		this.add(panel1);
		

		c3Text3 = new JLabel("    We Accept: ");
		c3Text3.setBounds(50, 200, 80, 20);
		c3Text3.setBackground(new Color(162, 160, 161));
	    c3Text3.setOpaque(true);
		c3Text3.setFont(myFont);
		panel1.add(c3Text3);

		c3r1 = new JRadioButton("            ");
		c3r1.setBounds(170, 200, 100, 20);
		//c3r1.setBackground(new Color(198, 65, 83));
		//c3r1.setOpaque(true);
		c3r1.setFont(myFont);
		panel1.add(c3r1);
		
		c3r2 = new JRadioButton("          ");
		c3r2.setBounds(370, 200, 100, 20);
		//c3r2.setBackground(new Color(198, 65, 83));
		//c3r2.setOpaque(true);
		c3r2.setFont(myFont);
		panel1.add(c3r2);

		c3r3 = new JRadioButton("          ");
		c3r3.setBounds(570, 200, 100, 20);
		//c3r3.setBackground(new Color(198, 65, 83));
		//c3r3.setOpaque(true);
		c3r3.setFont(myFont);
		panel1.add(c3r3);


		c3Bg1 = new ButtonGroup();
		c3Bg1.add(c3r1);
		c3Bg1.add(c3r2);
		c3Bg1.add(c3r3);







		login12 = new JLabel("  Moviebuzz ");
		login12.setBounds(0, 0, 800, 50);
		login12.setForeground(Color.WHITE);
		login12.setBackground(new Color(20, 48, 230));
		login12.setOpaque(true);
		login12.setFont(myFont02);
		panel1.add(login12);



		login1 = new JLabel("  Log In With Mobile Number & Password ");
		login1.setBounds(248, 290, 282, 30);
		login1.setForeground(Color.WHITE);
		login1.setBackground(new Color(20, 48, 230));
		login1.setOpaque(true);
		login1.setFont(myFont12);
		panel1.add(login1);

	

		userLabel1 = new JLabel("Mobile Number : ");
		userLabel1.setBounds(265, 338, 100, 18);
		userLabel1.setBackground(new Color(20, 48, 230));
		userLabel1.setOpaque(true);
		userLabel1.setForeground(Color.WHITE);
		userLabel1.setFont(myFont);
		panel1.add(userLabel1);

		userTF1 = new JTextField();
		userTF1.setBounds(370, 337, 150, 20);
		userTF1.setBackground(new Color(162, 160, 161));
		userTF1.setForeground(Color.BLACK);
		userTF1.setFont(myFont);
		panel1.add(userTF1);

		passLabel1 = new JLabel("Password           : ");
		passLabel1.setBounds(265, 367, 100, 18);
		passLabel1.setBackground(new Color(20, 48, 230));
		passLabel1.setOpaque(true);
		passLabel1.setForeground(Color.WHITE);
		passLabel1.setFont(myFont);
		panel1.add(passLabel1);

		passPF1 = new JPasswordField();
		passPF1.setBounds(370, 367, 150, 20);
		passPF1.setBackground(new Color(162, 160, 161));
		passPF1.setForeground(Color.BLACK);
		passPF1.setFont(myFont);
		passPF1.setEchoChar('*');
		panel1.add(passPF1);

		
		/*c1Option = new JLabel("See Password");
		c1Option.setBounds(335, 300, 250, 30);
		c1Option.setFont(myFont);
        panel1.add(c1Option);*/

		String[] items = {" Show Password","         1234"};
		c1Combo = new JComboBox(items);
		c1Combo.setBounds(335, 390, 140, 20);
		c1Combo.setBackground(new Color(20, 48, 230));
		//c1Combo.setBackground(new Color(198, 65, 83));
		c1Combo.setFont(myFont);
		panel1.add(c1Combo);
		

		loginBtn1 = new JButton("Pay");
		loginBtn1.setBounds(630, 440, 80, 30);
		loginBtn1.setBackground(new Color(20, 48, 230));
		loginBtn1.setOpaque(true);
		loginBtn1.setForeground(Color.BLACK);
		loginBtn1.addActionListener(this);
		loginBtn1.addMouseListener(this);
		loginBtn1.setFont(myFont);
		panel1.add(loginBtn1);

		exitBtn1 = new JButton("Exit");
		exitBtn1.setBounds(90, 440, 80, 30);
		exitBtn1.setBackground(new Color(20, 48, 230));
		exitBtn1.setOpaque(true);
		exitBtn1.setForeground(Color.BLACK);
		exitBtn1.addActionListener(this);
		exitBtn1.addMouseListener(this);
		exitBtn1.setFont(myFont);
		panel1.add(exitBtn1);

		this.add(panel1);

	}
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == loginBtn1)
		{
			loginBtn1.setBackground(new Color(198, 65, 83));
			loginBtn1.setForeground(new Color(198, 65, 83));
		}
		else if(me.getSource() == exitBtn1)
		{
			exitBtn1.setBackground(new Color(198, 65, 83));
			exitBtn1.setForeground(new Color(198, 65, 83));
        }
		
		
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginBtn1)
		{
			loginBtn1.setBackground(new Color(20, 48, 230));;
			loginBtn1.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn1)
		{
			exitBtn1.setBackground(new Color(20, 48, 230));;
			exitBtn1.setForeground(Color.BLACK);
		}
		
		else
		{
			
		}
	}
	
	public void actionPerformed(ActionEvent e1)
	{

		
		/*if(e1.getSource()==admin1)
		{
			Admin a1 = new Admin();
			a1.setVisible(true);
			this.setVisible(false);
		}*/

		if(e1.getSource()==loginBtn1)
		{
			String s1 = userTF1.getText();
			String s2 = passPF1.getText();

			if(s1.equals("Mashruf") && s2.equals("1234"))// || s1.equals("Sakib") && s2.equals("1234") || s1.equals("Sourov") && s2.equals("1234"))
			{
				/*Employee2 c1 = new Employee2();
				c1.setVisible(true);
				this.setVisible(false);*/
				JOptionPane.showMessageDialog(null,"Paid!!!");
			}
            else
            {
                JOptionPane.showMessageDialog(null,"Please! Don't Try With Wrong Information Again Or Fill Up .");
            }

			
		}
	
		else if(e1.getSource()==exitBtn1)
		{
			System.exit(0);
		}
	}
}