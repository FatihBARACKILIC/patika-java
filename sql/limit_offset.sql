SELECT *
FROM film
WHERE rental_rate = 4.99
ORDER BY length
LIMIT 10 OFFSET 5;