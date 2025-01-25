package vizzastar;

import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;
import com.microsoft.playwright.options.AriaRole;

public class HealthAssure {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("Videos/")).setRecordVideoSize(1280,720));		      
		      context.tracing().start(new Tracing.StartOptions()
					  .setScreenshots(true)
					  .setSnapshots(true)
					  .setSources(!true));
		      Page page = context.newPage();
//		      page.route("**/*.{png,jpg,jpeg,gif}", route -> route.abort());		      
//		      page.onRequest(request -> {
//	                System.out.println(">>: "+ request.method() +   request.resourceType()  + request.url());
//	            });		      
//		      page.onResponse(response ->{
//		    	  System.out.println(  ">>:" + response.status()  + response.url()) ;
//		      });
		      page.navigate("https://vizzainsurance.com/home");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("   POS Login")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mobile number")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mobile number")).fill("9962907312");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin1");
		      page.locator("#main-content").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Login")).click();		      
		      page.waitForTimeout(5000);		      
		      page.locator("//span[text()='Online Insurance']").click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Health Insurance").setExact(true)).click();
		      page.waitForLoadState();
		      page.locator(".mat-checkbox-inner-container").first().click();		     
		      page.locator("#mat-input-10").click(); 
		      page.locator("#mat-input-10").fill("23");
		      page.locator("#mat-checkbox-2 > .mat-checkbox-layout > .mat-checkbox-inner-container").click();
		      page.locator("#mat-input-11").click();
		      page.locator("#mat-input-11").fill("23");		      
		      page.locator("#mat-tab-content-0-0 div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^PIN CODE$"))).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("PIN CODE")).fill("600012");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Proceed")).click();
		      page.waitForTimeout(5000);
		      

		      page.getByText("All (+5 others) Filter by").first().click();
		      page.getByText("Star Health", new Page.GetByTextOptions().setExact(true)).click();		    
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("₹ 13280/Yr")).first().click();
		      page.getByLabel("1PROPOSER DETAILS").getByLabel("Title").getByText("Title").click();
		      page.getByText("Mr", new Page.GetByTextOptions().setExact(true)).click();		   
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("First Name")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("First Name")).press("CapsLock");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("First Name")).fill("T");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("First Name")).press("CapsLock");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("First Name")).fill("Free");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Middle Name")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Middle Name")).press("CapsLock");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Middle Name")).fill("D");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Last Name")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Last Name")).press("CapsLock");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Last Name")).fill("T");
		      page.getByLabel("1PROPOSER DETAILS").getByLabel("DOB (DD/MM/YYYY) *").click();
		      page.getByLabel("1PROPOSER DETAILS").getByLabel("DOB (DD/MM/YYYY) *").fill("09/12/1999");
		      page.locator("(//span[text()='Occupation'])[1]").click();
		      page.locator("//span[text()=' BUSINESS/TRADERS ']").click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email ID")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email ID")).fill("freedela0912@gmail.com");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mobile Number")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mobile Number")).fill("8531913069");
		      page.getByLabel("1PROPOSER DETAILS").getByLabel("Address 1 *").click();
		      page.getByLabel("1PROPOSER DETAILS").getByLabel("Address 1 *").fill("3");
//		      page.getByLabel("1PROPOSER DETAILS").locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Address 2 \\*$"))).nth(3).click();
		      page.getByLabel("1PROPOSER DETAILS").getByLabel("Address 2 *").click();

		      page.getByLabel("1PROPOSER DETAILS").getByLabel("Address 2 *").type("A");
