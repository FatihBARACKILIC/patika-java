SELECT a.first_name,
    a.last_name,
    b.title,
    b.page_number
FROM authors AS a
    INNER JOIN book AS b ON a.id = b.author_id
WHERE b.page_number > (
        SELECT AVG(page_number)
        FROM book
    );