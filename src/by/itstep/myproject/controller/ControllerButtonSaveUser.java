package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import by.itstep.myproject.model.User;
import by.itstep.myproject.window.AdminWindow;
import by.itstep.myproject.window.RegistrationWindow;

public class ControllerButtonSaveUser extends BaseController {

	@Override
	public void actionPerformed(ActionEvent e) {

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
		}
		 dataBaseUser.addUser(new User(login, password, name, lastName));
//		File file = new File("Users.txt");
//		file.createNewFile();
//
//		try {
//			FileOutputStream fos = new FileOutputStream("Users");
//
//		} catch (FileNotFoundException e1) {
//
//			e1.printStackTrace();
//		}
//
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		oos.writeObject(new User(login, password, name, lastName));
//		oos.flush();
//		oos.close();

		regWin.showMessage1("Вы успешно зарегистрированы!");
	}

}
