/*DROP TABLE IF EXISTS billionaires;

CREATE TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  f_name VARCHAR(250) NOT NULL,
  l_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);
*/
INSERT INTO continents (continent_name) VALUES
    ('South America'),
    ('North America'),
    ('Europe'),
    ('Africa'),
    ('Asia'),
    ('Australia'),
    ('Antarctica');

INSERT INTO billionaires (f_name, l_name, career, home_continent_id) VALUES
  ('Aliko', 'Dangote', 'Billionaire Industrialist', 4),
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur', 2),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate', 4);

INSERT INTO conspiracy (c_name, description) VALUES
('White genocide', 'A secret plan to eradicate white people and have them replaced by lower-IQ, more conformist races'),
('Round earth', 'A Satanic plot to convince the sheeple that the Earth is not flat, discrediting Genesis and driving mankind away from God');

INSERT INTO BILLIONAIRES_CONSPIRACIES (CONSPIRACY_LEADERS_ID, CONSPIRACIES_ID) VALUES
(2, 1),
(3, 2);
