# Consultorio Gama Pan Anatomy 
![image](https://images.pexels.com/photos/7108276/pexels-photo-7108276.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940)

# A proposta da atividade:

## Desafio

Ajude o consultório Gama Pan Anatomy a salvar e listar sua equipe médica e além de exibir seus respectivos agendamentos.. 


- A aplicação deve conter conexão com o mongo DB  
- Utilizar padrão MVC  
- Os agendamentos devem ter data(não há necessidade de utilizar tipo Date, podem utilizar String) e o médico referente.  
-A aplicação deve listar as consultas e a listar os médicos  
(Não obrigatório: implementar delete e put para médicos e consultas)

## Sobre o trabalho 

### Foi utilizando SpringBoot com as dependências
- spring-boot-starter-data-mongodb
- spring-boot-starter-web
- spring-boot-devtools
- spring-boot-starter-test

### Objetos
São dois objetos.
- Médicos: Trabalha com os dados dos médicos, como nome, crm e especialização.
- Consultas: Trabalha com as informações do agendamento das consultas. Nome do paciente, a data, a especialidade e qual médico.

### Sobre o MVC
A API roda sobre as camadas Controller, model, repository e service.

### Os serviços disponibilizados

### >> medicos
**Cadastrando médicos**

![image](https://raw.githubusercontent.com/jadergreiner/PanAcademy/main/mongodb/img/postMedicos.gif)

**Consultando médicos**

![image](https://raw.githubusercontent.com/jadergreiner/PanAcademy/main/mongodb/img/getMedicos.gif)

### >> Agendamento de consultas

**Agendando uma consulta**

![image](https://raw.githubusercontent.com/jadergreiner/PanAcademy/main/mongodb/img/postConsultas.gif)

**Consultando agendamentos**

![image](https://raw.githubusercontent.com/jadergreiner/PanAcademy/main/mongodb/img/getConsultas.gif)

**Atualizando dados da consulta**

![image](https://raw.githubusercontent.com/jadergreiner/PanAcademy/main/mongodb/img/atualizarConsultas.gif)




