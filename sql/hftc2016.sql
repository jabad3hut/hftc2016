drop table if exists `user`;
drop table if exists pending_request;
drop table if exists family_inventory;
drop table if exists pending_request;
drop table if exists inventory;
drop table if exists location;
drop table if exists location;
drop table if exists product_type;
drop table if exists returns_archive;
drop table if exists request_archive;


create table product_type(
	id int not null auto_increment primary key,
    product_name varchar(255) not null,
    product_desc text
);

create table location(
	id int not null auto_increment primary key,
    location_name varchar(255) not null
);

create table inventory(
	id int not null auto_increment primary key,
	product_type_id int not null,
    location_id int not null,
    total_inventory int not null default 0,
    reserved_inventory int not null default 0,
    constraint unique key uk_inv_ptypeid_loc (product_type_id, location_id),
    constraint foreign key fk_inv_ptypeid (product_type_id) references product_type(id),
    constraint foreign key fk_inv_locid (location_id) references location(id)
);

create table `user`(
	id int not null auto_increment primary key,
    username varchar(255),
    password varchar(255) collate latin1_general_cs,
    email varchar(255),
    role enum('HomeVisitor', 'TeamAdmin', 'Supervisor')
);


create table pending_request(
	id int not null primary key auto_increment,
    user_id int not null,
    inventory_id int not null,
    request_date timestamp not null,
    family_id varchar(255) not null,
    constraint foreign key fk_req_inv (inventory_id) references inventory(id)
);

create table family_inventory(
	id int not null primary key auto_increment,
    family_id varchar(255) not null,
    inventory_id int not null,
    quantity int not null,
    requested_date timestamp,
    constraint foreign key fk_fi_inv(inventory_id) references inventory(id)
);
create table request_archive(
	id int not null primary key,
    product_name varchar(255),
    product_location varchar(255),
    request_date timestamp not null,
    family_id varchar(255) not null,
    quantity int not null,
    requested_date timestamp not null default current_timestamp,
    request_status enum('approved', 'denied')
);

create table returns_archive(
	id int not null primary key,
    family_id varchar(255) not null,
    product_name varchar(255),
    product_location varchar(255),
    quantity int,
    returned_date timestamp not null default current_timestamp
);
