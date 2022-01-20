# Criação de uma API Rest do projeto Accurate Back-end.

**O projeto está na brench Master**

Neste projeto, foram criadas as requisições solicitadas. Elas podem ser testadas
pelo swagger, links para utiliza-lo:
1. http://localhost:8080/swagger-ui.html
2. http://localhost:8080/swagger-ui.html#/achados-perdidos-controller

## Sobre os Path's: 
Path padrão do AchadosPerdidosController:
http://localhost:8080/api/achadosperdidos

Foi criado um RequestMapping com o Put e o Get em um unico método, devido a 
implementação ser a mesma. Eles podem ser acessados com o path padrão do 
AchadosPerdidosController.

Também foi criado um metodo com Get para buscar todos os dados do banco.
Ele pode ser acessado com o path padrão do AchadosPerdidosController.

Foram adicionados dois metodos, Get e Delete, os dois por id. Podem ser acessados
por esse path: http://localhost:8080/api/achadosperdidos/{id}

Foi criado também um metodo Get que busca por nome, que facilita uma busca filtrada.
Pode ser acessado por este path: http://localhost:8080/api/achadosperdidos/nome/{porNome}

E por fim, um metodo Get que busca por categoria, assim, facilitando também uma
busca filtrada. 
Pode ser acessado por este path: http://localhost:8080/api/achadosperdidos/categoria/{categoria}


## AchadosPerdidosRepository:
Nesta interface, foi implementada a extenção de PagingAndSortingRepository. 
E implementados os metodos para busca filtrada.



## Exception:
Neste package, foi implementada uma exceção personalizada. Que captura do stacktrace
somente o resumo da exceção.



## Entidade:
Na entidade, se encontra a implementação da classe base, na qual ficam as infromações
que o spring boot gerenciará! informações essas que se transformarão em uma tabela 
no banco de dados.



## Config:
Classe com a configuração da Bean do Swagger.



## Problemas que enfrentei:
Tive problemas com package, havia criado eles fora do escopo do springboot.

Não consegui implementar o relatorio cruzado entre raio e categoria, devido a não possuir
este conhecimento. Pesquisei, más acredito que esse relatorio envolve muitos detalhes 
que estão distantes do meu entendimento. E não tenho a intenção de copiar algo pronto
pois eu seria requisitado futuramente por um conhecimento que ainda me é vago.



## Alterações que fiz:
Mudei o bando de dados do mySQL para o h2, para facilitar os testes do projeto.



## Informações adicionais:

As unicas coisas que eu fiz com auxilio de pesquisas, e que não tinha conhecimento, foram
a configuração do swagger e a utilização do mesmo, e a Exception personalizada.

No caso da Exception, não tinha conhecimento de como tratar exceções voltadas para web. Somente 
exceções personalizadas para tratar possiveis erros em um trecho de codigo voltado para aplicações desktop.

Também aprendi a utilizar o README.md, e por sinal, é muito útil.



## Conclusão:
Meus conhecimentos em Spring Boot ainda são, de fato bem simplificado. Estou disposto
a cada dia aprender e lapidar tais conhecimentos. Assim como outros que irei alcançando.
Algumas coisas neste projeto solicitado são novas para meu entendimento, mas fiquei
entusiasmado com o projeto! Sou grato por ter participado do mesmo.
Estarei aberto a sugestões, independente do resultado. O caminho é grande, um passo
de cada vez estarei progredindo.

