
# E-Commerce Java EE 7

Este é um projeto básico Java EE 7 utilizando Java 8, Maven e WildFly 8.

## Pré-requisitos

- JDK 8
- Apache Maven
- WildFly 8

## Deploy e Execução

### Compilar e Empacotar

Para compilar e empacotar o projeto, execute o seguinte comando Maven:

```bash
mvn clean install
```

o maven criará o .war que deverá ser deployado no Wildfly

### Deploy no servidor WildFly

Inicie o servidor executando o script apropriado no diretório `bin/` do WildFly:

```bash
./standalone.sh
```

Execute o CLI do servidor:

```bash
./jboss-cli.sh
```

Conecte ao servidor:

```bash
connect
```

Execute o comando de Deploy

```bash
deploy caminho/para/o/arquivo/war/criado/no/target
```

A aplicação estará acessível na porta 8080 do localhost


