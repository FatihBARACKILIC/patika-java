SELECT rental_rate,
    COUNT(*)
FROM film
GROUP BY rental_rate
HAVING COUNT(*) > 325;

SELECT rental_rate,
    COUNT(*)
FROM film
WHERE NOT rental_rate = 2.99
GROUP BY rental_rate;

SELECT staff_id,
    COUNT(*)
FROM payment
GROUP BY staff_id;

SELECT customer_id,
    COUNT(*),
    sum(amount),
    ROUND(AVG(amount), 2)
FROM payment
GROUP BY customer_id
HAVING SUM(amount) > 100
ORDER BY ROUND(AVG(amount), 2) DESC,
    SUM(amount) DESC,
    COUNT(*) DESC
LIMIT 10;