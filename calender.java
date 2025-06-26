//package assignment4;
//import java.util.Calendar;
//import java.util.Scanner;
//
//class Date{
//	private int day;
//	private int month;
//	private int year;
//	public void intiDate() {
//		Calendar c= Calendar.getInstance();
//		day=c.get(Calendar.DATE);
//		month=c.get(Calendar.MONTH)+1;
//		year=c.get(Calendar.YEAR);
//		
//		 
//	}
//	
//	public void printDate() {
//		System.out.println("Day:"+this.day);
//		System.out.println("month:"+this.month);
//		System.out.println("year:"+this.year);
//		
//	}
//	public void acpectRecord() {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Day:");
//		day=sc.nextInt();
//		System.out.println("Month:");
//		month=sc.nextInt();
//		System.out.println("year:");
//		year=sc.nextInt();
//		
//		sc.close();
//	}
//}
//public class calender {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Date d1=new Date();
//		d1.intiDate();
//		d1.printDate();
//		d1.acpectRecord();
//		d1.printDate();
//		
//	}
//
//}
