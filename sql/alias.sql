SELECT first_name AS isim,
    last_name AS soyisim
FROM actor;

SELECT COUNT(*) AS "Aktör Sayısı"
FROM actor;

SELECT CONCAT(first_name, ' ', last_name) AS "Ad Soyad"
FROM actor;