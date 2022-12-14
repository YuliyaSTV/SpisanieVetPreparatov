package by.itstep.myproject.model;

import java.util.Objects;

public class Product {

	private GroupOfDrug groupOfDrug;
	private String title;
	private String disease;
	private String activeSubstance;
	private int oneUnit;
	private int numberUnit;
	private String measurement;
	private String dosage;

	public Product() {
		super();
	}

	public Product(GroupOfDrug groupOfDrug, String title, String disease, String activeSubstance, int oneUnit,
			int numberUnit, String measurement, String dosage) {
		super();
		this.groupOfDrug = groupOfDrug;
		this.title = title;
		this.disease = disease;
		this.activeSubstance = activeSubstance;
		this.oneUnit = oneUnit;
		this.numberUnit = numberUnit;
		this.measurement = measurement;
		this.dosage = dosage;
	}

	public GroupOfDrug getGroupOfDrug() {
		return groupOfDrug;
	}

	public void setGroupOfDrug(GroupOfDrug groupOfDrug) {
		this.groupOfDrug = groupOfDrug;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getActiveSubstance() {
		return activeSubstance;
	}

	public void setActiveSubstance(String activeSubstance) {
		this.activeSubstance = activeSubstance;
	}

	public int getOneUnit() {
		return oneUnit;
	}

	public void setOneUnit(int oneUnit) {
		this.oneUnit = oneUnit;
	}

	public int getNumberUnit() {
		return numberUnit;
	}

	public void setNumberUnit(int numberUnit) {
		this.numberUnit = numberUnit;
	}

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public int getRemainder(int writtenOf) {
		int result = (numberUnit - writtenOf);
		if (result > 0) {
			return result;
		}
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(activeSubstance, disease, dosage, groupOfDrug, measurement, numberUnit, oneUnit, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(activeSubstance, other.activeSubstance) && Objects.equals(disease, other.disease)
				&& Objects.equals(dosage, other.dosage) && groupOfDrug == other.groupOfDrug
				&& Objects.equals(measurement, other.measurement) && numberUnit == other.numberUnit
				&& oneUnit == other.oneUnit && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("???????????? ???????????????????????? - ");
		builder.append(groupOfDrug + "\n");
		builder.append("???????????????????????? ???????????????? - ");
		builder.append(title + "\n");
		builder.append("???????????????????? - ");
		builder.append(disease + "\n");
		builder.append("?????????????????????? ???????????????? - ");
		builder.append(activeSubstance + "\n");
		builder.append("???????????????????? ?? ?????????????? - ");
		builder.append(oneUnit + measurement + "\n");
		builder.append("???????????????????? ???????????? - ");
		builder.append(numberUnit + "\n");
		builder.append("?????????????????? - ");
		builder.append(dosage + "\n");
		return builder.toString();
	}

	public int getAmountOfDrug(int numberOfAnimals, int massOfAnimal, int dose) {
		int variableDoses = 10;
		int quantityOfDrugWriteOff = (numberOfAnimals * massOfAnimal * dose) / variableDoses;
		int amountOfDrug = numberUnit * oneUnit;
		if (numberUnit > 0 && amountOfDrug > quantityOfDrugWriteOff) {
			this.numberUnit = (amountOfDrug - quantityOfDrugWriteOff) / oneUnit;
			return quantityOfDrugWriteOff;
		} else {
			return -1;
		}

	}
}
