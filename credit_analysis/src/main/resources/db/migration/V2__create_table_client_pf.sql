CREATE TABLE client_pf(
    id UUID NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    birth_date DATE,
    PRIMARY KEY(id)
);

INSERT INTO client_pf VALUES(123, '71775251063', 'Patricia', 'Magalhães', '1995-05-31');