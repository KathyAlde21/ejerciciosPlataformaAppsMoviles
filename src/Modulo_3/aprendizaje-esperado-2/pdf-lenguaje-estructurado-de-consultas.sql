-- CONSULTAS TABLAS

-- OPERADORES que se pueden usar en conjunto con WHERE
/*
= Igual a - ej. WHERE escuela = 'E-34'
• <> o != Distinto de - ej. WHERE escuela <> 'E-34'
• > Mayor a - ej. WHERE sueldo > 100000
• < Menor que - ej. WHERE sueldo < 1000000
• >= Mayor o igual que - ej. WHERE sueldo >= 100000
• <= Menor o igual que - ej. WHERE sueldo <= 1000000
• BETWEEN Dentro de un rango - ej. WHERE sueldo BETWEEN 100000 AND600000
• IN Coincidir con un grupo de valores - ej. WHERE apellido IN ('Catrileo', 'Perez')
• LIKE Coincidir con un patrón (distingue mayúsculas y minúsculas) - ej. WHERE apellido LIKE 'Catri%'
• NOT Niega una condición - ej. WHERE apellido NOT LIKE 'catri%
*/

-- FUNCIONES en las consultas que se prueban con SELECT
/*
• current_date: Devuelve la fecha de hoy
• current_time: Devuelve la hora actual (no se devuelve información de fecha).
• current_timestamp: Devuelve una marca de tiempo (fecha y hora) de la hora actual.
• extract(tipo from campo): Devuelve una parte de un campo especificado en el atributo “tipo”.
• now(): Devuelve un campo especificado en el texto de una marca de tiempo determinada.
*/
-- ej:
SELECT current_time; -- muestra la hora actual

-- FUNCIONES DE CADENA (STRING)
/*
• lower(string): Devuelve la cadena en minúsculas.
• position(substring in string): Devuelve la posición entera de una subcadenadentro de la cadena.
• substring(string,from,[for]): Extrae una subcadena de la cadena a partir de losdígitos especificados.
• replace(string,from,to): Reemplaza texto por texto en una cadena determinada.
• upper(string): Devuelve la cadena en mayúsculas.
*/
-- ej:
SELECT replace('Monito', 'ito', 'oto');

-- FUNCIONES DE AGRUPACION
/*
• avg(expression): El promedio de todos los valores de entrada. Los valores de entrada deben ser uno de los tipos enteros.
• count(*): El número de valores de entrada.
• count(expression): El número de valores de entrada no nulos.
• max(expression): El valor máximo de expresión para todos los valores deentrada.
• min(expression): Los valores mínimos de expresión para todos los valores de entrada.
• sum(expression): La suma de la expresión para todos los valores de entrada nonulos
*/

-- Llaves FOREIGN KEY y PRIMARY KEY
-- PRIMARY KEY => llave principal
-- FOREIGN KEY => ocurre entre dos tablas: ujna tabla que llama a un dato y otra tabla que es llamada


-- JOIN o INNER JOIN => devuelve las filas de ambas tablas donde hay valores coincidentes
-- LEFT JOIN => devuelve las filas de ambas tablas donde hay valores coincidentes más todas las filas de la tabla
	-- a la izquierda. Si no hay coincidencias muestra solo la tabla de la izquierda
-- RIGHT JOIN => devuelve las filas de ambas tablas donde hay valores coincidentes más todas las filas de la tabla
	-- a la derecha. Si no hay coincidencias muestra solo la tabla de la derecha
-- FULL JOIN => devuelve todas las filas de ambas tablas y en las que coinciden las une. Si no hay ninguna
	-- coincidencia se crea una fila en blanco
