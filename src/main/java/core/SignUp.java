package core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;



/**
 * Hello world!
 *
 */
public class SignUp 
{
    public static void main( String[] args )
    {

    	String text_case_id_01 = "TC-001.01";
    	String text_case_id_02 = "TC-002.01";
    	String text_case_id_03 = "TC-003.04";
    	String text_case_id_04 = "TC-003.05";	
    	String text_case_id_05 = "TC-004.05";
    	String text_case_id_06 = "TC-004.06";
    	String text_case_id_07 = "TC-004.07";
    	String text_case_id_08 = "TC-004.08";
    	String text_case_id_09 = "TC-005.01";
    	String text_case_id_10 = "TC-005.02";
    	String text_case_id_11 = "TC-005.03";
    	String text_case_id_12 = "TC-005.04";
    	String text_case_id_13 = "TC-005.05";
    	String text_case_id_14 = "TC-005.06";
    	String text_case_id_15 = "TC-006.01";
    	String text_case_id_16 = "TC-006.02";
    	String text_case_id_17 = "TC-006.03";
    	String text_case_id_18 = "TC-006.04";
    	String text_case_id_19 = "TC-006.05";
    	String text_case_id_20 = "TC-007.02";
    	String text_case_id_21 = "TC-004.01";
    	String text_case_id_22 = "TC-004.02";
    	String text_case_id_23 = "TC-004.03";
    	String text_case_id_24 = "TC-004.04";
    	String text_case_id_25 = "TC-007.01";
    	String text_case_id_26 = "TC-003.01";
    	String text_case_id_27 = "TC-008.01";
    	String text_case_id_28 = "TC-008.02";
    	String text_case_id_29 = "TC-009.01";
    	String text_case_id_30 = "TC-003.02";
    	String text_case_id_31 = "TC-003.03";
    	String text_case_id_32 = "TC-006.06";
    	String text_case_id_33 = "TC-006.07";
    	String text_case_id_34 = "TC-008.03";
    	String text_case_id_35 = "TC-010.01";
    	String text_case_id_36 = "TC-011.01";
    	String text_case_id_37 = "TC-011.02";
    	String text_case_id_38 = "TC-012.01";
    	String text_case_id_39 = "TC-013.01";
    	String text_case_id_40 = "TC-014.01";
    	
    	String url = "http://learn2test.net/qa/apps/sign_up/v1/";
    	String title_SignUp_expected = "Welcome to Sign Up v1";
    	String app_title_expected ="Sign Up";
    	String title_facebook_expected = "Facebook - Log In or Sign Up";
    	String title_twitter_expected = "Twitter";
    	String title_flickr_expected = "Flickr, a Yahoo company | Flickr - Photo Sharing!";
    	String title_youtube_expected = "YouTube";

    	String error_fname_empty_expected = "Please enter First Name";
    	String error_lname_empty_expected = "Please enter Last Name";
    	String error_email_empty_expected = "Please enter Email Address";
    	String error_phone_empty_expected = "Please enter Phone Number";
    		
    	String fname = "Alex";
    	String lname = "Moore";
    	String email = "alexmoore@gmail.com";
    	String phone = "415 555-1212";

    	WebDriver driver = new FirefoxDriver();
    	//WebDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
    	//((HtmlUnitDriver)driver).setJavascriptEnabled(true);
    	
    	driver.get(url);
    	
    	
    // TC-001.01	Sign Up page html title is: "Welcome to Sign Up v1”
    		String title_sign_up_actual = driver.getTitle();

    	if (title_SignUp_expected.equals(title_sign_up_actual)) {
    		System.out.println("Test Case ID: \t\t" + text_case_id_01
    				+ " - PASSED");
    		System.out.println("Title Expected/Actual: \t"
    				+ title_SignUp_expected + "/" + title_sign_up_actual);
    		System.out.println("=======================================");
    	} else {
    		System.out.println("Test Case ID: \t\t" + text_case_id_01
    				+ " - FAILED");
    		System.out.println("Title Expected/Actual: \t"
    				+ title_SignUp_expected + "/" + title_sign_up_actual);
    		System.out.println("=======================================");
    	}

    // TC-002.01   Sign Up page application title is: "Sign Up"
    		
    	    String  app_title_actual = driver.findElement(By.id("id_f_title")).getText();

    	if (app_title_expected.equals(app_title_actual)) {
    		System.out.println("Test Case ID: \t\t" + text_case_id_02
    				+ " - PASSED");
    		System.out.println("Title Expected/Actual: \t"
    				+ app_title_expected + "/" + app_title_actual);
    		System.out.println("=======================================");
    	} else {
    		System.out.println("Test Case ID: \t\t" + text_case_id_02 + " - FAILED");
    		System.out.println("Title Expected/Actual: \t" + app_title_expected + "/" + app_title_actual);
    		System.out.println("=======================================");
    	}
    		
    //TC_003.01  Page contains dynamic text (quote)
    	 isElementExist(driver, "id_quotes", text_case_id_26, "Dynamic quoat");
    	 System.out.println("The current qoute is: " + driver.findElement(By.id("id_quotes")).getText());
    	 System.out.println("=======================================");
    	 
    // TC-003.02     Verify that Page contains  button ("Reset", )
    		isElementExist(driver, "id_reset_button", text_case_id_30, "Button Reset");
    		
    // TC-003.03     Verify that Page contains  button ( "Submit")
    		isElementExist(driver, "id_submit_button", text_case_id_31, "Button Submit");
    		
    //TC_003.04 	New quote appears every new load of the page 
            driver.findElement(By.id("id_quotes")).getText();
    	    String quote = driver.findElement(By.id("id_quotes")).getText();
    	    driver.navigate().refresh(); 
    	
    	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	    String new_qoute = driver.findElement(By.id("id_quotes")).getText();
    	
    	if (quote.equals(new_qoute)){
    		System.out.println("The first qoute is: " + quote);
    		System.out.println("Test Case ID: \t\t" + text_case_id_03 + " - FAILED");
    	    System.out.println("The  qoute is the same: " + new_qoute);
    	    System.out.println("=======================================");} 

    	 else {
    		System.out.println("The first qoute is: " + quote);
    		System.out.println("Test Case ID: \t\t" + text_case_id_03 + " - PASSED");
    		System.out.println("The new qoute is : " + new_qoute);
    		System.out.println("=======================================");
    	}
    	
    	
    // TC-003.05  Dynamic qouats contains more then 67 chars and less then 103

    	    driver.findElement(By.id("id_quotes")).getText();
    	    String quote1 = driver.findElement(By.id("id_quotes")).getText();
    	if (quote1 != null && quote1.length() < 103 && quote1.length() > 67) {
    		System.out.println("Test Case ID: \t\t" + text_case_id_04 + " - PASSED");
    		System.out.println("Quote length: " + quote1.length());
    		System.out.println("=======================================");
    	} else {
    		System.out.println("Test Case ID: \t\t" + text_case_id_04 + " - FAILED");
    		System.out.println("Quote length: " + quote1.length());
    		System.out.println("=======================================");
    	}
    	
    //TC_004.01 Verify that Link Image Facebook is present		
    	isElementExist(driver, "id_img_facebook", text_case_id_21, "Image Link Facebook " ) ;
    //TC_004.02 Verify that Link Image Twitter is present	
    	isElementExist(driver, "id_link_twitter", text_case_id_22, "Image Link Twitter " ) ;
    //TC_004.03 Verify that Link Image Flickr is present	
    	isElementExist(driver, "id_link_flickr", text_case_id_23, "Image Link Flickr " ) ;
    //TC_004.04 Verify that Link Image YouTube is present	
    	isElementExist(driver, "id_link_youtube", text_case_id_24, "Image Link YouTube " ) ;
    	
    // TC-004.05  Image link Facebook  redirects to the Facebook page 

    		driver.findElement(By.id("id_img_facebook")).click();
    		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    		ArrayList<String> allTabs = new ArrayList<String>(
    			   driver.getWindowHandles());
    		driver.switchTo().window(allTabs.get(1));
    		String title_facebook_actual = driver.getTitle();
    		driver.close();
    		driver.switchTo().window(allTabs.get(0));

    	if (title_facebook_expected.equals(title_facebook_actual)) {
    		System.out.println("Test Case ID: \t\t" + text_case_id_05 + " - PASSED");
    		System.out.println("Title Expected/Actual: \t" + title_facebook_expected 
    				+ "/" + title_facebook_actual);
    		System.out.println("=======================================");
    	} else {
    		System.out.println("Test Case ID: \t\t" + text_case_id_05 + " - FAILED");
    		System.out.println("Title Expected/Actual: \t"
    				+ title_facebook_expected + "/" + title_facebook_actual);
    		System.out.println("=======================================");
    	}

    // TC-004.06 Image link Twitter redirects to the Twitter page 

    		driver.findElement(By.id("id_img_twitter")).click();
    		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    		ArrayList<String> allTabsT = new ArrayList<String>(
    			driver.getWindowHandles());
    		driver.switchTo().window(allTabsT.get(1));
    		String title_twitter_actual = driver.getTitle();
    		driver.close();
    		driver.switchTo().window(allTabsT.get(0));

    	if (title_twitter_expected.equals(title_twitter_actual)) {
    		System.out.println("Test Case ID: \t\t" + text_case_id_06 + " - PASSED");
    		System.out.println("Title Expected/Actual: \t"
    				+ title_twitter_expected + "/" + title_twitter_actual);
    		System.out.println("=======================================");
    	} else {
    		System.out.println("Test Case ID: \t\t" + text_case_id_06 + " - FAILED");
    		System.out.println("Title Expected/Actual: \t"
    				+ title_twitter_expected + "/" + title_twitter_actual);
    		System.out.println("=======================================");	}
    	
    	
    // TC-004.07 Image link Flickr  redirects to the Flickr   page
    		driver.findElement(By.id("id_img_flickr")).click();
    		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    		ArrayList<String> allTabsF = new ArrayList<String>(
    			driver.getWindowHandles());
    		driver.switchTo().window(allTabsF.get(1));
    		String title_flickr_actual = driver.getTitle();
    		driver.close();
    		driver.switchTo().window(allTabsF.get(0));

    	if (title_flickr_expected.equals(title_flickr_actual)) {
    		System.out.println("Test Case ID: \t\t" + text_case_id_07 + " - PASSED");
    		System.out.println("Title Expected/Actual: \t"
    				+ title_flickr_expected + "/" + title_flickr_actual);
    		System.out.println("=======================================");
    	} else {
    		System.out.println("Test Case ID: \t\t" + text_case_id_07 + " - FAILED");
    		System.out.println("Title Expected/Actual: \t"
    				+ title_flickr_expected + "/" + title_flickr_actual);
    		System.out.println("=======================================");	}

    // TC-004.08 Image link YouTube  redirects to the YouTube page 
    		driver.findElement(By.id("id_img_youtube")).click();
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	
    		ArrayList<String> allTabsY = new ArrayList<String>(
    			driver.getWindowHandles());
    		driver.switchTo().window(allTabsY.get(1));
    		String title_youtube_actual = driver.getTitle();
    		driver.close();
    		driver.switchTo().window(allTabsY.get(0));

    	if (title_youtube_expected.equals(title_youtube_actual)) {
    		System.out.println("Test Case ID: \t\t" + text_case_id_08 + " - PASSED");
    		System.out.println("Title Expected/Actual: \t"
    				+ title_youtube_expected + "/" + title_youtube_actual);
    		System.out.println("=======================================");
    	} else {
    		System.out.println("Test Case ID: \t\t" + text_case_id_08 + " - FAILED");
    		System.out.println("Title Expected/Actual: \t"
    				+ title_youtube_expected + "/" + title_youtube_actual);
    		System.out.println("=======================================");	}

    	
    // TC-005.01     Verify that text field "First Name" is present	
    			isElementExist(driver, "id_fname", text_case_id_09, "First Name " ) ;
    // TC-005.02     Verify that text field "Last Name" is present
    			isElementExist(driver, "id_lname", text_case_id_10, "Last Name" ) ; 
    // TC-005.03     Verify that text field "Email Address" is present					
    			isElementExist(driver, "id_email", text_case_id_11,"Email Address" );	
    // TC-005.04     Verify that text field "Phone" is present					
    			isElementExist(driver, "id_phone", text_case_id_12,"Phone" );	
    		
    	  
    // TC-005.05     Verify that radio button Gender: ”Male” is present
    		 Boolean b = driver.findElement(By.id("id_g_radio_01")).isDisplayed();
    	if   (b = true){
    		 System.out.println("Test Case ID: \t\t" + text_case_id_13	+ " - PASSED");
    	     System.out.println("Radio button Gender: ”Male” is present");
    	} else {
    		 System.out.println("Test Case ID: \t\t" + text_case_id_13	+ " - FAILED");
    		 System.out.println("Radio button Gender: ”Male” is not present");} 
    	System.out.println("========= ==============================");
    	
    // TC-005.06     Verify that radio button Gender: ”Female” is present
    	if   (driver.findElement(By.id("id_g_radio_01"))!=null)  {
    		 System.out.println("Test Case ID: \t\t" + text_case_id_14	+ " - PASSED");
             System.out.println("Radio button Gender: ”Female” is present");
        } else {
    	     System.out.println("Test Case ID: \t\t" + text_case_id_14	+ " - FAILED");
    	     System.out.println("Radio button Gender: ”Female” is not present");}
    	
    	System.out.println("========= ==============================");


    // TC-006.01  "First Name" text field should not be empty

    			driver.findElement(By.id("id_submit_button")).click();			
    			verifyErrorMassage( driver, error_fname_empty_expected, text_case_id_15);			
    			driver.findElement(By.id("id_reset_button")).click();
    		
    // TC-006.02  "Last Name" text field should not be empty
    			driver.findElement(By.id("id_fname")).sendKeys(fname);
    			driver.findElement(By.id("id_submit_button")).click();
    			verifyErrorMassage( driver, error_lname_empty_expected, text_case_id_16);
    			
    			driver.findElement(By.id("id_reset_button")).click();
    			
    // TC-006.03  "Email Address" text field should not be empty
    			driver.findElement(By.id("id_fname")).sendKeys(fname);
    			driver.findElement(By.id("id_lname")).sendKeys(lname);

    			driver.findElement(By.id("id_submit_button")).click();
    			verifyErrorMassage( driver, error_email_empty_expected, text_case_id_17);
    			driver.findElement(By.id("id_reset_button")).click();
    			
    // TC-006.04  "Phone Number" text field should not be empty	
    			
    			driver.findElement(By.id("id_fname")).sendKeys(fname);
    			driver.findElement(By.id("id_lname")).sendKeys(lname);			
    			driver.findElement(By.id("id_email")).sendKeys(email);

    			driver.findElement(By.id("id_submit_button")).click();
    			verifyErrorMassage( driver, error_phone_empty_expected, text_case_id_18);
    			driver.findElement(By.id("id_reset_button")).click();

    			
    // TC-006.05 Confirmation Page Should Containe the Same Imput  Data
    		      String parentHandle = driver.getWindowHandle();
    			driver.findElement(By.id("id_fname")).sendKeys(fname);
    			driver.findElement(By.id("id_lname")).sendKeys(lname);
    			driver.findElement(By.id("id_email")).sendKeys(email);
    			driver.findElement(By.id("id_phone")).sendKeys(phone);
    			driver.findElement(By.id("id_submit_button")).click();

    			String fname_conf_actual = driver.findElement(By.id("id_fname_conf"))
    					.getText();
    			String lname_conf_actual = driver.findElement(By.id("id_lname_conf"))
    					.getText();
    			String email_conf_actual = driver.findElement(By.id("id_email_conf"))
    					.getText();
    			String phone_conf_actual = driver.findElement(By.id("id_phone_conf"))
    					.getText();

    			
    			if (fname.equals(fname_conf_actual) && lname.equals(lname_conf_actual)
    					&& email.equals(email_conf_actual)
    					&& phone.equals(phone_conf_actual)) {
    				System.out.println("Test Case ID: \t\t" + text_case_id_19
    						+ " - PASSED");
    				System.out.println("First Expected/Actual: \t" + fname + "/"
    						+ fname_conf_actual);
    				System.out.println("Last Expected/Actual: \t" + lname + "/"
    						+ lname_conf_actual);
    				System.out.println("Email Expected/Actual: \t" + email + "/"
    						+ email_conf_actual);
    				System.out.println("Phone Expected/Actual: \t" + phone + "/"
    						+ phone_conf_actual);
    				System.out.println("=======================================");
    			} else {
    				System.out.println("Test Case ID: \t\t" + text_case_id_19
    						+ " - FAILED");
    				System.out.println("First Expected/Actual: \t" + fname + "/"
    						+ fname_conf_actual);
    				System.out.println("Last Expected/Actual: \t" + lname + "/"
    						+ lname_conf_actual);
    				System.out.println("Email Expected/Actual: \t" + email + "/"
    						+ email_conf_actual);
    				System.out.println("Phone Expected/Actual: \t" + phone + "/"
    						+ phone_conf_actual);
    				System.out.println("=======================================");
    			}
    // TC-006.06 Confirmation Page Should Containe the "Back" button
        isElementExist(driver, "id_back_button", text_case_id_32, "Back button");
        
     // TC-006.07 Back button redirects to the Home page 
        
        String currentTitle = driver.getTitle();
     
           driver.findElement(By.id("id_back_button")).click();
           String newTitle = driver.getTitle();

           if (newTitle != currentTitle && newTitle.equals("Welcome to Sign Up v1")){
        	   System.out.println("Test Case ID: \t\t" + text_case_id_32
    					+ " - PASSED");
        	   System.out.println("Back button redircts correctly");
           }
           else {System.out.println("Test Case ID: \t\t" + text_case_id_33
    				+ " - FAILED");
        	   System.out.println("Houston, we have the problem!");
           }
           System.out.println("========= ==============================");   
    		
    // TC-007.01 Page contains dynamic text (today’s day) 
    			isElementExist(driver, "timestamp", text_case_id_25,"TimeStamp" );
    // TC-007.02 Dynamic text (today’s day) provides the reale date
    			
    			String date_expected = driver.findElement(By.id("timestamp")).getText();
    			System.out.println("Online is date: " + date_expected);

    			java.util.Date today = Calendar.getInstance().getTime();
    			String todayString = today.toString();
    			System.out.println(todayString);
    			String[] todayArray = todayString.split(" ");

    			String newDate = todayArray[1] + " " + todayArray[2]+", "  + todayArray[5];
    			System.out.println(newDate);
    		
    			if (date_expected.equals(newDate)){
    			System.out.println("Test Case ID: \t\t" + text_case_id_20 + " - PASSED");
    			System.out.println("Date Online/Actual: \t"
    					+ date_expected + "/" + newDate);
    			System.out.println("=======================================");
    		} else {
    			System.out.println("Test Case ID: \t\t" + text_case_id_20 + " - FAILED");
    			System.out.println("Date Online is not equal the Actual Date: \t"
    					+ date_expected + "/" + newDate);
    			System.out.println("========= ==============================");	}
    		
    // TC-008.01 	Page contains drop-down list ("State")	
    			isElementExist(driver, "id_state", text_case_id_27, "element State");
    			
    // TC-008.02 Drop-down list contains 50 states	and District Culumbia
    			
    			WebElement element = driver.findElement(By.id("id_state"));
    	        Select s = new Select(element);
    	        List <WebElement> elementcount = s.getOptions();      //Get all options
    	        elementcount.remove(52);
    	        elementcount.remove(0);
                //String [] stateList = elementcount.
    	        System.out.println(elementcount.size());      //Get the length
    	                            // Loop to print one by one
    	        for(int i=0 ;i<elementcount.size();i++)
    	        {        	
    	            String value = elementcount.get(i).getText();
    	            System.out.println(value);
    	        }     
    	        int numberStates  = elementcount.size(); //Get the length
    			System.out.println("=======================================");
    	 if (numberStates == 51){
    	        	System.out.println("Test Case ID: \t\t" + text_case_id_28 + " - PASSED");
    	        System.out.println("The total number of States is: " + numberStates);      
    		} else {
    			System.out.println("Test Case ID: \t\t" + text_case_id_28 + " - FAILED");
    			System.out.println("The total number of States is not equal 51: " + numberStates);
    			System.out.println("========= ==============================");	}
    	        	        
    // TC-008.03 Select District of Culumbia in Drop-down list 
    	        
     for (WebElement option : elementcount) {
    	    if (option.getText().equalsIgnoreCase("District of Columbia")) {
    	        System.out.println( "District of Columbia" + " is present");
    	       // option.click();
           System.out.println("Test Case ID: \t\t" + text_case_id_34 + " - PASSED");	        
    	    }
     }
     		System.out.println("========= =============================="); 
     
     
    // TC-009.01 	Page contains checkbox (Agreement on Terms)
    			isElementExist(driver, "id_checkbox", text_case_id_29, "CheckBox Agreed");
    	
    // TC-010.01  Page contains static text (copyright) ("© 2014 learn2test.net")
    			isElementExist(driver, "copyright",	 text_case_id_35, "Copyrighte text");
    			
    // TC-011.01 Page contains dynamic text (Client’s OS & Browser) (example: "Windows 7 & Firefox 30")
    			isElementExist(driver, "os_browser", text_case_id_36, "Client’s OS & Browser");

    // TC-011.02 OS & Browser dynamic text displays Client’s current OS & Browser + version
    			 String myUserAgent = driver.findElement(By.id("os_browser")).getText();				
    		      String  osName = System.getProperty("os.name");	  					  	
    			  String [] osNameAr =    osName.split(" ");		  
    			  String newOsName = osNameAr[1]+" "+ osNameAr[2];
    			  
    			  String osVersion = System.getProperty("os.version");			  
    			  String  [] osVersionAr = osVersion.split("\\.");
    		      String newOsVersion = osVersionAr[0] + "."+ osVersionAr[1];		  
    			  
    	    //Getting Browser details using Selenium web driver 2.0
    			  Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
    			  String browserName = cap.getBrowserName().toLowerCase() ;  //.toLowerCase();		
    		//checking OS name:	  	  
    	        if (myUserAgent.contains(newOsName) )
    	        {
    	        	System.out.println("Test Case ID: \t\t" + text_case_id_37 + " - PASSED");
    	        	System.out.println(myUserAgent + " is matching " + newOsName);
    	        }
    	      else  {
    	        	System.out.println(myUserAgent + " is NOT matching " + newOsName);
    	            System.out.println("Test Case ID: \t\t" + text_case_id_37 + " - FAILED");
    	             }
    	    //checkin OS version:
    	        if (myUserAgent.contains(newOsName) )
    	         {
    	        	System.out.println("Test Case ID: \t\t" + text_case_id_37 + " - PASSED");        	
    	        	System.out.println(myUserAgent + " is matching " + newOsVersion);
    	         }
    	      else {
    	        	System.out.println(myUserAgent + " is NOT matching " + newOsVersion);
    	        System.out.println("Test Case ID: \t\t" + text_case_id_37 + " - FAILED");
    	            }
    	   //chacking browser name:     
    	        if (myUserAgent.toLowerCase().contains(browserName) )
    	         {	        	
    	        	System.out.println("Test Case ID: \t\t" + text_case_id_37 + " - PASSED");
    	        	System.out.println(myUserAgent + " is matching " + browserName);
    	        	System.out.println("========= ==============================");
    	         }
    	      else {
    	    	    System.out.println("Test Case ID: \t\t" + text_case_id_37 + " - FAILED");
    	        	System.out.println(myUserAgent + " is NOT matching " + browserName);
    	        	System.out.println("========= ==============================");
    	            }
    			 
    // TC-011.02 Page contains dynamic text (Client’s City and State) (example: "San Francisco, CA")	 			 
    			 isElementExist(driver, "id_current_location", text_case_id_38, "Current Location");
    			 
    // TC-012.01 Page contains dynamic text (Client’s current temperature, in Fahrenheit) (example: "71.5 ℉")	 
    			 isElementExist(driver, "id_temperature", text_case_id_39, "Current Temperature");

    // TC-013.01  "Submit" button redirects to Confirmation page (both titles [html/application]: "Confirmation")	
    			    driver.findElement(By.id("id_fname")).sendKeys(fname);
    				driver.findElement(By.id("id_lname")).sendKeys(lname);
    				driver.findElement(By.id("id_email")).sendKeys(email);
    				driver.findElement(By.id("id_phone")).sendKeys(phone);
    				driver.findElement(By.id("id_submit_button")).click();
    				   
    				   String comfermationTitle = driver.getTitle();
    			       if (newTitle != comfermationTitle && comfermationTitle.equals("Confirmation")){
    			    	   System.out.println("Test Case ID: \t\t" + text_case_id_39
    								+ " - PASSED");
    			    	   System.out.println("Submit button redirects to Conformation page ");
    			       }
    			       else {System.out.println("Test Case ID: \t\t" + text_case_id_39
    							+ " - FAILED");
    			    	   System.out.println("Houston, we have the problem!");
    			       }
    			       System.out.println("========= =============================="); 
    			       driver.findElement(By.id("id_back_button")).click();
    			       
    // TC-014.01  "Reset" button resets all fields and buttons (reloading the page resets as well)			
    				    driver.findElement(By.id("id_fname")).sendKeys(fname);
    					driver.findElement(By.id("id_lname")).sendKeys(lname);
    					driver.findElement(By.id("id_email")).sendKeys(email);
    					driver.findElement(By.id("id_phone")).sendKeys(phone);
    					
    					driver.findElement(By.id("id_reset_button")).click();
    					
    		            String f = driver.findElement(By.id("id_fname")).getText();
    			        String l = driver.findElement(By.id("id_lname")).getText();
    			        String e = driver.findElement(By.id("id_email")).getText();
    			        String ph =	driver.findElement(By.id("id_phone")).getText();
    					if (f == null &&  l == null  &&    e == null && ph == null)
    					{System.out.println("Test Case ID: \t\t" + text_case_id_40
    							+ " - PASSED");
    			    	   System.out.println("Reset button resets all fields and buttons ");}
    					else
    					{System.out.println("Test Case ID: \t\t" + text_case_id_40
    							+ " - FAILED");
    			    	   System.out.println("Houston, we have the problem!");
    			       }
    			       System.out.println("========= =============================="); 
    			       driver.quit();

    	
    	}//main method



