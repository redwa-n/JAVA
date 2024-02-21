import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public  class AccountInfo  extends JFrame implements ActionListener
{

  JLabel vehicale,tk,date,info;
  JTextField vh2,tk2,dt2;
  JButton backBtn,exitBtn;
  String [] columns = {"Vehicale Type", "Taka ", "Date"};
  String [] rows = new String[3];
  String vehicle;
  String taka;
  String date1;
  //JPanel aPanel;


  public AccountInfo(String vehicle, String date1, String taka){

  
    super("Account Details ");
	this.vehicle=vehicle;
	this.date1=date1;
	this.taka=taka;
  this.setSize(800, 600);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	 Color color = new Color(223,211,211);
	 JPanel panel = new JPanel();
	 panel.setLayout(null);
	 panel.setBackground(color);

	  info = new JLabel("Account Information ");
		info.setBounds(250, 30, 140, 50);
		info.setBackground(Color.WHITE);
		info.setOpaque(true);
		info.setForeground(Color.BLUE);
		panel.add(info);

	    vehicale = new JLabel("Vehicale Type : "+vehicle);
		vehicale.setBounds(130, 200, 300, 40);
		vehicale.setBackground(Color.WHITE);
		vehicale.setOpaque(true);
		vehicale.setForeground(Color.BLACK);
		panel.add(vehicale);
 
        tk = new JLabel("Taka : "+taka);
		tk.setBounds(130, 260, 300, 40);
		tk.setBackground(Color.WHITE);
		tk.setOpaque(true);
		tk.setForeground(Color.BLACK);
		panel.add(tk);
       
        date = new JLabel("Date : "+date1);
		date.setBounds(130, 320, 300, 40);
		date.setBackground(Color.WHITE);
		date.setOpaque(true);
		date.setForeground(Color.BLACK);
		panel.add(date);


    backBtn = new JButton("Back");
		backBtn.setBounds(520, 250, 100, 50);
		backBtn.setBackground(Color.GREEN);
		panel.add(backBtn);

		exitBtn = new JButton("Exit");
		exitBtn.setBounds(520, 320, 100, 50);
    exitBtn.setBackground(Color.RED);
		panel.add(exitBtn);
		

        JTable table = new JTable ();

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers (columns);
        table.setModel(model);
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.WHITE);
        table.setFont(getFont());
        table.setRowHeight(30);

        JScrollPane sc = new JScrollPane(table);
        sc.setBounds(10,360,740,265);

        Container c = new Container();
		    c.add(sc);



       backBtn.addActionListener(this);
       exitBtn.addActionListener(this);
       
        table.addMouseListener(new MouseAdapter(){
       	private int numberOfRow;

			public void mouseClicked(MouseEvent m){
       		
		    String vh_name = model.getValueAt(numberOfRow, 0).toString();
       		String tk3 = model.getValueAt(numberOfRow, 1).toString();
       		String dt3 = model.getValueAt(numberOfRow, 2).toString();
       		

       		vh2.setText(vh_name);
       		tk2.setText(tk3);
       		dt2.setText(dt3);

       		

       	}



  });
  this.add(panel);
 this.setVisible(true);

}
public static void main(String[] args) {
	
}
  @Override
 public void actionPerformed(ActionEvent a)
 {

	  int totalVehicale = 0;
	  double amount=0;

	   if(a.getSource()==backBtn)
				{
					Account1 a1=new Account1();
					a1.setVisible(true);
					this.setVisible(false);
					
			
				}

	 else if(a.getSource()==exitBtn)
       {
       
       	System.exit(0);
       }
      
	  
	  else
	  {
		  
	  }
	  

 }
  
   
  
}