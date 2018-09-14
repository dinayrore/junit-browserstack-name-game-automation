# Cross Browser Parallel Testing with [JUnit](http://junit.org/junit4/) Integrating [BrowserStack](https://www.browserstack.com/).

## Setup
* Clone repo
* Install dependencies `mvn install`
* Sign up with [BrowserStack](https://www.browserstack.com/)
* Update ~/.bash_profile with your [BrowserStack Username and Access Key](https://www.browserstack.com/accounts/settings).

OR

* Export the environment variables for the Username and Access Key of your BrowserStack account.
 ```
  export BROWSERSTACK_USERNAME=<browserstack-username> &&
  export BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
 ```

## Running your tests
* To run parallel tests, run `mvn test -P parallel`


## Notes
* You can view your test results on your [BrowserStack Automate dashboard](https://www.browserstack.com/automate)
* To test on a different set of browsers, check out our [platform configurator](https://www.browserstack.com/automate/java#setting-os-and-browser)


## Additional Resources
* [Download Mavin](http://maven.apache.org/download.cgi)
* [Documentation for writing Automate test scripts in Java](https://www.browserstack.com/automate/java)
* [Customizing your tests on BrowserStack](https://www.browserstack.com/automate/capabilities)
* [Browsers & mobile devices for selenium testing on BrowserStack](https://www.browserstack.com/list-of-browsers-and-platforms?product=automate)
* [Using REST API to access information about your tests via the command-line interface](https://www.browserstack.com/automate/rest-api)