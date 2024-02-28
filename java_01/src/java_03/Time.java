package java_03;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		// TODO Auto-generated constructor stub
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void formatTime() {
		if (second >= 60) {
			minute += second / 60;
			second %= 60;
		}
		if (minute >= 60) {
			hour += minute / 60;
			minute %= 60;
		}
		if (hour >= 24) {
			hour %= 24;
		}
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSecond() {
		return this.second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		formatTime();
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public Time nextSecond() {
		this.second += 1;
		formatTime();
		return new Time(hour, minute, second);
	}

	public Time previousSecond() {
		this.second -= 1;
		if (this.second < 0) {
			this.minute -= 1;
			this.second += 60;
			if (this.minute < 0) {
				this.minute += 60;
				this.hour -= 1;
				if (this.hour < 0) {
					this.hour += 24;
				}
			}
		}
		formatTime();
		return new Time(hour, minute, second);
	}

}
