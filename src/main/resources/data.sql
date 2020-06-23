CREATE table if not exists pizza(
pizza_ID int PRIMARY KEY,
name_of_pizza varchar(255),
pizzaType varchar(255),
nutritionalValue varchar(255),
ccal int
);

CREATE table if not exists payMethod(
payMethod_id int PRIMARY KEY,
name_of_payMethod varchar(255)
);

CREATE table if not exists Ingredients(
ingredient_id int PRIMARY KEY,
name_of_ingredient varchar(255)
);

CREATE table if not exists drinks(
drink_ID int PRIMARY KEY,
name_of_drink varchar(255),
nutritionalValue varchar(255),
ccal int
);

CREATE table if not exists pizza_and_ingredients(
id int PRIMARY KEY,
pizza_ID int,
ingredient_id int,
FOREIGN KEY(pizza_ID) REFERENCES pizza(pizza_ID),
FOREIGN KEY(ingredient_id) REFERENCES Ingredients(ingredient_id)
);

-- insert into pizza_and_ingredients (id,pizza_ID,ingredient_id) VALUES (1,1,1),(2,1,3),(3,1,8),(4,1,2),(5,1,4),(6,2,1),(7,2,4),(8,2,8),(9,3,1),(10,3,2),(11,3,3),(12,4,1),(13,4,8),(14,4,4);
-- insert into Ingredients (ingredient_id,name_of_ingredient) VALUES (1,'CHEESE'),(2,'TOMATO'),(3,'MEAT'),(4,'PEPERONI'),(5,'PICKLE'),(6,'PARMESAN'),(7,'MOZZARELLA'),(8,'CHICKEN');
-- insert into payMethod (payMethod_id,name_of_payMethod) VALUES (1,'CARD'),(2,'CASH');
-- insert into drinks (drink_ID,name_of_drink,nutritionalValue) VALUES (1,'Water','0/0/0',0), (2,'Cola','0/0/10.2',42),(3,'Morse','0/0/10.6',42);
-- insert into pizza (pizza_ID,name_of_pizza,pizzaType,nutritionalValue) VALUES (1,'meat pizza','open','14/14/28',317),(2,'4 cheeses','open','14/18/16',283),(3,'brand name pizza','open','7/4/39',224),(4,'calzone','closed','12/13/26',286);


