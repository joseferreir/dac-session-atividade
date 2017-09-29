# PARANDO CONTAINERS
docker-compose down

# REMOVENDO IMAGENS

docker rmi -f sessionbeans/banco
docker rmi -f sessionbeans/webapp


# REMOVENDO VOLUME
docker volume remove ./bd:/var/lib/postgresql
