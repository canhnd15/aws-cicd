CREATE TABLE IF NOT EXISTS course (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    price DOUBLE PRECISION,
    time INTEGER,
    created_date TIMESTAMP
);