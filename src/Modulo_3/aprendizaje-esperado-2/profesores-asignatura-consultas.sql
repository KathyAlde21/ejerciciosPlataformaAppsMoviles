CREATE TABLE profesor_asignatura(
	profesor_id INT NOT NULL,
    asignatura_id INT NOT NULL,
    PRIMARY KEY (profesor_id, asignatura_id)
);

INSERT INTO profesor_asignatura(profesor_id, asignatura_id)
VALUES (1, 1),
(1, 2),
(2, 3),
(2, 4),
(3, 5),
(3, 6),
(4, 6),
(5, 4),
(6, 1),
(6, 2),
(6, 3),
(6, 4),
(6, 5),
(6, 6),
(7, 3),
(7, 4),
(8, 1);

SELECT * FROM profesor_asignatura;