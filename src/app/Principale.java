package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Principale implements ActionListener, MouseListener {
	public  JFrame f;
	JButton N,L;
	public static JButton PE;
	JPanel pan,pan1,pan2,pan3;
	JButton HTML,CSS,P1,P2,P3,P4,P5,P6,P7,ME,PE1,PE2,PE3;
	public static JTabbedPane jt;
	public static String t;
	public static int A1;
	public static JFrame fen;
	public static ArrayList<String> list;
	public static Iterator itr;
	
	public void Principale1(){
		
		f = new JFrame("chargement");
    	
    	f.setContentPane(new JLabel(new ImageIcon("giphy.gif")));
    	
    	JLabel IMG = new JLabel();
    	IMG.setBounds(175,0,200,200);
    	IMG.setIcon(new ImageIcon("3.gif"));
    	
    	JLabel Quizzes = new JLabel("Quizzes");
    	Quizzes.setFont(new Font("TimesRoman",Font.BOLD,30));
    	Quizzes.setBounds(155,-40,200,200);
    	Quizzes.setForeground(Color.YELLOW);
        JProgressBar P = new JProgressBar(JProgressBar.HORIZONTAL,0,3000);
        P.setBounds(115,145,200,25);
        P.setStringPainted(true);
        
        f.add(P);
        f.add(IMG);
        f.add(Quizzes);
        
        f.setSize(450,350);
		f.setIconImage(new ImageIcon("applications.png").getImage());

		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		
		for(int i=0;i<=1500;i++) {
			P.setValue(2*i);
			try{Thread.sleep(1);}catch(Exception e){}	
			if(i==1500) {
				f.dispose();
				Quizzes Q = new Quizzes();
				Q.login();
			}
		}

	}

	public void Principale2() {
		
		fen = new JFrame("Application d'evaluation ");
		

		pan = new JPanel();
	
		
		
		JLabel L = new JLabel("The Quiz ");
		L.setFont(new Font("TimesRoman",Font.BOLD,30));
		L.setForeground(new Color(100,179,60));
		L.setBounds(150,-10,1200,120);
		pan.add(L);
		
		JLabel B = new JLabel("Each quiz contains 20 questions, you get 1 point for each correct answer, at the end of each quiz you get your total score." );
		B.setFont(new Font("TimesRoman",Font.BOLD,15));
		B.setForeground(new Color(140,100,60));
		B.setBounds(150,60,1000,60);
		pan.add(B);
		
		JLabel L1 = new JLabel("When you finish the quiz , you can go through each question with the correct answer.");
		L1.setFont(new Font("TimesRoman",Font.BOLD,15));
		L1.setForeground(new Color(140,100,60));
		L1.setBounds(150,90,1000,60);
		pan.add(L1);
		
	
		HTML = new JButton(new ImageIcon("html-5.png"));
		HTML.setBounds(250,170,100,100);
		HTML.addActionListener(this);
		pan.add(HTML);
		HTML.setOpaque(false);
		HTML.setContentAreaFilled(false);
		HTML.addMouseListener(this);
		HTML.setBorder(BorderFactory.createLineBorder(Color.green));
		 
		CSS = new JButton(new ImageIcon("css-3.png"));
		CSS.setBounds(600,170,100,100);
		CSS.addActionListener(this);
		pan.add(CSS);
		CSS.setOpaque(false);
		CSS.setContentAreaFilled(false);
		CSS.addMouseListener(this);
		CSS.setBorder(BorderFactory.createLineBorder(Color.green));
		
		P1 = new JButton(new ImageIcon("c-.png"));
		P1.setBounds(950,170,100,100);
		P1.addActionListener(this);
		pan.add(P1);
		P1.setOpaque(false);
		P1.setContentAreaFilled(false);
		P1.addMouseListener(this);
		P1.setBorder(BorderFactory.createLineBorder(Color.green));
		
		 
		P2 = new JButton(new ImageIcon("c-sharp.png"));
		P2.setBounds(250,370,100,100);
		P2.addActionListener(this);
		pan.add(P2);
		P2.setOpaque(false);
		P2.setContentAreaFilled(false);
		P2.addMouseListener(this);
		P2.setBorder(BorderFactory.createLineBorder(Color.green));
		
		
		
		P3 = new JButton(new ImageIcon("java.png"));
		P3.setBounds(600,370,100,100);
		P3.addActionListener(this);
		pan.add(P3);
		P3.setOpaque(false);
		P3.setContentAreaFilled(false);
		P3.addMouseListener(this);
		P3.setBorder(BorderFactory.createLineBorder(Color.green));
		
		 
		P4 = new JButton(new ImageIcon("javascript.png"));
		P4.setBounds(950,370,100,100);
		P4.addActionListener(this);
		pan.add(P4);
		P4.setOpaque(false);
		P4.setContentAreaFilled(false);
		P4.addMouseListener(this);
		P4.setBorder(BorderFactory.createLineBorder(Color.green));
		
		
		P5 = new JButton(new ImageIcon("php.png"));
		P5.setBounds(250,570,100,100);
		P5.addActionListener(this);
		pan.add(P5);
		P5.setOpaque(false);
		P5.setContentAreaFilled(false);
		P5.addMouseListener(this);
		P5.setBorder(BorderFactory.createLineBorder(Color.green));

		
		P6 = new JButton(new ImageIcon("python.png"));
		P6.setBounds(600,570,100,100);
		P6.addActionListener(this);
		pan.add(P6);
		P6.setOpaque(false);
		P6.setContentAreaFilled(false);
		P6.addMouseListener(this);
		P6.setBorder(BorderFactory.createLineBorder(Color.green));
		
		
		P7 = new JButton(new ImageIcon("sql-server.png"));
		P7.setBounds(950,570,100,100);
		P7.addActionListener(this);
		pan.add(P7);
		P7.setOpaque(false);
		P7.setContentAreaFilled(false);
		P7.addMouseListener(this);
		P7.setBorder(BorderFactory.createLineBorder(Color.green));
		
		
		
		
		pan.setBounds(0,0,1300,1000);
		pan.setLayout(null);
		pan.setVisible(true);
		
	  
	
		
		
		java.awt.Image img = new ImageIcon("accueil.png").getImage();
		java.awt.Image newimg = img.getScaledInstance(45,45,java.awt.Image.SCALE_SMOOTH);
    	
		
		PE1 = new JButton(new ImageIcon(newimg));
		PE1.setBounds(30,30,50,50);
		PE1.addActionListener(this);
		PE1.setBackground(Color.yellow);
		pan.add(PE1);
		
		java.awt.Image img1 = new ImageIcon("bloc-notes.png").getImage();
		java.awt.Image newimg1 = img1.getScaledInstance(45,45,java.awt.Image.SCALE_SMOOTH);
		
		PE2 = new JButton(new ImageIcon(newimg1));
		PE2.setBounds(30,110,50,50);
		PE2.addActionListener(this);
		PE2.setBackground(Color.yellow);
		pan.add(PE2);
		
		java.awt.Image img2 = new ImageIcon("se-deconnecter.png").getImage();
		java.awt.Image newimg2 = img2.getScaledInstance(45,45,java.awt.Image.SCALE_SMOOTH);
		
		PE3 = new JButton(new ImageIcon(newimg2));
		PE3.setBounds(1200,30,50,50);
		PE3.addActionListener(this);
		PE3.setBackground(Color.yellow);
		pan.add(PE3);
		
		
		Cherche CH = new Cherche();
		pan3 = CH.getMonPanel();
		
		jt = new JTabbedPane();
		jt.setBounds(-5,-30,1500,1000);

		
			
		jt.add("1",pan);
		jt.add("1",pan3);
		
		
		
		
		fen.add(jt);
        fen.setIconImage(new ImageIcon("home.png").getImage());

       
		fen.setSize(1300,800);
		fen.setResizable(false);
		fen.setLayout(null);
		fen.setVisible(true);
		fen.setLocationRelativeTo(null);
		
		JLabel ba = new JLabel(new ImageIcon("giphy.gif"));
		ba.setBounds(0,0,1300,800);
		pan.add(ba);
		
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 Principale T = new Principale();
		 T.Principale1();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();
			Quizzes Q = new Quizzes();

		if(ob.equals(HTML)) {
			Q.list("HTML");
			int rep;
			rep=JOptionPane.showConfirmDialog(null,"  Quizze "+t+" start now","Messagr",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("test.png"));
			if(rep==0) {
				A1 = Integer.parseInt((String) itr.next());
			String B = (String) itr.next();
			String C = (String) itr.next();
			String D = (String) itr.next();
			String E = (String) itr.next();
			String F = (String) itr.next();
			
				
				fen.dispose();
				Q.Quizzes11(t,A1,B,C,D,E,F,20);
			}
		}
		else if(ob.equals(CSS)) {
			Q.list("CSS");
			int rep;
			rep=JOptionPane.showConfirmDialog(null,"  Quizze "+t+" start now","Messagr",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("test.png"));
			if(rep==0) {
				A1 = Integer.parseInt((String) itr.next());
			String B = (String) itr.next();
			String C = (String) itr.next();
			String D = (String) itr.next();
			String E = (String) itr.next();
			String F = (String) itr.next();
			
				
				fen.dispose();
				Q.Quizzes11(t,A1,B,C,D,E,F,20);
			}
			 
		}
		else if(ob.equals(P1)) {
			Q.list("Cpp");
			int rep;
			rep=JOptionPane.showConfirmDialog(null,"  Quizze "+t+" start now","Messagr",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("test.png"));
			if(rep==0) {
				A1 = Integer.parseInt((String) itr.next());
			String B = (String) itr.next();
			String C = (String) itr.next();
			String D = (String) itr.next();
			String E = (String) itr.next();
			String F = (String) itr.next();
			
				
				fen.dispose();
				Q.Quizzes11(t,A1,B,C,D,E,F,20);
			}
			 
			
		}
		else if(ob.equals(P2)) {
			Q.list("Csharp");
			int rep;
			rep=JOptionPane.showConfirmDialog(null,"  Quizze "+t+" start now","Messagr",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("test.png"));
			if(rep==0) {
				A1 = Integer.parseInt((String) itr.next());
			String B = (String) itr.next();
			String C = (String) itr.next();
			String D = (String) itr.next();
			String E = (String) itr.next();
			String F = (String) itr.next();
			
				
				fen.dispose();
				Q.Quizzes11(t,A1,B,C,D,E,F,20);
			}
			 
		}
		else if(ob.equals(P3)) {
			Q.list("java");
			int rep;
			rep=JOptionPane.showConfirmDialog(null,"  Quizze "+t+" start now","Messagr",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("test.png"));
			if(rep==0) {
				A1 = Integer.parseInt((String) itr.next());
			String B = (String) itr.next();
			String C = (String) itr.next();
			String D = (String) itr.next();
			String E = (String) itr.next();
			String F = (String) itr.next();
			
				
				fen.dispose();
				Q.Quizzes11(t,A1,B,C,D,E,F,20);
			}
			 
		}
		else if(ob.equals(P4)) {
			Q.list("javascript");
			int rep;
			rep=JOptionPane.showConfirmDialog(null,"  Quizze "+t+" start now","Messagr",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("test.png"));
			if(rep==0) {
				A1 = Integer.parseInt((String) itr.next());
			String B = (String) itr.next();
			String C = (String) itr.next();
			String D = (String) itr.next();
			String E = (String) itr.next();
			String F = (String) itr.next();
			
				
				fen.dispose();
				Q.Quizzes11(t,A1,B,C,D,E,F,20);
			}
			 
		}
		else if(ob.equals(P5)) {
			Q.list("php");
			int rep;
			rep=JOptionPane.showConfirmDialog(null,"  Quizze "+t+" start now","Messagr",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("test.png"));
			if(rep==0) {
				A1 = Integer.parseInt((String) itr.next());
			String B = (String) itr.next();
			String C = (String) itr.next();
			String D = (String) itr.next();
			String E = (String) itr.next();
			String F = (String) itr.next();
			
				
				fen.dispose();
				Q.Quizzes11(t,A1,B,C,D,E,F,20);
			}
			 
		}
		else if(ob.equals(P6)) {
			Q.list("python");
			int rep;
			rep=JOptionPane.showConfirmDialog(null,"  Quizze "+t+" start now","Messagr",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("test.png"));
			if(rep==0) {
				A1 = Integer.parseInt((String) itr.next());
			String B = (String) itr.next();
			String C = (String) itr.next();
			String D = (String) itr.next();
			String E = (String) itr.next();
			String F = (String) itr.next();
			
				
				fen.dispose();
				Q.Quizzes11(t,A1,B,C,D,E,F,20);
			}
			 
		}
		else if(ob.equals(P7)) {
			Q.list("Qsql");
			int rep;
			rep=JOptionPane.showConfirmDialog(null,"  Quizze "+t+" start now","Messagr",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("test.png"));
			if(rep==0) {
				A1 = Integer.parseInt((String) itr.next());
			String B = (String) itr.next();
			String C = (String) itr.next();
			String D = (String) itr.next();
			String E = (String) itr.next();
			String F = (String) itr.next();
			
				
				fen.dispose();
				
			}
			 
		}
		
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
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	 }

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();

		  if(ob.equals(HTML)) {
				HTML.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		  }
		  if(ob.equals(CSS)) {
				CSS.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		  }
		  if(ob.equals(P1)) {
				P1.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		  }
		  if(ob.equals(P2)) {
				P2.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		  }
		  if(ob.equals(P3)) {
				P3.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		  }
		  if(ob.equals(P4)) {
				P4.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		  }
		  if(ob.equals(P5)) {
				P5.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		  }
		  if(ob.equals(P6)) {
				P6.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		  }
		  if(ob.equals(P7)) {
				P7.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		  }
		  
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();

		if(ob.equals(HTML)) {
			HTML.setBorder(BorderFactory.createLineBorder(Color.green));

	  }
	  if(ob.equals(CSS)) {
			CSS.setBorder(BorderFactory.createLineBorder(Color.green));

	  }
	  if(ob.equals(P1)) {
			P1.setBorder(BorderFactory.createLineBorder(Color.green));

	  }
	  if(ob.equals(P2)) {
			P2.setBorder(BorderFactory.createLineBorder(Color.green));

	  }
	  if(ob.equals(P3)) {
			P3.setBorder(BorderFactory.createLineBorder(Color.green));

	  }
	  if(ob.equals(P4)) {
			P4.setBorder(BorderFactory.createLineBorder(Color.green));

	  }
	  if(ob.equals(P5)) {
			P5.setBorder(BorderFactory.createLineBorder(Color.green));

	  }
	  if(ob.equals(P6)) {
			P6.setBorder(BorderFactory.createLineBorder(Color.green));

	  }
	  if(ob.equals(P7)) {
			P7.setBorder(BorderFactory.createLineBorder(Color.green));

	  }
	}



}


