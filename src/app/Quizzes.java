package app;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

import com.toedter.calendar.JDateChooser;

public class Quizzes extends Principale implements ActionListener  {
	
	JFrame f,fen2,f2 = new JFrame("Quizzes "+t),f3;
	Connection con = null;
	JTextField x1,x2,x3;
	JTextField x5,x6;
	JDateChooser c;
	JButton Start,Next,registration,Back,check,Again,RE,log ;
	JRadioButton ch1,ch2,ch3,ch4;
	ButtonGroup gp;
	JPanel d ;
	int i=0;
	static String CNE;
	int[] tab = new int[40];
	JTabbedPane jtP;
	
	public Connection OuverirConnex() {
		try {
			//charge drive
			Class.forName("com.mysql.jdbc.Driver");
			//créer la connexion
			 con = DriverManager.getConnection("jdbc:mysql://localhost/quizzes","root","");
			
			
			}catch (Exception e) {
				JOptionPane mess1 = new JOptionPane();
				mess1.showMessageDialog(null,"ERROR :"+ e.getMessage(),"Ma_Boite",JOptionPane.INFORMATION_MESSAGE);
			}
		return con;
		
	}
	
	public void login() {	
    	
		f = new JFrame("LOGIN");
		
		java.awt.Image img = new ImageIcon("Final.png").getImage();
		java.awt.Image newimg = img.getScaledInstance(1200,700,java.awt.Image.SCALE_SMOOTH);
    	f.setContentPane(new JLabel(new ImageIcon(newimg)));
    	

		JTextField B = new JTextField();
		B.setBounds(550,359,200,20);
		B.setBackground(Color.white);
		B.setBorder(BorderFactory.createLineBorder(Color.white,1));	
		B.setEnabled(false);
		f.add(B);
	
		 x1 = new JTextField();
		 x6 = new JPasswordField();
		 
		x1.setBounds(446,270,200,30);
		x1.setBorder(BorderFactory.createLineBorder(Color.white,1));
		x1.setFont(new Font("Serif", Font.BOLD, 15));
		x1.setPreferredSize(new Dimension(300, 25));
		
	    x6.setBounds(446,325,200,30);
	    x6.setBorder(BorderFactory.createLineBorder(Color.white,1));
	    x6.setFont(new Font("Serif", Font.BOLD, 15));
		x6.setPreferredSize(new Dimension(300, 25));
		
		
		f.add(x1);
		f.add(x6);
		
		
		Start = new JButton("LOGIN");
		Start.setBounds(425,383,230,35);
		Start.addActionListener(this);
		Start.setBackground(new Color(60,188,130));
		Start.setBorder(BorderFactory.createLineBorder(new Color(60,188,130),1));
		
		RE = new JButton("REGISTER");
		RE.setBounds(20,20,150,35);
		RE.addActionListener(this);
		RE.setBackground(new Color(60,188,130));
		RE.setBorder(BorderFactory.createLineBorder(new Color(60,188,130),1));

		
		f.add(RE);
        f.add(Start);

        
        
        
        f.setIconImage(new ImageIcon("user.png").getImage());
        f.setSize(800,600);
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		
	}	
    