//		      page.getByLabel("1PROPOSER DETAILS").getByLabel("Address 2 *").press("CapsLock");
		      page.getByLabel("1PROPOSER DETAILS").getByLabel("Pincode *").click();
		      page.getByLabel("1PROPOSER DETAILS").getByLabel("Pincode *").fill("600012");		      
		      page.waitForTimeout(5000);		      
		      page.getByLabel("1PROPOSER DETAILS").getByLabel("City *").getByText("City").click();
		      page.getByLabel("1PROPOSER DETAILS").getByLabel("City *").press("Enter");		      
		      page.waitForTimeout(3000);		      
		      page.getByLabel("1PROPOSER DETAILS").getByLabel("Area *").getByText("Area").click();
		      page.getByLabel("1PROPOSER DETAILS").getByLabel("Area *").press("Enter");
		      page.locator(".mat-checkbox-inner-container").first().click();      
		      page.waitForTimeout(5000);		      
		      page.locator("(//span[text()='Next'])[1]").click();
		      page.locator("#mat-radio-100 > .mat-radio-label > .mat-radio-container > .mat-radio-outer-circle").click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("PAN Number")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("PAN Number")).fill("gjkpn0846p");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).first().click();
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).first().setInputFiles(Paths.get("SubhashAadhar.jpg"));
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).nth(1).click();
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).nth(1).setInputFiles(Paths.get("SubhashAadhar.jpg"));
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).nth(2).click();
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).nth(2).setInputFiles(Paths.get("SubhashAadhar.jpg"));
		    
		      page.waitForTimeout(60000);
		      page.locator("(//span[text()='Submit'])[1]").click();
		      
		
		      
		      
		      
		      
//		      page.locator("#mat-radio-100 > .mat-radio-label > .mat-radio-container > .mat-radio-outer-circle").click();
//		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("PAN Number")).click();
//		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("PAN Number")).fill("gjkpm0846p");
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
//		      page.getByText("Identity Proof Document TypeIdentity Proof Document Type").click();
//		      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Identity Proof Document Type")).click();
//		      page.locator(".cdk-overlay-container > div:nth-child(3)").click();
//		      page.locator(".cdk-overlay-container > div:nth-child(3)").click();
//		      page.getByLabel("Passport Number").fill("123");
//		      page.getByText("Address Proof Document TypeAddress Proof Document Type").click();
//		      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Passport")).locator("span").click();
//		      page.locator("#mat-input-83").click();
//		      page.locator("#mat-input-83").fill("123");
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).first().click();
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).first().setInputFiles(Paths.get("Health Assure Benefits.pdf"));
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).nth(1).click();
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).nth(1).setInputFiles(Paths.get("Health Assure Benefits.pdf"));
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).nth(2).click();
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Choose File")).nth(2).setInputFiles(Paths.get("Health Assure Benefits.pdf"));
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();

		    	 	      
//		      page.locator("#mat-radio-100 > .mat-radio-label > .mat-radio-container > .mat-radio-outer-circle").click();
//		      page.locator("#mat-dialog-0 div").filter(new Locator.FilterOptions().setHasText("PAN Number")).nth(4).click();
//		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("PAN Number")).fill("gjkpm0846p");
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
//		      page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Occupation Occupation")).locator("span").click();
//		      page.getByText("Professional", new Page.GetByTextOptions().setExact(true)).click();
//		      page.getByLabel("Income Source").getByText("Income Source").click();
//		      page.locator("//span[text()=' Salary ']").click();
//		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
//		      
		      page.getByLabel("2INSURED DETAILS").getByText("Same as proposer").click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Height(cms)")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Height(cms)")).fill("170");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Weight(kgs)")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Weight(kgs)")).fill("60");
		      page.locator("#mat-radio-21 > .mat-radio-label > .mat-radio-container > .mat-radio-outer-circle").click();
		      page.locator("#mat-radio-22 > .mat-radio-label > .mat-radio-container").click();
		      page.locator("#mat-radio-30 > .mat-radio-label > .mat-radio-container > .mat-radio-outer-circle").click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("1.INSURED DETAILS")).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("2.INSURED DETAILS")).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Name").setExact(true)).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Name").setExact(true)).press("CapsLock");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Name").setExact(true)).fill("SF");
		      page.getByLabel("2.INSURED DETAILS").getByLabel("DOB (DD/MM/YYYY) *").click();
		      page.getByLabel("2.INSURED DETAILS").getByLabel("DOB (DD/MM/YYYY) *").fill("09/12/1999");
		      page.getByLabel("2.INSURED DETAILS").getByLabel("Gender").getByText("Gender").click();
		      page.getByText("Female").click();
		      page.getByLabel("2.INSURED DETAILS").locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Height\\(cms\\) \\*$"))).nth(3).click();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Height(cms)")).fill("160");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Height(cms)")).press("Tab");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Weight(kgs)")).fill("70");
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Weight(kgs)")).press("Tab");
		      page.getByLabel("2.INSURED DETAILS").getByLabel("Occupation *").getByText("Occupation").click();
		      page.getByText("HOUSEWIVES").click();
		      page.getByLabel("2.INSURED DETAILS").getByLabel("Relationship with Proposer").getByText("Relationship with Proposer").click();
		      page.getByText("SPOUSE", new Page.GetByTextOptions().setExact(true)).click();
		      page.getByLabel("2INSURED DETAILS").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Next")).click();
		      
		     
		      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Name of Nominee\\*$"))).nth(3).click();
		      page.locator("#mat-input-64").press("CapsLock");
		      page.locator("#mat-input-64").fill("NOMI");
		      page.locator("#mat-input-65").click();
		      page.locator("#mat-input-65").fill("22");
		      page.getByLabel("3NOMINEE DETAILS").getByLabel("", new Locator.GetByLabelOptions().setExact(true)).locator("span").click();
		      page.getByLabel("3NOMINEE DETAILS").getByLabel("", new Locator.GetByLabelOptions().setExact(true)).press("Enter");
		      page.locator("#mat-input-66").click();
		      page.locator("#mat-input-66").fill("100");
		      page.getByLabel("3NOMINEE DETAILS").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Next")).click();
