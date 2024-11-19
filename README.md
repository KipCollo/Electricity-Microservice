# Smart City System

The project has several services:

1. Citizen microservice - It simulates smart meters randomly gnerating data at specified range as well as takes citizen manual data input.Each meter reading has is more than previous.
2. Electricty Provider microservice - Contains APIs for receiving data from smart meters and citizen's input in Citizen microservice.Data is received in real-time.
3. Smart City microservice - Contains API for requesting data from Electricty providers microservice.It then aggregates and collate the data and stores the aggregated data permanently in database.
4. Main - It simulates Smart City System; runs one instance of smart city service,3 instance of electricty providers service and 100 citizen's for manual entry & 50 smart metersfor automated entry.
5. testing - Contains Unit test for all microservices
6. Data - Contains database fies used to permanently store collected data samples.

## Technologies Used

1. Java
2. SpringBoot
3. MongoDB Database
4. API Gateway
5. REST Template
6. Swagger
