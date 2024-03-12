# Projeto Contador em Java

Este é um aplicativo Java simples que solicita ao usuário a entrada de dois números e realiza uma operação de contagem.

## Descrição

O aplicativo solicita ao usuário que insira dois números. Em seguida, realiza uma operação de contagem do primeiro número até o segundo. Se o primeiro número for maior que o segundo, ele lançará uma `ParametrosInvalidosException`.

## Como executar

1. Compile o arquivo Java: `javac Contador.java`
2. Execute o arquivo Java compilado: `java Contador`

Você será solicitado a inserir dois números. Insira o primeiro número, pressione enter, depois insira o segundo número e pressione enter novamente.

## Tratamento de exceções

O aplicativo possui uma exceção personalizada `ParametrosInvalidosException` que é lançada quando o primeiro número inserido pelo usuário é maior que o segundo. Nesse caso, o aplicativo exibirá uma mensagem: "O segundo parâmetro deve ser maior que o primeiro."

## Licença

[MIT](https://choosealicense.com/licenses/mit/)
