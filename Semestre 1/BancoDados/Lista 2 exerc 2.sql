CREATE TABLE CURSO (
	IDcurso SERIAL PRIMARY KEY UNIQUE NOT NULL, 
	nomeCurso TEXT NOT NULL
);

CREATE TABLE ALUNO (
	IDaluno SERIAL PRIMARY KEY UNIQUE NOT NULL, 
	nomeAluno TEXT NOT NULL,
	dataNasc varchar(10)
);

CREATE TABLE TURMA (
	IDturma SERIAL PRIMARY KEY UNIQUE NOT NULL, 
	IDcurso SERIAL NOT NULL,
	IDaluno SERIAL NOT NULL,
	professor TEXT NOT NULL
);

CREATE TABLE alunosTurmas(
	IDturma int,
	CONSTRAINT fk_turma FOREIGN KEY (IDturma) REFERENCES TURMA (IDturma),
	IDaluno int,
	CONSTRAINT fk_aluno FOREIGN KEY (IDaluno) REFERENCES ALUNO (IDaluno)
)

INSERT INTO CURSO (nomeCurso) VALUES
('ADS'),
('Mecatrônica'),
('Produção'),
('Elétrica'),
('Veterinária'),
('Medicina'),
('Engenharia'),
('Biomedicina'),
('Robótica'),
('Letras');

INSERT INTO ALUNO (nomeAluno,dataNasc) VALUES
('Beyoncé', '04/09/1981'),
('Justin Bieber', '01/03/1994'),
('Ariana Grande', '26/06/1993'),
('Taylor Swift', '13/12/1989'),
('Rihanna', '20/02/1988'),
('Ed Sheeran', '17/02/1991'),
('Lady Gaga', '28/03/1986'),
('Shawn Mendes', '08/08/1998'),
('Katy Perry', '25/10/1984'),
('Drake', '24/10/1986');

INSERT INFO TURMA (professor) VALUES
('Rodrigo'),
('Rogério'),
('Eduardo'),
('Julia'),
('Marcos'),
('Carlos'),
('Tatiane'),
('Thiago'),
('Fernanda'),
('Paulo');


SELECT * FROM CURSO
SELECT * FROM ALUNO
SELECT * FROM TURMA
SELECT * FROM alunosTurmas

DROP TABLE alunosTurmas