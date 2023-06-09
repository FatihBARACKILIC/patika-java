SELECT *
FROM book
ORDER BY page_number DESC
LIMIT 5;

SELECT *
FROM book
ORDER BY title ASC
LIMIT 5;

(
    SELECT *
    FROM book
    ORDER BY page_number DESC
    LIMIT 5
)
UNION
(
    SELECT *
    FROM book
    ORDER BY title ASC
    LIMIT 5
);

(
    SELECT *
    FROM book
    ORDER BY page_number DESC
    LIMIT 5
)
UNION ALL
(
    SELECT *
    FROM book
    ORDER BY title ASC
    LIMIT 5
);

(
    SELECT id,
        email
    FROM authors
)
UNION
(
    SELECT id,
        page_number
    FROM book
);