package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;

import org.apache.log4j.Logger;

import by.itstep.myproject.window.AddDeletWindow;

public class ControllerButtonAddDelete extends BaseController {

	private final static Logger LOGGER = Logger.getLogger(ControllerButtonAddDelete.class);

	@Override
	public void actionPerformed(ActionEvent e) {

		AddDeletWindow addDelWindow = new AddDeletWindow(dataBase);
		LOGGER.error(addDeletWindow);
	}

}
