package by.itstep.myproject.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

//Запись удаления, добавления, списания продукта 

public class Record implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String userLastName;
	private String titleProduct;
	private String numbAnim;
	private int amountOfDrug;


	public Record(String userName, String userLastName, String titleProduct, String numbAnim, int amountOfDrug) {
		super();
		this.userName = userName;
		this.userLastName = userLastName;
		this.titleProduct = titleProduct;
		this.numbAnim = numbAnim;
		this.amountOfDrug = amountOfDrug;
	}

	public Record() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getTitleProduct() {
		return titleProduct;
	}

	public void setTitleProduct(String titleProduct) {
		this.titleProduct = titleProduct;
	}

	public String getNumbAnim() {
		return numbAnim;
	}

	public void setNumbAnim(String numbAnim) {
		this.numbAnim = numbAnim;
	}

	public int getAmountOfDrug() {
		return amountOfDrug;
	}

	public void setAmountOfDrug(int amountOfDrug) {
		this.amountOfDrug = amountOfDrug;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amountOfDrug, numbAnim, titleProduct, userLastName, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Record other = (Record) obj;
		return amountOfDrug == other.amountOfDrug && Objects.equals(numbAnim, other.numbAnim)
				&& Objects.equals(titleProduct, other.titleProduct) && Objects.equals(userLastName, other.userLastName)
				&& Objects.equals(userName, other.userName);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		LocalDate date = LocalDate.now();
		builder.append(date + " ");
		builder.append(userName);
		builder.append(" ");
		builder.append(userLastName);
		builder.append(", название препарата - ");
		builder.append(titleProduct);
		builder.append(", количество животных - ");
		builder.append(numbAnim);
		builder.append(", количество препарата - ");
		builder.append(amountOfDrug);
		builder.append(".");
		return builder.toString();
	}

}
