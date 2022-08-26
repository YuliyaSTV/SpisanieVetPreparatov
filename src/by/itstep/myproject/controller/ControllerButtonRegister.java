package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;

import by.itstep.myproject.window.RegistrationWindow;

public class ControllerButtonRegister extends BaseController {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		RegistrationWindow regWin = new RegistrationWindow(dataBaseUser);
		
	}
}
