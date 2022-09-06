package by.itstep.myproject.window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import by.itstep.myproject.controller.ControllerButtonLogin;
import by.itstep.myproject.controller.ControllerButtonRegister;

public class AdminWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnLogin = new JButton("Войти");
	private JButton btnRegister = new JButton("Регистрация");
	private JTextField textUser = new JTextField(20);
	private JPasswordField textPass = new JPasswordField(20);

	private ControllerButtonLogin conButLog = new ControllerButtonLogin();
	private ControllerButtonRegister conButReg = new ControllerButtonRegister();

	public AdminWindow() {
		super("Start");

		JPanel panel = new JPanel();
		panel.setLocale(null);
		panel.setLayout(null);

		btnLogin.setBounds(25, 100, 120, 31);
		btnRegister.setBounds(190, 100, 120, 31);
		textUser.setBounds(100, 15, 210, 25);
		textPass.setBounds(100, 50, 210, 25);

		JLabel labUser = new JLabel("User ");
		labUser.setBounds(5, 15, 95, 25);
		JLabel labPass = new JLabel("Password ");
		labPass.setBounds(5, 50, 95, 25);

		panel.add(labUser);
		panel.add(textUser);
		panel.add(labPass);
		panel.add(textPass);
		panel.add(btnLogin);
		panel.add(btnRegister);

		add(panel);

		setSize(370, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public String getUser() {
		return textUser.getText();
	}

	public String getPassword() {
		return textPass.getText();
	}

	public void showMessage(String text) {
		JOptionPane.showMessageDialog(null, text);
	}

	public ControllerButtonLogin getButLog() {
		return conButLog;
	}

	public void setButLog(ControllerButtonLogin butLog) {
		this.conButLog = butLog;
		btnLogin.addActionListener(butLog);
	}

	public ControllerButtonRegister getButReg() {
		return conButReg;
	}

	public void setButReg(ControllerButtonRegister butReg) {
		this.conButReg = butReg;
		btnRegister.addActionListener(butReg);
	}
}
