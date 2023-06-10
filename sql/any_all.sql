SELECT first_name,
    last_name
FROM authors
WHERE id = ANY (
        SELECT author_id
        FROM book
        WHERE title = 'Abe Lincoln in Illinois'
            OR title = 'Saving Shiloh'
    );

SELECT first_name,
    last_name
FROM authors
WHERE id = ALL (
        SELECT author_id
        FROM book
        WHERE title = 'Abe Lincoln in Illinois'
            OR title = 'Saving Shiloh'
    );

SELECT id,
    first_name,
    last_name
FROM authors
WHERE id > ANY (
        SELECT author_id
        FROM book
        WHERE title = 'Abe Lincoln in Illinois'
            OR title = 'Saving Shiloh'
    );

SELECT id,
    first_name,
    last_name
FROM authors
WHERE id > ALL (
        SELECT author_id
        FROM book
        WHERE title = 'Abe Lincoln in Illinois'
            OR title = 'Saving Shiloh'
    );