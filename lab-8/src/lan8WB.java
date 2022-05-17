import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class lan8WB {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lan8WB window = new lan8WB();
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
	public lan8WB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 664, 418);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JFileChooser ofd = new JFileChooser();
				if (ofd.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
				{
					String fileName = ofd.getSelectedFile().getAbsolutePath();
					
					try 
					{
						Scanner sc = new Scanner(new File(fileName));
						
						String str = "";
						
						while (sc.hasNext())
						{
							str += sc.nextLine() + "\r\n";
						}
						
						textArea.setText(str);
						
						sc.close();
					} catch (IOException e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				};	
			}
		});
		btnNewButton.setBounds(10, 440, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u041E\u0431\u0440\u0430\u0431\u043E\u0442\u0430\u0442\u044C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				StringBuilder sb = new StringBuilder(textArea.getText());
			    String b = "";
			    int i;


			    for (i = 0; i<sb.length();i++)
			    {
			        if (Character.isLetter(sb.charAt(i))){
			            if (Character.isLowerCase(sb.charAt(i)))
			                b += Character.toUpperCase(sb.charAt(i));
			            else
			            	b += Character.toUpperCase(sb.charAt(i));
			        }
			    }
				
				textArea.setText(b);
			}
		});
		btnNewButton_1.setBounds(109, 440, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JFileChooser sfd = new JFileChooser();
				if (sfd.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION)
				{
					String fileName = sfd.getSelectedFile().getAbsolutePath();
					try 
					{
						BufferedWriter sw = new BufferedWriter(new FileWriter(new File(fileName)));
						sw.write(textArea.getText());
						sw.close();
					} catch (IOException e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton_2.setBounds(208, 440, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}


}


