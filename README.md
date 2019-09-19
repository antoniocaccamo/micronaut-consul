# micronaut-consul

## image : creation
```sh
docker build -t \
  antoniocaccamo/micronaut-consul-bookinventory:$(git rev-parse --short HEAD) \
  -f micronaut-consul-bookinventory/Dockerfile micronaut-consul-bookinventory/
```



```sh
docker build \
  -t antoniocaccamo/micronaut-consul-bookcatalogue:$(git rev-parse --short HEAD) \
  -f micronaut-consul-bookcatalogue/Dockerfile micronaut-consul-bookcatalogue/
```

```sh
docker build \
  -t antoniocaccamo/micronaut-consul-bookrecommandation:$(git rev-parse --short HEAD) \
  -f micronaut-consul-bookrecommandation/Dockerfile micronaut-consul-bookrecommandation/
```

## image : latest

```sh
docker image tag \
  antoniocaccamo/micronaut-consul-bookcatalogue:$(git rev-parse --short HEAD) \
  antoniocaccamo/micronaut-consul-bookcatalogue:latest
```

```sh
docker image tag \
  antoniocaccamo/micronaut-consul-bookinventory:$(git rev-parse --short HEAD) \
  antoniocaccamo/micronaut-consul-bookinventory:latest
```

```sh
docker image tag \
  antoniocaccamo/micronaut-consul-bookrecommandation:$(git rev-parse --short HEAD) \
  antoniocaccamo/micronaut-consul-bookrecommandation:latest

```

## docker compose

```sh
docker-compose -d up

```

```sh
docker-compose down

```
