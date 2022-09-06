package by.itstep.myproject.window;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import by.itstep.myproject.model.DataBase;
import by.itstep.myproject.model.GroupOfDrug;
import by.itstep.myproject.model.Product;

public class MyComboBox extends JComboBox<Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DataBase dataBase;
	private StartWindow starWin;

	public MyComboBox(DataBase dataBase) {
		super();
		this.dataBase = dataBase;
	}

	public MyComboBox() {
		super();
	}

	public DataBase getDataBase() {
		return dataBase;
	}

	public void setDataBase(DataBase dataBase) {
		this.dataBase = dataBase;
	}

	public void addElement(GroupOfDrug groupOfDrug) {

		int a = dataBase.getProducts().size();
		for (int i = 0; i < a; i++) {
			if (dataBase.getProductOfIndex(i).getGroupOfDrug() == groupOfDrug) {
				addItem(dataBase.getProductOfIndex(i).getTitle());

			}
		}
	}

	public StartWindow getStarWin() {
		return starWin;
	}

	public void setStarWin(StartWindow starWin) {
		this.starWin = starWin;
	}
	

}
