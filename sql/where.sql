SELECT *
FROM film
WHERE rental_rate = 0.99;

SELECT *
FROM actor
WHERE first_name = 'Penelope';

SELECT *
FROM film
WHERE length > 90;

SELECT *
FROM film
WHERE rental_rate <= 1;

SELECT *
FROM film
WHERE rental_rate != 0.99;

SELECT rental_rate,
    *
FROM film
WHERE rental_rate <> 4.99;

SELECT *
FROM actor
WHERE first_name = 'Penelope'
    OR first_name = 'Bob';

SELECT *
FROM film
WHERE rental_rate = 4.99
    OR rental_rate = 0.99;

SELECT title,
    replacement_cost,
    rental_rate
FROM film
WHERE NOT rental_rate = 4.99
    AND replacement_cost = 20.99;

SELECT *
FROM actor
WHERE NOT(
        first_name = 'Penelope'
        OR first_name = 'Nick'
        OR first_name = 'Ed'
    );