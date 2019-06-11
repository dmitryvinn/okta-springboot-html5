# Okta Integration with Spring Boot+HTML5  

## Overview
Simple TODO app built on top of Spring Boot and HTML5.

## Running the App

To start the application, you will need to update its `application.yaml` with next properties:
 ```
okta.oauth2.issuer: {Find in your Dashboard, top right corner}
okta.oauth2.clientId: {Created as a part of your Okta Web App}
okta.oauth2.clientSecret: {Created as a part of your Okta Web App}
```

After your Okta integration is configured, you will need to start the app:

```
gradle bootRun
```

## Using the App
Assuming the app runs on the default port, go to `http://localhost:8080`:

![figure1](https://github.com/dmitryvinn/okta-springboot-htm5/blob/master/docs/assets/figure1.png "figure1")
Figure 1: Home Screen of Demo App

The application will require you to login using the credentials specified in your [Okta Dashboard](https://developer.okta.com/product/user-management/).
By default, you have at least one user associated with the email you used to create Okta App:

![figure2](https://github.com/dmitryvinn/okta-springboot-htm5/blob/master/docs/assets/figure1.png "figure1")
Figure 2: Okta Authentication Widget

After you're authenticated, go ahead and create new todo items, delete existing ones or complete items you are done with.

![figure3](https://github.com/dmitryvinn/okta-springboot-htm5/blob/master/docs/assets/figure3.png "figure1")
Figure 3: Okta Authentication Widget

### Note
If you encounter an exception, "400 Bad Request; The 'redirect_uri' parameter must be an absolute URI", follow steps described [here](https://support.okta.com/help/s/article/The-redirect-uri-parameter-must-be-an-absolute-URI).

## Acknowledgments
This project is based:
* [Okta Integration with Spring Boot](https://developer.okta.com/blog/2018/09/26/build-a-spring-boot-webapp)
* [TodoMVC](http://todomvc.com/)
* [HTML5 Todo](https://www.w3schools.com/howto/howto_js_todolist.asp)

