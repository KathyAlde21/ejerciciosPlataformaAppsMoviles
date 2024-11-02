CREATE TABLE departamento(
	departamento_id INT PRIMARY KEY,
    nombre VARCHAR(100),
    descripcion VARCHAR(1000)
);

INSERT INTO departamento(departamento_id, nombre, descripcion)
VALUES (1, 'Ciencias Sociales', 'Ramas de la ciencia relacionadas con la existencia y el comportamiento humano'),
(2, 'Ciencias Exactas', 'Disciplinas que se basan en la observacion y experimentacion para crear conocimientos
y cuyos contenidos pueden sistematizarse a partir del lenguaje matemático'),
(3, 'Ciencias Naturales', 'Ciencias que tienen por objeto el estudio de la naturaleza, siguiendo la modalidad
del método científico conocida como método empírico analítico');

SELECT * FROM departamento;

INSERT INTO departamento(departamento_id, nombre, descripcion)
VALUES (4, 'Ciencias Especiales', 'Ramas de la ciencia que son especiales');


