run: build
	sudo docker-compose -f src/main/docker/app/docker-compose.yml up

build:
	./mvnw clean package -DskipTests
	cp ./target/hr-management-0.0.1-SNAPSHOT.jar ./src/main/docker/app/
	sudo docker build -t db-img ./src/main/docker/postgres/

rebuild: clean run

clean: stop
	rm -rf ./src/main/docker/app/*.jar ./target/*.jar ./target/*.jar.original

stop:
	sudo docker-compose -f src/main/docker/app/docker-compose.yml down
