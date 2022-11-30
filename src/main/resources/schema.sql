drop table if exists book;
create table book(book_id int primary key, book_name varchar(100), author varchar(100),available_copies int, total_copies int)