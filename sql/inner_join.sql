SELECT title,
    CONCAT(first_name, ' ', last_name) AS author
FROM book AS b
    INNER JOIN authors AS a ON b.author_id = a.id
ORDER BY author;