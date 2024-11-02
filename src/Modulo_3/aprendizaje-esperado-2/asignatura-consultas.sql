CREATE TABLE asignatura(
	asignatura_id INT NOT NULL PRIMARY KEY,
    departamento_id INT NOT NULL,				-- FOREIGN KEY a tabla departamento
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(1000)
);

INSERT INTO asignatura(asignatura_id, departamento_id, nombre, descripcion)
VALUES (1, 1,'Literatura', 'Arte de la expresión verbal'),
(2, 1, 'Castellano', 'Lengua romance procedente del latín hablado'),
(3, 2, 'Matemáticas', 'Ciencia formal que, partiendo de axiomas y siguiendo el razonamiento lógico, estudia las
propiedades y relaciones entre entidades abstractas coo números, figuras geométricas, iconos, glifos o
símbolos en general'),
(4, 2, 'Trigonometría', 'Rama de la matemática, cuyo significado etimológico es la medición de los triángulos'),
(5, 3, 'Biología', 'Rama de la ciencia que estudia los procesos naturales d elos organismos vivos, considerando
su anatomía, fisiología, evolución, desarrollo, distribución y relaciones'),
(6, 3, 'Ecosistema', 'Sistema biológico constituido por una comunidad de organismos vivos (biocenosis) y el medio físico
donde se relacionan (biotopo)');

SELECT * FROM asignatura;

INSERT INTO asignatura(asignatura_id, departamento_id, nombre, descripcion)
VALUE (7, 10, 'Especial', 'Asignatura Especial');

