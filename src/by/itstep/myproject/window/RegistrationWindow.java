package by.itstep.myproject.window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import by.itstep.myproject.controller.ControllerButtonSaveUser;
import by.itstep.myproject.model.DataBaseUser;

// окно для регистрации пользователей

public class RegistrationWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textUser = new JTextField(20);
	private JPasswordField textPassword = new JPasswordField(20);
	private JPasswordField textConfirmPassword = new JPasswordField(20);
	private JTextField textName = new JTextField(20);
	private JTextField textEmail = new JTextField(20);
	private JButton btnSave = new JButton("Сохранить");

	private ControllerButtonSaveUser conButSaveUser = new ControllerButtonSaveUser();

	public RegistrationWindow(DataBaseUser dataBaseUser) {

		super("Registration field");
		setLayout(null);

		JLabel label = new JLabel("Информация пользователя");
		label.setBounds(100, 5, 200, 20);
		add(label);

		JLabel labe2 = new JLabel("Login:");
		labe2.setBounds(20, 30, 100, 20);
		add(labe2);

		textUser.setBounds(170, 30, 170, 22);
		add(textUser);

		JLabel labe3 = new JLabel("Пароль:");
		labe3.setBounds(20, 60, 100, 20);
		add(labe3);

		textPassword.setBounds(170, 60, 170, 22);
		add(textPassword);

		JLabel labe4 = new JLabel("Повторите пароль:");
		labe4.setBounds(20, 90, 150, 20);
		add(labe4);

		textConfirmPassword.setBounds(170, 90, 170, 22);
		add(textConfirmPassword);

		JLabel labe5 = new JLabel("Имя:");
		labe5.setBounds(20, 120, 150, 20);
		add(labe5);

		textName.setBounds(170, 120, 170, 22);
		add(textName);

		JLabel labe6 = new JLabel("Фамилия:");
		labe6.setBounds(20, 150, 150, 20);
		add(labe6);

		textEmail.setBounds(170, 150, 170, 22);
		add(textEmail);

		btnSave.setBounds(130, 200, 120, 31);
		add(btnSave);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(390, 300);
		setLocationRelativeTo(null);
		setLayout(null);

		conButSaveUser.setRegWin(this);
		conButSaveUser.setDataBaseUser(dataBaseUser);

		btnSave.addActionListener(conButSaveUser);

	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
		btnSave.addActionListener(conButSaveUser);
	}

	public String getLogin() {
		return textUser.getText();
	}

	public String getPassword() {
		return textPassword.getText();
	}

	public String getConfirmPassword() {
		return textConfirmPassword.getText();
	}

	public String getName() {
		return textName.getText();
	}

	public String getLastName() {
		return textEmail.getText();
	}

	public void showMessage1(String text) {
		JOptionPane.showMessageDialog(null, text);
	}

}
