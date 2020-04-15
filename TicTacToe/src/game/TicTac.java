package game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TicTac {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	protected static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTac window = new TicTac();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTac() {
		initialize();
	}
	int p1Won() {
		if(p1[0]==1&&p1[1]==1&&p1[2]==1) {
			return 1;
		}
		if(p1[3]==1&&p1[4]==1&&p1[5]==1) {
			return 1;
		}
		if(p1[6]==1&&p1[7]==1&&p1[8]==1) {
			return 1;
		}
		if(p1[0]==1&&p1[3]==1&&p1[6]==1) {
			return 1;
		}
		if(p1[1]==1&&p1[4]==1&&p1[7]==1) {
			return 1;
		}
		if(p1[2]==1&&p1[5]==1&&p1[8]==1) {
			return 1;
		}if(p1[0]==1&&p1[4]==1&&p1[8]==1) {
			return 1;
		}if(p1[2]==1&&p1[4]==1&&p1[6]==1) {
			return 1;
		}
		return 0;
	}
	int p2Won() {
		if(p2[0]==1&&p2[1]==1&&p2[2]==1) {
			return 1;
		}
		if(p2[3]==1&&p2[4]==1&&p2[5]==1) {
			return 1;
		}
		if(p2[6]==1&&p2[7]==1&&p2[8]==1) {
			return 1;
		}
		if(p2[0]==1&&p2[3]==1&&p2[6]==1) {
			return 1;
		}
		if(p2[1]==1&&p2[4]==1&&p2[7]==1) {
			return 1;
		}
		if(p2[2]==1&&p2[5]==1&&p2[8]==1) {
			return 1;
		}if(p2[0]==1&&p2[4]==1&&p2[8]==1) {
			return 1;
		}if(p2[2]==1&&p2[4]==1&&p2[6]==1) {
			return 1;
		}
		return 0;
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 392, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton a1 = new JButton("");
		a1.setFont(new Font("Tahoma", Font.PLAIN, 42));
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[0]==0) {
					if(turn%2==0) {
						a1.setText("X");
						turn++;
						btn[0]=1;
						p1[0]=1;
						int r1= p1Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 1 Has won!");
						}
					}
					else {
						
						turn++;
						btn[0]=1;
						p2[0]=1;
						int r1= p2Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 2 Has won!");
						}
					}
				}
				else {
					
				}
				
				
				
			}
		});
		a1.setBounds(10, 11, 111, 99);
		frame.getContentPane().add(a1);
		
		JButton a2 = new JButton("");
		a2.setFont(new Font("Tahoma", Font.PLAIN, 42));
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[1]==0) {
					if(turn%2==0) {
						a2.setText("X");
						turn++;
						btn[1]=1;
						p1[1]=1;
						int r1= p1Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 1 Has won!");
						}
					}
					else {
						a2.setText("O");
						turn++;
						btn[1]=1;
						p2[1]=1;
						int r1= p2Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 2 Has won!");
						}
					}
				}
				else {
					
			}
		}});
		a2.setBounds(130, 11, 111, 99);
		frame.getContentPane().add(a2);
		
		JButton a3 = new JButton("");
		a3.setFont(new Font("Tahoma", Font.PLAIN, 42));
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[2]==0) {
					if(turn%2==0) {
						a3.setText("X");
						turn++;
						btn[2]=1;
						p1[2]=1;
						int r1= p1Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 1 Has won!");
						}
					}
					else {
						a3.setText("O");
						turn++;
						btn[2]=1;
						p2[2]=1;
						int r1= p2Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 2 Has won!");
						}
					}
				}
				else {
					
			}}
		});
		a3.setBounds(251, 11, 111, 99);
		frame.getContentPane().add(a3);
		
		JButton b1 = new JButton("");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 42));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[3]==0) {
					if(turn%2==0) {
						b1.setText("X");
						turn++;
						btn[3]=1;
						p1[3]=1;
						int r1= p1Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 1 Has won!");
						}
					}
					else {
						b1.setText("O");
						turn++;
						btn[3]=1;
						p2[3]=1;
						int r1= p1Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 2 Has won!");
						}
					}
				}
				else {
					
			}
			}
		});
		b1.setBounds(10, 121, 111, 99);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.setFont(new Font("Tahoma", Font.PLAIN, 42));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[4]==0) {
					if(turn%2==0) {
						b2.setText("X");
						turn++;
						btn[4]=1;
						p1[4]=1;
						int r1= p1Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 1 Has won!");
						}
					}
					else {
						b2.setText("O");
						turn++;
						btn[4]=1;
						p2[4]=1;
						int r1= p2Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 2 Has won!");
						}
					}
				}
				else {
					
			}
			}
		});
		b2.setBounds(130, 121, 111, 99);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("");
		b3.setFont(new Font("Tahoma", Font.PLAIN, 42));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[5]==0) {
					if(turn%2==0) {
						b3.setText("X");
						turn++;
						btn[5]=1;
						p1[5]=1;
						int r1= p1Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 1 Has won!");
						}
					}
					else {
						b3.setText("O");
						turn++;
						btn[5]=1;
						p2[5]=1;
						int r1= p2Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 2 Has won!");
						}
					}
				}
				else {
					
			}
			}
		});
		b3.setBounds(251, 121, 111, 99);
		frame.getContentPane().add(b3);
		
		JButton d1 = new JButton("");
		d1.setFont(new Font("Tahoma", Font.PLAIN, 42));
		d1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[6]==0) {
					if(turn%2==0) {
						d1.setText("X");
						turn++;
						btn[6]=1;
						p1[6]=1;
						int r1= p1Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 1 Has won!");
						}
					}
					else {
						d1.setText("O");
						turn++;
						btn[6]=1;
						p2[6]=1;
						int r1= p2Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 2 Has won!");
						}
					}
				}
				else {
					
			}
			}
		});
		d1.setBounds(10, 231, 111, 99);
		frame.getContentPane().add(d1);
		
		JButton d2 = new JButton("");
		d2.setFont(new Font("Tahoma", Font.PLAIN, 42));
		d2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[7]==0) {
					if(turn%2==0) {
						d2.setText("X");
						turn++;
						btn[7]=1;
						p1[7]=1;
						int r1= p1Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 1 Has won!");
						}
					}
					else {
						d2.setText("O");
						turn++;
						btn[7]=1;
						p2[7]=1;
						int r1= p2Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 2 Has won!");
						}
					}
				}
				else {
					
			}
			}
		});
		d2.setBounds(130, 231, 111, 99);
		frame.getContentPane().add(d2);
		
		JButton d3 = new JButton("");
		d3.setFont(new Font("Tahoma", Font.PLAIN, 42));
		d3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btn[8]==0) {
					if(turn%2==0) {
						d3.setText("X");
						turn++;
						btn[8]=1;
						p1[8]=1;
						int r1= p1Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 1 Has won!");
						}
					}
					else {
						d3.setText("O");
						turn++;
						btn[8]=1;
						p2[8]=1;
						int r1= p2Won();
						if(r1==1) {
							JOptionPane.showMessageDialog(null, "Player 2 Has won!");
						}
					}
				}
				else {
					
			}
			}
		});
		d3.setBounds(251, 231, 111, 99);
		frame.getContentPane().add(d3);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				TicTac t = new TicTac();
				t.frame.setVisible(true);
			}
		});
		btnReset.setBounds(54, 354, 117, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(196, 354, 117, 23);
		frame.getContentPane().add(btnExit);
	}
	int turn =2;
	int[] btn = {0,0,0,0,0,0,0,0,0};
	int p1[]= {0,0,0,0,0,0,0,0,0};
	int p2[]= {0,0,0,0,0,0,0,0,0};
}
