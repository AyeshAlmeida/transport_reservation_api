# Transport Reservation API Server #

Simple REST API for Transport Reservation System

## Prerequisites ##

* Java 1.8.x
* MySQL 8.x
* Maven 3.x

## Required Configurations ##

* Create following 'reservation_db' Databases in MySQL (Do not have to specify the schema since Hibernate will automatically create it). 

* Add following DNS to '/etc/hosts' file.

```
    127.0.0.1   db.mysql.reservation
    127.0.0.1   reservation.core
```

## How to Deploy ##

* Build the project from top-level.

```
    mvn clean install
``` 

* Find the deployable 'reservation-api-server.zip' located at 'reservation-service/target' and extract it.

* Go into 'reservation-api-server' directory and execute following command.

```
    ./bin/reservation-api-server start
```

## How to Test ##

* Use Postman Documentation located at 'reservation-service/docs'.