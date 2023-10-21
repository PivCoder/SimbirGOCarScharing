create schema IF NOT EXISTS project;

DROP TABLE IF EXISTS project.transport_type CASCADE;

create table IF NOT EXISTS project.transport_type
(
    id numeric not null
        constraint transport_type_pkey
            primary key,
    type_of_transport varchar(250) not null unique
);

DROP TABLE IF EXISTS project.model CASCADE;

create table IF NOT EXISTS project.model
(
    id numeric not null
        constraint model_pkey
            primary key,
    model_name varchar(200) not null unique,
    transport_type_id numeric
        constraint transport_type_id_fkey
            references project.transport_type

);

DROP TABLE IF EXISTS project.account CASCADE;

create table IF NOT EXISTS project.account
(
    id numeric not null
        constraint account_pkey
            primary key,
    user_name varchar(250) not null,
    password varchar(250) not null,
    balance real,
    is_admin bool
);

create index IF NOT EXISTS user_name_index
    on project.account (user_name);

DROP TABLE IF EXISTS project.transport CASCADE;

create table IF NOT EXISTS project.transport
(
    id numeric not null
        constraint transport_pkey
            primary key,
    can_be_rated bool,
    color varchar(100),
    identifier varchar(100) not null unique,
    description varchar(100),
    latitude real not null,
    longitude real not null,
    minutePrice real,
    dayPrice real,
    rentType varchar(25) not null ,
    model_id numeric
        constraint model_id_fkey
            references project.model not null,
    owner_id numeric
        constraint owner_account_id_fkey
            references project.account not null unique,
    arendator_id numeric
        constraint arendator_account_id_fkey
            references project.account unique
);

create index IF NOT EXISTS identifier_index
    on project.transport (identifier);

DROP TABLE IF EXISTS project.account_transport CASCADE;

create table IF NOT EXISTS project.account_transport
(
    account_id numeric
        constraint account_transport_account_id_fkey
            references project.account,
    transport_id numeric
        constraint account_transport_transport_id_fkey
            references project.transport
);

create sequence IF NOT EXISTS project.transport_type_seq;

alter sequence project.transport_type_seq owned by project.transport.id;

create sequence IF NOT EXISTS project.model_seq;

alter sequence project.model_seq owned by project.model.id;

create sequence IF NOT EXISTS project.account_seq;

alter sequence project.account_seq owned by project.account.id;

create sequence IF NOT EXISTS project.transport_seq;

alter sequence project.transport_seq owned by project.transport.id;

INSERT INTO project.transport_type (id, type_of_transport) VALUES (1, 'Type1');
INSERT INTO project.transport_type (id, type_of_transport) VALUES (2, 'Type2');
INSERT INTO project.transport_type (id, type_of_transport) VALUES (3, 'Type3');

INSERT INTO project.model (id, model_name, transport_type_id) VALUES (1, 'Model1', 1);
INSERT INTO project.model (id, model_name, transport_type_id) VALUES (2, 'Model2', 2);
INSERT INTO project.model (id, model_name, transport_type_id) VALUES (3, 'Model3', 3);
INSERT INTO project.model (id, model_name, transport_type_id) VALUES (4, 'Model4', 2);
INSERT INTO project.model (id, model_name, transport_type_id) VALUES (5, 'Model5', 1);

INSERT INTO project.account (id, user_name, password, balance, is_admin) VALUES (1, 'Name 1', '', 200.0, false);
INSERT INTO project.account (id, user_name, password, balance, is_admin) VALUES (2, 'Name 2', '1', 300.0, false);
INSERT INTO project.account (id, user_name, password, balance, is_admin) VALUES (3, 'AdminName 1', '1', 400.0, true);

INSERT INTO project.transport (id,
                               can_be_rated,
                               color,
                               identifier,
                               description,
                               latitude,
                               longitude,
                               minutePrice,
                               dayPrice,
                               rentType,
                               model_id,
                               owner_id)
VALUES (1, true, 'Red', 'C065MK78', '', 10.07785, 25.12256, 150.50, 2000, 'MINUTES', 1, 1);

INSERT INTO project.transport (id,
                               can_be_rated,
                               color,
                               identifier,
                               description,
                               latitude,
                               longitude,
                               minutePrice,
                               dayPrice,
                               rentType,
                               model_id,
                               owner_id)
VALUES (2, true, 'Red', 'A124KA99', '', 10.11241, 25.78852, 201.50, 3500, 'DAYS', 2, 2);

INSERT INTO project.transport (id,
                               can_be_rated,
                               color,
                               identifier,
                               description,
                               latitude,
                               longitude,
                               minutePrice,
                               dayPrice,
                               rentType,
                               model_id,
                               owner_id)
VALUES (3, true, 'Red', 'B099AA54', '', 11.22353, 27.44755, 800.77, 5500, 'DAYS', 3, 3);