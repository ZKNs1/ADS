CREATE TABLE Funcionarios(
	id_func SERIAL PRIMARY KEY,
	nome_func varchar(100),
	data_admissao date
)

SELECT * FROM Funcionarios

CREATE TABLE Projetos(
	id_proj SERIAL PRIMARY KEY,
	nome_proj varchar(100),
	descricao text
)

SELECT * FROM Projetos

CREATE TABLE funcionarios_projetos(
	id_func int,
	CONSTRAINT fk_func FOREIGN KEY (id_func) REFERENCES Funcionarios (id_func),
	id_proj int,
	CONSTRAINT fk_proj FOREIGN KEY (id_proj) REFERENCES Projetos (id_proj)
)

SELECT * FROM funcionarios_projetos