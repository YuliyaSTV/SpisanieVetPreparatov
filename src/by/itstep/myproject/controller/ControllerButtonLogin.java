package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;

import by.itstep.myproject.window.MyComboBox;
import by.itstep.myproject.window.StartWindow;

public class ControllerButtonLogin extends BaseController {

	@Override
	public void actionPerformed(ActionEvent e) {
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
