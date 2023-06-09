(
    SELECT *
    FROM book
    ORDER BY page_number DESC
    LIMIT 10
)
INTERSECT
(
    SELECT *
    FROM book
    ORDER BY title ASC
    LIMIT 10
);

(
    SELECT *
    FROM book
    ORDER BY page_number DESC
    LIMIT 5
)
EXCEPT (
        SELECT *
        FROM book
        ORDER BY title ASC
        LIMIT 5
    );