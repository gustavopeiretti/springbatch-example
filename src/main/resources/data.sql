-- risk HIGH
INSERT INTO credit_card (card_number,last_pay) VALUES (9991,CURRENT_DATE()-30);
INSERT INTO credit_card (card_number,last_pay) VALUES (9992,CURRENT_DATE()-21);
-- risk LOW
INSERT INTO credit_card (card_number,last_pay) VALUES (9993,CURRENT_DATE()-20);
INSERT INTO credit_card (card_number,last_pay) VALUES (9994,CURRENT_DATE()-11);
-- risk NORMAL
INSERT INTO credit_card (card_number,last_pay) VALUES (9995,CURRENT_DATE()-10);
INSERT INTO credit_card (card_number,last_pay) VALUES (9996,CURRENT_DATE()-5);
