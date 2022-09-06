package by.itstep.myproject.window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import by.itstep.myproject.controller.ControllerButtonAdd;
import by.itstep.myproject.controller.ControllerButtonDelete;
import by.itstep.myproject.model.DataBase;

public class AddDeletWindow {

	// окно для добавления и удаления препаратов из базы

	private JTextField textTitle = new JTextField(30);
	private JTextField textDiseas = new JTextField(30);
	private JTextField textActiveSubstance = new JTextField(30);
	private JTextField textOneUnit = new JTextField(30);
	private JTextField textNumberUnit = new JTextField(30);
	private JTextField textMeasurement = new JTextField(30);
	private JTextField textDosage = new JTextField(30);
	private JTextField textGroupOfDrug = new JTextField(30);

	private JButton btnAdd = new JButton("Добавить");
	private JButton btnDelete = new JButton("Удалить");

	private ControllerButtonAdd conButAdd = new ControllerButtonAdd();
	private ControllerButtonDelete conButDelete = new ControllerButtonDelete();

	public AddDeletWindow(DataBase dataBase) {

		JFrame frame = new JFrame("Registration of the drug");
		frame.setLayout(null);

		JLabel label = new JLabel("Registration data");
		label.setBounds(150, 5, 100, 20);
		frame.add(label);

		JLabel labe2 = new JLabel("Коммерческое название:");
		labe2.setBounds(20, 30, 170, 20);
		frame.add(labe2);

		textTitle.setBounds(250, 30, 200, 22);
		frame.add(textTitle);

		JLabel labe3 = new JLabel("Применение:");
		labe3.setBounds(20, 60, 100, 20);
		frame.add(labe3);

		textDiseas.setBounds(250, 60, 200, 22);
		frame.add(textDiseas);

		JLabel labe4 = new JLabel("Действующее вещество:");
		labe4.setBounds(20, 90, 170, 20);
		frame.add(labe4);

		textActiveSubstance.setBounds(250, 90, 200, 22);
		frame.add(textActiveSubstance);

		JLabel labe5 = new JLabel("Количество препарата в единице:");
		labe5.setBounds(20, 120, 200, 20);
		frame.add(labe5);

		textOneUnit.setBounds(250, 120, 200, 22);
		frame.add(textOneUnit);

		JLabel labe6 = new JLabel("Количество единиц препарата:");
		labe6.setBounds(20, 150, 200, 20);
		frame.add(labe6);

		textNumberUnit.setBounds(250, 150, 200, 22);
		frame.add(textNumberUnit);

		JLabel labe7 = new JLabel("Единица измерения:");
		labe7.setBounds(20, 180, 150, 20);
		frame.add(labe7);
		textMeasurement.setBounds(250, 180, 200, 22);
		frame.add(textMeasurement);

		JLabel labe8 = new JLabel("Дозировка:");
		labe8.setBounds(20, 210, 150, 20);
		frame.add(labe8);
		textDosage.setBounds(250, 210, 200, 22);
		frame.add(textDosage);

		JLabel labe9 = new JLabel("Группа препаратов:");
		labe9.setBounds(20, 240, 150, 20);
		frame.add(labe9);

		textGroupOfDrug.setBounds(250, 240, 200, 22);
		frame.add(textGroupOfDrug);

		btnAdd.setBounds(100, 400, 120, 31);
		frame.add(btnAdd);

		btnDelete.setBounds(280, 400, 120, 31);
		frame.add(btnDelete);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);

		conButAdd.setAddDeletWindow(this);
		conButAdd.setDataBase(dataBase);

		conButDelete.setAddDeletWindow(this);
		conButDelete.setDataBase(dataBase);

		btnAdd.addActionListener(conButAdd);
		btnDelete.addActionListener(conButDelete);

	}

	public String getTitle() {
		return textTitle.getText();
	}

	public String getDiseas() {
		return textDiseas.getText();
	}

	public String getActiveSubstance() {
		return textActiveSubstance.getText();
	}

	public String getOneUnit() {
		return textOneUnit.getText();
	}

	public String getNumberUnit() {
		return textNumberUnit.getText();
	}

	public String getMeasurement() {
		return textMeasurement.getText();
	}

	public String getDosage() {
		return textDosage.getText();
	}

	public String getGroupOfDrug() {
		return textGroupOfDrug.getText();
	}

	public void showMessage(String text) {
		JOptionPane.showMessageDialog(null, text);
	}

}
