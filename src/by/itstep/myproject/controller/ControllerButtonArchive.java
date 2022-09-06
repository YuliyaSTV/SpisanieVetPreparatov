package by.itstep.myproject.controller;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import by.itstep.myproject.model.Record;

public class ControllerButtonArchive extends BaseController {

	@Override
	public void actionPerformed(ActionEvent e) {

		// чтение записей из файла
		File file = new File("records.txt");

		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream oin = new ObjectInputStream(fis);
			Record record = (Record) oin.readObject();
			startWindow.getTextArea(record.toString());
		
			oin.close();
			fis.close();

		} catch (FileNotFoundException e1) {
			startWindow.showError(e1.getMessage());
		}

		catch (IOException e2) {
			startWindow.showError(e2.getMessage());
		}

		catch (ClassNotFoundException e3) {
			startWindow.showError(e3.getMessage());

		}

	}

}