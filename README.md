# Katalon-Studio-Training-Assessment

# Project 01 - Orange HRM

Non Applicable/Troubled Scenarios:

### ❖ Reset password

➢ (-) Users enter the same username -> I changed the scenario into (-) Users leave the form blank

➢ (-) Users enter invalid username -> The system does not seem to have invalid username authentication, it just accepts every username I entered


### ❖ Add Currency

➢ (-) Users enter invalid currency -> Users leave the currency form blank

➢ (-) Users enter registered currency -> Registered Currency is automatically removed from the currency drop down list


### ❖ Edit Currency

➢ (+) Successfully replace the currency -> The system does not allow the currency to be replaced


### ❖ Search Employee

➢ (-) Users enter invalid username -> No option to search by username


## Data Driven Testing (DDT) and Behaviour Driven Development (BDD)

**DDT** is applied to these test cases:
- TC03-02 Add New Account
- TC04-01 Add Job Title
- TC05-01 Add New Currency
- TC05-03 Delete Currencies
- TC06-01 Add Job Category
- TC07-01 - Add Employee

**BDD** is applied to these test cases:
- TC05 - Pay Grades
  - 01 - Add Pay Grade
  - 02 - Add Currency
  - 03 - Delete Currency





# Project 02 - Empxtrack

Non Applicable/Troubled Scenarios:

### ❖ Leave

➢ (+) Successfully cancel a pending leave request -> Leave request cannot be made so there is no leave request to be cancelled


## Data Driven Testing (DDT) and Behaviour Driven Development (BDD)

**DDT** is applied to these test cases:
- TC04-01-013 Add New Event
- TC04-01-015 Add New Task
- TC05-04-053 AddMyTicket

**BDD** is applied to these test cases:
- TC03/BDD01 - Search
