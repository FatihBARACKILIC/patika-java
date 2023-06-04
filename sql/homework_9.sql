-- city tablosu ile country tablosunda bulunan şehir (city) ve 
-- ülke (country) isimlerini birlikte görebileceğimiz
-- INNER JOIN sorgusunu yazınız.
SELECT cit.city,
    c.country
FROM city AS cit
    INNER JOIN country AS c ON cit.country_id = c.country_id;

-- customer tablosu ile payment tablosunda bulunan payment_id
--  ile customer tablosundaki first_name ve last_name isimlerini
--  birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
SELECT p.payment_id,
    c.first_name,
    c.last_name
FROM payment AS p
    INNER JOIN customer AS c ON p.customer_id = c.customer_id;

-- customer tablosu ile rental tablosunda bulunan rental_id ile
--  customer tablosundaki first_name ve last_name isimlerini
--  birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
SELECT r.rental_id,
    c.first_name,
    c.last_name
FROM rental AS r
    INNER JOIN customer AS c ON r.customer_id = c.customer_id;