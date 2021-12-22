drop table if exists book;

create table book(
id bigint auto_increment primary key,
title varchar(100) not null,
author varchar(100) not null,
published int not null,
created bigint not null,
updated bigint default null
);
