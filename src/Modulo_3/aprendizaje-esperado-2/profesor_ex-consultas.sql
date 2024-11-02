-- creación profesor_ex

-- tabla vacia solo con campos apellido y fecha de contratacion creando una tabla desde una consulta
SELECT apellido, fecha_de_contratacion
FROM profesor;

-- si quiero esos datos se escribe:
CREATE TABLE profesores_ex AS  				-- que cree la tabla según la consulta:
SELECT apellido, fecha_de_contratacion
FROM profesor;

SELECT * FROM profesores_ex;

-- como cree una tabla puedo ingresarle datos
-- pero no afectan a las otras tablas porque se armaron desde una consulta no por llaves
INSERT INTO profesores_ex
VALUES ('Torres', '2001-05-01');
