CREATE TABLE profesores(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(25),
    apellido VARCHAR(50),
    escuela VARCHAR(50),
    fecha_de_contratacion DATE,
    sueldo INT
);


-- llenando tabla - con VALUE si es uno y VALUES si son varios
INSERT INTO profesores(nombre, apellido, escuela, fecha_de_contratacion, sueldo) 
VALUE ('Caupolicán', 'Catrileo', 'Santiago de la Extremadura', '2000-10-26', 780000);

INSERT INTO profesores(nombre, apellido, escuela, fecha_de_contratacion, sueldo)
VALUES ('Juanita', 'Perez', 'Gabriela Mistral', '2011-10-30', 234000),
('Bruce', 'Lee', 'Republica Popular China', '1993-05-22', 780945),
('Juan Alberto', 'Valdivieso', 'Sagrada Concepcion', '2005-08-01', 3400000),
('Pablo', 'Rojas', 'E-34', '2011-10-30', 300000),
('Nicolas', 'Echenique', 'Bendito Corazón de María', '2005-08-30', 8900000),
('Jericho', 'Jorquera', 'A-18 Abrazo de Maipú', '2010-10-22', 67500);

INSERT INTO profesores(nombre, apellido, escuela, fecha_de_contratacion, sueldo) 
VALUE ('Pablo', 'Lizarraga', 'Santiago Grial de Montegrande', '2004-08-21', 680000);

SELECT * FROM profesores;

-- // --------------------
-- consultas tabla profesores
SELECT * FROM prefesores;

SELECT nombre, apellido
FROM profesores;

-- el orden va según lo que se necesite
SELECT apellido, escuela, sueldo
FROM profesores;

SELECT sueldo, apellido, escuela
FROM profesores;

-- // --------------------
INSERT INTO profesores(nombre, apellido, escuela, fecha_de_contratacion, sueldo)
VALUES ('Wong', 'Lee', 'Santiago de la Extremadura', '200-10-26', 780000);

-- buca las escuelas diferentes
SELECT DISTINCT escuela FROM profesores;

SELECT DISTINCT escuela, sueldo
FROM profesores
ORDER BY escuela ASC;

SELECT * FROM profesores
WHERE escuela = 'Santiago de la Extremadura';

SELECT * FROM profesores
WHERE apellido NOT LIKE 'catri%';

-- cantidad de profesores contratados desde el año 2010
SELECT COUNT(DISTINCT escuela)
FROM profesores
WHERE fecha_de_contratacion > '2010-01-01';

-- cantidad de dinero gastado mensualmente en todos los profesores registrados
SELECT SUM(sueldo) AS total
FROM profesores;

-- // -----------------------------------------------------------------------------
-- Datos relacionales y relaciones de tablas
-- renombrar la tabla profesores a profesor
ALTER TABLE profesores
RENAME TO profesor;

SELECT * FROM profesor;

ALTER TABLE profesor
RENAME COLUMN id TO profesor_id;

-- // ----------------------------------------------
-- sueldos mínimo y máximo
SELECT MIN(sueldo) AS sueldomin
FROM profesor;

SELECT MAX(sueldo) AS sueldomin
FROM profesor;

-- // -------------------------------------------------
-- insertar registro sin indicar nombre del campo
-- en id puse null y le agrego solo el valor porque es AUTO_INCREMENTAL
INSERT INTO profesor 
VALUES (null, 'Carla', 'Carmona', 'Escuela CC-202', '2020-01-01', 500000); 


SELECT * FROM profesor;

-- puedo cambiar el orden de los datos siempre que el llamado y el ingreso esten en el mismo orden
-- como no anote todos los campos no ingrese el id ni tuve que colocar null porque los puso solo
INSERT INTO profesor(apellido, nombre, escuela)
VALUES ('Diaz', 'Daniel', 'Escuela DD502');



