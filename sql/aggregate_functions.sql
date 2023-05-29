-- COUNT, MAX, MIN, AVG, SUM
SELECT MAX(replacement_cost),
    MIN(replacement_cost)
FROM film;

SELECT ROUND(AVG(length))
FROM film;

SELECT ROUND(AVG(length), 3)
FROM film;

SELECT SUM(rental_rate)
FROM film;

SELECT MAX(length),
    MIN(length),
    SUM(replacement_cost)
FROM film;

SELECT MAX(length)
FROM film
WHERE rental_rate IN(0.99, 2.99);

SELECT MAX(length),
    rental_rate
FROM film
GROUP BY rental_rate;