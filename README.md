# postgres-spring-boot

sudo apt update && sudo apt upgrade -y

sudo apt install postgresql-client

sudo apt install postgresql postgresql-contrib

sudo systemctl status postgresql

sudo systemctl enable postgresql && sudo systemctl start postgresql

sudo systemctl stop postgresql
sudo systemctl restart postgresql


sudo -i -u postgres
psql
\q

create database test_db;
create user test with encrypted password 'abc';
grant all privileges on database test_db to test;


## Docker

#stop all docker container

sudo docker stop $(docker ps -a -q)




