create database flykart;
use flykart;

create table e_commerce_user_details(user_id int auto_increment,
user_name varchar(20), 
user_password varchar(20),
user_phone_number varchar(13),
user_mail_id varchar(20), 
primary key(user_id));

insert into e_commerce_user_details(user_name,user_password,user_phone_number,user_mail_id)values("vignesh","vignesh","987654321","abc@gmail.com");
insert into e_commerce_user_details(user_name,user_password,user_phone_number,user_mail_id)values("sakthi","vel","987123421","def@gmail.com");

select * from e_commerce_user_details;
-- drop table e_commerce_user_details;

create table address_details(address_id int auto_increment, 
address_line_1 varchar(100), 
address_line_2 varchar(50), 
city varchar(20), 
state varchar(20), 
pin_code int, 
user_id int,primary key(address_id),
foreign key(user_id) references e_commerce_user_details(user_id));

insert into address_details(address_line_1,address_line_2,city,state,pin_code,user_id)values("rcnavarathna","kodungaiyur","chennai","tamilnadu",600118,2);
insert into address_details(address_line_1,address_line_2,city,state,pin_code,user_id)values("cpkflat","near trichy gh","trichy","tamilnadu",610122,2);

select * from address_details;
-- drop table address_details;


create table category(category_id int auto_increment,
category_name varchar(20), 
category_description varchar(100), 
primary key(category_id));

insert into category(category_name,category_description)values("shoe","it is a footware weared for schools, sports, casual wear");
insert into category(category_name,category_description)values("sandal","it is a footware weared for casual wear");
insert into category(category_name,category_description)values("socks","used for shoes");

select * from category;
-- drop table category;

create table product(product_id int auto_increment, 
product_name varchar(20), 
list_price int, 
sale_price int, 
product_img_url varchar(50),
 product_description varchar(50),primary key(product_id));
	
insert into product(product_name,list_price,sale_price,product_img_url,product_description)values("bata shoe",1000, 600, "bata shoe url"," used to wear for school, any function,etc.,");
insert into product(product_name,list_price,sale_price,product_img_url,product_description)values("rebok shoe",2000, 900, "rebok shoe url"," used to wear for sports, casual wear.,");
insert into product(product_name,list_price,sale_price,product_img_url,product_description)values("bata chappal",1000,500, "bata chappal url"," used to wear for casual outing.,");
insert into product(product_name,list_price,sale_price,product_img_url,product_description)values("socks",100,50, "socks url"," used by all the mens.,");
insert into product(product_name,list_price,sale_price,product_img_url,product_description)values("baby socks",200,100, "baby socks url"," used for babies.,");
insert into product(product_name,list_price,sale_price,product_img_url,product_description)values("vks sandals",600,400, "vkc sandals url"," used by all mens,");

select *from product;
-- drop table product;

create table product_category_relationship(product_category_relationship_id int auto_increment,
product_id int, 
category_id int,
primary key(product_category_relationship_id),
foreign key(product_id) references product(product_id),
foreign key(category_id) references category(category_id));

insert into product_category_relationship(product_id,category_id)values(1,1);
insert into product_category_relationship(product_id,category_id)values(2,1);
insert into product_category_relationship(product_id,category_id)values(3,2);
insert into product_category_relationship(product_id,category_id)values(4,3);
insert into product_category_relationship(product_id,category_id)values(5,3);
insert into product_category_relationship(product_id,category_id)values(6,2);


select * from product_category_relationship;

-- drop table product_category_relationship;

create table cart(cart_id int auto_increment, 
total_price double,
total_tax double, 
delivery_status varchar(20),
address_id int,
user_id int,primary key(cart_id),
foreign key(address_id) references address_details(address_id),
foreign key(user_id) references e_commerce_user_details(user_id));

insert into cart(total_price,total_tax,delivery_status,address_id,user_id)values(600,20,"pending",1,1);
insert into cart(total_price,total_tax,delivery_status,address_id,user_id)values(900,70,"pending",1,1);
insert into cart(total_price,total_tax,delivery_status,address_id,user_id)values(500,50,"pending",1,1);

select * from cart;
-- update cart set user_id=2;

create table order_item(order_item_id int auto_increment,
product_id int, price double, tax double, quantity int, cart_id int, 
primary key(order_item_id),foreign key(product_id) references product(product_id),
foreign key(cart_id) references cart(cart_id)); 

insert into order_item(product_id,price,tax,quantity,cart_id)values(1,600,20,1,1);
insert into order_item(product_id,price,tax,quantity,cart_id)values(2,900,70,1,2);
insert into order_item(product_id,price,tax,quantity,cart_id)values(3,500,50,1,3);

select * from order_item;

-- up to date 






