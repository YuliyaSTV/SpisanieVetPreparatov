package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;
import org.apache.log4j.Logger;
import by.itstep.myproject.window.StartWindow;

public class ControllerButtonLogin extends BaseController {

	private final static Logger LOGGER = Logger.getLogger(ControllerButtonLogin.class);

	@Override
	public void actionPerformed(ActionEvent e) {

		LOGGER.info("нажатие проверки логина и пароля");

		String login = adminWindow.getUser();
		String password = adminWindow.getPassword();
		if (login.isEmpty() || password.isEmpty()) {
			adminWindow.showMessage("Не все строки заполнены.");
			return;
		}
		if (dataBaseUser.checkUser(login, password)) {
			adminWindow.setVisible(false);

			StartWindow startWin = new StartWindow(dataBase);
			startWin.setUser(dataBaseUser.getUser(login, password));

		} else {
			adminWindow.showMessage("Неверный логин и/или пароль");
		}
	}

}
