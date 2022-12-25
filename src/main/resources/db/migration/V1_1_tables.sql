rop table if exists rate;
create table rate
(
    id        serial not null
        primary key,
    close     numeric(19, 2),
    currency  varchar(255),
    date_time varchar(255)
);

drop table if exists limits;
create table limits
(
    id                       serial not null
        primary key,
    limit_currency_shortname varchar(255),
    limit_datetime           timestamp,
    limit_sum                numeric(19, 2)
);

drop table if exists operations;
create table operations
(
    id                 serial  not null
        primary key,
    account_from       integer not null,
    account_to         integer not null,
    currency_shortname varchar(255),
    date               timestamp,
    expense_category   varchar(255),
    sum                numeric(19, 2)
);


