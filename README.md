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