    	public static void verifyErrorMassage(WebDriver driver, String error_message_expected, String text_case_id) {
    		
    		String error_message_actual = driver.findElement(By.id("ErrorLine")).getText();

    		if (error_message_expected .equals(error_message_actual)) {
    			System.out.println("Test Case ID: \t\t" + text_case_id + " - PASSED");
    			System.out.println("Error Expected/Actual: \t"
    					+ error_message_expected  + "/"
    					+ error_message_actual);
    			System.out.println("=======================================");
    		} else {
    			System.out.println("Test Case ID: \t\t" + text_case_id + " - FAILED");
    			System.out.println("Error Expected/Actual: \t"
    					+ error_message_expected + "/"
    					+ error_message_actual);
    			System.out.println("=======================================");
    		}
    	}

    	public static  boolean isElementExist(WebDriver driver, String element_id, String text_case_id, String elementName)  {
    		boolean isExist = true;
    		try { 
    			driver.findElement(By.id(element_id)).isDisplayed();
    	     System.out.println("Test Case ID: \t\t" + text_case_id	+ " - PASSED");
    	     System.out.println("Element "+ elementName + " is present");
    			System.out.println("=======================================");
    		} 
    		catch ( NoSuchElementException e  ){
    			isExist = false;
    		 System.out.println("Test Case ID: \t\t" + text_case_id	+ " - FAILED");
    		 System.out.println("Element "+ elementName + " is not present");
    			System.out.println("=======================================");}
    		  return isExist;
    	}

    	}

