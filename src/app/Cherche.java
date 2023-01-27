package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;







public class Cherche extends Quizzes implements ActionListener {
	 
		JFrame GR;
	 JPanel pan1;
	 JTextField x1;
	 JButton B1,B12,B13 ;
	 Connection con = null;
	 ArrayList<String> list;
	 java.util.Iterator<String> itr;
	 String[] columnNames;
	 DefaultTableModel tableModel;
	 JTable tableau;
		
	 public JPanel getMonPanel() {
		
		pan1 = new JPanel();
		 
		JLabel K1 = new JLabel("Sort by :");
		K1.setFont(new Font("TimesRoman",Font.BOLD,20));
		K1.setForeground(Color.blue);
		K1.setBackground(Color.black);
		K1.setBounds(250,600,150,20);
		pan1.add(K1);
		
		
		ch1 = new JRadioButton("chronology");
		ch1.setActionCommand("ID");
		ch2 = new JRadioButton("Type Quizze");
		ch2.setActionCommand("QCM");
		ch3 = new JRadioButton("Percentage");
		ch3.setActionCommand("por");
		
		ch1.setFont(new Font("TimesRoman",Font.BOLD,18));
		ch1.setForeground(new Color(140,100,60));
		ch1.setBackground(new Color(0, 0, 0));
		ch1.setBounds(450,600,150,20);
		
		
		ch2.setFont(new Font("TimesRoman",Font.BOLD,18));
		ch2.setForeground(new Color(140,100,60));
		ch2.setBackground(new Color(0, 0, 0));
		ch2.setBounds(650,600,150,20);
		
		ch3.setFont(new Font("TimesRoman",Font.BOLD,18));
		ch3.setForeground(new Color(140,100,60));
		ch3.setBackground(new Color(0, 0, 0));
		ch3.setBounds(850,600,150,20);
		
		gp = new ButtonGroup();
		gp.add(ch1);
		gp.add(ch2);
		gp.add(ch3);
		
		pan1.add(ch1);
		pan1.add(ch2);
		pan1.add(ch3);
		
		B12 = new JButton("Refresh");
		B12.setBounds(1050,590,100,40);
		B12.setBackground(Color.BLUE);
		B12.setForeground(Color.WHITE);
		B12.setFocusPainted(false);
		B12.addActionListener(this);
		pan1.add(B12);
		
		B13= new JButton("ghraphe");
		B13.setBounds(1050,650,100,40);
		B13.setBackground(Color.BLUE);
		B13.setForeground(Color.WHITE);
		B13.setFocusPainted(false);
		B13.addActionListener(this);
		//pan1.add(B13);
		
		Label n11 = new Label("CNE :");
		n11.setFont(new Font("TimesRoman",Font.BOLD,20));
		n11.setForeground(new Color(100,179,60));
		n11.setBounds(200,50,100,40);
		n11.setBackground(Color.black);
		pan1.add(n11);	
		
		Label n22 = new Label(CNE);
		n22.setFont(new Font("TimesRoman",Font.BOLD,20));
		n22.setForeground(new Color(140,120,60));
		n22.setBounds(330,50,200,40);
		n22.setBackground(Color.black);
		pan1.add(n22);	
		
		Label n33 = new Label("Nom :");
		n33.setFont(new Font("TimesRoman",Font.BOLD,20));
		n33.setForeground(new Color(100,179,60));
		n33.setBounds(200,110,100,40);
		n33.setBackground(Color.black);
		pan1.add(n33);	
		
		
		Label n55 = new Label("Prenom :");
		n55.setFont(new Font("TimesRoman",Font.BOLD,20));
		n55.setForeground(new Color(100,179,60));
		n55.setBackground(Color.black);
		n55.setBounds(200,170,100,40);
		pan1.add(n55);	
		
		
		
		columnNames = new String[] {"Type Quiz","Point","Percentage","Note"};
		tableModel = new DefaultTableModel(columnNames,0);
		
		tableau = new JTable(tableModel);
		
		list = new ArrayList<String>();
		Quizzes Q = new Quizzes();
		String x = null,y = null;
		try {
			con = Q.OuverirConnex();
			java.sql.Statement st = con.createStatement();
			//créer une requete de sélection
			ResultSet res = st.executeQuery("select * from note where CNE = '"+CNE+"'");
			//parcourt des données
			while(res.next()){
				list.add(res.getString(3));
				list.add(res.getString(4));
				list.add(res.getString(5));
				list.add(res.getString(6));
			}
			
			ResultSet res2 = st.executeQuery("select * from login where CNE = '"+CNE+"'");
			res2.next();
			 x =  res2.getString(2);
			 y =  res2.getString(3);
		
			
			}catch (Exception e1) {
				JOptionPane.showMessageDialog(null,"ERROR :"+ e1.getMessage(),"Ma_Boite",JOptionPane.ERROR_MESSAGE);
			}
			itr = list.iterator();
			
			Label n44 = new Label(x);
			n44.setBounds(330,110,200,40);
			n44.setFont(new Font("TimesRoman",Font.BOLD,20));
			n44.setForeground(new Color(140,100,60));
			n44.setBackground(Color.black);
			pan1.add(n44);	
			Label n66 = new Label(y);
			n66.setFont(new Font("TimesRoman",Font.BOLD,20));
			n66.setForeground(new Color(140,100,60));
			n66.setBackground(Color.black);
			n66.setBounds(330,170,200,40);
			pan1.add(n66);	
			
			while(itr.hasNext()){
				
				tableModel.addRow(new Object[] {itr.next(),itr.next()+" / 20",itr.next()+"%",itr.next()});

			}
			tableModel.addRow(new Object[] {null,null,null,null});
			tableModel.addRow(new Object[] {null,null,null,null});
			tableModel.addRow(new Object[] {null,null,null,null});
			tableModel.addRow(new Object[] {null,null,null,null});
			tableModel.addRow(new Object[] {null,null,null,null});
			tableModel.addRow(new Object[] {null,null,null,null});
			tableModel.addRow(new Object[] {null,null,null,null});
			tableModel.addRow(new Object[] {null,null,null,null});
			tableModel.addRow(new Object[] {null,null,null,null});
			tableModel.addRow(new Object[] {null,null,null,null});
			tableModel.addRow(new Object[] {null,null,null,null});
			tableModel.addRow(new Object[] {null,null,null,null});

			tableau.getTableHeader().setFont(new Font("Segoe Ui",Font.BOLD,12));
			tableau.getTableHeader().setOpaque(false);
			tableau.getTableHeader().setBackground(new Color(12,54,96));
			tableau.getTableHeader().setForeground(new Color(121,154,196));
			tableau.setBackground(new Color(31,21,21));
			tableau.setForeground(new Color(200,154,196));

			tableau.setRowHeight(30);
			tableau.setFocusable(false);
			tableau.setIntercellSpacing(new Dimension(0,0));
			tableau.setShowVerticalLines(false);
			

			
		
			
		 
		
		JScrollPane S = new JScrollPane(tableau);
		S.setBounds(20,250,1250,320);
		pan1.add(S);
		

		java.awt.Image img = new ImageIcon("accueil.png").getImage();
		java.awt.Image newimg = img.getScaledInstance(45,45,java.awt.Image.SCALE_SMOOTH);
    	
		
		PE1 = new JButton(new ImageIcon(newimg));
		PE1.setBounds(30,30,50,50);
		PE1.addActionListener(this);
		PE1.setBackground(Color.yellow);
		pan1.add(PE1);
		
		java.awt.Image img1 = new ImageIcon("bloc-notes.png").getImage();
		java.awt.Image newimg1 = img1.getScaledInstance(45,45,java.awt.Image.SCALE_SMOOTH);
		
		PE2 = new JButton(new ImageIcon(newimg1));
		PE2.setBounds(30,110,50,50);
		PE2.addActionListener(this);
		PE2.setBackground(Color.yellow);
		pan1.add(PE2);
		
		java.awt.Image img2 = new ImageIcon("se-deconnecter.png").getImage();
		java.awt.Image newimg2 = img2.getScaledInstance(45,45,java.awt.Image.SCALE_SMOOTH);
		
		PE3 = new JButton(new ImageIcon(newimg2));
		PE3.setBounds(1200,30,50,50);
		PE3.addActionListener(this);
		PE3.setBackground(Color.yellow);
		pan1.add(PE3);
		
		JLabel ba = new JLabel(new ImageIcon("giphy.gif"));
		ba.setBounds(0,0,1300,800);
		pan1.add(ba);
		
		pan1.setLayout(null);
		pan1.setVisible(true);
		return pan1;
	}
	
	 
	 public void Graphe() {
		
		 
	 }
	
	 
	 
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob = e.getSource();
		Quizzes Q = new Quizzes();

