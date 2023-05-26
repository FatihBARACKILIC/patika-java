--? DISTINCT
SELECT DISTINCT rental_rate
FROM film;

SELECT DISTINCT replacement_cost
FROM film;

SELECT DISTINCT rental_rate,
    replacement_cost
FROM film;

--? COUNT
SELECT COUNT(*)
FROM actor
WHERE first_name = 'Penelope';

SELECT COUNT(first_name)
FROM actor
WHERE first_name LIKE 'A%';

SELECT COUNT(DISTINCT first_name)
FROM actor;

SELECT COUNT(DISTINCT length)
FROM film;