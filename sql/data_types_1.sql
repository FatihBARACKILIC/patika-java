CREATE TABLE test (
    real_type REAL,
    double_type DOUBLE PRECISION,
    numeric_type NUMERIC
);

INSERT INTO test (real_type, double_type, numeric_type)
VALUES (
        1.12345678912345678912,
        1.12345678912345678912,
        1.12345678912345678912
    );

SELECT *
FROM test;

CREATE TABLE test2 (
    float4_type FLOAT4,
    float8_type FLOAT8,
    decimal_type DECIMAL
);

INSERT INTO test2
VALUES (
        1.12345678912345678912,
        1.12345678912345678912,
        1.12345678912345678912
    );

SELECT *
FROM test2;

SELECT (10 + 1);

SELECT (10 + 1::REAL);

SELECT (10 + 1::DOUBLE PRECISION);

SELECT (10 + 1::NUMERIC);