		if(ob.equals(PE1)) {
			jt.setSelectedIndex(0);
		}
		else if(ob.equals(PE2)) {
			jt.setSelectedIndex(1);
		}
		else if(ob.equals(PE3)) {
			fen.dispose();
			Q.login();
		}
		
		if(ob.equals(B12)){ 
			
			 String g =gp.getSelection().getActionCommand();
			 list.clear();	
			 try {
				    con = Q.OuverirConnex();
					java.sql.Statement st = con.createStatement();
					//créer une requete de sélection
					ResultSet res = st.executeQuery("select * from note where CNE = '"+CNE+"' ORDER BY "+g+" ASC");
					//parcourt des données
					while(res.next()){
						list.add(res.getString(3));
						list.add(res.getString(4));
						list.add(res.getString(5));
						list.add(res.getString(6));
					}
					}catch (Exception e1) {
						JOptionPane.showMessageDialog(null,"ERROR :"+ e1.getMessage(),"Ma_Boite",JOptionPane.ERROR_MESSAGE);
					}
				 itr =  list.iterator();
				
				for(int i = tableModel.getRowCount(); i > 0; --i) {
					tableModel.removeRow(i-1);
					}  
				
				while(itr.hasNext()){
					
					tableModel.addRow(new Object[] {itr.next(),itr.next()+" / 20",itr.next()+"%",itr.next()});

				}
				tableModel.addRow(new Object[] {null,null,null,null});
				tableModel.addRow(new Object[] {null,null,null,null});
				tableModel.addRow(new Object[] {null,null,null,null});
				tableModel.addRow(new Object[] {null,null,null,null});
				tableModel.addRow(new Object[] {null,null,null,null});
				tableModel.addRow(new Object[] {null,null,null,null});
				tableModel.addRow(new Object[] {null,null,null,null});
				tableModel.addRow(new Object[] {null,null,null,null});
				tableModel.addRow(new Object[] {null,null,null,null});
				tableModel.addRow(new Object[] {null,null,null,null});
				tableModel.addRow(new Object[] {null,null,null,null});
				tableModel.addRow(new Object[] {null,null,null,null});
		}
		
		if(ob.equals(B13)) {
			
		}
	
	}
				
		
	}

