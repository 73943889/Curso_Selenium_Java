package com.org.prueba.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectioChromeDrive {

	public static void main(String[] args) {
		// validando ChromeDriver
		
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\pc\\Documents\\Java\\Curso_Selenium_Java\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");

	}

}