	public void registration() {
		
		f = new JFrame("REGISTRATION");
		
		java.awt.Image img = new ImageIcon("R.png").getImage();
		java.awt.Image newimg = img.getScaledInstance(1000,500,java.awt.Image.SCALE_SMOOTH);
    	f.setContentPane(new JLabel(new ImageIcon(newimg)));
    	

		
		Label n1 = new Label("CNE: ");
		Label n2 = new Label("Nom: ");
		Label n3 = new Label("Prénom: ");
		Label n4 = new Label("Date.N: ");
		Label n5 = new Label("password:");
		Label n6 = new Label("password:");
		
		
		n1.setBounds(20,40,60,35);
		n1.setBackground(new Color(248, 248, 255));
		n1.setForeground(new Color(219, 112, 147));
	    n2.setBounds(20,90,60,35);
	    n2.setBackground(new Color(248, 248, 255));
	    n2.setForeground(new Color(219, 112, 147));
		n3.setBounds(20,130,60,35);
		n3.setBackground(new Color(248, 248, 255));
		n3.setForeground(new Color(219, 112, 147));
		n4.setBounds(20,180,60,35);
		n4.setBackground(new Color(248, 248, 255));
		n4.setForeground(new Color(219, 112, 147));
		n5.setBounds(20,230,60,35);
		n5.setBackground(new Color(248, 248, 255));
		n5.setForeground(new Color(219, 112, 147));
		n6.setBounds(20,280,60,35);
		n6.setBackground(new Color(248, 248, 255));
		n6.setForeground(new Color(219, 112, 147));
		
		
		f.add(n1);
		f.add(n2);
		f.add(n3);
		f.add(n4);
		f.add(n5);
		f.add(n6);
		
		
		 x1 = new JTextField();
		 x1.setBackground(new Color(196,255,248));	
		 x1.setFont(new Font("Serif", Font.BOLD, 20));
		 x1.setPreferredSize(new Dimension(300, 25));
		 
		 x2 = new JTextField();
		 x2.setBackground(new Color(196,255,248));	
		 x2.setFont(new Font("Serif", Font.BOLD, 20));
		 x2.setPreferredSize(new Dimension(300, 25));
		 
		 x3 = new JTextField();
		 x3.setBackground(new Color(196,255,248));
		 x3.setFont(new Font("Serif", Font.BOLD, 20));
		 x3.setPreferredSize(new Dimension(300, 25));

		 c = new JDateChooser(new Date(0));
		 c.setBackground(new Color(196,255,248));
		 c.setFont(new Font("Serif", Font.BOLD, 15));
		 c.setPreferredSize(new Dimension(300, 25));
	
		 for( Component nn : c.getComponents()){
			nn.setBackground(new Color(196,255,248)); 
		 }

		 x5 = new JPasswordField();
		 x5.setBackground(new Color(196,255,248));
		 x5.setFont(new Font("Serif", Font.BOLD, 20));
		 x5.setPreferredSize(new Dimension(300, 25));
		 
		 x6 = new JPasswordField();
		 x6.setBackground(new Color(196,255,248));
		 x6.setFont(new Font("Serif", Font.BOLD, 20));
		 x6.setPreferredSize(new Dimension(300, 25));

		 
		x1.setBounds(120,40,270,35);
	    x2.setBounds(120,90,270,35);
		x3.setBounds(120,130,270,35);
		 c.setBounds(120,180,270,35);
		x5.setBounds(120,230,270,35);
		x6.setBounds(120,280,270,35);
		
		f.add(x1);
		f.add(x2);
		f.add(x3);
		f.add(c);
		f.add(x5);
		f.add(x6);
		
		registration = new JButton("Sends");
		registration.setBounds(170,350,140,40);
		registration.addActionListener(this);
		registration.setFont(new Font("Serif", Font.BOLD, 20));
		registration.setPreferredSize(new Dimension(300, 25));
		registration.setBackground(new Color(196,255,248));
		registration.setForeground(new Color(219, 112, 147));
		f.add(registration);
		
		log = new JButton("login");
		log.setBounds(700,350,140,40);
		log.addActionListener(this);
		log.setFont(new Font("Serif", Font.BOLD, 20));
		log.setPreferredSize(new Dimension(300, 25));
		log.setBackground(new Color(196,255,248));
		log.setForeground(new Color(219, 112, 147));
		f.add(log);
		
		
		
		f.setIconImage(new ImageIcon("2921222.png").getImage());
		f.setBackground(new Color(248, 248, 255));
        f.setSize(1000,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		
	}	
	
	public void list(String type) {
		for(int j=0;j<40;j++) {
			tab[j]=0;
		}
		t=type;
		
		list = new ArrayList<String>();
		try {
		
			con = OuverirConnex();
			java.sql.Statement st = con.createStatement();
			
			//créer une requete de sélection
			ResultSet res = st.executeQuery("select * from "+type+" ORDER BY RAND() LIMIT 20");
			//parcourt des données
			while(res.next()){
				
				list.add(res.getString(1));
				list.add(res.getString(2));
				list.add(res.getString(3));
				list.add(res.getString(4));
				list.add(res.getString(5));
				list.add(res.getString(6));

			}
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null,"ERROR :"+ e.getMessage(),"Message",JOptionPane.ERROR_MESSAGE);
			}
		itr = list.iterator();
	}
	
