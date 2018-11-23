## Google-geocoding integration :
    - About : An API developed using Java springboot & maven to :
        -  query address and latitude+longitude 
        -  using Google's Geocoding API integration services.

## tl;dr - watch the functionality at the below link:
    - You tube - https://www.youtube.com/watch?v=CTH_Ei4Ilt0 

## Features : The API has the following features:
    - Exposes a RESTful API
    - Accepts address as a single string
    - Uses this address parameter to query Google's Geocoding API,
    - Consumes the API and sends response displaying "formatted address", "latitude" and "longitude" in XMLformat. 

## Tools & tech used : 
    - Java springboot
    - Spring-tool-suite-4
    - Swagger UI
    - Postman tool
    - Docker
Disclaimer - This API was built & tested on MacBook Pro

## Assumptions :
    - Took an MVP approach to show the logical thinking and a working API with integrations
    - Used Tomcat(since it serves the goal for now). 
    - Wish to add Apache Camel on a separate branch and build it as soon as i find sometime.
    - The code quality can be improved further with cleaner MVC structure, better inline comments
    - Focus on functionality & MVP thinking since this is not a productin grade API. 

## Steps to build & run the application:
    - Using Spring-tool-suite-4 
        - Download the repository and navigate to "Geocoding" folder. Open it with using Spring-tool-suite-4.
        - Select project,then right click (on Geocoding), select "Run as" and click on "maven clean" to run the build. 
        - Upon successful build, again right click (on Geocoding), select "Run as" and click on "maven install". 
        - This generates the "jar" file. On target folder, you can "right click" and click on "refresh" to see the jar file.
        - To finally run the app and view the API, right click (on Geocoding), select "Run as" and click on "Sprint Boot App".
        - Once the app is running, you can visit test the API using the methods/tools listed under "#Testing the API". 
    - If you wish to use the Terminal & Docker to buid and run the app. 
        - Pre requisite - Make sure you have docker installed and running .
        - On terminal run " mvn clean package docker:build" command at root directory ("GeoCoding"). 
            - Creates the docker  image and jar file in the target/docker location. 
            - On target folder, you can "right click" and click on "refresh" to see the jar file created. 
        - Verify the image was created using "docker images" command. 
        - To run the docker image; use the below command 
        "docker run -p 8085:8085 -t springbootdockermavenbuild"
         ; where -p is the port and you can chose any port number which is not in use currently. 
          & Creates a new container where you can view the app. 

## Testing the API :
    - On Chrome, visit the following url
        - http://localhost:8080/getGeoCoding/Amsterdam    
    - On Swagger, cisit the following url
        - http://localhost:8080/swagger-ui.html 
            - Pls visit - geo-coding-api-controller 
            - Click on GET ( button) and then click on “Try it out” button
            - In the address field, please fill the name of a city; for e.g. Amsterdam , no click on execute
            - Scroll down to see the response code in xml format
    - On Postman (https://www.getpostman.com/apps to download)
            - In the tool, select GET in the drop down and paste the following url
            - http://localhost:8080/getGeoCoding/amsterdam and hit send button. 
            - In the body, you can view the xml response with details of the API call 
Note 
    - Since the API is coded (to xml output), json, text or html view is not available in postman swagger 
    - Replace Amsterdam in the url and query any city you wish.

## Bonus - Performance scheduling & monitoring : 
    - Pro-actively testing and monitoring the performance of the API using Postman monitor
    - Using the monitor the api availability is currently set to test every 4 hours.  
    - A notification is sent every 4 hours on the registered postman e-mail about the performance of this API 
    - An error notification is sent as soon as the API is failing (check monitor report in the attached image). 
    
 ![Postman monitor.png](https://images.zenhubusercontent.com/579884bee40e5714b16c96cc/4cc31186-47df-4565-99c9-b19474581cf6)

## To-do 
    - CI with travis
    - Deploy to cloud (azure/aws)
    - Swap Tomcat with Apache-camel
    - Add integration test 
    - Build a client to call the API service from front end 

Thank you for the opportunity!

Regards,
Vikas
