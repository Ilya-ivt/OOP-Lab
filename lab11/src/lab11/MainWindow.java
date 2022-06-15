package lab11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainWindow {

	private JFrame frame;
	private JTextField textField;
	static MyList list;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		list = new MyList();
		frame = new JFrame();
		frame.setBounds(100, 100, 664, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 628, 266);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C"); // Кнопка добавления элемента в список
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String x = textField_1.getText();
				
				list.add(x);
				
				textArea.setText(list.toString());
				
				textField_1.setText("");
			}
		});
		btnNewButton.setBounds(10, 318, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0423\u0434\u0430\u043B\u0438\u0442\u044C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String x = textField_2.getText();
				
				list.delElem(x);
				
				textArea.setText(list.toString());
				
				textField_2.setText("");
			}
		});
		btnNewButton_1.setBounds(109, 318, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setToolTipText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0441\u0442\u0440\u043E\u043A\u0443, \u043A\u043E\u0442\u043E\u0440\u0443\u044E \u0432\u044B \u0445\u043E\u0442\u0438\u0442\u0435 \u043D\u0430\u0439\u0442\u0438");
		textField.setBounds(208, 288, 430, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\u041D\u0430\u0439\u0442\u0438");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String x = textField.getText();
				
				if (list.isExist(x))
				{
					textArea.setText(x);
					
					textField.setText("");
				}
			}
		});
		btnNewButton_2.setBounds(381, 318, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 288, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 288, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}
}
