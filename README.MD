Start database

    docker run -d -p 3306:3306 --name mysql-pruebajpa -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=pruebajpa mysql:latest