rm -rf ./src/main/docker/app/*.jar
rm -rf ./target/*.jar
rm -rf ./target/*.jar.original
./mvnw clean package -DskipTests
cp ./target/hr-management-0.0.1-SNAPSHOT.jar ./src/main/docker/app
sudo docker build -t db-img ./src/main/docker/postgres/
sudo docker-compose -f src/main/docker/app/docker-compose.yml up
