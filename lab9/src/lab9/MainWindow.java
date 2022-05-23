package lab9;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class MainWindow {
	
	String Result = "";

	private JFrame frame;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 522, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 486, 420);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JFileChooser openDialog = new JFileChooser();
				
				if (openDialog.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
				{
					String fileName = openDialog.getSelectedFile().getAbsolutePath();
					
					try
					{
						Scanner sc = new Scanner(new File(fileName));
						String str = "";
						String strseq = "Del";
						
						
						while (sc.hasNext())
						{
							str += sc.nextLine() + "\r\n";
						}
						
						sc.close();
						
						textArea.setText(str);
						
						int MainCount = 0;
						int Count = 0;
						
						StringTokenizer st = new StringTokenizer(str, " \t\n\r,.");
						
						while (st.hasMoreTokens())
						{
							String s  = st.nextToken();
							
							// Вариант B
							
							Count = 0;
							
							for (int i = 0; i < strseq.length(); i++)
							{
								if (s.charAt(i) == strseq.charAt(i))
								{
									Count++;
								}
								else
								{
									break;
								}
							}
							
							if (Count == strseq.length())
							{
								MainCount++;
							}
							
							
							/*
							if (s.charAt(0) == 'A')
							{
								Count++;
							}
							*/
						}
						/*
						Result = 
						"<HTML><H2 ALIGN=\"CENTER\">Лабораторная работа №9</H2><I><P ALIGN=\"CENTER\">Вариант A</P></I>"
						+ "<P ALIGN=\"LEFT\">Выполнил студент группы ИВТАПбд-11 <B>Галацков И.А.</B></P>"
						+ "<P ALIGN=\"LEFT\">Файл: <B>" + fileName.substring(fileName.lastIndexOf("\\") + 1) +
						"</B></P><P ALIGN=\"LEFT\">Количество найденных слов: <B>" + Count + "</B></P></HTML>";
						*/
						// Вариант B
						
						Result = 
						"<HTML><H2 ALIGN=\"CENTER\">Лабораторная работа №9</H2><I><P ALIGN=\"CENTER\">Вариант B</P></I>"
						+ "<P ALIGN=\"LEFT\">Выполнил студент группы ИВТАПбд-11 <B>Галацков И.А.</B></P>"
						+ "<P ALIGN=\"LEFT\">Файл: <B>" + fileName.substring(fileName.lastIndexOf("\\") + 1) +
						"</B></P><P ALIGN=\"LEFT\">Начало слова: <B>" + strseq +
						"</B></P><P ALIGN=\"LEFT\">Количество найденных слов: <B>" + MainCount + "</B></P></HTML>";
						
						
						
					} catch (FileNotFoundException e1)
					{
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setBounds(10, 442, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{		
				JFileChooser saveDialog = new JFileChooser();
				
				if (saveDialog.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
				{
					String fileName = saveDialog.getSelectedFile().getAbsolutePath();
					
					try
					{
						BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileName)));
						bw.write(Result);
						bw.close();;
						
					} catch (IOException e1)
					{
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton_1.setBounds(109, 442, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
