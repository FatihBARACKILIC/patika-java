SELECT f.title,
    f.length,
    a.first_name,
    a.last_name
FROM film AS f
    INNER JOIN film_actor AS fa ON f.film_id = fa.film_id
    INNER JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE f.length = (
        SELECT MAX(length)
        FROM film
    )
ORDER BY f.title ASC;