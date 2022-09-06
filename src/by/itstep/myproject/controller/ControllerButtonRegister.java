package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;

import org.apache.log4j.Logger;

import by.itstep.myproject.window.RegistrationWindow;

public class ControllerButtonRegister extends BaseController {

	private final static Logger LOGGER = Logger.getLogger(ControllerButtonRegister.class);

	@Override
	public void actionPerformed(ActionEvent e) {

		LOGGER.error("нажатие кнопки регистрации");
		RegistrationWindow regWin = new RegistrationWindow(dataBaseUser);
		regWin.setVisible(true);
	}
}
