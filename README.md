# Test task

This project uses Maven, Spring framework and H2 embedded database. The compiler I used for testing was Java 1.7 JDK.

#Database H2
I used Spring to initialize the database at runtime. The database sql can be found in src/main/resources/db folder. Since I am using H2 as an embedded databese, the data changes will last until closing the server. The customer data table is simplistic, I didn't add any specific constraints other then NOT NULL.

#UI
The application uses Bootstrap to make it look better but I didn't pay much attention to the looks. I also added simple form validation to the application so that the user can't add new customer data with blank fields. Error messages are displayed next to the corresponding field.


#Jetty
To run the application on Jetty from the command line, open the cmd line at the project folder(where the pom.xml is) and use this command: mvn jetty:run
The application runs at localhost:7777 and the main page is: localhost:7777/customers

#Tomcat
To run the application on Tomcat from the command line, open the cmd line at the project folder(where the pom.xml is) and use this command: mvn tomcat7:run
The application runs at localhost:7777 and the main page is:  localhost:7777/customers

#Jboss
Unfortunately I was unable to run the application using Jboss. I tried diffent versions of Jboss, different configurations but to no avail.



