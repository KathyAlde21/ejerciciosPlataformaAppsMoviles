-- CONSULTAS TABLAS RELACIONADAS

-- JOIN - INNER, LEFT, RIGTH

-- JOIN o INNER JOIN => devuelve las filas de ambas tablas donde hay valores coincidentes
-- LEFT JOIN => devuelve las filas de ambas tablas donde hay valores coincidentes más todas las filas de la tabla
	-- a la izquierda. Si no hay coincidencias muestra solo la tabla de la izquierda
-- RIGHT JOIN => devuelve las filas de ambas tablas donde hay valores coincidentes más todas las filas de la tabla
	-- a la derecha. Si no hay coincidencias muestra solo la tabla de la derecha
-- FULL JOIN => devuelve todas las filas de ambas tablas y en las que coinciden las une. Si no hay ninguna
	-- coincidencia se crea una fila en blanco

-- // --------------------------------------------------------------------------
-- para saber a que departamento pertenece la asignatura 'Castellano'
SELECT departamento.nombre FROM departamento
INNER JOIN asignatura
ON asignatura.departamento_id = departamento.departamento_id
WHERE asignatura.nombre = 'Castellano';

-- // --------------------------------------------------------------------------
-- para saber en que departamento trabaja el profesor Pablo Rojas
SELECT d.nombre
FROM departamento d
INNER JOIN asignatura a
ON a.departamento_id = d.departamento_id
INNER JOIN profesor_asignatura pa
ON pa.asignatura_id = a.asignatura_id
INNER JOIN profesor p
ON p.profesor_id = pa.profesor_id
WHERE p.nombre = 'Pablo' AND p.apellido = 'Rojas';

-- buscar nuevamente en que departamento trabaja el profesor Pablo Rojas:
SELECT d.nombre
FROM departamento d
WHERE departamento_id IN (
	SELECT departamento_id FROM asignatura a
	WHERE a.asignatura_id IN (
		SELECT asignatura_id FROM profesor_asignatura pa
		WHERE pa.profesor_id IN (
			SELECT p.profesor_id FROM profesor p
            WHERE p.nombre = 'Pablo' AND p.apellido = 'Rojas'            
            )
        )
    );

SELECT departamento.nombre FROM departamento;

-- // --------------------------------------------------------------------------

SELECT d.nombre, a.nombre
FROM departamento d
JOIN asignatura a 
ON d.departamento_id = a.departamento_id; -- solo contiene los nombres con texto - 6 datos

-- //
SELECT d.nombre, a.nombre
FROM departamento d 
LEFT JOIN asignatura a 
ON d.departamento_id = a.departamento_id; -- incluye Ciencias Especiales que tiene nombre null - 7 datos

SELECT d.nombre, a.nombre
FROM departamento d
RIGHT JOIN asignatura a
ON d.departamento_id = a.departamento_id; -- incluye Especiales que tiene nombre null - 7 datos

-- //
SELECT d.nombre, a.nombre
FROM departamento d
LEFT JOIN asignatura a
ON d.departamento_id = a.departamento_id
UNION
SELECT d.nombre, a.nombre
FROM departamento d
RIGHT JOIN asignatura a
ON d.departamento_id = a.departamento_id; -- incluye dos null - 8 datos
