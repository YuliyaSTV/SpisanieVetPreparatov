package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;

import by.itstep.myproject.model.GroupOfDrug;
import by.itstep.myproject.model.Product;

public class ControllerButtonAdd extends BaseController {

	// Добавляет препарат в базу

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String title = addDeletWindow.getTitle();
		String diseas = addDeletWindow.getDiseas();
		String activeSubstance = addDeletWindow.getActiveSubstance();
		int oneUnit = 0;
		String oneUnitStr = addDeletWindow.getOneUnit();
		try {
			oneUnit = Integer.parseInt(oneUnitStr);
		} catch (NumberFormatException e1) {
			addDeletWindow.showMessage("Неправильный формат строки!");
		}
		String numberUnitStr = addDeletWindow.getNumberUnit();
		int numberUnit = 0;
		try {
			numberUnit = Integer.parseInt(numberUnitStr);
		} catch (NumberFormatException e1) {
			addDeletWindow.showMessage("Неправильный формат строки!");
		}

		String measurement = addDeletWindow.getMeasurement();
		String dosage = addDeletWindow.getDosage();

		String groupDrug = addDeletWindow.getGroupOfDrug();
		GroupOfDrug result = GroupOfDrug.valueOf(groupDrug.toUpperCase());

		if (title.isEmpty() || diseas.isEmpty() || activeSubstance.isEmpty() || oneUnitStr.isEmpty()
				|| numberUnitStr.isEmpty() || measurement.isEmpty() || dosage.isEmpty()) {
			addDeletWindow.showMessage("Не все строки заполнены !");
		} else {
			dataBase.addProduct(
					new Product(result, title, diseas, activeSubstance, oneUnit, numberUnit, measurement, dosage));
			addDeletWindow.showMessage("Успешно добавлен");
		}
	}

}
