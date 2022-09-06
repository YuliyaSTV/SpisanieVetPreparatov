package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

import by.itstep.myproject.model.User;
import by.itstep.myproject.window.AdminWindow;
import by.itstep.myproject.window.RegistrationWindow;

public class ControllerButtonSaveUser extends BaseController {

	private final static Logger LOGGER = Logger.getLogger(ControllerButtonSaveUser.class);

	@Override
	public void actionPerformed(ActionEvent e) {

		LOGGER.info("нажатие кнопки сохранения данных пользователя");

		String login = regWin.getLogin();
		String password = regWin.getPassword();
		String confirmPassword = regWin.getConfirmPassword();
		String name = regWin.getName();
		String lastName = regWin.getLastName();

		if (login.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || name.isEmpty()
				|| lastName.isEmpty()) {
			regWin.showMessage1("Не все строки заполнены.");
			return;
		}
		if (!password.equals(confirmPassword)) {
			regWin.showMessage1("Пароли должны совпадать!");
			return;

		} else {
			dataBaseUser.addUser(new User(login, password, name, lastName));
			regWin.showMessage1("        Вы успешно зарегистрированы!\n "
					+ "Для входа в программу введите ваш логин и пароль");
			regWin.setVisible(false);
		}

	}
}
