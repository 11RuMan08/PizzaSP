CREATE table persons if not exists (
person_ID int PRIMARY KEY,
name_of_person varchar(255),
phoneNumber varchar(255),
address varchar(255),
payMethod_id int,
FOREIGN KEY(payMethod_id) REFERENCES payMethod(payMethod_id)
);CHARACTER SET = UTF8;

CREATE table pizza if not exists (
pizza_ID int PRIMARY KEY,
name_of_pizza varchar(255),
pizzaType varchar(255),
nutritionalValue varchar(255),
ccal int,
);CHARACTER SET = UTF8;

CREATE table payMethod if not exists (
payMethod_id int PRIMARY KEY,
nane_of_payMethod varchar(255)
);CHARACTER SET = UTF8;

CREATE table Ingredients if not exists (
ingredient_id int PRIMARY KEY,
nane_of_ingredient varchar(255)
);CHARACTER SET = UTF8;

CREATE table drinks if not exists (
drink_ID int PRIMARY KEY,
name_of_drink varchar(255),
nutritionalValue varchar(255),
ccal int,
);CHARACTER SET = UTF8;

CREATE table payMethod if not exists (
id int PRIMARY KEY,
pizza_ID int,
ingredient_id int,
FOREIGN KEY(pizza_ID) REFERENCES pizza(pizza_ID)
FOREIGN KEY(ingredient_id) REFERENCES Ingredients(ingredient_id)
);CHARACTER SET = UTF8;

CREATE table pizza_order if not exists (
id int PRIMARY KEY;
order_id int,
pizza_ID int,
person_ID int,
FOREIGN KEY(pizza_ID) REFERENCES pizza(pizza_ID)
FOREIGN KEY(person_ID) REFERENCES persons(person_ID)
);CHARACTER SET = UTF8;

CREATE table drink_order if not exists (
id int PRIMARY KEY;
order_id int,
drink_ID int,
person_ID int,
FOREIGN KEY(drink_ID) REFERENCES drinks(drink_ID)
FOREIGN KEY(person_ID) REFERENCES persons(person_ID)
);CHARACTER SET = UTF8;