package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;

import org.apache.log4j.Logger;

public class ControllerButtonDelete extends BaseController {

	private final static Logger LOGGER = Logger.getLogger(ControllerButtonDelete.class);

	@Override
	public void actionPerformed(ActionEvent e) {

		LOGGER.info(e);

		String title = addDeletWindow.getTitle();
		if (title.isEmpty()) {
			addDeletWindow.showMessage("Введите коммерческое название");
		}
		if (dataBase.findProduct(title) != null) {
			dataBase.deleteProduct(dataBase.findProduct(title));
			addDeletWindow.showMessage("Препарат удален из базы");
			
			startWindow.getComBox().setDataBase(dataBase);
		} else {
			addDeletWindow.showMessage("Препарат не найден");
		}
	}
}
