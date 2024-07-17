use db_pizzeria;

INSERT INTO db_pizzeria.model_of_special_price
(`pizza_id`, `end_of_special_price`, `special_price`, `description`, `name_of_special_price`)
VALUES( 1, STR_TO_DATE('22-01-2025', '%d-%m-%Y'), STR_TO_DATE('22-07-2025', '%d-%m-%Y'), 'solo il mercoledi tutte le margherite che riesci a mangiare a 15 euro', 'margerta a sbafo');