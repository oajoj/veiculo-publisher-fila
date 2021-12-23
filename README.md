# Veículo Publisher

Para utilização desta api de publicação de mensagens, clone o projeto, abra o terminal na raís do projeto e execute os seguintes comandos:

    mvn clean install : Para realizar a limpeza dos artefatos construídos e, posteriormente, instalar um artefato limpo.
  
    mvn spring-boot:run Para executar a aplicação.
  
  Enquanto a aplicação estiver em execução, não feche o terminal.
  
  Para fazer os envios das mensagens tu podes utilizar algum software utilitário, tal como: Postman ou Insomnia. Utilize o seguinte endereço para fazer os envios:
  
      localhost:8081/api/veiculo
      
  Execute um POST para o endereço acima utilizando a seguinte estrutura:
  
      {
	      "nome": "NomeExemplo",
	      "marca": "MarcaExemplo",
	      "valor": 0000,
	      "ano": 0000,
	      "donoId": 1
      }
      
 O atributo `donoId` é uma FK, portanto é necessário que o valor exista na base de dados para que a mensagem seja recebida com sucesso.
       
  
  
  
  
