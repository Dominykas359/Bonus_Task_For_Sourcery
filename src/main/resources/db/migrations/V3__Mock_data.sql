INSERT INTO books (id, title, year_published, rating, author, genre, book_language)
VALUES
('71a8df4d-e158-4385-9bee-10b130714646', 'Witcher: Last Wish', 2016,
    (SELECT AVG(r.rating_value) FROM ratings r WHERE r.book_id = '71a8df4d-e158-4385-9bee-10b130714646'),
    'Andrzej Sapkowski', 'fantasy', 'English'),
('7583e012-576d-4a93-94bf-943ae4efd1a7', 'Lord of the rings', 1989,
    (SELECT AVG(r.rating_value) FROM ratings r WHERE r.book_id = '7583e012-576d-4a93-94bf-943ae4efd1a7'),
    'JRR Tolkien', 'fantasy', 'English'),
('1b1710e1-ede2-4efe-9ab9-f2f29fcceea1', 'Game of thrones', 1998,
    (SELECT AVG(r.rating_value) FROM ratings r WHERE r.book_id = '1b1710e1-ede2-4efe-9ab9-f2f29fcceea1'),
    'George RR Martin', 'fantasy', 'English');

INSERT INTO ratings (id, user_id, book_id, rating_value)
VALUES
('1b1710e1-ede2-4efe-9ab9-f2f29fcceea2', '62d8d5e0-9de6-4806-9abc-fe9c3eaffb95', '71a8df4d-e158-4385-9bee-10b130714646', 4),
('837ad31f-db44-4f87-897e-187b6e103c90', 'c87c752a-05de-42ce-9c84-45322b455d9f', '71a8df4d-e158-4385-9bee-10b130714646', 3),
('3953ae62-3425-4e1e-85fe-2f9d1c56f917', '62d8d5e0-9de6-4806-9abc-fe9c3eaffb95', '7583e012-576d-4a93-94bf-943ae4efd1a7', 5),
('7ae00ead-97be-4a06-8ffb-67119627d8c8', '62d8d5e0-9de6-4806-9abc-fe9c3eaffb95', '1b1710e1-ede2-4efe-9ab9-f2f29fcceea1', 2),
('264e2a29-e553-483b-aac5-c125dc71a09b', 'e0121017-9efa-440e-be34-c987e55c841f', '71a8df4d-e158-4385-9bee-10b130714646', 4);
