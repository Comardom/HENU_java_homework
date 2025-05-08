package S9_1;

import javax.swing.*;
import java.awt.*;

public class S9_1
{
	public static void main(String[] args)
	{
		;
	}
}
class Login
{
	private int id;
	private String name;
	private boolean isRemember=false;

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Login");
		frame.setSize(500, 500);
		frame.setLocation(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4, 2));


		JLabel userLabel = new JLabel("Username:");
		JTextField userField = new JTextField();

		JLabel passLabel = new JLabel("Password:");
		JPasswordField passField = new JPasswordField();

		JCheckBox rememberBox = new JCheckBox("Remember me");

		JButton loginButton = new JButton("Login");


		frame.add(userLabel);
		frame.add(userField);

		frame.add(passLabel);
		frame.add(passField);

		frame.add(rememberBox);
		frame.add(new JLabel()); // 占位

		frame.add(new JLabel()); // 占位
		frame.add(loginButton);

		// 显示窗口
		frame.setVisible(true);

		loginButton.addActionListener(e ->
		{
			String username = userField.getText();
			String password = new String(passField.getPassword());
			boolean remember = rememberBox.isSelected();
//  		信息框查的
			JOptionPane.showMessageDialog(frame,
					"Username: " + username +
							"\nPassword: " + password +
							"\nRemember: " + remember,
					"S9_1.Login Info",
					JOptionPane.INFORMATION_MESSAGE);
		});
	}
}
