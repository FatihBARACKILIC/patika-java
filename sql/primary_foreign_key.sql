CREATE TABLE book (
    id SERIAL PRIMARY KEY,
    title varchar(100) NOT NULL,
    page_number INTEGER NOT NULL,
    author_id INTEGER REFERENCES authors(id)
);

SELECT *
FROM book;

INSERT INTO book (title, page_number, author_id)
VALUES ('White Banners', 61, 1);

INSERT INTO book (title, page_number, author_id)
VALUES ('Saving Shiloh', 580, 10);

INSERT INTO book (title, page_number, author_id)
VALUES ('Abe Lincoln in Illinois', 105, 7);

INSERT INTO book (title, page_number, author_id)
VALUES ('Apache Territory', 286, 1);

INSERT INTO book (title, page_number, author_id)
VALUES ('Out 1: Spectre', 402, 9);

INSERT INTO book (title, page_number, author_id)
VALUES ('Trials of Muhammed Ali, The', 164, 5);

INSERT INTO book (title, page_number, author_id)
VALUES (
        'B.U.S.T.E.D (Everybody Loves Sunshine) (Busted)',
        84,
        10
    );

INSERT INTO book (title, page_number, author_id)
VALUES ('Father Sergius (Otets Sergiy)', 265, 9);

INSERT INTO book (title, page_number, author_id)
VALUES ('It Started in Naples', 838, 8);

INSERT INTO book (title, page_number, author_id)
VALUES ('Thirty Seconds Over Tokyo', 586, 1);

INSERT INTO book (title, page_number, author_id)
VALUES ('Return to Homs, The', 580, 9);

INSERT INTO book (title, page_number, author_id)
VALUES ('Cutie Honey', 788, 8);

INSERT INTO book (title, page_number, author_id)
VALUES ('Jackass 3.5', 834, 1);

INSERT INTO book (title, page_number, author_id)
VALUES ('Baby On Board', 339, 7);

INSERT INTO book (title, page_number, author_id)
VALUES (
        'Making Plans for Lena (Non ma fille, tu n''iras pas danser)',
        375,
        7
    );

SELECT *
FROM book;

SELECT *
FROM book
    JOIN authors ON book.author_id = authors.id
WHERE author_id = 1;