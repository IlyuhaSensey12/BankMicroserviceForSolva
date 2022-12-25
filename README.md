What is this project for?

The goal of this mini project is to write a simple micro web service to mimic a “Bank Account”. Through this web service, one can query about the balance, deposit money, and withdraw money. Just like any Bank, there are restrictions on how many transactions/amounts it can handle. The details are described below.

Write a simple “Bank Account” web service using REST API design principles.
Program should have 3 REST API endpoints: Currency Rate, Operations, Limits
No requirement for authentication assume the web service is for one account only and is open to the world
No requirement for the backend store you can store it in a file or database (your decision)
How do I run the project?

N.B.: Internet Connection needed to download jars from Maven Repo
Rest Endpoints

localhost:8080/operations/all [GET]

localhost:8080/operations/addOperation [POST]

localhost:8080/limits/updatePost [PUT]

FOR Rate we use get and save method in RateService and this endpoint is localhost:8080/test
API we get from https://twelvedata.com/docs#time-series
and configured it daily and get last updated rate

ATTENTION!!!!

In future I will upgrade this project when I will have more knowledge about Spring Cloud, 
I need build 2 microservices for client and bank systems, so take a look on my progress in future.
