week7.day1
02:30 - 03:15 -> Hooks Implementation
03:15 - 03:30 -> Tags
03:30 - 04:15 -> Constructors & Keywords(this) 
04:15 - 04:30 -> Break
04:30 - 05:15 -> POM introduction
05:15 - 05:45 -> Breakout
05:45 - 06:30 -> POM Parallel Execution
06:30 - 06:45 -> Breakout




Hooks Implementation: Before TestNG intro
   Cucumber Annotations - > Hooks in Ruby Language
   its run before the scenario and after scenario
   Hooks:
       @Before :
          -is to have common precondition for each scenario
        @After : 
           - is to have common postcondition for each scenario


Steps to implement Hooks:
*Create a package called hooks and create a class called HooksImplementation
*Create 2 methods preCondition() and postCondition() and annotate with @Before and @After
*The Hooks class should extends BaseClass or PSM
*Add code inside precondition and postcondition and command out line feature file and stepdef
*In the Runner class inside glue attribute mention hooks package as well glue ={"steps","hooks"}


io.cucumber.java.InvalidMethodException: 
	You're not allowed to extend classes that define Step Definitions or hooks. 
  class stepDefinition.CreateLeadSD extends class stepDefinition.Hooks


  io.cucumber.java.InvalidMethodException: You're not allowed to extend classes that define Step Definitions or hooks. class stepdefinitation.Login extends class hooks.HooksImplementation




BaseClass:
Step-1 Add TestNG Annotation BeforeMethod and AfterMethod
Step-2 And copy code and paste inside perCondition and postCondition
Step-3 Command the common line in the feature file and steps package(launch browser and load url)
Step-4 Extends -> Runnerclass to BaseClass or PSM
BaseClass  or PSM extends AbstractTestNGCucumberTests
Step-5 And executed from the runnerclass


Tags:
It is used to categorize the scenarios

tags="@smoke" )// only smoke scenarios will be executed 
tags="not @smoke")// it will exclude a smoke scenario  from execution
tags="@smoke or @functional") // To run scenarios that have either of the tags
tags="@functional and @regression" ) //To run scenarios which has both the tags





Page Object Model - Design Pattern

Design Pattern -> Best Practices to code
 - pom.xml -> Project Object Model

 - POM     -> Page Object Model

Pages
LoginPage :
enterUsername - retain in the samepage - keyword -this
enterPassword - retain in the samepage -keyword -this (return this)
clickLoginButton - nextpage - call nextpage constructor

return new WelcomePage();



return this - retain in the same page or class
return new NextPage()-  if its connected with next page


WelcomePage:
clickCRMSFALink
Logout
MyHomePage: 
clickLeadsLink
clickAccountsLink
MyLeadsPage:
clickCreateLeadLink 
clickFindLeadsLink
clickMergeLeadsLink
CreateLeadPage :
enterCompanyName 
enterFirstName
enterLastName 
clickSubmitButton
ViewLeadPage :
verifyLeads 
clickEditButton
clickDeleteButton 
clickDuplicateButton



Steps to Implement POM:
*Create a new Project and have all the dependencies inside the pom.xml
*Create 3 packages inside src/main/java
base
pages
runner or testcase

*base Create a ProjectSpecificMethods or BaseClass and create 2 methods preCondition() and postCondition()
 and annotate with @BeforeMethod and @AfterMethod Create static driver as a global variable
*pages Create 6 classes for each page Each Classes inside pages package should extends 
ProjectSpecificMethods or BaseClass Create methods for each action inside each page Inside each method 
add return statement according to the page navigation 
-if an action stays in the same page -> return this 
-if an action takes you to another page -> return new nextPage();
*testcases or runner
All classes inside the testcase package should extend ProjectSpecificMethods   or baseclassCreate a class called RunLogin Create a method called runLogin and annotate with @Test Create object for LoginPage and call the method and execute


-If i want to reatin same page - this;
-If i want to go next page - return new  nextpage constructor- return new Homepage();


For Sequential Execution:
- Driver declaration should be static
- Create 2 testcases inside testcases package
     runLogin
     runCreateLead
- Select the required testcases and convert into testng.xml file
- Finally, run the testcases together sequentially from testng.xml file

Parallel Execution:

- remove static keyword from driver instance from PSM
-create own constructor call in each pages
public LoginPage(RemoteWebDriver driver){
    this.driver=driver;
}

-where you have called return new NextPage()-> pass driver variable inside
return new WelcomePage(driver);

-runner package also add the driver variable
LoginPage  lp=new LoginPage(driver);

This constructor call will accept both seq and parallel execution

2ec7d57f87b567aa8b3c0decf32b290a -psm
2ec7d57f87b567aa8b3c0decf32b290a