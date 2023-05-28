SELECT *
FROM film
ORDER BY title;

SELECT *
FROM film
ORDER BY title ASC;

SELECT *
FROM film
ORDER BY title DESC;

SELECT title,
    rental_rate,
    length
FROM film
WHERE title LIKE 'A%'
ORDER BY rental_rate ASC,
    length DESC;