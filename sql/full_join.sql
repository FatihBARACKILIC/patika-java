SELECT a.first_name,
    a.last_name,
    b.title
FROM book AS b
    FULL JOIN authors AS a ON b.author_id = a.id;

SELECT *
FROM book AS b
    FULL JOIN authors AS a ON b.author_id = a.id;

SELECT *
FROM book AS b
    FULL JOIN authors AS a ON b.author_id = a.id
WHERE (
        b.id IS NOT NULL
        AND a.id IS NOT NULL
    );

SELECT *
FROM book AS b
    INNER JOIN authors AS a ON b.author_id = a.id;

SELECT *
FROM book AS b
    FULL JOIN authors AS a ON b.author_id = a.id
WHERE (
        b.id IS NULL
        OR a.id IS NULL
    );