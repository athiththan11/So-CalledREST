# So-Called REST

A fake REST API for developers with **Basic Authentication** backed by [JSONPlaceHolder](https://jsonplaceholder.typicode.com/).

**[Deployed on Heroku](https://socalledrest.herokuapp.com/)**

### Basic Authentication

* username: `carbon`
* password: `hydrogen`

### Resources

* [Users](https://jsonplaceholder.typicode.com/users)

### Routes

* GET [/mock/users](https://socalledrest.herokuapp.com/mock/users) : `http://localhost:8080/mock/users`
* GET [/mock/users/1](https://socalledrest.herokuapp.com/mock/users/1) : `http://localhost:8080/mock/users/1`

#### Build & Run

> Use the second command, if you dont have a pre-installed maven environment

```shell
mvn spring-boot:run
```

```shell
./mvnw spring-boot:run
```
