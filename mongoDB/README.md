# Exercitando MongoDB
![image](https://www.redspark.io/wp-content/uploads/2020/02/mongodb.jpg)

# A proposta da atividade:

## Atividade MongoDB  

Você deve criar um banco de dados novo (database) e uma coleção com um nome pertinente, de acordo com os dados e tema que você escolher. Os seguintes comandos  devem ser feitos e entregues:  
-  Inserção de documentos  
-  Atualização de documentos  
-  Exclusão de documentos  
-  Consulta com projeção  
-  Consulta utilizando combinação entre os seletores  
-  Consulta paginada e ordenada (utilizar ignorar , limitar e classificar )

## Sobre o meu trabalho 
![image](https://miro.medium.com/max/1360/1*zVnWJtyGOX_kUIDm6ccCfQ.gif)

### Criei um Banco de Dados chamado curso
db.createCollection('cursos')
![image](https://github.com/jadergreiner/PanAcademy/blob/main/mongoDB/cursos.png?raw=true)

###  Inserção de documentos
Comecei a incluir os documentos na estrutura abaixo usando o Robo 3T
db.nomedacollection.insert(documento)

	{
		"nome" : "Logica de programacacao",
		"etapa" : 1,
		"detalhes" : "Curso inicial para destravar e expandir a mentalidade de programador",
		"cargaHoraria" : 1200,
		"anoLancamento" : 2017,
		"totalAlunos" : 900,
		"valorCurso" : 1000
	}

### Atualização de documentos

	db.getCollection('cursos').update(
		// query 
		{
			"etapa" : 5
		},
		
		// update 
		{ $set: {"cargaHoraria" : 400}
		},
		
		// options 
		{
			"multi" : false,  // update only one document 
			"upsert" : false  // insert a new document, if no existing document match the query 
		}
	)

### Exclusão de documentos

Exclusão de uma Field

	db.getCollection('cursos').update(
		// query 
		{
			"etapa" : 5
		},
		
		// update 
		{ $unset: {"cargaHoraria" : 400}
		},
		
		// options 
		{
			"multi" : false,  // update only one document 
			"upsert" : false  // insert a new document, if no existing document match the query 
		}
	)
	
### Exclusão de um documento
	db.getCollection('cursos').remove({ "etapa" : 5})


###  Consulta com projeção

##### Exibindo apenas nome e etapa na consulta
	db.getCollection('cursos').find({},{"etapa" : 1, "nome" : 1, "_id" : 0})

#####  Consulta utilizando combinação entre os seletores

###### Retorna cursos com Carga Horária a partir de 400 horas e a partir de 900 alunos

	db.getCollection('cursos').find({"cargaHoraria": {$gte: 400},
                                     "totalAlunos" : {$gte: 900}    
                                })




##### Consulta paginada e ordenada (utilizar ignorar , limitar e classificar 

###### Para ver a partir da 3 etapa
	db.getCollection('cursos').find({etapa : {$gte : 3 }})

###### Para ver ordenador por etapa
	db.getCollection('cursos').find().sort({"etapa": 1})
	
###### Limitando a 2 registros
	db.getCollection('cursos').find().limit(2)
	
###### Pulando um registros
	db.getCollection('cursos').find().skip(1)

	
