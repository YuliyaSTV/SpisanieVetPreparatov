package by.itstep.myproject.window;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import by.itstep.myproject.controller.ControllerButtonAdd;
import by.itstep.myproject.controller.ControllerButtonAddDelete;
import by.itstep.myproject.controller.ControllerButtonDelete;
import by.itstep.myproject.controller.ControllerButtonWriteOff;
import by.itstep.myproject.model.DataBase;
import by.itstep.myproject.model.GroupOfDrug;
import by.itstep.myproject.model.Product;

public class StartWindow extends JFrame {

	private JButton btnAdd = new JButton("Удалить");
	private JButton btnDelete = new JButton("Добавить");
	private JButton btnSpisanie = new JButton("Списать");
	private JButton btnArchive = new JButton("Архив");

	private JTextField textNumAnim = new JTextField(20);
	private JTextField textMassAnim = new JTextField(20);
	private JTextField textDosage = new JTextField(20);

	private MyComboBox comBox;
	private MyComboBox comboBox2;
	private MyComboBox comboBox3;

	ControllerButtonAddDelete conAddDel = new ControllerButtonAddDelete();
	ControllerButtonWriteOff conButWriteOff = new ControllerButtonWriteOff();

	public StartWindow(DataBase dataBase) throws HeadlessException {
		super();
		JTabbedPane tabsLeft = new JTabbedPane(JTabbedPane.TOP);
		tabsLeft.setBounds(20, 20, 300, 500);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(new JLabel(String.format("Антибиотики"))).setBounds(40, 20, 200, 20);
		comBox = new MyComboBox();
		comBox.setStarWin(this);
		comBox.setDataBase(dataBase);
		comBox.addElement(GroupOfDrug.ANTIBIOTIC);
		comBox.setPrototypeDisplayValue("very long element");
		comBox.setMaximumRowCount(10);

		comBox.setBounds(40, 40, 200, 20);
		panel.add(comBox);

		tabsLeft.addTab(String.format("Антибиотики", 1), panel);
		tabsLeft.setMnemonicAt(0, String.valueOf(1).charAt(0));

		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.add(new JLabel(String.format("Противопаразитарные "))).setBounds(40, 20, 200, 20);
		comboBox2 = new MyComboBox();
		comboBox2.setStarWin(this);
		comboBox2.setDataBase(dataBase);
		comboBox2.addElement(GroupOfDrug.ANTIPARASITIC);
		comboBox2.setPrototypeDisplayValue("very long element");
		comboBox2.setMaximumRowCount(10);
		comboBox2.setSize(200, 20);
		comboBox2.setBounds(40, 40, 200, 20);
		panel2.add(comboBox2);

		tabsLeft.addTab(String.format("Противопаразитарные ", 2), panel2);
		tabsLeft.setMnemonicAt(1, String.valueOf(2).charAt(0));

		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.add(new JLabel(String.format("НПВС"))).setBounds(40, 20, 200, 20);
		tabsLeft.addTab(String.format("НПВС", 3), panel3);
		tabsLeft.setMnemonicAt(2, String.valueOf(3).charAt(0));
		comboBox3 = new MyComboBox();
		comboBox3.setStarWin(this);
		comboBox3.setDataBase(dataBase);
		comboBox3.addElement(GroupOfDrug.NPVS);
		comboBox3.setPrototypeDisplayValue("very long element");
		comboBox3.setMaximumRowCount(10);
		comboBox3.setSize(200, 20);
		comboBox3.setBounds(40, 40, 200, 20);
		panel3.add(comboBox3);

		JPanel basPan = new JPanel();
		basPan.setLayout(null);

		JLabel labNumAnim = new JLabel("Количество животных - ");
		labNumAnim.setBounds(350, 80, 150, 25);
		textNumAnim.setBounds(600, 80, 100, 25);

		JLabel labMasAnim = new JLabel("Масса одного животного - ");
		labMasAnim.setBounds(350, 120, 250, 25);
		textMassAnim.setBounds(600, 120, 100, 25);

		JLabel labDosage = new JLabel("Дозировка препарата на 10 кг ж.м. - ");
		labDosage.setBounds(350, 160, 300, 25);
		textDosage.setBounds(600, 160, 100, 25);

		basPan.add(labNumAnim);
		basPan.add(textNumAnim);
		basPan.add(labMasAnim);
		basPan.add(textMassAnim);
		basPan.add(labDosage);
		basPan.add(textDosage);

		btnAdd.setBounds(25, 600, 120, 31);
		btnDelete.setBounds(190, 600, 120, 31);
		btnSpisanie.setBounds(400, 600, 120, 31);
		btnArchive.setBounds(550, 600, 120, 31);

		add(btnAdd);
		add(btnDelete);
		add(btnSpisanie);
		add(btnArchive);

		getContentPane().add(tabsLeft);
		add(basPan);

		setSize(800, 700);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		conAddDel.setStartWindow(this);
		conAddDel.setDataBase(dataBase);

		btnAdd.addActionListener(conAddDel);
		btnDelete.addActionListener(conAddDel);
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
		btnAdd.addActionListener(conAddDel);
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
		btnDelete.addActionListener(conAddDel);
	}

	public JButton getBtnSpisanie() {
		return btnSpisanie;
	}

	public void setBtnSpisanie(JButton btnSpisanie) {
		this.btnSpisanie = btnSpisanie;
		btnSpisanie.addActionListener(conButWriteOff);
	}

	public JButton getBtnArchive() {
		return btnArchive;
	}

	public void setBtnArchive(JButton btnArchive) {
		this.btnArchive = btnArchive;
	}

	public JTextField getTextNumAnim() {
		return textNumAnim;
	}

	public void setTextNumAnim(JTextField textNumAnim) {
		this.textNumAnim = textNumAnim;
	}

	public JTextField getTextMassAnim() {
		return textMassAnim;
	}

	public void setTextMassAnim(JTextField textMassAnim) {
		this.textMassAnim = textMassAnim;
	}

	public JTextField getTextDosage() {
		return textDosage;
	}

	public void setTextDosage(JTextField textDosage) {
		this.textDosage = textDosage;
	}

	public ControllerButtonWriteOff getConButWriteOff() {
		return conButWriteOff;
	}

	public void setConButWriteOff(ControllerButtonWriteOff conButWriteOff) {
		this.conButWriteOff = conButWriteOff;
	}

	public String getNumAnimals() {
		return textNumAnim.getText();
	}

	public String getMassAnimal() {
		return textMassAnim.getText();
	}

	public String getDosage() {
		return textDosage.getText();
	}

	public void showMessage(String text) {
		JOptionPane.showMessageDialog(null, text);
	}

	public MyComboBox getComBox() {
		return comBox;
	}

	public void setComBox(MyComboBox comBox) {
		this.comBox = comBox;
	}

}
