# Spring Boot + MongoDB + docker

***This is a successful trail application to run spring boot application with MongoDB in Docker***


### How to run this application

git clone https://github.com/dileepkeeppalli/backend.git

Build the code
`./gradlew clean build -x test`

create image for spring boot application 
`docker build --build-arg JAR_FILE=build/libs/*.jar -t demo/gradle-java-spring-boot .`

Run the container along with mongoDB configured in docker-compose.yaml file
`docker-compose up`





