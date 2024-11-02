-- CREATE DATABASE ejercicios_plataforma_appmov;
USE ejercicios_plataforma_appmov;

-- agregar datos FILA POR FILA:
-- deben ir en el mismo orden tabla y valor
INSERT INTO nombre_table (columna_, columna_2, numero, columna_n) -- tratar que el nombre refleje el contenido
VALUE ('valor_1', 'valor_2', 4, 'valor_n');

-- subconjunto de columnas


-- bloques de filas
INSERT INTO nombre_table (columna_, columna_2, numero, columna_n) -- tratar que el nombre refleje el contenido
VALUES ('valor_1', 'valor_2', 4, 'valor_n'),
('valor_1', 'valor_2', 4, 'valor_n'),
('valor_1', 'valor_2', 4, 'valor_n'),
('valor_1', 'valor_2', 4, 'valor_n'),
('valor_1', 'valor_2', 4, 'valor_n'),
('valor_1', 'valor_2', 4, 'valor_n');

