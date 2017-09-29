cd app && mvn clean install && cd ..

docker-compose up --build -d
docker logs -f $(docker ps -q -f name="sessionbeans-app")
