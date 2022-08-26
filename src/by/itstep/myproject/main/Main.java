package by.itstep.myproject.main;



import by.itstep.myproject.controller.ControllerButtonLogin;
import by.itstep.myproject.controller.ControllerButtonRegister;
import by.itstep.myproject.model.DataBase;
import by.itstep.myproject.model.DataBaseUser;
import by.itstep.myproject.model.GroupOfDrug;
import by.itstep.myproject.model.Product;
import by.itstep.myproject.model.User;
import by.itstep.myproject.window.AdminWindow;



public class Main {
	public static void main(String[] args) {

		Product product = new Product(GroupOfDrug.ANTIBIOTIC, "Кобактан LA", "ЖКТ и РТ", "цефалоспорин", 100, 10, "мл",
				"1мл/30кг");
		Product product2 = new Product(GroupOfDrug.ANTIBIOTIC, "Гентамокс", "ЖКТ", "гентамицин + амоксициллин", 100, 10, "мл",
				"1мл/10кг");
		Product product3 = new Product(GroupOfDrug.ANTIPARASITIC, "Albendasol", "противогельминтные", "альбендазол", 100, 10, "гр",
				"10мл/10кг");
		Product product4 = new Product(GroupOfDrug.ANTIPARASITIC, "Meradoc", "против эктопаразитов", "doramectin", 100, 10, "мл",
				"10мл/10кг");
		Product product5 = new Product(GroupOfDrug.NPVS, "Ainil", "противовосполительное", "кетопрофен", 100, 10, "мл",
				"3мл/10кг");
		Product product6 = new Product(GroupOfDrug.NPVS, "Ketoprofen", "антипиретик", "кетопрофен", 100, 10, "мл",
				"3мл/10кг");
		Product product7 = new Product(GroupOfDrug.ANTIBIOTIC, "Азитронит", "РТ", "азитромицин", 100, 10, "мл",
				"1мл/20кг");
		Product product8 = new Product(GroupOfDrug.ANTIBIOTIC, "Альбипен ЛА", "ЖКТ", "Ампицциллин", 100, 10, "мл",
				"1мл/6,5кг");
		Product product9 = new Product(GroupOfDrug.ANTIBIOTIC, "Амоксицилин 15%", "РТ", "Амоксициллина тригидрат", 100, 10, "мл",
				"1мл/10кг");
		Product product10 = new Product(GroupOfDrug.ANTIBIOTIC, "Амоксигард", "Широкий спектр", "амоксицилин + клавулановая кислота", 100, 10, "мл",
				"1мл/20кг");
		Product product11 = new Product(GroupOfDrug.ANTIBIOTIC, "VETACEF", "респираторка", "цефалоспорины", 100, 10, "мл",
				"10мл/10кг");
		Product product12 = new Product(GroupOfDrug.ANTIBIOTIC, "Gentamicin", "кишечка", "гентамицин", 100, 10, "мл",
				"10мл/10кг");
		Product product13 = new Product(GroupOfDrug.ANTIBIOTIC, "VETACEF", "респираторка", "цефалоспорины", 100, 10, "мл",
				"10мл/10кг");
		Product product14 = new Product(GroupOfDrug.ANTIBIOTIC, "Gentamicin", "кишечка", "гентамицин", 100, 10, "мл",
				"10мл/10кг");
		Product product15 = new Product(GroupOfDrug.ANTIBIOTIC, "VETACEF", "респираторка", "цефалоспорины", 100, 10, "мл",
				"10мл/10кг");
		Product product16 = new Product(GroupOfDrug.ANTIBIOTIC, "Gentamicin", "кишечка", "гентамицин", 100, 10, "мл",
				"10мл/10кг");
		
		
		DataBase dataBase = new DataBase();
		dataBase.addProduct(product);
		dataBase.addProduct(product2);
		dataBase.addProduct(product3);
		dataBase.addProduct(product4);
		dataBase.addProduct(product5);
		dataBase.addProduct(product6);
		dataBase.addProduct(product7);
		dataBase.addProduct(product8);
		dataBase.addProduct(product9);
		dataBase.addProduct(product10);
		dataBase.addProduct(product11);
		dataBase.addProduct(product12);
		dataBase.addProduct(product13);
		dataBase.addProduct(product14);
		dataBase.addProduct(product15);
		dataBase.addProduct(product16);
		

		User user = new User("Анна", "Иванова", "12345", "12345");
		DataBaseUser dataUser = new DataBaseUser();
		dataUser.addUser(user);

		AdminWindow winAdmin = new AdminWindow();
		winAdmin.setVisible(true);

		ControllerButtonRegister conButReg = new ControllerButtonRegister();
		ControllerButtonLogin conButLog = new ControllerButtonLogin();

		conButReg.setDataBaseUser(dataUser);
		conButReg.setDataBase(dataBase);
		conButReg.setAdminWindow(winAdmin);

		conButLog.setDataBaseUser(dataUser);
		conButLog.setAdminWindow(winAdmin);
		conButLog.setDataBase(dataBase);
		conButReg.setAdminWindow(winAdmin);

		winAdmin.setButLog(conButLog);
		winAdmin.setButReg(conButReg);

		winAdmin.setVisible(true);
		

		
		
	}
}
