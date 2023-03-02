
create table if not exists products(id bigserial primary key, title varchar(255), price integer);


insert into products (title, price) values ('apple', 10), ('lemon', 10), ('orange', 25);