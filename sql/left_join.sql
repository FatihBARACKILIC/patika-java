SELECT title,
    first_name,
    last_name
FROM authors AS a
    INNER JOIN book AS b ON a.id = b.author_id;

INSERT INTO book (title, page_number, author_id)
VALUES ('Gülün Adı', 466, 44);

ALTER TABLE book DROP CONSTRAINT book_author_id_fkey;

INSERT INTO book (title, page_number, author_id)
VALUES ('Gülün Adı', 466, 44)
VALUES ('Yapay Zeka', 108, 55);

SELECT *
FROM book;

SELECT a.id,
    a.first_name,
    a.last_name,
    a.email,
    b.title,
    b.page_number
FROM book AS b
    LEFT JOIN authors AS a ON a.id = b.author_id;

SELECT a.id,
    a.first_name,
    a.last_name,
    a.email,
    b.title,
    b.page_number
FROM authors AS a
    LEFT JOIN book AS b ON a.id = b.author_id
WHERE b.id IS NOT NULL
ORDER BY b.title;