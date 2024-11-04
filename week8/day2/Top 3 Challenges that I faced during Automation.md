Top 3 Challenges that I faced during automation [STAR Approach - Situation Task Action Result]:

1) Stale Element Reference Exception

Situation: While automating 400+ tests and running them using Selenium Grid, I noticed several tests failing with Stale Element Reference exception and this caused lot of rework in the test automation project. 

Task: Have to find the rootcause of this problem and fix it [Not having deeper understanding] !! 

Root Cause: When the element was looked for its presence by findElement, the element was there. But it got disappeared, when you were about to interact with the element - sendKeys, click, clear !! 

Action: 

Option 1) Either add sleep statement before find the element [How long?]
Best Option) Whenever there is stale element reference exception, find the element again !! 

Result:

This solved most of the common failures and the test automation results were helpful to speed up the testing efforts !! You are awarded 'STAR Award' !!


Thread.sleep(2000);
driver.findElement(By.id("username")).sendKeys("Demo");


WebDriverWait


Try-catch block


2)Xpath Challenges due to dynamic application changes

Situation: XPath keep breaking to dynamic element introduction or deletion in the given page or back of the screen

Task: Find a common approach that can solve changing DOM element causing failures

Action: Built an XPath based on unqiue screen or window name and from there -> traverse to the label denoting the element -> and then traverse to the exact element by its index helped to solve these dynamic changing problems / Used Chrome extensions like Ruto to assist on XPath auto generation

Result: Saved lot of time and saved the script from failing changing DOM elements


driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demo");

Advance Xpath:
//label[text()='Username']/following::input -SF
//label[text()='Username']/following-sibling::input -LT



Scenario3: Enhance framework with dynamic test data

Situation: We are using Excel to keep the data. Which is providing static data to the test cases. Client has raised this a concern as data whatever we create using automation looks like junk data in data base

Task: I was asked to implement dynamic data for the test cases

Action: I have explored APIs and libraries to dynamic data  and implemented faker one of the java library. Faker is very simple and easy to implement in our framework. 

Result: Data created using Faker is dynamic and looks like real data


