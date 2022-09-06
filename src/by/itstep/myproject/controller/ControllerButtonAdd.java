package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;

import org.apache.log4j.Logger;

import by.itstep.myproject.model.GroupOfDrug;
import by.itstep.myproject.model.Product;

public class ControllerButtonAdd extends BaseController {

	private final static Logger LOGGER = Logger.getLogger(ControllerButtonAdd.class);
	// Добавляет препарат в базу

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String title = addDeletWindow.getTitle();
			String diseas = addDeletWindow.getDiseas();
			String activeSubstance = addDeletWindow.getActiveSubstance();

			int oneUnit = Integer.parseInt(addDeletWindow.getOneUnit());
			int numberUnit = Integer.parseInt(addDeletWindow.getNumberUnit());

			String measurement = addDeletWindow.getMeasurement();
			String dosage = addDeletWindow.getDosage();

			String groupDrug = addDeletWindow.getGroupOfDrug();
			GroupOfDrug result = GroupOfDrug.valueOf(groupDrug.toUpperCase());

			if (title.isEmpty() || diseas.isEmpty() || activeSubstance.isEmpty()
					|| addDeletWindow.getOneUnit().isEmpty() || addDeletWindow.getNumberUnit().isEmpty()
					|| measurement.isEmpty() || dosage.isEmpty()) {
				addDeletWindow.showMessage("Не все строки заполнены !");

			} else {
				dataBase.addProduct(
						new Product(result, title, diseas, activeSubstance, oneUnit, numberUnit, measurement, dosage));
				addDeletWindow.showMessage("Успешно добавлен");
			}
		} catch (Exception e1) {
			addDeletWindow.showMessage("Неверный формат строки" + " " + e1);
			LOGGER.error("неверный формат строки" + e1);

		}
	}

}
