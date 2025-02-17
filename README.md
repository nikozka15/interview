## Instructions  

## Product listing  
You are provided with two public endpoints that deliver JSON data about products available on the Marketplace. You are also given the structure for a Spring Boot application. 
  
**Requirements**  
* Your task is to develop an application that provides a unified JSON response from a single endpoint located at `/products`. The endpoint will combine the data provided by the two external APIs.
* You will need to create a service class file and a new controller `src/main/java/com/clouddefense/interview/controller/ProductController.java`. The controller is using the service class in order to merge the data from both APIs, to apply the necessary filters, and to ensure the results are correct and returned in the correct format. The necessary clients and models for fetching product details and prices from these APIs have already been implemented.
* The response status of the API must be `200`.   
  

The output data your endpoints will return should be in JSON format and be an array of objects. An example is provided below. Each product should have the following fields:  
```GET /products```
```json
[
  ...
  {
    "product_uid": "6447344",
    "product_type": "BASIC",
    "name": "Apple",
    "full_url": "http://example.com/apple",
    "unit_price": 15.63,
    "unit_price_measure": "kg",
    "unit_price_measure_amount": 1
  },
  {
    "product_uid": "7947559",
    "product_type": "BASIC",
    "name": "Carrot",
    "full_url": "http://example.com/carrot",
    "unit_price": 0.5,
    "unit_price_measure": "g",
    "unit_price_measure_amount": 100
  },
  ...
]
```
* The mapping of fields from public API endpoint to the `/products` endpoint is as follows:
  * `product_uid` - `product_uid`
  * `product_type` - `product_type`
  * `name` - `name`
  * `full_url` - `url`
  * `unit_price.price` - `unit_price`
  * `unit_price.measure` - `unit_price_measure`
  * `unit_price.measure_amount` - `unit_price_measure_amount`
* Any data from the public API endpoints that does not fit into the `/products` endpoint schema should be ignored.
  
**Additional Requirements**  
* Your endpoint should also support an optional query string parameter `type`, which can have a value of a **single** `product_type`.
* When the `type` parameter is present and a corresponding `product_type` is found, the endpoint should return only the products that match the `product_type` value.
* When the `type` parameter is present and a corresponding `product_type` is not found, the endpoint should return an **empty array**.

**Evaluation Criteria**  
* Accuracy of the code, overall code quality, and quality of unit tests.
* Correctness of the response code returned by the endpoint.
* Validity of the returned JSON, ensuring the data matches expected results.
* Functionality of the query parameter, confirming it filters data as intended.
   
There are 7 test cases that run after the test is submitted. Each test case is worth approximately 14.28 points, leading to a total possible score of 100 points.  
