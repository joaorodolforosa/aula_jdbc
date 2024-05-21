CREATE DATABASE bar_da_esquina_db;
USE bar_da_esquina_db;
CREATE TABLE comanda_tb (
	id INT AUTO_INCREMENT PRIMARY KEY,
	qtd INT,
    descricao VARCHAR(100),
    valor DOUBLE);
INSERT INTO comanda_tb (qtd, descricao, valor) VALUES
	(2, 'Cerveja', 5.00),
	(1, 'Caipirinha', 10.00),
	(3, 'Porção de batata frita', 15.00);
