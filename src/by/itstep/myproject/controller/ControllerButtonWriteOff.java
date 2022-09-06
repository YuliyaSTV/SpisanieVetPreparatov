package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import by.itstep.myproject.model.Record;

public class ControllerButtonWriteOff extends BaseController {

	@Override
	public void actionPerformed(ActionEvent e) {

		int numAnimals = Integer.parseInt(startWindow.getNumAnimals());
		int massAnimals = Integer.parseInt(startWindow.getMassAnimal());
		int dose = Integer.parseInt(startWindow.getDosage());
		int index = startWindow.getElementComboBox();
		int amountOfDrug = dataBase.getProductOfIndex(index).getAmountOfDrug(numAnimals, massAnimals, dose);
		if (amountOfDrug < 0) {
			startWindow.showMessage("недостаточное количество препарата ");
		} else {
			String userName = startWindow.getUser().getName();
			String userLastName = startWindow.getUser().getLastName();
			String titleProduct = dataBase.getProductOfIndex(index).getTitle();
			String numbAnim = startWindow.getNumAnimals();

			Record record = new Record(userName, userLastName, titleProduct, numbAnim, amountOfDrug);

			File file = new File("records.txt");
			if (file.exists()) {

				try {
					OutputStream fos = new FileOutputStream(file);
					ObjectOutput oos = new ObjectOutputStream(fos);
					oos.writeObject(record);
					oos.close();
					fos.close();
				} catch (IOException e1) {
					startWindow.showError(e1.getMessage());
				}
			}

			else {
				try {
					file.createNewFile();
				} catch (IOException e1) {
					startWindow.showError(e1.getMessage());
				}
			}
		}
	}
}