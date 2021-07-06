# spring-boot-kafka
###### Project spring boot and kfka publisher
## Tools needed
###### Java version minimum: 1.8.0.261
###### Docker and Docker compose

##  How to run the projects with command line
###### in the main folder  **spring-boot-kafka**
1.  docker-compose up -d
2.  Run command "cd PlayerProject"
3.  Run command "./gradlew clean build"
4.  Run command "./gradlew bootRun"

- [x] # end point http://localhost:8191/api/v1/player/

- Curl message
"curl -X POST \
  http://localhost:8191/api/v1/player/ \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: d4786f3f-6f71-1573-cc81-11fb792eebf2' \
  -d '[
    {
      "name": "Sub Zero",
      "type": "expert"
    },
    {
      "name": "Scorpion",
      "type": "novice"
    },
    {
      "name": "Reptile",
      "type": "meh"
    }
  ]'"



