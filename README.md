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

sudo apt install apt-transport-https ca-certificates curl gnupg-agent software-properties-common -y

curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -

sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
#arm64
sudo apt update

sudo apt install docker-ce docker-ce-cli containerd.io -y


sudo docker container run hello-world




#stop all docker container

sudo docker stop $(sudo docker ps -a -q)




