package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;

public class ControllerButtonDelete extends BaseController {

	@Override
	public void actionPerformed(ActionEvent e) {
		String title = addDeletWindow.getTitle();
		if (title.isEmpty()) {
			addDeletWindow.showMessage("Введите коммерческое название");
		}
		if (dataBase.findProduct(title) != null) {
			dataBase.deleteProduct(dataBase.findProduct(title));
			addDeletWindow.showMessage("Препарат удален из базы");
		} else {
			addDeletWindow.showMessage("Препарат не найден");
		}
	}
}
