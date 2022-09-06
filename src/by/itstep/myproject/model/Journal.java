package by.itstep.myproject.model;

import java.util.ArrayList;
import java.util.List;

//для регистрации кем, когда и сколько списано препарата  

public class Journal {

	List<Record> records = new ArrayList<>();

	public void addRecord(Record record) {
		records.add(record);
	}

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

}
