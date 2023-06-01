SELECT *
FROM authors;

UPDATE authors
SET first_name = 'Emrah Safa',
    last_name = 'Gürkan',
    email = 'emrah@gurkan.com',
    birthdate = '1980-01-01'
WHERE id = 10;

SELECT *
FROM authors;

UPDATE authors
SET first_name = 'XXXX',
    last_name = 'YYYY'
WHERE first_name LIKE 'V%';

SELECT *
FROM authors;

UPDATE authors
SET last_name = 'UPDATED'
WHERE first_name = 'Milo'
RETURNING *;

SELECT *
FROM authors;

DELETE FROM authors
WHERE id = 6;

SELECT *
FROM authors;

DELETE FROM authors
WHERE id > 11
RETURNING *;

SELECT *
FROM authors;