# FoodTruck Services

FoodTruck is an applications developed in Java to look for places to eat in the city of San Francisco.

You can look for the location on a particular food truck if you know what you want or choose between the different options getting a list of some random food trucks.
Or if you want something near you can search with something that match the coordinates of your location.

This application exposes three simple REST services to get the results from an embedded database containing the information of many places to eat:
Search by place name:
http://localhost:8080/vendor?applicant=The%20Geez%20Freeze
Get a page of n number of results to pick one.
http://localhost:8080/vendor/page?pageNumber=1&pageElements=10
Get places near the location using coordinates
http://localhost:8080/vendor/near?x=600&y=2105

Project developed using Java, Springboot, Junit jupiter, Mockito, Lombok, Spring Actuator, Maven 
