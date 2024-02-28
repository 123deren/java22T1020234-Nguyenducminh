package java_03;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int date, int month, int year) {
		// TODO Auto-generated constructor stub
		this.day = date;
		this.month = month;
		this.year = year;
	}
	public void formatDate() {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (day > 31) {
					day -= 31;
					month += 1;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (day > 30) {
					day -= 30;
					month += 1;
				}
				break;
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					if (day > 29) {
						day -= 29;
						month += 1;
					}
				} else {
					if (day > 28) {
						day -= 28;
						month += 1;
					}
				}
				break;
			default:
			}

			if (month > 12) {
				month -= 12;
				year += 1;
			}
		}
	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}
	public void setDay(int day){
		this.day=day;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setYear(int year){
		this.year=year;
	}
	public void setDayMonthYear(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	@Override
	public String toString() {
		formatDate();
		return String.format("%02d/%02d/%02d", day, month, year);
	}
}
