CREATE TABLE paciente (
	IDpaciente SERIAL PRIMARY KEY NOT NULL UNIQUE,
	nomePac TEXT NOT NULL,
	dataNasc DATE NOT NULL
);

CREATE TABLE medico (
	IDmedico SERIAL PRIMARY KEY NOT NULL UNIQUE,
	nomeMed	TEXT NOT NULL,
	especializacao TEXT NOT NULL
);

CREATE TABLE registroMedico(
	CONSTRAINT fk_IDpaciente FOREIGN KEY (IDpaciente) REFERENCES paciente(IDpaciente),
	IDpaciente SERIAL,
	CONSTRAINT fk_IDmedico FOREIGN KEY (IDmedico) REFERENCES medico(IDmedico),
	IDmedico INT	
);

INSERT INTO paciente (nomePac, dataNasc) VALUES
('gabi', '1992/11/25'),
('triz_pariz', '2006/01/25'),
('cellbit', '1997/12/20'),
('alanzoka', '1995/12/15'),
('calango', '1991/07/05'),
('bruninhozor', '1993/09/08'),
('nyvi', '1991/06/27'),
('loud_thurzin', '1999/10/11'),
('jovirone', '1991/09/28'),
('yoDa', '1992/10/10');

INSERT INTO medico (nomeMed, especializacao) VALUES
('Dr. Meredith Grey', 'Cirurgia Geral'),
('Dr. Gregory House', 'Diagnóstico Diferencial'),
('Dr. Derek Shepherd', 'Neurocirurgia'),
('Dr. Miranda Bailey', 'Cirurgia Geral'),
('Dr. Mindy Lahiri', 'Ginecologia e Obstetrícia'),
('Dr. Arizona Robbins', 'Cirurgia Pediátrica'),
('Dr. Cristina Yang', 'Cirurgia Cardíaca'),
('Dr. Alex Karev', 'Cirurgia Pediátrica'),
('Dr. Sheldon Cooper', 'Física Teórica'),
('Dr. Leonard Hofstadter', 'Física Experimental');

INSERT INTO registroMedico (IDmedico) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10);

DROP TABLE paciente
DROP TABLE medico
DROP TABLE registroMedico
SELECT * FROM registroMedico