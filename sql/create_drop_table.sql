CREATE DATABASE bookstore;

CREATE TABLE authors(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    birthdate DATE
);

SELECT *
FROM authors;

INSERT INTO authors(first_name, last_name, email, birthdate)
VALUES (
        'Haruki',
        'Murakami',
        'haruki@murakami.com',
        '1948-11-07'
    ),
    (
        'Sabahattin',
        'Ali',
        'sabahattin@ali.com',
        '1914-07-11'
    ),
    (
        'Orhan',
        'Pamuk',
        'orhan@pamuk.com',
        '1950-04-14'
    ),
    (
        'Halide Edip',
        'Adıvar',
        'halide@edip.com',
        '1884-07-11'
    ),
    (
        'Zygmunt',
        'Bauman',
        'zygmunt@ali.com',
        '1911-07-12'
    );

SELECT *
FROM authors;

CREATE TABLE author2(LIKE authors);

INSERT INTO author2
SELECT *
FROM authors
WHERE first_name = 'Sabahattin';

SELECT *
FROM author2;

CREATE TABLE author3 AS
SELECT *
FROM authors;

SELECT *
FROM author3;

DROP TABLE IF EXISTS author3;

DROP TABLE author2;