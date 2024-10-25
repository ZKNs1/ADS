CREATE TABLE LIVRO (
	ISBN INT PRIMARY KEY UNIQUE NOT NULL, 
	anopubli VARCHAR(10),
	titulo TEXT NOT NULL,
	editora TEXT
);

CREATE TABLE AUTOR (
	IDautor INT PRIMARY KEY UNIQUE NOT NULL, 
	nome TEXT NOT NULL,
	cpf VARCHAR(14) NOT NULL
);

CREATE TABLE registroPublicacao(
	IDregistro INT NOT NULL, 
	ISBN INT NOT NULL,
	IDautor INT NOT NULL,
	data_publi VARCHAR(10)
)

INSERT INTO LIVRO (ISBN, anopubli, titulo, editora) VALUES
('12345', '2015', 'Viagem ao Passado', 'Editora Mundo'),
('54321', '2007', 'Cartas para outro eu', 'Editora Letras'),
('15323', '2013', 'Coleção - Poemas', 'Editora Tipologia'),
('18390', '2021', 'Datas Marcadas', 'Editora Rosa'),
('98765', '2005', 'O Mistério da Noite', 'Editora Lua'),
('24680', '2018', 'Caminho da Liberdade', 'Editora Livre'),
('13579', '2010', 'Segredos do Universo', 'Editora Estrela'),
('97531', '2016', 'A Última Esperança', 'Editora Esperança'),
('86420', '2009', 'Sonhos Dourados', 'Editora Aurora'),
('36912', '2019', 'Noites Inesquecíveis', 'Editora Memória');

INSERT INTO AUTOR (IDautor, nome, cpf) VALUES
('1', 'João Silva', '123.456.789-00'),
('2', 'Maria Santos', '987.654.321-00'),
('3', 'Pedro Oliveira', '456.789.123-00'),
('4', 'Ana Souza', '789.123.456-00'),
('5', 'Lucas Pereira', '321.654.987-00'),
('6', 'Carla Almeida', '654.321.987-00'),
('7', 'Mariana Costa', '987.123.654-00'),
('8', 'Marcos Lima', '147.258.369-00'),
('9', 'Laura Fernandes', '258.369.147-00'),
('10', 'Paulo Santos', '369.147.258-00');

INSERT INTO registroPublicacao (IDregistro, ISBN, IDautor, data_publi) VALUES
('01', '12345', '1', '2023-01-15'),
('02', '54321', '2', '2022-05-20'),
('03', '15323', '3', '2021-09-10'),
('04', '18390', '4', '2020-03-25'),
('05', '98765', '5', '2019-07-12'),
('06', '24680', '6', '2018-11-30'),
('07', '13579', '7', '2017-04-05'),
('08', '97531', '8', '2016-08-22'),
('09', '86420', '9', '2015-12-18'),
('10', '36912', '10', '2014-06-07');



SELECT * FROM LIVRO
SELECT * FROM AUTOR
SELECT * FROM registroPublicacao

ALTER TABLE LIVRO
IDautor int,
CONSTRAINT fk_autor FOREIGN KEY (IDautor) REFERENCES AUTOR (IDautor)

