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


# Connect to remote postgres

sudo gedit /etc/postgresql/12/main/postgresql.conf

listen_addresses = '*'



sudo gedit /etc/postgresql/12/main/pg_hba.conf

find IPv4 local connections and replace 

host    all             all              0.0.0.0/0                       md5

host    all             all              ::/0                            md5


## Docker

#stop all docker container

sudo docker stop $(sudo docker ps -a -q)




