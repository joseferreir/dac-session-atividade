**Instituto Federal de Educação, Ciência e Tecnologia da Paraíba**

**Campus Cajazeiras**

**Curso Superior de Tecnologia em Análise e Desenvolvimento de Sistemas**

**Desenvolvimento de Aplicações Corporativas**

**Professor**: Ricardo de Sousa Job

**Alunos**: Isak Furtado, José Ferreira, Michele Oliveira

<h3 align="center">
  Projeto: Final da disciplina
</h3>

Para ver detalhes sobre especificaçÕes do projeto juntamente com uma breve
 Em produção



#### ROTEIRO PARA IMPLANTAR E UTILIZAR A APLICAÇÃO COM DOCKER (*)




1. Certifique-se que o seu serviço **Docker** esteja iniciado e que não haja outros serviços rodando nas seguintes portas: 5433, 8081

2. Para iniciar os containers da ***Aplicação***, a partir da pasta bin deste projeto execute `sh ./run.sh` (\*\*). A partir deste passo, a aplicação já deve estar disponível para uso, logo após os containers terem inicializado.

3. Se desejar parar todos os containers e remover os volumes de persistência de dados, pode ser executado `sh ./stop.sh`(\*\*).

  \*\* Os scripts `run.sh` e `stop.sh` são válidos para sistemas unix-like.


4. Depois de inicializados os containers, o serviço web estará disponívesl em [http://localhost:8081/dac-session/](http://localhost:8081/dac-session/).

  
<hr>

#### O que os scripts fazem:


1. `run.sh`:
  - compila o módulos, construindo os arquivos `.war` a serem implantados no Docker.
  - inicia os containers através do Docker/docker-compose.
  - ao terminar a inicialação do último container, o script é encadeado com a execução de um comando que faz acompanhamento dos logs de inicialização da imagem do `Payara` que abriga o módulo/container `app`. A visualização deste log tem finalidade puramente observatória e pode ser cancelada a qualquer tempo sem prejuízo para execução dos containers no Docker.

2. `stop.sh`:
  - encerra todos os containers iniciados através do docker-compose;
  - remove as imagens do projeto que foram criadas pelo script de inicalização;
  - (pode) remove o volume de persistência do container baseado em `Postgresql`. Sinta-se livre, por exemplo, para comentar/descomentar esta última linha no arquivo com intuito de preservar ou apagar o conteúdo do volume antes de encerrar a execução dos containers.
<hr>

 
