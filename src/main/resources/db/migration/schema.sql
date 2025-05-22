CREATE SCHEMA IF NOT EXISTS shopping;

CREATE TABLE shopping.shop (
    id BIGSERIAL PRIMARY KEY,
    user_identifier VARCHAR(255) NOT NULL,
    date TIMESTAMP NOT NULL,
    total FLOAT NOT NULL
);

CREATE TABLE shopping.item (
    id BIGSERIAL PRIMARY KEY,
    shop_id BIGINT REFERENCES shopping.shop(id),
    product_identifier VARCHAR(255) NOT NULL,
    price FLOAT NOT NULL
);