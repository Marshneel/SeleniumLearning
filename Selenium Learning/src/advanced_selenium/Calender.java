package advanced_selenium;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) {

     //select 5th date of next month
		
		//WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.redbus.in/");
		
		   //DateFormat df = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm");
		/*
			DateFormat df = new SimpleDateFormat("EEEE, d MMMM yyyy");
		    Calendar cal = new GregorianCalendar();
		    cal.add(Calendar.DAY_OF_MONTH,1);
		    System.out.println(df.format(cal.getTime())+" 23:59");
		    
		    DateFormat df3 = new SimpleDateFormat("HH");
		    Calendar cal3 = new GregorianCalendar();
		    String current_time = df3.format(cal3.getTime());
		    int hour = Integer.parseInt(current_time);
		    
		    if(hour < 13){
		    	
		    }
		    else{
		    	
		    }
		    df3.format(cal3.getTime()).
		    DateFormat df_4 = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm");
		    Calendar cal_4 = new GregorianCalendar();
			cal_4.add(Calendar.HOUR_OF_DAY,6);
			String Target_fix_date_level4 = df_4.format(cal_4.getTime());
			System.out.println(Target_fix_date_level4);
			*/
			

		   // DateFormat df = new SimpleDateFormat("DD/MM/YYYY");
		    GregorianCalendar cal = new GregorianCalendar();
		    
		   // Calendar c = Calendar.getInstance();
		    cal.add(GregorianCalendar.DATE, 3);
		    System.out.println(new SimpleDateFormat("dd/mm/yyyy").format(cal.getTime()));
		   
		    
		  // String day = String.valueOf(cal.get(GregorianCalendar.DAY_OF_WEEK));
		    //System.out.println(day);
		    
		/*driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/div/label")).click();
		driver.findElement(By.xpath("S")).click();
		
		
		List<WebElement> dates = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody//td"));
		
		for(WebElement ele:dates){
			String date = ele.getText();
			if(date.equalsIgnoreCase("5")){
				ele.click();
				break;
			}
		}*/
		

	}

}
