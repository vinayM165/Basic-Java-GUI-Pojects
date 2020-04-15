import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JTextArea;
import javax.swing.text.AbstractDocument.BranchElement;
public class note {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					note window = new note();
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
	public note() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1148, 621);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea Epane = new JTextArea();
		Epane.setBounds(0, 0, 1202, 729);
		frame.getContentPane().add(Epane);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("     File     ");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("      New");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Epane.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Do you want to save the file? , Unless you'll loose all data");
				}
				else {
				try {
				frame.dispose();
				note a = new note();
				a.frame.setVisible(true);
			}catch(Exception e) {
				e.getMessage();
			}
				}}
		});
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("      Open     ");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser j = new JFileChooser("D:");
				int r =  j.showSaveDialog(null);
				if(r==JFileChooser.APPROVE_OPTION) {
					File fi =new File(j.getSelectedFile().getAbsolutePath());
					try {
						String sl=" ";
						FileReader f = new FileReader(fi);
						BufferedReader b = new BufferedReader(f);
						sl = b.readLine();
						while((sl=b.readLine())!=null) {
							sl= sl+"\n"+sl;
						}
						Epane.setText(sl);
						
					}catch(Exception e) {
						
					}
				}
			}
		});
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("      Save                ");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Epane!=null) {
					JFileChooser j = new JFileChooser("D:");
					int r =  j.showSaveDialog(null);
					if(r==JFileChooser.APPROVE_OPTION) {
						File fi =new File(j.getSelectedFile().getAbsolutePath());
						try {
							FileWriter f = new FileWriter(fi,false);
							BufferedWriter w = new BufferedWriter(f);
							w.write(Epane.getText());
							w.flush();
							w.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null, "file is empty");
				}
				
			}
		});
		mnFile.add(mntmSave);
		
		JMenuItem mntmExit = new JMenuItem("       Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnNewMenu = new JMenu("    Format     ");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Cut");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Epane.cut();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Copy");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Epane.copy();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Paste                    ");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Epane.paste();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmPrint = new JMenuItem("Print");
		mntmPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Epane.print();
				} catch (PrinterException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		mnNewMenu.add(mntmPrint);
		
		JMenu mnView = new JMenu("      View     ");
		menuBar.add(mnView);
		
		JMenuItem mntmStatusBar = new JMenuItem("Status Bar");
		mntmStatusBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Status s = new Status();
				s.frame.setVisible(true);
			}
		});
		mnView.add(mntmStatusBar);
		
		JMenu mnHelp = new JMenu("   Help       ");
		menuBar.add(mnHelp);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("About NotePad  ");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				About a1 = new About();
				a1.frame.setVisible(true);
			}
		});
		mnHelp.add(mntmNewMenuItem_5);
		
		JMenuItem mntmViewHelp = new JMenuItem(" View  Help");
		mntmViewHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Help h = new Help();
				h.frame.setVisible(true);
			}
		});
		mnHelp.add(mntmViewHelp);
	}
}
