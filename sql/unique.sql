INSERT INTO users (username, email, age)
VALUES ('tester2', 'tester@mail.com', 20);

SELECT *
FROM users;

ALTER TABLE users
ADD UNIQUE (email);

SELECT *
FROM users;

UPDATE users
SET email = 'tester2@mail.com'
WHERE id = 7;

SELECT *
FROM users;

ALTER TABLE users
ADD UNIQUE (email);

INSERT INTO users (username, email, age)
VALUES ('tester2', 'tester3@mail.com', 20);

SELECT *
FROM users;