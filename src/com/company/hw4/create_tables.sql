DROP TABLE IF EXISTS tickets;
DROP TABLE IF EXISTS sessions;
DROP TABLE IF EXISTS films;

CREATE TABLE films
(
    id       SERIAL PRIMARY KEY,
    name     VARCHAR(255),
    duration TIME
);

CREATE TABLE sessions
(
    id      SERIAL PRIMARY KEY,
    film_id INTEGER,
    date    DATE,
    time    TIME,
    FOREIGN KEY (film_id) references films (id)
);

CREATE TABLE tickets
(
    id         SERIAL PRIMARY KEY,
    session_id INTEGER,
    price      NUMERIC,
    FOREIGN KEY (session_id) references sessions (id)
);