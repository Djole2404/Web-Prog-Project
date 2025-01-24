CREATE TABLE Billetter
(
    id        INTEGER AUTO_INCREMENT NOT NULL,
    filmer    VARCHAR(255) NOT NULL,
    fornavn   VARCHAR(255) NOT NULL,
    etternavn VARCHAR(255) NOT NULL,
    antall    INTEGER      NOT NULL,
    telefonnr VARCHAR(255) NOT NULL,
    email     VARCHAR(255) NOT NULL,
    primary key (id)
);