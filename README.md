
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | ROHINI GUDIMETLA           |
| Date         | 02/21/2024                 |
| Course       | Spring                     |
| Assignment # | 2                          |

# Assignment Overview
This is an application where retailers get to send out notifications to available drivers in the city.
The drivers can accept the requests and their status is updated accordingly.

# GitHub Repository Link:
https://github.com/rohinigudimetla/cs-665-assignment-2

# Implementation Description 


- The following objects can be added with ease: Driver, Shop and Product, since they have their own respective classes.
- The remaining classes rely on these to create their own objects.
- There are separate, simplified classes for each entity. In the Driver class, orders that were broadcast, can be accepted.
- Consecutive changes are made to the available orders and drivers accordingly. 
- Duplicated code has been avoided by the use of different classes creating a list of objects that were created by other classes.
- The Observer pattern was chosen since the drivers tune into the Delivery Requests class in order to get notified about new orders.
- Notifications can be sent out to all the drivers available and the drivers can choose to accept the order request.


# Maven Commands
```bash
mvn package
````
```bash
- mvn compile
````
```bash
- java -jar target/JavaProjectTemplate-1.0-SNAPSHOT.jar 
````

## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`


