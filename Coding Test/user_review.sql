CREATE TABLE user_review (
id INT NOT NULL AUTO_INCREMENT,
order_id INT NOT NULL,
product_id INT NOT NULL,
user_id INT NOT NULL,
rating FLOAT NOT NULL,
review TEXT NOT NULL,
created_at TIMESTAMP NOT NULL,
updated_at TIMESTAMP NOT NULL,
PRIMARY KEY (`id`))