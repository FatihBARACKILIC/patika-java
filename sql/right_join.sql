SELECT a.first_name,
    a.last_name,
    b.title
FROM book AS b
    RIGHT JOIN authors AS a ON a.id = b.author_id;