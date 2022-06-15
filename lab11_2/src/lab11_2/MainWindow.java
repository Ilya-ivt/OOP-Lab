package lab11_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MainWindow {

	private JFrame frame;
	private JTextField textField;
	static MyList list;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_3;
	private JTextField textField_4;

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
		btnNewButton_1.setBounds(324, 453, 89, 23);
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
		
		textField_2 = new JTextField();
		textField_2.setBounds(324, 422, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u041F\u0440\u044F\u043C\u043E\u0435 \u043D\u0430\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (rdbtnNewRadioButton.isSelected())
				{
					textArea.setText(list.toString());
				}
				else
				{
					textArea.setText(list.toStringReverse());
				}
			}
		});
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) 
			{
				//textArea.setText(list.toString());
			}
			@Override
			public void focusLost(FocusEvent e) 
			{
				//textArea.setText(list.toStringReverse());
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 287, 192, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u041E\u0431\u0440\u0430\u0442\u043D\u043E\u0435 \u043D\u0430\u043F\u0440\u0430\u0432\u043B\u0435\u043D\u0438\u0435");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (rdbtnNewRadioButton.isSelected())
				{
					textArea.setText(list.toString());
				}
				else
				{
					textArea.setText(list.toStringReverse());
				}
			}
		});
		rdbtnNewRadioButton_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) 
			{
				//textArea.setText(list.toStringReverse());
			}
			
			@Override
			public void focusLost(FocusEvent e) 
			{
				//textArea.setText(list.toString());
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(10, 318, 192, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(175, 422, 126, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C \u0432 \u0445\u0432\u043E\u0441\u0442");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String x = textField_3.getText();
				
				list.addToTail(x);
				
				if (rdbtnNewRadioButton_1.isSelected())
				{
					textArea.setText(list.toStringReverse());
				}
				else
				{
					textArea.setText(list.toString());
				}
				
				textField_3.setText("");
			}
		});
		btnNewButton_3.setBounds(171, 453, 130, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 422, 155, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C \u0432 \u0433\u043E\u043B\u043E\u0432\u0443");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String x = textField_4.getText();
				
				list.addToHead(x);
				
				if (rdbtnNewRadioButton.isSelected())
				{
					textArea.setText(list.toString());
				}
				else
				{
					textArea.setText(list.toStringReverse());
				}
				
				textField_4.setText("");
			}
		});
		btnNewButton_4.setBounds(10, 453, 151, 23);
		frame.getContentPane().add(btnNewButton_4);
	}
}
