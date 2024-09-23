CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE users(
    id UUID PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);
CREATE TABLE books(
    id UUID PRIMARY KEY,
    title VARCHAR(50) NOT NULL,
    year_published INTEGER NOT NULL,
    rating INTEGER,
    author VARCHAR(50) NOT NULL,
    genre VARCHAR(50) NOT NULL,
    book_language VARCHAR(50) NOT NULL
);
CREATE TABLE ratings(
    id UUID PRIMARY KEY,
    user_id UUID NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    book_id UUID NOT NULL REFERENCES books(id) ON DELETE CASCADE,
    rating_value INTEGER NOT NULL
);