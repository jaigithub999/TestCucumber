Feature: To Validate the login functionality

  Scenario Outline: To Validate login functionality with inappropriate credential
		Given user launch floto application
		And user click account link
		When user enter "<username>" and "<password>"
		And user enter login button
		Then user see the result based on the "<credential>"
		
		Examples: 
		|username|password|credential|
		|jayaselvam@gmail|jai@123|negative|
		
		
		
		