	public void Quizzes11(String type,int A,String B,String C,String D,String E,String F,int nb) {
		
	 
	 JPanel d = new JPanel();
	 
 	f2.setContentPane(new JLabel(new ImageIcon("giphy.gif")));
 	f2.setIconImage(new ImageIcon("examen.png").getImage());
	 
	    Label n1 = new Label(type+" Quiz");
		n1.setFont(new Font("TimesRoman",Font.BOLD,35));
		n1.setBounds(20,10,250,40);
		n1.setBackground(new Color(0, 0, 0));
		d.add(n1);
		 
		
		Label n2 = new Label("Question " +(i+1)+" of "+nb+" :");
		n2.setFont(new Font("TimesRoman",Font.BOLD,25));
		n2.setBounds(20,60,400,40);
		n2.setForeground(new Color(100,179,60));
		n2.setBackground(new Color(0, 0, 0));
		d.add(n2);
		
		Label n3 = new Label(B);
		n3.setFont(new Font("TimesRoman",Font.BOLD,18));
		n3.setBounds(20,110,970,40);
		n3.setForeground(new Color(140,179,60));
		n3.setBackground(new Color(0, 0, 0));
		d.add(n3);
		
		ch1 = new JRadioButton(C);
		ch1.setForeground(new Color(140,100,60));
		ch1.setFont(new Font("TimesRoman",Font.BOLD,18));
		ch1.setBackground(new Color(0, 0, 0));
		ch1.setActionCommand("1");
		
		ch2 = new JRadioButton(D);
		ch2.setFont(new Font("TimesRoman",Font.BOLD,18));
		ch2.setForeground(new Color(140,100,60));
		ch2.setBackground(new Color(0, 0, 0));
		ch2.setActionCommand("2");
		
		if(!E.equals("")) {
		ch3 = new JRadioButton(E);
		ch3.setFont(new Font("TimesRoman",Font.BOLD,18));
		ch3.setForeground(new Color(140,100,60));
		ch3.setBackground(new Color(0, 0, 0));
		ch3.setActionCommand("3");
		}
		if(!F.equals("")) {
		ch4 = new JRadioButton(F);
		ch4.setFont(new Font("TimesRoman",Font.BOLD,18));
		ch4.setForeground(new Color(140,100,60));
		ch4.setBackground(new Color(0, 0, 0));
		ch4.setActionCommand("4");
		}
		
		
		ch1.setBounds(120,180,850,20);
		ch2.setBounds(120,230,850,20);
		if(!E.equals("")) {
		ch3.setBounds(120,280,850,20);
		}
		if(!F.equals("")) {
		ch4.setBounds(120,330,850,20);
		}
		gp = new ButtonGroup();
		gp.add(ch1);
		gp.add(ch2);
		
		if(!E.equals("")) {
			gp.add(ch3);
		}
		if(!F.equals("")) {
		gp.add(ch4);
		}
		d.add(ch1);
		d.add(ch2);
		if(!E.equals("")) {
		d.add(ch3);
		}
		if(!F.equals("")) {
		d.add(ch4);
		}
		
		
	 
	 	Next = new JButton("Next");
		Next.setBounds(800,440,100,40);
		Next.setBackground(Color.BLUE);
		Next.setForeground(Color.WHITE);
		Next.setFocusPainted(false);
		Next.addActionListener(this);
		d.add(Next);
	    d.setBackground(Color.BLACK);
		d.setSize(1000,600);
		d.setLayout(null);
		d.setVisible(true);
		
		f2.add(d);
	 	f2.setSize(1000,600);
		f2.setLayout(null);
		f2.setVisible(true);
		f2.setResizable(false);
		f2.setLocationRelativeTo(null);

		JLabel ba = new JLabel(new ImageIcon("giphy.gif"));
		ba.setBounds(0,0,1300,800);
		d.add(ba);
		
		
		
	}

