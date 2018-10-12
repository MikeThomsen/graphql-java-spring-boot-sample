# graphql-java-spring-boot-sample
Derived from [this tutorial](https://www.codenotfound.com/graphql-java-spring-boot-example.html)

## User mutation

```
mutation {
  newUser(username: "john.smith", password: "testing1234", fullName: "John Smith", validLogins: 5) {
    id
  }
}
```

## User query
```
{
  getUser(id: <ID_HERE>) {
    fullName
    username
    password
    validLogins
  }
}
```
