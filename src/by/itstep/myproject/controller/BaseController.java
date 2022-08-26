package by.itstep.myproject.controller;

import java.awt.event.ActionListener;

import by.itstep.myproject.model.DataBase;
import by.itstep.myproject.model.DataBaseUser;
import by.itstep.myproject.window.AddDeletWindow;
import by.itstep.myproject.window.AdminWindow;
import by.itstep.myproject.window.RegistrationWindow;
import by.itstep.myproject.window.StartWindow;

public abstract class BaseController implements ActionListener {

	protected AddDeletWindow addDeletWindow;
	protected StartWindow startWindow;
	protected AdminWindow adminWindow;
	protected RegistrationWindow regWin;
	protected DataBase dataBase;
	protected DataBaseUser dataBaseUser;

	public RegistrationWindow getRegWin() {
		return regWin;
	}

	public void setRegWin(RegistrationWindow regWin) {
		this.regWin = regWin;
	}

	public AddDeletWindow getAddDeletWindow() {
		return addDeletWindow;
	}

	public void setAddDeletWindow(AddDeletWindow addDeletWindow) {
		this.addDeletWindow = addDeletWindow;
	}

	public StartWindow getStartWindow() {
		return startWindow;
	}

	public void setStartWindow(StartWindow startWindow) {
		this.startWindow = startWindow;
	}

	public AdminWindow getAdminWindow() {
		return adminWindow;
	}

	public void setAdminWindow(AdminWindow adminWindow) {
		this.adminWindow = adminWindow;
	}

	public DataBase getDataBase() {
		return dataBase;
	}

	public void setDataBase(DataBase dataBase) {
		this.dataBase = dataBase;
	}

	public DataBaseUser getDataBaseUser() {
		return dataBaseUser;
	}

	public void setDataBaseUser(DataBaseUser dataBaseUser) {
		this.dataBaseUser = dataBaseUser;
	}

}
