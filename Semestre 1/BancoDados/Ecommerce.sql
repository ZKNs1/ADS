-- Exercicios:
-- 1. Quais clientes compraram produtos da categoria eletrônicos?
-- 2. Quais clientes não compraram nenhum produto?
-- 3. Quais produtos não foram vendidos?
-- 4. Quais produtos Rodrigo comprou?
-- 5. Quais clientes compraram produtos da marca DELL?

SELECT * FROM products
SELECT * FROM clients

--1
SELECT clients.firstname, products.productname, products.category
FROM clients INNER JOIN products
ON clients.idclient = products.idclient
WHERE category = 'eletronicos'

--2
SELECT clients.firstname, clients.lastname, products.productname
FROM clients LEFT JOIN products USING (idclient)
WHERE products.productname IS NULL

--3
SELECT products.productname, clients.idclient
FROM clients RIGHT JOIN products USING (idclient)
WHERE clients.idclient IS NULL

--4
SELECT products.productname, clients.firstname
FROM clients INNER JOIN products USING (idclient)
WHERE clients.firstname = 'Rodrigo'
				 
--5
SELECT products.productname, products.brand, clients.firstname
FROM clients RIGHT JOIN products USING (idclient)
WHERE products.brand =  'dell'
				 