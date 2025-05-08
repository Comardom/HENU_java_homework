package S9_2;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class S9_2
{
	public static void main(String[] args)
	{
//*****************************************************************************
		JFrame frame = new JFrame("S9_2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100,100);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(10,10));
//*****************************************************************************
//		JPanel panel = new JPanel();
		JLabel label = new JLabel("File: ");
		JTextField textField = new JTextField(10);
		JButton openButton = new JButton("Open");

//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		openButton.addActionListener(e ->
		{
			JFileChooser chooser = new JFileChooser();
//			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
			{
				textField.setText(chooser.getSelectedFile().getAbsolutePath());
			}
		});
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		frame.add(label);
		frame.add(textField);
		frame.add(openButton);


//*****************************************************************************
//		JTextArea textArea = new JTextArea();
		JTextArea textArea = new JTextArea(10, 30);
		JScrollPane scrollPane = new JScrollPane(textArea);

//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		frame.add(scrollPane);
//*****************************************************************************
		JButton clearButton = new JButton("Clear");
		JButton readButton = new JButton("Read");
		JButton saveButton = new JButton("Save");
		JButton exitButton = new JButton("Exit");
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		exitButton.addActionListener(e ->
		{
			System.exit(0);
		});
		clearButton.addActionListener(e ->
		{
			textArea.setText("");
		});
		readButton.addActionListener(e ->
		{
			try (BufferedReader br = new BufferedReader(new FileReader(textField.getText())))
			{
				String line;
				while ((line = br.readLine()) != null)
				{
					textArea.append(line + "\n");
				}
			}
			catch (IOException e1)
			{
				e1.printStackTrace();
			}
		});
		saveButton.addActionListener(e ->
		{
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(textField.getText())))
			{
				bw.write(textArea.getText());
			}
			catch (IOException e2)
			{
				e2.printStackTrace(); // 处理异常
			}
		});
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		frame.add(clearButton);
		frame.add(readButton);
		frame.add(saveButton);
		frame.add(exitButton);
//*****************************************************************************
		frame.setVisible(true);
	}
}
