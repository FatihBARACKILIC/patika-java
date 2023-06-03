CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(20),
    email VARCHAR(50),
    age INTEGER
);

SELECT *
FROM users;

INSERT INTO users (username, email, age)
VALUES ('tester', 'tester@mail.com', 20);

SELECT *
FROM users;

INSERT INTO users (email, age)
VALUES ('gamer@mail.com', 35);

SELECT *
FROM users;

ALTER TABLE users
ALTER COLUMN username
SET NOT NULL;

DELETE FROM users
WHERE username IS NULL
RETURNING *;

ALTER TABLE users
ALTER COLUMN username
SET NOT NULL;

INSERT INTO users (email, age)
VALUES ('gamer@mail.com', 35);

SELECT *
FROM users;

INSERT INTO users (username, email, age)
VALUES ('', 'gamer@mail.com', 35);

SELECT *
FROM users;