SELECT rental_rate,
    COUNT(*),
    FROM film
GROUP BY rental_rate;

SELECT rating,
    COUNT(*)
FROM film
GROUP BY rating;

SELECT replacement_cost,
    rental_rate,
    MIN(length),
    MAx(length),
    COUNT(length)
FROM film
GROUP BY replacement_cost,
    rental_rate
ORDER BY replacement_cost DESC,
    rental_rate,
    MIN(length),
    MAX(length)
LIMIT 10 OFFSET 3;