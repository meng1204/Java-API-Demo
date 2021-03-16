# Java demo API

## Java Spring boot MVC Project structure

inside src/main (outer to inner)
* controller: 
  - very high level. 
  - Intercepts incoming requests
* service:
  - All the business logic and authorizations happen here
* dao (repository)
  - Data Access Object
  - Encapsulating the details of the persistence layer and provide a CRUD interface for a single entity
  - main goal is to handle the details of the persistence mechanism
  - usually core component
* repository (similar to dao)
  - encapsulating storage, retrieval, and search behavior, which emulates a collection of objects
* model:
  - Data-driven models
  - interact with database  

## API URL