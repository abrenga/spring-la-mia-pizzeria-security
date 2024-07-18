use DB_pizzeria;

INSERT INTO DB_pizzeria.menu
(prezzo,descrizione,`type_of_pizza`,url)
VALUES(5.00,"pizza al pomodoro e mozzarella","Margherita",'/img/Margherita.jpg' ),
(8.00,"pizza al pomodoro con olive con carciofi e funghi","Capricciosa",'/img/Capricciosa.jpg' ),
(4.00,"pizza al pomodoro e origano","Mariara", '/img/Marinara.jpg' ),
(5.50,"pizza con pomodorini rucola e grana", "Primavera",'/img/Primavera.jpg' ),
(7.00,"pizza mozzarella e gorgonzola con emmental e provola","Quattroformaggi", '/img/quattroformaggi.jpg' ),
(6.50,"pizza mozzarella con tonno e cipolla", "Tonno e cipolla",'/img/tonno.jpg' );

INSERT INTO db_pizzeria.ingredients
( name)
VALUES( 'mozzarella');


INSERT INTO db_pizzeria.model_of_special_price
(`pizza_id`, `end_of_special_price`, `special_price`, `description`, `name_of_special_price`)
VALUES( 1, STR_TO_DATE('22-01-2025', '%d-%m-%Y'), STR_TO_DATE('22-07-2025', '%d-%m-%Y'), 'solo il mercoledi tutte le margherite che riesci a mangiare a 15 euro', 'margerta a sbafo');


INSERT INTO db_pizzeria.pizze_ingredients
(ingredients_id, pizza_id)
VALUES(1, 1);