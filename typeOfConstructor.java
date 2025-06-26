package assignment4;
import java.util.Calendar;
class Date{
	public int day;
	public int month;
	public int year;
	public Date() {
		Calendar c=Calendar.getInstance();
		day=c.get(Calendar.DATE);
		month=c.get(Calendar.MONTH);
		year=c.get(Calendar.YEAR);
		
	}
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	public void printDate() {
		System.out.println("Day:"+day);
		System.out.println("Month:"+month);
		System.out.println("Year:"+year);
		
		
	}
}

public class typeOfConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt1=new Date();
		Date dt2=new Date(1,1,1000);
		dt1.printDate();
		dt2.printDate();
	}

}