	public void Resultat(int note,int por,String p) {
		
		 f3 = new JFrame("Quizzes "+t);
		 f3.setContentPane(new JLabel(new ImageIcon("giphy.gif")));
		 f3.setIconImage(new ImageIcon("examen.png").getImage());
		 
		    Label n1 = new Label("Result: ");
			n1.setFont(new Font("TimesRoman",Font.BOLD,40));
			n1.setForeground(new Color(170,179,60));
			n1.setBounds(330,10,400,50);
			n1.setBackground(new Color(0, 0, 0));
			f3.add(n1);
			
			Label n2 = new Label(note+" of "+20);
			n2.setFont(new Font("TimesRoman",Font.BOLD,30));
			n2.setForeground(new Color(60,179,60));
			n2.setBackground(new Color(0, 0, 0));
			n2.setBounds(100,70,200,60);
			f3.add(n2);
			
		
			Label n3 = new Label(por +"%");
			n3.setFont(new Font("TimesRoman",Font.BOLD,30));
			n3.setBounds(100,150,200,60);
			n3.setForeground(new Color(60,179,60));
			n3.setBackground(new Color(0, 0, 0));
			f3.add(n3);
			
			Label R1 = new Label(p);
			
			R1.setFont(new Font("TimesRoman",Font.BOLD,30));
			R1.setForeground(new Color(60,179,60));
			R1.setBackground(new Color(0, 0, 0));
			R1.setBounds(100,230,600,100);
			f3.add(R1);
			
			
		 
		Back = new JButton("Back");
		Back.setBounds(550,400,100,40);
		Back.setBackground(Color.BLUE);
		Back.setForeground(Color.WHITE);
		Back.setFocusPainted(false);
		Back.setFont(new Font("Tahoma", Font.BOLD, 12));
		Back.addActionListener(this);
		f3.add(Back);
		
		Again = new JButton("Again");
		Again.setBounds(350,400,100,40);
		Again.setBackground(Color.BLUE);
		Again.setForeground(Color.WHITE);
		Again.setFocusPainted(false);
		Again.setFont(new Font("Tahoma", Font.BOLD, 12));
		Again.addActionListener(this);
		f3.add(Again);
		
		check = new JButton("Check");
		check.setBounds(150,400,100,40);
		check.setBackground(Color.BLUE);
		check.setForeground(Color.WHITE);
		check.setFocusPainted(false);
		check.setFont(new Font("Tahoma", Font.BOLD, 12));
		check.addActionListener(this);
		f3.add(check);
		 
		 
		 f3.setSize(800,600);
		 f3.setLayout(null);
		 f3.setVisible(true);
		 f3.setResizable(false);
		 f3.setLocationRelativeTo(null);

	}
	
