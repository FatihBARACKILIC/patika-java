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