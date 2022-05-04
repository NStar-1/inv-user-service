CREATE TABLE application
(
    app_id SERIAL NOT NULL,
    app_version varchar(10) NOT NULL,
    data_release timestamp NOT NULL,
    primary key (app_version)
);