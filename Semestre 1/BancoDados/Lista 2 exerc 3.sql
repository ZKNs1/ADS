CREATE TABLE projeto (
	IDprojeto SERIAL PRIMARY KEY UNIQUE NOT NULL,
	nomeProjeto TEXT NOT NULL,
	descricao TEXT
);

CREATE TABLE funcionario (
	IDfuncionario SERIAL PRIMARY KEY NOT NULL UNIQUE,
	nomeFuncionario TEXT NOT NULL,
	dataEmissao DATE NOT NULL
);

CREATE TABLE reuniao (
	IDreuniao SERIAL PRIMARY KEY NOT NULL UNIQUE,
	CONSTRAINT fk_IDprojeto FOREIGN KEY (IDprojeto) REFERENCES projeto (IDprojeto),
	IDprojeto SERIAL,
	CONSTRAINT fk_IDfuncionario FOREIGN KEY (IDfuncionario) REFERENCES funcionario (IDfuncionario),
	IDfuncionario SERIAL,	
	pautaReuniao TEXT NOT NULL,
	horarioReuniao TIME NOT NULL
);

INSERT INTO projeto (nomeProjeto, descricao) VALUES
('Sistema de Gerenciamento de Finanças Pessoais', 'Aplicativo para controle de despesas e receitas'),
('Plataforma de Aprendizado Online', 'Website para cursos e tutoriais em vídeo'),
('Rede Social para Profissionais', 'Conectando pessoas com interesses profissionais similares'),
('Sistema de Reservas de Hotéis', 'Facilitando a reserva de acomodações em hotéis'),
('Aplicativo de Fitness', 'Acompanhamento de exercícios e planejamento de treinos'),
('Plataforma de Entregas Rápidas', 'Entrega de alimentos e produtos de lojas locais'),
('Marketplace de Artesanato', 'Compra e venda de produtos feitos à mão'),
('Aplicativo de Receitas Culinárias', 'Descubra e compartilhe suas receitas favoritas'),
('Sistema de Gestão de Projetos', 'Acompanhe e gerencie todas as etapas de seus projetos'),
('Plataforma de Música Online', 'Streaming de música com recomendações personalizadas');

INSERT INTO funcionario (nomeFuncionario, dataEmissao) VALUES
('João Silva', '1990-05-15'),
('Maria Santos', '1985-08-20'),
('Pedro Oliveira', '1993-12-10'),
('Ana Souza', '1987-04-25'),
('Lucas Pereira', '1998-10-03'),
('Carla Almeida', '1995-06-08'),
('Mariana Costa', '1992-02-17'),
('Marcos Lima', '1989-11-30'),
('Laura Fernandes', '1991-07-22'),
('Paulo Santos', '1986-03-05');

INSERT INTO reuniao (pautaReuniao, horarioReuniao) VALUES
('Planejamento Semanal', '09:00'),
('Discussão de Novas Funcionalidades', '14:30'),
('Avaliação de Resultados', '11:00'),
('Revisão de Orçamento', '15:00'),
('Definição de Metas Trimestrais', '10:30'),
('Brainstorming de Ideias', '13:00'),
('Análise de Desempenho', '10:00'),
('Treinamento de Novos Processos', '16:00'),
('Feedback de Equipe', '14:00'),
('Planejamento Estratégico Anual', '11:30');

SELECT * FROM reuniao
DROP TABLE reuniao