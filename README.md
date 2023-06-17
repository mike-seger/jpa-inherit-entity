# Description

This is a small SpringBoot example how to leverage inheritance in JPA.  
This one here uses: @Inheritance(strategy = InheritanceType.JOINED)
There exist several other strategies to achieve inheritance, for more information see here: https://thorben-janssen.com/complete-guide-inheritance-strategies-jpa-hibernate/

# Run
```
./gradlew clean bootRun
```

# Create X and W instances
```
curl -X POST -H "Content-Type: application/json" -d '{"xattr1":"Value of xattr1","xattr2":"Value of xattr2","yattr1": "Value of yattr1","yattr2":"Value of yattr2"}' http://localhost:8080/api/x

curl -X POST -H "Content-Type: application/json" -d '{"wattr1":"Value of wattr1","wattr2":"Value of wattr2","yattr1": "Value of yattr1","yattr2":"Value of yattr2"}' http://localhost:8080/api/w
```

# open H2 console
http://localhost:8080/h2
