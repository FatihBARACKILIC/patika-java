-- test veritabanınızda employee isimli sütun bilgileri 
-- id(INTEGER), name VARCHAR(50), birthday DATE,
--  email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee (
    id SERIAL NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthday DATE,
    email VARCHAR(100)
);

-- Oluşturduğumuz employee tablosuna 'Mockaroo' 
-- servisini kullanarak 50 adet veri ekleyelim.
INSERT INTO employee (name, birthday, email)
VALUES (
        'Clarabelle',
        '1954-01-13',
        'cmathevon0@weather.com'
    );

INSERT INTO employee (name, birthday, email)
VALUES ('Fletcher', NULL, 'fgrammer1@squarespace.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Desi', NULL, NULL);

INSERT INTO employee (name, birthday, email)
VALUES (
        'Micheal',
        '1922-11-12',
        'mbadwick3@shutterfly.com'
    );

INSERT INTO employee (name, birthday, email)
VALUES ('Dianemarie', NULL, 'dmolloy4@technorati.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Dorena', '1913-09-22', NULL);

INSERT INTO employee (name, birthday, email)
VALUES ('Reinaldo', NULL, 'rnaisbit6@hubpages.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Phip', NULL, 'palldritt7@blinklist.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Franciskus', '1936-01-22', 'fburger8@diigo.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Ly', '1979-08-21', 'ljans9@csmonitor.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Alyse', '1983-02-20', 'aaverya@goodreads.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Maire', NULL, 'mjaszczakb@ycombinator.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Astrix', NULL, 'aelphc@miitbeian.gov.cn');

INSERT INTO employee (name, birthday, email)
VALUES ('Sabra', '1902-10-07', 'scappsd@plala.or.jp');

INSERT INTO employee (name, birthday, email)
VALUES ('Daria', '1914-01-15', 'dminichie@mlb.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Emelia', '1957-08-30', 'eleavesf@topsy.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Frasier', '1988-05-18', 'fdurdleg@state.gov');

INSERT INTO employee (name, birthday, email)
VALUES ('Bernete', NULL, 'bgiamuzzoh@blogspot.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Avrit', NULL, 'amantionei@mtv.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Corena', '1976-01-31', 'churryj@wp.com');

INSERT INTO employee (name, birthday, email)
VALUES (
        'Neale',
        '1949-05-27',
        'nbeldersonk@cargocollective.com'
    );

INSERT INTO employee (name, birthday, email)
VALUES ('Adan', '1945-08-25', 'aventural@economist.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Woodie', '1992-11-18', 'wviggersm@who.int');

INSERT INTO employee (name, birthday, email)
VALUES ('Carlynne', '1918-03-22', 'cquailn@toplist.cz');

INSERT INTO employee (name, birthday, email)
VALUES (
        'Evaleen',
        '1935-07-16',
        'eberringero@addthis.com'
    );

INSERT INTO employee (name, birthday, email)
VALUES ('Nada', '1954-03-03', NULL);

INSERT INTO employee (name, birthday, email)
VALUES ('Carl', '1918-05-24', 'cchealeq@wordpress.org');

INSERT INTO employee (name, birthday, email)
VALUES ('Ferne', NULL, 'fbaxstairr@google.ca');

INSERT INTO employee (name, birthday, email)
VALUES (
        'Beatrice',
        '1957-01-19',
        'bsleighs@hugedomains.com'
    );

INSERT INTO employee (name, birthday, email)
VALUES ('Elva', '1938-06-05', 'efransmant@engadget.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Hedwiga', NULL, 'hmaccarteru@ucsd.edu');

INSERT INTO employee (name, birthday, email)
VALUES ('Devonna', '1923-05-30', 'dboleynv@salon.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Joseito', '1911-05-26', NULL);

INSERT INTO employee (name, birthday, email)
VALUES (
        'Joana',
        '1961-04-30',
        'jbillboroughx@reverbnation.com'
    );

INSERT INTO employee (name, birthday, email)
VALUES ('Aline', NULL, 'amerrissony@theatlantic.com');

INSERT INTO employee (name, birthday, email)
VALUES (
        'Ashton',
        '1973-08-28',
        'amartindalez@networkadvertising.org'
    );

INSERT INTO employee (name, birthday, email)
VALUES (
        'Goldie',
        '1936-01-04',
        'gpethick10@altervista.org'
    );

INSERT INTO employee (name, birthday, email)
VALUES ('Lyn', NULL, 'lelles11@networksolutions.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Rutger', '1926-07-06', 'rsaiz12@vk.com');

INSERT INTO employee (name, birthday, email)
VALUES (
        'Burke',
        '1996-11-26',
        'bborgbartolo13@naver.com'
    );

INSERT INTO employee (name, birthday, email)
VALUES (
        'Dorthea',
        '1947-08-02',
        'dhakonsen14@comcast.net'
    );

INSERT INTO employee (name, birthday, email)
VALUES (
        'Hortense',
        '1958-10-20',
        'hsuthworth15@tripod.com'
    );

INSERT INTO employee (name, birthday, email)
VALUES ('Andrea', '1931-12-22', 'aolyet16@pen.io');

INSERT INTO employee (name, birthday, email)
VALUES ('Berget', NULL, 'btranckle17@samsung.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Evonne', NULL, 'esharnock18@cpanel.net');

INSERT INTO employee (name, birthday, email)
VALUES ('Stoddard', NULL, 'smckerton19@senate.gov');

INSERT INTO employee (name, birthday, email)
VALUES ('Katharyn', NULL, NULL);

INSERT INTO employee (name, birthday, email)
VALUES ('Reggy', '1958-01-22', 'rcrosgrove1b@ning.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Arda', NULL, 'atinniswood1c@msn.com');

INSERT INTO employee (name, birthday, email)
VALUES ('Russ', '1968-03-22', 'rwilacot1d@seesaa.net');

SELECT *
FROM employee;

-- Sütunların her birine göre diğer sütunları güncelleyecek 
-- 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET name = 'UPDATED 1'
WHERE name LIKE 'A%';

UPDATE employee
SET birthday = '2000-01-01'
WHERE birthday = '1902-10-07'
RETURNING *;

UPDATE employee
SET name = 'UPDATED 3'
WHERE id < 3;

UPDATE employee
SET name = 'UPDATED 4'
WHERE name LIKE 'C%'
    AND birthday BETWEEN '1900-01-01' AND '1990-01-01'
RETURNING *;

UPDATE employee
SET email = 'UPDATED5@mail.com'
WHERE email LIKE '%@m%';

SELECT *
FROM employee
ORDER BY id;

-- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE birthday IS NULL
RETURNING *;

DELETE FROM employee
WHERE email IS NULL
RETURNING *;

DELETE FROM employee
WHERE id = 1;

DELETE FROM employee
WHERE name ILIKE '%y';

DELETE FROM employee
WHERE birthday BETWEEN '1900-01-01' AND '1950-01-01'
RETURNING *;

SELECT *
FROM employee
ORDER BY id;