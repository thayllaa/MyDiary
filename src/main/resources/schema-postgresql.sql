CREATE TABLE IF NOT EXISTS users (
	id serial PRIMARY KEY,
	name		VARCHAR(50),
	email		VARCHAR(50),
	password	varchar(8)
);

CREATE TABLE IF NOT EXISTS tasks (
	id serial PRIMARY KEY,
	name		VARCHAR(40),
	category	VARCHAR(50),
	start		VARCHAR(30),
	finish		VARCHAR(30),
	details		VARCHAR(500)
);