	public void check() {
		
		JFrame frame = new JFrame(t+" Quiz Results");
		frame.setIconImage(new ImageIcon("research.png").getImage());

		
		JPanel pan1 = new JPanel();
		pan1.setLayout(new BoxLayout(pan1, BoxLayout.Y_AXIS));
		 
		 Label n1 = new Label(t+" Quiz");
		 n1.setFont(new Font("TimesRoman",Font.BOLD,35));
		 n1.setForeground(new Color(255,255,255));
		 n1.setBackground(new Color(0, 0, 0));
		 n1.setBounds(20,10,90,40);
		 pan1.add(n1);
		   
			try {
			
			con = OuverirConnex();
			java.sql.Statement st = con.createStatement();
			//créer une requete de sélection
			
			ResultSet res1 = st.executeQuery("select * from "+t);
			
			int m=70;
			Label n2,n3,n4,n5,ch1,ch2,ch3 = null,ch4 = null;
			int h,tpls=1;
	while(res1.next()) {
		    h =res1.getInt(1);
		    if(tab[h-1] != 0) {
				n4 = new Label("-------------------------------------------------------------------");
				n4.setFont(new Font("TimesRoman",Font.BOLD,40));
				n4.setBackground(new Color(0, 0, 0));
				n4.setForeground(new Color(255,255,255));
				pan1.add(n4);
				n5 = new Label("-------------------------------------------------------------------");
				n5.setFont(new Font("TimesRoman",Font.BOLD,40));
				n5.setBackground(new Color(0, 0, 0));
				n5.setForeground(new Color(255,255,255));
				pan1.add(n5);

		    	
		    	
			n2 = new Label("Question " +tpls+":");
			n2.setFont(new Font("TimesRoman",Font.BOLD,30));
			n2.setBackground(new Color(0, 0, 0));
			n2.setForeground(new Color(240,128,128));
			tpls++;
			n2.setBounds(20,m,200,40);
			pan1.add(n2);
			m=m+70;	
			n3 = new Label(res1.getString(2));
			n3.setFont(new Font("TimesRoman",Font.BOLD,18));
			n3.setBackground(new Color(0, 0, 0));
			n3.setForeground(new Color(240,128,128));
			n3.setBounds(20,m,200,40);
			pan1.add(n3);
			m=m+70;
			
			
			
			ch1 = new Label(res1.getString(3));
			ch1.setForeground(Color.white);
			ch1.setFont(new Font("TimesRoman",Font.BOLD,18));
			ch1.setBackground(new Color(0, 0, 0));
			ch1.setBounds(100,m,70,20); 
			pan1.add(ch1);
			m=m+70;
			ch2 = new Label(res1.getString(4));
			ch2.setForeground(Color.white);
			ch2.setFont(new Font("TimesRoman",Font.BOLD,18));
			ch2.setBackground(new Color(0, 0, 0));
			ch2.setBounds(100,m,70,20);
			pan1.add(ch2);
			m=m+70;	
			if(!res1.getString(5).equals("")) {
			ch3 = new Label(res1.getString(5));
			ch3.setForeground(Color.white);
			ch3.setFont(new Font("TimesRoman",Font.BOLD,18));
			ch3.setBackground(new Color(0, 0, 0));
			ch3.setBounds(100,m,100,20);
			pan1.add(ch3);
			m=m+70;
			}
			
			if(!res1.getString(6).equals("")) {
			ch4 = new Label(res1.getString(6));
			ch4.setForeground(Color.white);
			ch4.setFont(new Font("TimesRoman",Font.BOLD,18));
			ch4.setBackground(new Color(0, 0, 0));
			ch4.setBounds(100,m,100,20);
			pan1.add(ch4);
			m=m+70;
			}
			m=m+70;
			
			
			
			
			if(res1.getInt(7)==1) {
				ch1.setForeground(Color.green);
			}
			else if(res1.getInt(7)==2) {
				ch2.setForeground(Color.green);
			}
			else if(res1.getInt(7)==3) {
				ch3.setForeground(Color.green);
			}
			else if(res1.getInt(7)==4) {
				ch4.setForeground(Color.green);
			}
			
			
			
			if(tab[h-1]==1) {
				ch1.setForeground(Color.red);
				if(tab[h-1]==res1.getInt(7)) {
					ch1.setForeground(Color.yellow);
				}
			}
			else if(tab[h-1]==2) {
				ch2.setForeground(Color.red);
				if(tab[h-1]==res1.getInt(7)) {
					ch2.setForeground(Color.yellow);
				}
			}
			else if(tab[h-1]==3) {
				ch3.setForeground(Color.red);
				if(tab[h-1]==res1.getInt(7)) {
					ch3.setForeground(Color.yellow);
				}
			}
			else if(tab[h-1]==4) {
				ch4.setForeground(Color.red);
				if(tab[h-1]==res1.getInt(7)) {
					ch4.setForeground(Color.yellow);
				}
			}
			
			
				
		}
	}
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null,"ERROR :"+ e.getMessage(),"Message",JOptionPane.ERROR_MESSAGE);
			}
		
			
			
