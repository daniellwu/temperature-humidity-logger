create table SAMPLE (
    DEVICE BIGINT not null,
    TIMESTAMP TIMESTAMP not null,
    TEMPERATURE DOUBLE,
    HUMIDITY DOUBLE,
    PRIMARY KEY(TEMPERATURE, HUMIDITY)
);