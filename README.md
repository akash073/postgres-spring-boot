# postgres-spring-boot deploy

sudo apt update && sudo apt upgrade -y

sudo apt install postgresql-client -y

sudo apt install postgresql postgresql-contrib -y

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


#DATABASE SUPER USER CREATION IN POSTGRES

CREATE ROLE username WITH LOGIN SUPERUSER PASSWORD 'password';

#DUMP
pg_dump -h localhost --port=5432 -U test --dbname=test_db > test_db_dumb.sql

#RESTORE

psql -h localhost --port=5432 -U test --dbname=restored_db -f test_db_dumb.sql --set ON_ERROR_STOP=on

pg_dump -h localhost --port=9432 -U username --dbname=alhaiyatululya > alhaiyatululya_dumb.sql

drop database alhaiyatululya_local;

create database alhaiyatululya_local;

create role username;

create role username2;

create role rdsadmin;

\c  alhaiyatululya_local;

psql -h localhost --port=5432 -U test --dbname=alhaiyatululya_local -f alhaiyatululya_dumb.sql 

# Connect to remote postgres

sudo nano /etc/postgresql/12/main/postgresql.conf

listen_addresses = '*'



sudo nano /etc/postgresql/12/main/pg_hba.conf

find IPv4 local connections and replace 

host    all             all              0.0.0.0/0                       md5

host    all             all              ::/0                            md5


## Docker

sudo apt install apt-transport-https ca-certificates curl gnupg-agent software-properties-common -y

curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -

sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
#arm64
sudo apt update

sudo apt install docker-ce docker-ce-cli containerd.io -y

sudo chmod 666 /var/run/docker.sock

sudo usermod -aG docker ${USER}

sudo service docker restart

docker container run hello-world


#stop all docker container

sudo docker stop $(sudo docker ps -a -q)

# Logs docker logs

sudo docker ps -a
sudo docker logs -f <container ID>
       


## Nginx
sudo apt install nginx -y

sudo ufw allow 'Nginx Full'

sudo systemctl start nginx

## PHP

sudo apt update -y

sudo apt install -y curl wget gnupg2 ca-certificates lsb-release apt-transport-https

sudo apt-add-repository ppa:ondrej/php -y

sudo apt update -y

sudo apt install php-fpm php-cli php-common php-cgi php-mbstring php-curl php-gd php-xml php-xmlrpc php-pear php-zip php-snmp php-imap -y

sudo apt-get install php-pgsql -y

sudo nano /etc/nginx/sites-available/default


server {
...
        location ~ \.php$ {
                include snippets/fastcgi-php.conf;
                fastcgi_pass unix:/var/run/php/php8.0-fpm.sock;
        }
...
}


# check configuration is valid
sudo nginx -t

sudo systemctl restart nginx

sudo service nginx restart -y

sudo nano /var/www/html/phpinfo.php


<?php phpinfo(); ?>













