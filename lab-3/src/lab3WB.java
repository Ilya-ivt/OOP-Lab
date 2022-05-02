import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lab3WB {

	private JFrame frame;
	JSpinner spinner;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab3WB window = new lab3WB();
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
	public lab3WB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 593, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Размер:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Узор:");
		lblNewLabel_1.setBounds(10, 58, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(45, 58, 371, 270);
		frame.getContentPane().add(textArea);
		
		spinner = new JSpinner();
		/*spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int n = (Integer)spinner.getValue();
				String str = "";
				int i = n;
				int j = 1;
				while(i>=1) {
					
					j = n;
					while(j>=i) {
						System.out.print(j + " ");
						str = str + j + " ";
						j--;
					}
					i--;
					System.out.println();
					str = str + "\n";
				}
				
				textArea.setText(str);
			}
		});*/
			
		spinner.setBackground(Color.WHITE);
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(65, 8, 70, 20);
		frame.getContentPane().add(spinner);
		
		JButton btnNewButton = new JButton("while");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = (Integer)spinner.getValue();
				String str = "";
				int i = n;
				int j = 1;
				
				// Через while
			
				while(i>=1) {
					
					j = n;
					while(j>=i) {
						System.out.print(j + " ");
						str = str + j + " ";
						j--;
					}
					i--;
					System.out.println();
					str = str + "\n";
				}
				
				textArea.setText(str);
				
			}
				
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(155, 7, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("do while");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = (Integer)spinner.getValue();
				String str = "";
				int i = n;
				int j = 1;
				
				// Через do while
				
				do {
					j = n;
					do {
						System.out.print(j + " ");
						str = str + j + " ";
						j--;
					}
					while(j>=i);
					i--;
					System.out.println();
					str = str + "\n";
				}
				while(i>=1);
				textArea.setText(str);
				
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(261, 7, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
