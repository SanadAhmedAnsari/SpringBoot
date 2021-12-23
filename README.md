# SpringBoot


we need to implement as TDD so that we need minimal changes in test cases

1. Implement a GET /hotel/{id} to retrieve a hotel by Id

2. Implement a DELETE /hotel/{id} to delete a hotel by Id. (It should not be actually deleted from the system but should be marked as 'deleted')

3. Search all the hotels closest to the city center. /search/{cityId}. The city object has latitude and longitude and the hotel object also has latitude and longitude.
The distance between two can be calculated using the haversine formula, (The question says we can use the internet to calculate the haversine formula)


Extend a half implemented Spring boot application
Application contains data about hotels and cities.
Need to implement few APIs related to finding nearest hotels to the city center sort by distance and distance property
should be there in hoteldto to show the distance as well from the entered city 
endnpoint :- /search/{cityId}?sortBy=distance
Distance needs to be calculated with haversine formula
There were some pre-written test cases, which deliberately written to fail the build, need to fix them and add few more if time permits.
