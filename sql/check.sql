INSERT INTO users (username, email, age)
VALUES ('Gamer 3', 'gamer3@gmail.com', -20);

SELECT *
FROM users;

ALTER TABLE users
ADD CHECK (age > 18);

DELETE FROM users
WHERE id = 10;

SELECT *
FROM users;

ALTER TABLE users
ADD CHECK (age > 18);

INSERT INTO users (username, email, age)
VALUES ('Gamer4', 'gamer4@gmail.com', 20);

SELECT *
FROM users;

CREATE TABLE products (
    products_no INTEGER,
    name text,
    price numeric CHECK (price > 0),
    discounted_price numeric CHECK (discounted_price > 0),
    CHECK (discounted_price < price)
);

SELECT *
FROM products;

INSERT INTO products (products_no, name, price, discounted_price)
VALUES (1, 'Product 1', 100, 50);

SELECT *
FROM products;