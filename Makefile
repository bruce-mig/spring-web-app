mysql:
	docker run --name todo-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=secret -e MYSQL_DATABASE=todos -d mysql:8.4-oracle