		JScrollPane scrollPane = new JScrollPane(pan1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBackground(Color.black);

		frame.add(scrollPane);

		frame.setSize(800,600);
		frame.setResizable(false);
		frame.setVisible(true);
		 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();
		Quizzes Q = new Quizzes();
		
		JOptionPane mess1 = new JOptionPane();

		if(ob.equals(registration)) {
			String date=new SimpleDateFormat("yyyy-MM-dd").format(c.getDate());

			String A=x5.getText(),B=x6.getText();
			if(A.equals(B) & !x1.getText().equals("") & !x2.getText().equals("") & !x3.getText().equals("")  & !x5.getText().equals("") & !x6.getText().equals("")) {
			try {
				con = Q.OuverirConnex();
				PreparedStatement stmt=con.prepareStatement("INSERT INTO `login` VALUES (?,?,?,?,?)");  
				stmt.setString(1,x1.getText());
				stmt.setString(2,x2.getText());
				stmt.setString(3,x3.getText());
				stmt.setString(4,date);
				stmt.setString(5,x5.getText());
				
				stmt.executeUpdate();  
				mess1.showMessageDialog(null,"  Student is well add","Message",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("version.png"));
				f.dispose();
				login();
			}catch (Exception e1) {
				mess1.showMessageDialog(null,"  Student Already exists","Message",JOptionPane.ERROR_MESSAGE,new ImageIcon("personal-information .png"));
			}
			}
			else {
				mess1.showMessageDialog(null,"  Information Incorrect","Message",JOptionPane.ERROR_MESSAGE,new ImageIcon("browser.png"));
			}
		}
		
		if(ob.equals(Start)) {
			try {
				
				con = OuverirConnex();
				java.sql.Statement st = con.createStatement();
				
		    	//System.out.print(nbLignes);
				//créer une requete de sélection
		    	CNE=x1.getText();
				ResultSet res = st.executeQuery("select * from login where CNE = '"+x1.getText()+"' AND Password = '"+x6.getText()+"'");
				//parcourt des données
				
				if(res.next()) {
					Principale T = new Principale();
					 mess1.showMessageDialog(null, "welcome tô your Quiz","Message",JOptionPane.ERROR_MESSAGE,new ImageIcon("waving-hand.png"));

					 T.Principale2();
					 f.dispose();
				}
				else {
					mess1.showMessageDialog(null, "Wrong Username & Password","Message",JOptionPane.ERROR_MESSAGE,new ImageIcon("cancelled.png"));

				}
				
				}catch (Exception e1) {
					mess1.showMessageDialog(null,"ERROR :"+ e1.getMessage(),"Message",JOptionPane.ERROR_MESSAGE);
				}
		}
		if(ob.equals(Next)) {
			if(gp.isSelected(null)){
				
				tab[A1-1]=-1;
			}
			else{
				String g =gp.getSelection().getActionCommand();
				tab[A1-1] = Integer.parseInt(g);
			}
			 


			i++;
			if(i<20) {
				A1 = Integer.parseInt((String) itr.next());
				String B = (String) itr.next();
				String C = (String) itr.next();
				String D = (String) itr.next();
				String E = (String) itr.next();
				String F = (String) itr.next();
				Quizzes11(t,A1,B,C,D,E,F,20);
			}
			else {
				int note =0,k=0;
				i=0;
			//	for(int j=0;j<25;j++) {
			//		System.out.print(tab[j]);
			//	}

				 int por = 0;
				String p = null;
				try {
					
					con = Q.OuverirConnex();
					java.sql.Statement st = con.createStatement();
					//créer une requete de sélection
					ResultSet res = st.executeQuery("select CR from "+t);
					//parcourt des données
					while(res.next()){
						
						if(tab[k] == res.getInt(1) ) {
							note++;
							
						}
						k++;
					}
					 por = (int) (((double)note/ 20)*100);
					
					if(por<25) {
						 p = "Well, you have a lot of studying to do!";
					}
					else if(25<=por && por<50) {
						 p = "You should study harder!";

					}
					else if(50<=por && por<75) {
						 p = "It's okay, you can improve";

					}
					else if(50<=por && por <100) {
						 p = "Very well keep going";
					}
					else {
						 p =" Excellent ";
					}
					PreparedStatement stmt=con.prepareStatement("INSERT INTO `note` VALUES (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  
					
					stmt.setString(1,CNE);
					stmt.setString(2,t);
					stmt.setInt(3,note);
					stmt.setInt(4,por);
					stmt.setString(5,p);

					for(int L=6;L<=45;L++) {
						stmt.setInt(L,tab[L-6]);
					}

					
					stmt.executeUpdate();
					
					}catch (Exception e1) {
						JOptionPane.showMessageDialog(null,"ERROR :"+ e1.getMessage(),"Message",JOptionPane.ERROR_MESSAGE);
					}
				
				f2.dispose();
				Resultat(note,por,p);

			}
		
		}
		if(ob.equals(Back)) {
			
			 f3.dispose();
			 Principale T = new Principale();
			 T.Principale2();

		}
		if(ob.equals(Again)) {
			int rep;
			rep=JOptionPane.showConfirmDialog(null,"  Quizze "+t+" start now","Message",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("test.png"));
			if(rep==0) {
					list(t);
					f3.dispose();
				
					
					A1 = Integer.parseInt((String) itr.next());
					String B = (String) itr.next();
					String C = (String) itr.next();
					String D = (String) itr.next();
					String E = (String) itr.next();
					String F = (String) itr.next();
				
					Quizzes11(t,A1,B,C,D,E,F,20);
			}
		}
		if(ob.equals(check)) {
			JOptionPane.showMessageDialog(null,"Green is the correct answer\r\n"
					+ "Red Your answer is wrong\r\n"
					+ "Yellow Your answer is correcta ","Message",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("books.png"));

			check();
			
		}
		if(ob.equals(RE)) {
			f.dispose();
			registration();
			
		}
		if(ob.equals(log)) {
			f.dispose();
			login();
			
		}
		
	
	}

}
