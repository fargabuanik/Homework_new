package xpath;

public class Home_work_Xpath {
	/*
	1. tag with a single attribute
	www.verizon.com
	//input[@id='search_box_gnav_input']
	//a[@aria-label='Pre-order the Apple iPhone 14 Pro.']
	//a[@class='gnav20-logoWhiteBg']
	//body[@class='react-page page basicpage gnav20-using-mouse']
	//meta[@name='google-site-verification']

	2.Tag with multiple attribute with 'or' logic 
	//a[@title='Verizon Home Page' or @title='Verizon Home Page']
	//div[@class='abwJ5F _16AW_S _2LF_6p' or @class='abwJ5F _16AW_S _2LF_6p']
	//div[@class='webPlayerContainer' or @class='webPlayerContainer']
	//meta[@name='google-site-verification' or @name='google-site-verification
	//span[@class='nav-line-1 nav-progressive-content' or @class='nav-line-1 nav-progressive-content']

	3.Tag with multiple attribute with 'and' logic
	//meta[@name='google-site-verification' and @name='google-site-verification']
	//span[@class='nav-line-1 nav-progressive-content' and@class='nav-line-1 nav-progressive-content']
	//div[@class='abwJ5F _16AW_S _2LF_6p' and @class='abwJ5F _16AW_S _2LF_6p']
	//div[@class='webPlayerContainer' and @class='webPlayerContainer']
	//div[@style='display:none;visibility:hidden;' and @style='display:none;visibility:hidden;']

	4) Tag with inner text
      //a[text()='Sell products on Amazon']
     //a[text()='Reload Your Balance']	
     //button[text()= 'Accessibility Survey']
    //a[text()='Skip to content']
    //div[text() ='Main Content']

   5) Tag with inner text [not complete inner text rather partial text]
	//h2[contains(text(),' more phone plans?')]
	//title[contains(text(),'Chargers vs. Chiefs')]
	//a[contains(text(),'Sell products on Amazon')]
	//a[contains(text(),'Reload Your Balance')]
	//title[contains(text(),'Home Services - Amazon Customer Service')]

	6) Tag with attributes and use of contains
    //div[contains(@class,'pre-l-wrapper mauto-sm d-sm-flx')]
    //script[contains(@id,'gen-nav-shared')]
    //script[contains(@type,'text/javascript')][5]
    //style[contains(@class,'server-style-loader-element')]
    //script[contains(@id,'esi-optimizely-src-skipped')]

     7) Normalize space -- eliminates leading and trailing spaces. (high level) – learn slowly
     //script[normalize-space(text())='window.PAGE_VERSION = "42c30a228";']

   8) Starts with text
   //span[starts-with(text(),'Banking')]
   //p[starts-with(text(),'Start Of Main Content')]
   //span[starts-with(text(),'Investments')]
  //title[starts-with(text(),'State Farm Auto Insurance & More for 100 Years. Get a Quote | State Farm®')]
  //span[starts-with(text(),'Pay a Bill')]

   9) Starts with attribute 
  //h2[starts-with(@class,'u-fontDisplay u-te')]
  //ul[starts-with(@class,'list-none flex flex-row m-none p-none')]
  //a[starts-with(@data-t,'header-primary-logo')]
  //nav[starts-with(@class,'hamburger-menu')]
  //a[starts-with(@data-lid,'hdr_carticon')]
	 */
}
