package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;

import by.itstep.myproject.window.AddDeletWindow;

public class ControllerButtonAddDelete extends BaseController {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		AddDeletWindow addDelWindow = new AddDeletWindow(dataBase);
		
	}
    
}