//		    	page.pause();
		      
		      page.getByLabel("Proposal created successfully").click();
	            String toastMessage =  page.getByLabel("Proposal created successfully!!").textContent(); 
	            if (toastMessage.equals("Proposal created successfully!!")) {
	                System.out.println("Toast message is as expected.");
	            } else {
	                System.out.println("Toast message is appeared as. Found: " + toastMessage);
	            }  
		      page.locator("#mat-checkbox-15 > .mat-checkbox-layout > .mat-checkbox-inner-container").click();		     
		      page.locator("//span[text()='Copy Link']").click();
//		      page.locator("(//span[text()='Pay by Customer'])[1]").click();
		      page.locator("(//span[text()='Pay Now'])[1]").click();	
		      page.waitForTimeout(25000); 
		      
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter only numeric value")).click();
		      Scanner scan = new Scanner(System.in);
		      String OTP = scan.nextLine();
		      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter only numeric value")).fill(OTP);
	    	  page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Proceed")).click();	    
//		      page.locator("//button[text()='Proceed']").click();  
		      page.waitForTimeout(10000); 
		      
// Payment Gateway -----1 		     
		  if (page.getByText("Unlock your saved payment").isVisible()) {		    	
		    	System.out.println(" ----> Payment Gateway 1 is Opened");		    	
		    	 page.getByText("UPI", new Page.GetByTextOptions().setExact(true)).click();
//		    	 page.waitForTimeout(5000);
		         page.getByText("Google Pay").click();
		         page.getByPlaceholder("Enter UPI ID").click();
		         page.getByPlaceholder("Enter UPI ID").fill("sirajabhi4-1@okaxis");
		         page.getByPlaceholder("Enter UPI ID").press("Enter");
		         page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("PROCEED")).click();
		    }		      
// Payment Gateway -----2 		      
		  else{		    	
		    	System.out.println(" ---->Payment Gateway 2 is Opened");		    	
		      page.waitForTimeout(30000);
		      page.locator("//P[text()='UPI']").click();
		      page.waitForTimeout(4000);
		      page.locator("div:nth-child(2) > .flex-col > .center-box").click();
		      page.getByPlaceholder("Enter UPI ID").click();
		      page.getByPlaceholder("Enter UPI ID").fill("sirajabhi4-1@okaxis");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Verify")).click();
		      page.waitForTimeout(5000);
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("PROCEED")).click();
		    }		     		      
		      page.waitForTimeout(4000);
		     
		      System.out.println("----------->Playwright Script Passed<------------");
		      
		      context.tracing().stop(new Tracing.StopOptions()
						.setPath(Paths.get("trace.zip")));
		      context.close();
		      playwright.close();
		  	}
		}
	}



