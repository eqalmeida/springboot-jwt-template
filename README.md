# Projeto Template de Autenticação usando SpringBoot

Esse projeto serve como base para authenticação usando JWT

## Gerando chaves com openssl

```bash
openssl genrsa -out app.key 4096
```

```bash
openssl rsa -in app.key -outform PEM -pubout -out app.pub
```

copie as chaves na pasta src/main/resources/
