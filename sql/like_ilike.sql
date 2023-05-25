SELECT *
FROM customer
WHERE first_name LIKE 'M%';

SELECT *
FROM customer
WHERE first_name LIKE 'Ma%';

SELECT *
FROM customer
WHERE first_name LIKE '%y';

SELECT *
FROM customer
WHERE first_name LIKE 'A%y';

SELECT *
FROM customer
WHERE first_name LIKE 'A%'
    AND last_name LIKE 'A%';

SELECT *
FROM customer
WHERE first_name ILIKE 'a%';

SELECT *
FROM customer
WHERE first_name ILIKE 'd%n';

SELECT *
FROM customer
WHERE first_name LIKE 'J_';

SELECT *
FROM customer
WHERE first_name LIKE 'J_an';

SELECT *
FROM customer
WHERE first_name ~~ 'B%';

SELECT *
FROM customer
WHERE first_name ~~* 'b%';

SELECT *
FROM customer
WHERE first_name !~~* 'b%';