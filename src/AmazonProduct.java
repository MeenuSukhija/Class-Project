
import java.sql.SQLException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProduct extends AmazonPOM{

	public AmazonProduct(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ClassNotFoundException, InterruptedException, SQLException {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the URL");
	String p = s.next();
	System.out.println("Enter the Product Name");
	String pn = s.next();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\OneDrive\\Desktop\\Setup\\chromedriver.exe");
	WebDriver wb = new ChromeDriver();
	wb.manage().window().maximize();
	wb.get(p);
	AmazonPOM ap = new AmazonPOM(wb);
	ap.productSearch(pn);
	String Name = wb.findElement(productname1st).getText();
	System.out.println("Name of the product is " +Name);
	String Price = wb.findElement(productprice1st).getText();
	System.out.println("Price of the product is " +Price);
	ap.Insert(Name, Price);
	ap.selectDBdata(Name, Price);
	
	}

}
