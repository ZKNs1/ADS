CREATE TABLE funcionario (
	IDfuncionario SERIAL PRIMARY KEY NOT NULL UNIQUE,
	CONSTRAINT fk_IDgerente FOREIGN KEY (IDgerente) REFERENCES gerente(IDgerente) ,
	IDgerente SERIAL,
	nomeFuncionario TEXT NOT NULL,
	dataAdmissao DATE NOT NULL,
	cargo TEXT NOT NULL
);

CREATE TABLE gerente(
	IDgerente INT PRIMARY KEY NOT NULL UNIQUE
);

CREATE TABLE departamento(
	IDdepartamento SERIAL PRIMARY KEY NOT NULL UNIQUE,
	nomeDp TEXT NOT NULL,
	CONSTRAINT fk_IDgerente FOREIGN KEY (IDgerente) REFERENCES gerente(IDgerente), 
	IDgerente SERIAL,
	centroCusto SERIAL
);

INSERT INTO funcionario (nomeFuncionario,dataAdmissao,cargo) VALUES
('Eleven', '2016/11/06', 'Telecinética'),
('Mike Wheeler', '2016/11/06', 'Líder do Grupo'),
('Will Byers', '2016/11/06', 'Amigo Leal'),
('Jim Hopper', '2016/11/06', 'Chefe de Polícia'),
('Joyce Byers', '2016/11/06', 'Mãe Determinada'),
('Dustin Henderson', '2016/11/06', 'Mestre em Comunicação'),
('Lucas Sinclair', '2016/11/06', 'Estrategista'),
('Nancy Wheeler', '2016/11/06', 'Investigadora'),
('Jonathan Byers', '2016/11/06', 'Fotógrafo'),
('Steve Harrington', '2016/11/06', 'Babá de Criaturas');

INSERT INTO gerente VALUES
('1'),
('2'),
('3'),
('4'),
('5'),
('6'),
('7'),
('8'),
('9'),
('10');

INSERT INTO departamento (nomeDp) VALUES
('Recursos Humanos'),
('Finanças'),
('Marketing'),
('TI'),
('Operações'),
('Vendas'),
('Desenvolvimento'),
('Logística'),
('Jurídico'),
('Produção');

SELECT * FROM gerente
SELECT * FROM departamento
SELECT * FROM funcionario
DROP TABLE gerente
DROP TABLE departamento
DROP TABLE funcionario