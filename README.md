# Projeto Intermediário

Este é um projeto de backend desenvolvido por Geanlucca Zappe usando o Spring, Maven.

## Classes

### Ajuda.java

Esta é uma classe de modelo que contém dois campos, `estudante` e `projeto`. Ela tem métodos getter e setter para esses campos.

### ProjetoController.java

Esta é a classe do controlador que lida com as solicitações HTTP. Ela usa a classe `ProjetoService` para realizar várias operações e retorna os resultados como respostas HTTP.

### ProjetointermediarioApplication.java

Esta é a classe principal que inicia a aplicação Spring Boot.

### ProjetoService.java

Esta é a classe de serviço que contém a lógica de negócios. Ela usa o WebClient para fazer chamadas HTTP para a API do Cataas.

## Endpoints

- `/consulta`: Retorna uma consulta da API do Cataas.
- `/processamento`: Processa os dados recebidos no corpo da solicitação. ("Processamento era pra ser um Post, mas não consegui pensar em como fazer um post com essa API.
- `/ajuda`: Retorna um objeto Ajuda com informações sobre o estudante e o projeto.
- `/gato`: Retorna uma imagem aleatória.
- `/Sol`: Retorna uma imagem no Sol.
- `/Suave`: Retorna uma imagem Suave.
- `/Dorminhoco`: Retorna uma imagem de um gato Dorminhoco.

## Como executar

Para executar este projeto, você precisa ter o Java e o Maven instalados. Depois de instalados, você pode executar o projeto usando o seguinte comando:


