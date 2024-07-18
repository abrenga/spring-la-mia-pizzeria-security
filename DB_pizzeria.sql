use DB_pizzeria;

INSERT INTO DB_pizzeria.menu
(prezzo,descrizione,`type_of_pizza`,url)
VALUES(5.00,"pizza tradizionale, ingredienti provenienti dalla campania","Margherita",'/img/Margherita.jpg' ),
(8.00,"pizza rossa con olive lavorate nel frantoio di Agerola","Capricciosa",'/img/Capricciosa.jpg' ),
(4.00,"tradizionle e saporita","Mariara", '/img/Marinara.jpg' ),
(5.50,"Fresca, leggera e anche con farina integrale", "Primavera",'/img/Primavera.jpg' ),
(7.00,"leggera,no..buona si, per i veri amanti del formaggio casareccio","Quattroformaggi", '/img/quattroformaggi.jpg' ),
(6.50,"Non hai la fidanzata/o?, questa è la pizza per te, con prodotti della tradizione campana", "Tonno e cipolla",'/img/tonno.jpg' );

INSERT INTO db_pizzeria.model_of_special_price
(`pizza_id`, `end_of_special_price`, `special_price`, `description`, `name_of_special_price`)
VALUES( 1, '2025/01/22', '2024/07/17', 'solo il mercoledi tutte le margherite che riesci a mangiare a 15 euro', 'margerta a sbafo'),
( 1, '2025/02/22', '2024/08/12', 'solo il mercoledi tutte le bianche che riesci a mangiare basta che non ci sia sugo a 15 euro', 'margerta a sbafo');

INSERT INTO db_pizzeria.ingredients
(name)
VALUES( 'pomodoro'),
('mozzarella'),
('tonno'),
('cipolla'),
('olive'),
('prociutto'),
('salame'),
('gorgonzola'),
('Rucola'),
('Grana'),
('gunghi'),
('gunghi'),
('emmental'),
('provola');

INSERT INTO db_pizzeria.`user`
(id, password, username)
VALUES(1, '{noop}pass', 'Antonietta');

INSERT INTO db_pizzeria.`role`
(id, name)
VALUES(1, 'ADMIN'), (2, 'USER');


INSERT INTO db_pizzeria.user_roles
(roles_id, user_id)
VALUES(1, 1), (2, 1);