package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	//Header WebElements
	@FindBy(xpath="//a[@title='phptravels']")
	public WebElement phpTravels;
	
	@FindBy(xpath="//a[text()='Login']")
	public WebElement logginButton;
	
	@FindBy(xpath="//a[text()='Demo']")
	public WebElement demoLink;
	
	@FindBy(xpath="//a[text()='Pricing']")
	public WebElement pricingLink;
	
	@FindBy(xpath="//div[contains(@class, 'lvl-0 dropdown')]//span[text()='Features']")
	public WebElement featuresDropdown;
	
	@FindBy(xpath="//div[contains(@class, 'lvl-0 dropdown')]//span[text()='Product']")
	public WebElement productDropdown;
	
	@FindBy(xpath="//a[@href='https://phptravels.com/integrations']")
	public WebElement integrationsLink;
	
	@FindBy(xpath="//a[text()= 'Docs']")
	public WebElement docsLink;
	
	@FindBy(xpath="//nav[@class='clearfix']//a[text()= 'Blog']")
	public WebElement blogLink;
	
	@FindBy(xpath="//div[contains(@class, 'lvl-0 dropdown')]//span[text()='Company']")
	public WebElement companyDropdown;
	
	//Tiles
	@FindBy(xpath="//a[contains(text(), 'Homepage - Front-End')]")
	public WebElement frontEndTile;
	
	@FindBy(xpath="//a[contains(text(), 'Administrator - Back-End')]")
	public WebElement adminBackEndTile;
	
	@FindBy(xpath="//a[contains(text(), 'Supplier Panel - Back-End')]")
	public WebElement supplierBackEndTile;
	
	@FindBy(xpath="//small[text()='http://www.phptravels.net']//parent::a")
	public WebElement frontEndLinkButton;
	
	@FindBy(xpath="//small[text()='http://www.phptravels.net/admin']//parent::a")
	public WebElement backEndAdminLinkButton;
	
	@FindBy(xpath="//small[text()='http://www.phptravels.net/supplier']//parent::a")
	public WebElement backEndSupplierLinkButton;
	
	@FindBy(xpath="//span[text()= 'App Store']//ancestor::div[contains(@class, 'fadeInUp')]//a[contains(text(), 'Mobile Apps')]")
	public WebElement mobileAppStoreTile;
	
	@FindBy(xpath="//span[text()= 'Google Play']//ancestor::div[contains(@class, 'fadeInUp')]//a[contains(text(), 'Mobile Apps')]")
	public WebElement mobilePlayStoreTile;
	
	@FindBy(xpath="//span[text()= 'App Store']//ancestor::a")
	public WebElement appStoreTile;
	
	@FindBy(xpath="//span[text()= 'Google Play']//ancestor::a")
	public WebElement playStoreTile;
	
	//Bottom page buttons
	@FindBy(xpath="//a[contains(text(), 'Join')]")
	public WebElement joinNewsletterLink;
	
	@FindBy(xpath="//button[contains(text(), 'SUBSCRIBE')] ")
	public WebElement subscribeButton;
	
	@FindBy(xpath="//a[contains(@title, 'php travels')] ")
	public WebElement phpTravelsBottomLink;
	
	@FindBy(xpath="//span[contains(text(), 'Facebook')]//ancestor::a")
	public WebElement facebookLink;
	
	@FindBy(xpath="//span[contains(text(), 'Youtube')]//ancestor::a")
	public WebElement youtubeLink;
	
	@FindBy(xpath="//span[contains(text(), 'Twitter')]//ancestor::a")
	public WebElement twitterLink;
	
	@FindBy(xpath="//span[contains(text(), 'Pinterest')]//ancestor::a")
	public WebElement linkedinLink;
	
	@FindBy(xpath="//span[contains(text(), 'Instagram')]//ancestor::a")
	public WebElement instagramLink;
	
	@FindBy(xpath="//div[text()= 'Product']//following::a[text()= 'Desktop App']")
	public WebElement desktopAppBottomLink;
	
	@FindBy(xpath="//div[text()= 'Product']//following::a[text()= 'Mobile Apps']")
	public WebElement mobileAppsBottomLink;
	
	@FindBy(xpath="//div[text()= 'Product']//following::a[text()= 'Features']")
	public WebElement featuresBottomLink;

	@FindBy(xpath="//div[text()= 'Product']//following::a[text()= 'Requirements']")
	public WebElement requirementsBottomLink;
	
	@FindBy(xpath="//div[text()= 'Product']//following::a[text()= 'Technology']")
	public WebElement technologyBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'links products')]//a[contains(text(), 'Changelog')]")
	public WebElement resourcesChangelogBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'links products')]//a[contains(text(), 'Updates')]")
	public WebElement updatesBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'links products')]//a[contains(text(), 'Providers')]")
	public WebElement providersBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'links products')]//a[contains(text(), 'Affiliate')]")
	public WebElement affiliateBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'links products')]//a[contains(text(), 'Road Map')]")
	public WebElement roadMapBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'social-media')]//a[contains(text(), 'Product Services')]")
	public WebElement productServicesBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'social-media')]//a[contains(text(), 'Customizations')]")
	public WebElement customizationsBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'social-media')]//a[contains(text(), 'Changelog')]")
	public WebElement servicesChangelogBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'social-media')]//a[contains(text(), 'Hotels Integration')]")
	public WebElement hotelsIntegrationBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'social-media')]//a[contains(text(), 'Shared Cloud Hosting')]")
	public WebElement sharedCloudHostingBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'html5-banners')]//a[contains(text(), 'Blog')]")
	public WebElement blogBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'html5-banners')]//a[contains(text(), 'About Us')]")
	public WebElement aboutUsBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'html5-banners')]//a[contains(text(), 'Contact Us')]")
	public WebElement contactUsBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'html5-banners')]//a[contains(text(), 'Jobs')]")
	public WebElement jobsBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'html5-banners')]//a[contains(text(), 'The Team')]")
	public WebElement theTeamBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'support-links')]//a[contains(text(), 'Terms of Service')]")
	public WebElement termsOfServiceBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'support-links')]//a[contains(text(), 'Privacy Policy')]")
	public WebElement privacyPolicyBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'support-links')]//a[contains(text(), 'Live Chat')]")
	public WebElement liveChatBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'support-links')]//a[contains(text(), 'Content Program')]")
	public WebElement contentProgramBottomLink;
	
	@FindBy(xpath="//div[contains(@class, 'support-links')]//a[contains(text(), 'Public Chat')]")
	public WebElement publicChatBottomLink;
	
	//inputs
	@FindBy(xpath="//input[@id= 'address']")
	public WebElement suscribeInput;
	
	//icons and popups
	@FindBy(xpath="//div[contains(@class, 'whatsapp')]//parent::a")
	public WebElement whatsappIcon;
	
	
	//chat now functionality
	@FindBy(xpath="//iframe[contains(@title, 'LiveChat chat widget')]")
	public WebElement chatNowIFrame;
	
	@FindBy(xpath="//p[contains(text(), 'Chat now')]//following::button")
	public WebElement firstChatNowButton;
	
	@FindBy(xpath="//div[contains(text(), 'Chat now')]//parent::button")
	public WebElement secondChatNowButton;
	
	@FindBy(xpath="//input[@id= 'name']")
	public WebElement chatNowNameInput;
	
	@FindBy(xpath="//input[@id= 'email']")
	public WebElement chatNowEmailInput;
	
	@FindBy(xpath="//span[contains(text(), 'Start the chat')]//ancestor::button")
	public WebElement startTheChatButton;
	
	@FindBy(xpath="//textarea[contains(@aria-label, 'Write a message')]")
	public WebElement writeAMessageInput;
	
	@FindBy(xpath="//button[contains(@aria-label, 'open emoji picker')]")
	public WebElement emojiPickerButton;
	
	@FindBy(xpath="//div[@id= 'list-0-item-0']")
	public WebElement smileFaceEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-1']")
	public WebElement happyFaceEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-2']")
	public WebElement lolFaceEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-3']")
	public WebElement smileyFaceEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-4']")
	public WebElement loveFaceEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-5']")
	public WebElement neutralFaceEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-6']")
	public WebElement dissapointedFaceEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-7']")
	public WebElement dislikeFaceEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-8']")
	public WebElement sadFaceEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-9']")
	public WebElement cryFaceEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-10']")
	public WebElement partyEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-11']")
	public WebElement heartEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-12']")
	public WebElement okHandEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-13']")
	public WebElement goodHandEmoji;
	
	@FindBy(xpath="//div[@id= 'list-0-item-14']")
	public WebElement crashHandsEmoji;
	
	@FindBy(xpath="//button[contains(@aria-label, 'Send a message')]")
	public WebElement sendMessageButton;
	
	@FindBy(xpath="//button[contains(@aria-label, 'Open menu')]")
	public WebElement openMenuInChatButton;
	
	@FindBy(xpath="//button[contains(@aria-label, 'Minimize window')]")
	public WebElement minimizeWindowOnChatButton;
	
	@FindBy(xpath="//button[contains(@aria-label, 'Close the chat')]")
	public WebElement closeTheChatButton;
	
	@FindBy(xpath="//li[contains(text(), 'Send transcript')]")
	public WebElement sendTranscriptOptionList;
	
	@FindBy(xpath="//li[contains(text(), 'Mute')]")
	public WebElement muteOptionList;
	
	@FindBy(xpath="//button[contains(@aria-label, 'Rate as good and open comment modal')]")
	public WebElement likeButton;
	
	@FindBy(xpath="//button[contains(@aria-label, 'Rate as bad and open comment modal')]")
	public WebElement dislikeButton;
	
	@FindBy(xpath="//textarea[@id= 'comment']")
	public WebElement leaveACommentInput;
	
	@FindBy(xpath="//span[contains(text(), 'Leave a comment')]//ancestor::button")
	public WebElement leaveACommentButton;
	
	@FindBy(xpath="//button[contains(@aria-label, 'Close modal')]")
	public WebElement closeLeaveACommentWindowButton;
	
	@FindBy(xpath="//span[contains(text(), 'Close the chat')]//ancestor::button")
	public WebElement closeTheChatRedButton;
	
	@FindBy(xpath="//input[@id= 'tycc7yp7kas_11591_0']")
	public WebElement firstQuestionYesRadioButton;
	
	@FindBy(xpath="//input[@id= 'tycc7yp7kas_11591_1']")
	public WebElement firstQuestionNoRadioButton;
	
	@FindBy(xpath="//input[@id= '028vn88op8s9_11592_0']")
	public WebElement secondQuestionYesRadioButton;
	
	@FindBy(xpath="//input[@id= '028vn88op8s9_11592_1']")
	public WebElement secondQuestionNoRadioButton;
	
	@FindBy(xpath="//textarea[@id= 'rateComment']")
	public WebElement rateAndLeaveACommentInput;
	
	@FindBy(xpath="//span[contains(text(), 'Submit')]//ancestor::button")
	public WebElement rateAndSubmitButton;
	
	@FindBy(xpath="//span[contains(text(), 'Show more')]//ancestor::button")
	public WebElement showMoreButton;
	
	@FindBy(xpath="//div[contains(text(), 'Start the chat')]//ancestor::button")
	public WebElement startTheChatAgainButton;
	
	@FindBy(xpath="//div[@id= 'livechat-eye-catcher-img']")
	public WebElement needHelpPopUp;
	
	//class constructor
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
		//The init method will create all the webelements
		PageFactory.initElements(driver, this);
	}
	
}
