SELECT ('Lorem'::CHAR(10));

SELECT ('Lorem ipsum dolor sit amet'::CHAR(10));

SELECT ('Lorem'::VARCHAR(10));

SELECT ('Lorem ipsum dolor sit amet'::VARCHAR(10));

SELECT ('Lorem'::TEXT);

SELECT ('Lorem ipsum dolor sit amet'::TEXT);

SELECT (TRUE, 'yes', 't', 1);

SELECT (false, 'no', 'f', 0);

SELECT ('no'::BOOLEAN);

SELECT (1::BOOLEAN);

SELECT ('f'::BOOLEAN);

SELECT (TRUE::BOOLEAN);

SELECT (NULL::BOOLEAN);

SELECT ('1980-12-03'::DATE);

SELECT ('DEC-03-1980'::DATE);

SELECT ('DEC 03 1980'::DATE);

SELECT ('1980 December 03'::DATE);

SELECT ('03:44'::TIME);

SELECT ('03:44 AM'::TIME);

SELECT ('03:44 PM'::TIME);

SELECT ('03:44:11'::TIME);

SELECT ('02:16'::TIME WITH TIME ZONE);

SELECT('1980 December 03 02:16:07'::TIMESTAMP);